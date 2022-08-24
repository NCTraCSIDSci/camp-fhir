package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Claim;
public class ClaimConversion 
{
	public org.hl7.fhir.r4.model.Claim Claims(Claim c) throws ParseException
	{
		org.hl7.fhir.r4.model.Claim claim = new org.hl7.fhir.r4.model.Claim();

		/******************** id ********************************************************************************/
		claim.setId(c.getId());

		/******************** Clm_Accident_Dt ********************************************************************************/
		if(c.getClmAccidentDt() != null ) {

			if(c.getClmAccidentDt().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentDt()==null) {} else {
			claim.getAccident().setDate(c.getClmAccidentDt().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmAccidentDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Accident_LctnAddr_City ********************************************************************************/
		if(c.getClmAccidentLctnAddrCity() != null ) {

			if(c.getClmAccidentLctnAddrCity().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrCity()==null) {} else {
			claim.getAccident().getLocationAddress().setCity(c.getClmAccidentLctnAddrCity().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Accident_LctnAddr_Cntry ********************************************************************************/
		if(c.getClmAccidentLctnAddrCntry() != null ) {

			if(c.getClmAccidentLctnAddrCntry().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrCntry()==null) {} else {
			claim.getAccident().getLocationAddress().setCountry(c.getClmAccidentLctnAddrCntry().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Accident_LctnAddr_District ********************************************************************************/
		if(c.getClmAccidentLctnAddrDistrict() != null ) {

			if(c.getClmAccidentLctnAddrDistrict().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrDistrict()==null) {} else {
			claim.getAccident().getLocationAddress().setDistrict(c.getClmAccidentLctnAddrDistrict().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Accident_LctnAddr_Line ********************************************************************************/
		if(c.getClmAccidentLctnAddrLine() != null ) {

				for( String currListStrSplit : c.getClmAccidentLctnAddrLine().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			claim.getAccident().getLocationAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Clm_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(c.getClmAccidentLctnAddrPrdEnd() != null ) {

			if(c.getClmAccidentLctnAddrPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrPrdEnd()==null) {} else {
			claim.getAccident().getLocationAddress().getPeriod().setEnd(c.getClmAccidentLctnAddrPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmAccidentLctnAddrPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(c.getClmAccidentLctnAddrPrdStrt() != null ) {

			if(c.getClmAccidentLctnAddrPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrPrdStrt()==null) {} else {
			claim.getAccident().getLocationAddress().getPeriod().setStart(c.getClmAccidentLctnAddrPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmAccidentLctnAddrPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(c.getClmAccidentLctnAddrPostalCd() != null ) {

			if(c.getClmAccidentLctnAddrPostalCd().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrPostalCd()==null) {} else {
			claim.getAccident().getLocationAddress().setPostalCode(c.getClmAccidentLctnAddrPostalCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Accident_LctnAddr_State ********************************************************************************/
		if(c.getClmAccidentLctnAddrState() != null ) {

			if(c.getClmAccidentLctnAddrState().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrState()==null) {} else {
			claim.getAccident().getLocationAddress().setState(c.getClmAccidentLctnAddrState().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Accident_LctnAddr_Txt ********************************************************************************/
		if(c.getClmAccidentLctnAddrTxt() != null ) {

			if(c.getClmAccidentLctnAddrTxt().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrTxt()==null) {} else {
			claim.getAccident().getLocationAddress().setText(c.getClmAccidentLctnAddrTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Accident_LctnAddr_Typ ********************************************************************************/
		if(c.getClmAccidentLctnAddrTyp() != null ) {

			if(c.getClmAccidentLctnAddrTyp().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrTyp()==null) {} else {
			claim.getAccident().getLocationAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(c.getClmAccidentLctnAddrTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Accident_LctnAddr_Use ********************************************************************************/
		if(c.getClmAccidentLctnAddrUse() != null ) {

			if(c.getClmAccidentLctnAddrUse().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnAddrUse()==null) {} else {
			claim.getAccident().getLocationAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(c.getClmAccidentLctnAddrUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Accident_LctnRfrnc ********************************************************************************/
		if(c.getClmAccidentLctnRfrnc() != null ) {

			if(c.getClmAccidentLctnRfrnc().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentLctnRfrnc()==null) {} else {
			claim.getAccident().setLocation(new org.hl7.fhir.r4.model.Reference(c.getClmAccidentLctnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmAccidentTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmAccidentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getAccident().getType().getCoding().size() < i0+1) { claim.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getAccident().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmAccidentTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmAccidentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getAccident().getType().getCoding().size() < i0+1) { claim.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getAccident().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmAccidentTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmAccidentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getAccident().getType().getCoding().size() < i0+1) { claim.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getAccident().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmAccidentTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmAccidentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getAccident().getType().getCoding().size() < i0+1) { claim.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getAccident().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmAccidentTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmAccidentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getAccident().getType().getCoding().size() < i0+1) { claim.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getAccident().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Accident_Typ_Txt ********************************************************************************/
		if(c.getClmAccidentTypTxt() != null ) {

			if(c.getClmAccidentTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmAccidentTypTxt()==null) {} else {
			claim.getAccident().getType().setText(c.getClmAccidentTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_BillablePrd_End ********************************************************************************/
		if(c.getClmBillablePrdEnd() != null ) {

			if(c.getClmBillablePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmBillablePrdEnd()==null) {} else {
			claim.getBillablePeriod().setEnd(c.getClmBillablePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmBillablePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmBillablePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_BillablePrd_Strt ********************************************************************************/
		if(c.getClmBillablePrdStrt() != null ) {

			if(c.getClmBillablePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmBillablePrdStrt()==null) {} else {
			claim.getBillablePeriod().setStart(c.getClmBillablePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmBillablePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmBillablePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_CareTeam_Provider ********************************************************************************/
		if(c.getClmCareTeamProvider() != null ) {

			String[] arrayi0 = c.getClmCareTeamProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getCareTeam().get(i0).setProvider(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgCd() != null ) {

			String[] arrayi0 = c.getClmCareTeamQualificationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamQualificationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getQualification().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgDsply() != null ) {

			String[] arrayi0 = c.getClmCareTeamQualificationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamQualificationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getQualification().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgSys() != null ) {

			String[] arrayi0 = c.getClmCareTeamQualificationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamQualificationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getQualification().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmCareTeamQualificationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamQualificationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getQualification().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmCareTeamQualificationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamQualificationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getQualification().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Qualification_Txt ********************************************************************************/
		if(c.getClmCareTeamQualificationTxt() != null ) {

			String[] arrayi0 = c.getClmCareTeamQualificationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getCareTeam().get(i0).getQualification().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_CareTeam_Responsible ********************************************************************************/
		if(c.getClmCareTeamResponsible() != null ) {

			String[] arrayi0 = c.getClmCareTeamResponsible().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getCareTeam().get(i0).setResponsible(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(c.getClmCareTeamRoleCdgCd() != null ) {

			String[] arrayi0 = c.getClmCareTeamRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(c.getClmCareTeamRoleCdgDsply() != null ) {

			String[] arrayi0 = c.getClmCareTeamRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(c.getClmCareTeamRoleCdgSys() != null ) {

			String[] arrayi0 = c.getClmCareTeamRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmCareTeamRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmCareTeamRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getClmCareTeamRoleCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmCareTeamRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				String[] arrayi1 = c.getClmCareTeamRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { claim.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getCareTeam().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_CareTeam_Role_Txt ********************************************************************************/
		if(c.getClmCareTeamRoleTxt() != null ) {

			String[] arrayi0 = c.getClmCareTeamRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getCareTeam().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_CareTeam_Sqnc ********************************************************************************/
		if(c.getClmCareTeamSqnc() != null ) {

			String[] arrayi0 = c.getClmCareTeamSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getCareTeam().size() < i0+1) { claim.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getCareTeam().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Created ********************************************************************************/
		if(c.getClmCreated() != null ) {

			if(c.getClmCreated().replace("[","").replace("]","").equals("NULL") | c.getClmCreated()==null) {} else {
			claim.setCreated(c.getClmCreated().replace("[","").replace("]","").equals("NULL") | c.getClmCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getDiagnosis().get(i0).getDiagnosisCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Dgnsis_DgnsisRfrnc ********************************************************************************/
		if(c.getClmDgnsisDgnsisRfrnc() != null ) {

			String[] arrayi0 = c.getClmDgnsisDgnsisRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getDiagnosis().get(i0).setDiagnosis(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgCd() != null ) {

			String[] arrayi0 = c.getClmDgnsisOnAdmissionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisOnAdmissionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgDsply() != null ) {

			String[] arrayi0 = c.getClmDgnsisOnAdmissionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisOnAdmissionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgSys() != null ) {

			String[] arrayi0 = c.getClmDgnsisOnAdmissionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisOnAdmissionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmDgnsisOnAdmissionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisOnAdmissionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmDgnsisOnAdmissionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisOnAdmissionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionTxt() != null ) {

			String[] arrayi0 = c.getClmDgnsisOnAdmissionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getDiagnosis().get(i0).getOnAdmission().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmDgnsisPckgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisPckgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmDgnsisPckgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisPckgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmDgnsisPckgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisPckgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmDgnsisPckgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisPckgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmDgnsisPckgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisPckgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { claim.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(c.getClmDgnsisPckgCdTxt() != null ) {

			String[] arrayi0 = c.getClmDgnsisPckgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getDiagnosis().get(i0).getPackageCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Dgnsis_Sqnc ********************************************************************************/
		if(c.getClmDgnsisSqnc() != null ) {

			String[] arrayi0 = c.getClmDgnsisSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getDiagnosis().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmDgnsisTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getType().size() < i1+1) { claim.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = c.getClmDgnsisTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmDgnsisTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getType().size() < i1+1) { claim.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = c.getClmDgnsisTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmDgnsisTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getType().size() < i1+1) { claim.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = c.getClmDgnsisTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmDgnsisTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getType().size() < i1+1) { claim.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = c.getClmDgnsisTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmDgnsisTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getType().size() < i1+1) { claim.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = c.getClmDgnsisTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Dgnsis_Typ_Txt ********************************************************************************/
		if(c.getClmDgnsisTypTxt() != null ) {

			String[] arrayi0 = c.getClmDgnsisTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getDiagnosis().size() < i0+1) { claim.addDiagnosis(); }
				String[] arrayi1 = c.getClmDgnsisTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getDiagnosis().get(i0).getType().size() < i1+1) { claim.getDiagnosis().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getDiagnosis().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Enterer ********************************************************************************/
		if(c.getClmEnterer() != null ) {

			if(c.getClmEnterer().replace("[","").replace("]","").equals("NULL") | c.getClmEnterer()==null) {} else {
			claim.setEnterer(new org.hl7.fhir.r4.model.Reference(c.getClmEnterer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Facility ********************************************************************************/
		if(c.getClmFacility() != null ) {

			if(c.getClmFacility().replace("[","").replace("]","").equals("NULL") | c.getClmFacility()==null) {} else {
			claim.setFacility(new org.hl7.fhir.r4.model.Reference(c.getClmFacility().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_FundsReserve_Cdg_Cd ********************************************************************************/
		if(c.getClmFundsReserveCdgCd() != null ) {

			String[] arrayi0 = c.getClmFundsReserveCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getFundsReserve().getCoding().size() < i0+1) { claim.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getFundsReserve().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(c.getClmFundsReserveCdgDsply() != null ) {

			String[] arrayi0 = c.getClmFundsReserveCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getFundsReserve().getCoding().size() < i0+1) { claim.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getFundsReserve().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_FundsReserve_Cdg_Sys ********************************************************************************/
		if(c.getClmFundsReserveCdgSys() != null ) {

			String[] arrayi0 = c.getClmFundsReserveCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getFundsReserve().getCoding().size() < i0+1) { claim.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getFundsReserve().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmFundsReserveCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmFundsReserveCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getFundsReserve().getCoding().size() < i0+1) { claim.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getFundsReserve().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(c.getClmFundsReserveCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmFundsReserveCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getFundsReserve().getCoding().size() < i0+1) { claim.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getFundsReserve().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_FundsReserve_Txt ********************************************************************************/
		if(c.getClmFundsReserveTxt() != null ) {

			if(c.getClmFundsReserveTxt().replace("[","").replace("]","").equals("NULL") | c.getClmFundsReserveTxt()==null) {} else {
			claim.getFundsReserve().setText(c.getClmFundsReserveTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Id_Assigner ********************************************************************************/
		if(c.getClmIdAssigner() != null ) {

			String[] arrayi0 = c.getClmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Id_Prd_End ********************************************************************************/
		if(c.getClmIdPrdEnd() != null ) {

			String[] arrayi0 = c.getClmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Id_Prd_Strt ********************************************************************************/
		if(c.getClmIdPrdStrt() != null ) {

			String[] arrayi0 = c.getClmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Id_Sys ********************************************************************************/
		if(c.getClmIdSys() != null ) {

			String[] arrayi0 = c.getClmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				String[] arrayi1 = c.getClmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claim.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				String[] arrayi1 = c.getClmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claim.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				String[] arrayi1 = c.getClmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claim.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				String[] arrayi1 = c.getClmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claim.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				String[] arrayi1 = c.getClmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claim.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Id_Typ_Txt ********************************************************************************/
		if(c.getClmIdTypTxt() != null ) {

			String[] arrayi0 = c.getClmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Id_Use ********************************************************************************/
		if(c.getClmIdUse() != null ) {

			String[] arrayi0 = c.getClmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Id_Vl ********************************************************************************/
		if(c.getClmIdVl() != null ) {

			String[] arrayi0 = c.getClmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getIdentifier().size() < i0+1) { claim.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Insrnc_BusinessArrangement ********************************************************************************/
		if(c.getClmInsrncBusinessArrangement() != null ) {

			String[] arrayi0 = c.getClmInsrncBusinessArrangement().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).setBusinessArrangement(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Insrnc_ClmRsps ********************************************************************************/
		if(c.getClmInsrncClmRsps() != null ) {

			String[] arrayi0 = c.getClmInsrncClmRsps().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).setClaimResponse(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Cvg ********************************************************************************/
		if(c.getClmInsrncCvg() != null ) {

			String[] arrayi0 = c.getClmInsrncCvg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).setCoverage(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Focal ********************************************************************************/
		if(c.getClmInsrncFocal() != null ) {

			String[] arrayi0 = c.getClmInsrncFocal().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).setFocal(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Id_Assigner ********************************************************************************/
		if(c.getClmInsrncIdAssigner() != null ) {

			String[] arrayi0 = c.getClmInsrncIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Id_Prd_End ********************************************************************************/
		if(c.getClmInsrncIdPrdEnd() != null ) {

			String[] arrayi0 = c.getClmInsrncIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Id_Prd_Strt ********************************************************************************/
		if(c.getClmInsrncIdPrdStrt() != null ) {

			String[] arrayi0 = c.getClmInsrncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Id_Sys ********************************************************************************/
		if(c.getClmInsrncIdSys() != null ) {

			String[] arrayi0 = c.getClmInsrncIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmInsrncIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmInsrncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				String[] arrayi1 = c.getClmInsrncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getInsurance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { claim.getInsurance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmInsrncIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmInsrncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				String[] arrayi1 = c.getClmInsrncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getInsurance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { claim.getInsurance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmInsrncIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmInsrncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				String[] arrayi1 = c.getClmInsrncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getInsurance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { claim.getInsurance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmInsrncIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmInsrncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				String[] arrayi1 = c.getClmInsrncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getInsurance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { claim.getInsurance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmInsrncIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmInsrncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				String[] arrayi1 = c.getClmInsrncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getInsurance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { claim.getInsurance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Insrnc_Id_Typ_Txt ********************************************************************************/
		if(c.getClmInsrncIdTypTxt() != null ) {

			String[] arrayi0 = c.getClmInsrncIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Insrnc_Id_Use ********************************************************************************/
		if(c.getClmInsrncIdUse() != null ) {

			String[] arrayi0 = c.getClmInsrncIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insrnc_Id_Vl ********************************************************************************/
		if(c.getClmInsrncIdVl() != null ) {

			String[] arrayi0 = c.getClmInsrncIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Insrnc_PreAuthRef ********************************************************************************/
		if(c.getClmInsrncPreAuthRef() != null ) {

			String[] arrayi0 = c.getClmInsrncPreAuthRef().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getInsurance().get(i0).addPreAuthRef(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Insrnc_Sqnc ********************************************************************************/
		if(c.getClmInsrncSqnc() != null ) {

			String[] arrayi0 = c.getClmInsrncSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getInsurance().size() < i0+1) { claim.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getInsurance().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Insurer ********************************************************************************/
		if(c.getClmInsurer() != null ) {

			if(c.getClmInsurer().replace("[","").replace("]","").equals("NULL") | c.getClmInsurer()==null) {} else {
			claim.setInsurer(new org.hl7.fhir.r4.model.Reference(c.getClmInsurer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(c.getClmItmBodySiteCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { claim.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getBodySite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmBodySiteCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { claim.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getBodySite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(c.getClmItmBodySiteCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { claim.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getBodySite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { claim.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getBodySite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { claim.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getBodySite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_BodySite_Txt ********************************************************************************/
		if(c.getClmItmBodySiteTxt() != null ) {

			String[] arrayi0 = c.getClmItmBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getBodySite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_CareTeamSqnc ********************************************************************************/
		if(c.getClmItmCareTeamSqnc() != null ) {

			String[] arrayi0 = c.getClmItmCareTeamSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).addCareTeamSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmItmCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getCategory().getCoding().size() < i1+1) { claim.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getCategory().getCoding().size() < i1+1) { claim.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmItmCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getCategory().getCoding().size() < i1+1) { claim.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getCategory().getCoding().size() < i1+1) { claim.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getCategory().getCoding().size() < i1+1) { claim.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Ctgry_Txt ********************************************************************************/
		if(c.getClmItmCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmItmCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(c.getClmItmDtlCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Factor ********************************************************************************/
		if(c.getClmItmDtlFactor() != null ) {

			String[] arrayi0 = c.getClmItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).setFactor((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmItmDtlMdfrTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addModifier(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(c.getClmItmDtlNetCrncy() != null ) {

			String[] arrayi0 = c.getClmItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getNet().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Net_Vl ********************************************************************************/
		if(c.getClmItmDtlNetVl() != null ) {

			String[] arrayi0 = c.getClmItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getNet().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProductOrService().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = c.getClmItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = c.getClmItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = c.getClmItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = c.getClmItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = c.getClmItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(c.getClmItmDtlQntyCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Qnty_Cmprtr ********************************************************************************/
		if(c.getClmItmDtlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(c.getClmItmDtlQntySys() != null ) {

			String[] arrayi0 = c.getClmItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(c.getClmItmDtlQntyUnt() != null ) {

			String[] arrayi0 = c.getClmItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(c.getClmItmDtlQntyVl() != null ) {

			String[] arrayi0 = c.getClmItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(c.getClmItmDtlRevenueTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getRevenue().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_Sqnc ********************************************************************************/
		if(c.getClmItmDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmItmDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).setSequence(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(c.getClmItmDtlSubDtlFactor() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setFactor((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		
		/******************** Clm_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(c.getClmItmDtlSubDtlNetCrncy() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(c.getClmItmDtlSubDtlNetVl() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		return Claims_Extended( c, claim); 
	}
		public org.hl7.fhir.r4.model.Claim Claims_Extended(Claim c, org.hl7.fhir.r4.model.Claim claim) throws ParseException
		{
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = c.getClmItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Cmprtr ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntySys() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyUnt() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyVl() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueTxt() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(c.getClmItmDtlSubDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setSequence(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(c.getClmItmDtlSubDtlUdi() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmItmDtlSubDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmItmDtlSubDtlUntPriceVl() != null ) {

			String[] arrayi0 = c.getClmItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claim.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_Udi ********************************************************************************/
		if(c.getClmItmDtlUdi() != null ) {

			String[] arrayi0 = c.getClmItmDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).getDetail().get(i1).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmItmDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getClmItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getUnitPrice().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmItmDtlUntPriceVl() != null ) {

			String[] arrayi0 = c.getClmItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getDetail().size() < i1+1) { claim.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getDetail().get(i1).getUnitPrice().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Clm_Itm_DgnsisSqnc ********************************************************************************/
		if(c.getClmItmDgnsisSqnc() != null ) {

			String[] arrayi0 = c.getClmItmDgnsisSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).addDiagnosisSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_Enc ********************************************************************************/
		if(c.getClmItmEnc() != null ) {

			String[] arrayi0 = c.getClmItmEnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).addEncounter(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		
		/******************** Clm_Itm_Factor ********************************************************************************/
		if(c.getClmItmFactor() != null ) {

			String[] arrayi0 = c.getClmItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).setFactor((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Clm_Itm_InfoSqnc ********************************************************************************/
		if(c.getClmItmInfoSqnc() != null ) {

			String[] arrayi0 = c.getClmItmInfoSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).addInformationSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_LctnAddr_City ********************************************************************************/
		if(c.getClmItmLctnAddrCity() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnAddr_Cntry ********************************************************************************/
		if(c.getClmItmLctnAddrCntry() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnAddr_District ********************************************************************************/
		if(c.getClmItmLctnAddrDistrict() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnAddr_Line ********************************************************************************/
		if(c.getClmItmLctnAddrLine() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).getLocationAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(c.getClmItmLctnAddrPrdEnd() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(c.getClmItmLctnAddrPrdStrt() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(c.getClmItmLctnAddrPostalCd() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnAddr_State ********************************************************************************/
		if(c.getClmItmLctnAddrState() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnAddr_Txt ********************************************************************************/
		if(c.getClmItmLctnAddrTxt() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnAddr_Typ ********************************************************************************/
		if(c.getClmItmLctnAddrTyp() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_LctnAddr_Use ********************************************************************************/
		if(c.getClmItmLctnAddrUse() != null ) {

			String[] arrayi0 = c.getClmItmLctnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claim.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claim.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claim.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claim.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claim.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getClmItmLctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getLocationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_LctnRfrnc ********************************************************************************/
		if(c.getClmItmLctnRfrnc() != null ) {

			String[] arrayi0 = c.getClmItmLctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmItmMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getModifier().size() < i1+1) { claim.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getModifier().size() < i1+1) { claim.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmItmMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getModifier().size() < i1+1) { claim.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getModifier().size() < i1+1) { claim.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getModifier().size() < i1+1) { claim.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_Mdfr_Txt ********************************************************************************/
		if(c.getClmItmMdfrTxt() != null ) {

			String[] arrayi0 = c.getClmItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getModifier().size() < i1+1) { claim.getItem().get(i0).addModifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getModifier().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Net_Crncy ********************************************************************************/
		if(c.getClmItmNetCrncy() != null ) {

			String[] arrayi0 = c.getClmItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getNet().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_Net_Vl ********************************************************************************/
		if(c.getClmItmNetVl() != null ) {

			String[] arrayi0 = c.getClmItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getNet().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Clm_Itm_PrcdrSqnc ********************************************************************************/
		if(c.getClmItmPrcdrSqnc() != null ) {

			String[] arrayi0 = c.getClmItmPrcdrSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).addProcedureSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claim.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getProductOrService().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claim.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getProductOrService().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claim.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getProductOrService().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claim.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getProductOrService().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claim.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getProductOrService().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmItmPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getClmItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getProductOrService().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProgramCode().size() < i1+1) { claim.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProgramCode().size() < i1+1) { claim.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProgramCode().size() < i1+1) { claim.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProgramCode().size() < i1+1) { claim.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProgramCode().size() < i1+1) { claim.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmItmPrgrmCdTxt() != null ) {

			String[] arrayi0 = c.getClmItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getProgramCode().size() < i1+1) { claim.getItem().get(i0).addProgramCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getProgramCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Qnty_Cd ********************************************************************************/
		if(c.getClmItmQntyCd() != null ) {

			String[] arrayi0 = c.getClmItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_Qnty_Cmprtr ********************************************************************************/
		if(c.getClmItmQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_Qnty_Sys ********************************************************************************/
		if(c.getClmItmQntySys() != null ) {

			String[] arrayi0 = c.getClmItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_Qnty_Unt ********************************************************************************/
		if(c.getClmItmQntyUnt() != null ) {

			String[] arrayi0 = c.getClmItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_Qnty_Vl ********************************************************************************/
		if(c.getClmItmQntyVl() != null ) {

			String[] arrayi0 = c.getClmItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Clm_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(c.getClmItmRevenueCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { claim.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getRevenue().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmRevenueCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { claim.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getRevenue().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(c.getClmItmRevenueCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { claim.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getRevenue().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmRevenueCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { claim.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getRevenue().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmRevenueCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { claim.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getRevenue().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Revenue_Txt ********************************************************************************/
		if(c.getClmItmRevenueTxt() != null ) {

			String[] arrayi0 = c.getClmItmRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getRevenue().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_Sqnc ********************************************************************************/
		if(c.getClmItmSqnc() != null ) {

			String[] arrayi0 = c.getClmItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_SrvdDtTyp ********************************************************************************/
		if(c.getClmItmSrvdDtTyp() != null ) {

			String[] arrayi0 = c.getClmItmSrvdDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).setServiced(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_SrvdPrd_End ********************************************************************************/
		if(c.getClmItmSrvdPrdEnd() != null ) {

			String[] arrayi0 = c.getClmItmSrvdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getServicedPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_SrvdPrd_Strt ********************************************************************************/
		if(c.getClmItmSrvdPrdStrt() != null ) {

			String[] arrayi0 = c.getClmItmSrvdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getServicedPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(c.getClmItmSubSiteCdgCd() != null ) {

			String[] arrayi0 = c.getClmItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getSubSite().size() < i1+1) { claim.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmSubSiteCdgDsply() != null ) {

			String[] arrayi0 = c.getClmItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getSubSite().size() < i1+1) { claim.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(c.getClmItmSubSiteCdgSys() != null ) {

			String[] arrayi0 = c.getClmItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getSubSite().size() < i1+1) { claim.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmSubSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getSubSite().size() < i1+1) { claim.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmSubSiteCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getSubSite().size() < i1+1) { claim.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claim.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Itm_SubSite_Txt ********************************************************************************/
		if(c.getClmItmSubSiteTxt() != null ) {

			String[] arrayi0 = c.getClmItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				String[] arrayi1 = c.getClmItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getItem().get(i0).getSubSite().size() < i1+1) { claim.getItem().get(i0).addSubSite(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getItem().get(i0).getSubSite().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Itm_Udi ********************************************************************************/
		if(c.getClmItmUdi() != null ) {

			String[] arrayi0 = c.getClmItmUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getItem().get(i0).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Itm_UntPrice_Crncy ********************************************************************************/
		if(c.getClmItmUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getClmItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getUnitPrice().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Itm_UntPrice_Vl ********************************************************************************/
		if(c.getClmItmUntPriceVl() != null ) {

			String[] arrayi0 = c.getClmItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getItem().size() < i0+1) { claim.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getItem().get(i0).getUnitPrice().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Clm_OriginalPrescription ********************************************************************************/
		if(c.getClmOriginalPrescription() != null ) {

			if(c.getClmOriginalPrescription().replace("[","").replace("]","").equals("NULL") | c.getClmOriginalPrescription()==null) {} else {
			claim.setOriginalPrescription(new org.hl7.fhir.r4.model.Reference(c.getClmOriginalPrescription().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Pnt ********************************************************************************/
		if(c.getClmPnt() != null ) {

			if(c.getClmPnt().replace("[","").replace("]","").equals("NULL") | c.getClmPnt()==null) {} else {
			claim.setPatient(new org.hl7.fhir.r4.model.Reference(c.getClmPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Payee_Party ********************************************************************************/
		if(c.getClmPayeeParty() != null ) {

			if(c.getClmPayeeParty().replace("[","").replace("]","").equals("NULL") | c.getClmPayeeParty()==null) {} else {
			claim.getPayee().setParty(new org.hl7.fhir.r4.model.Reference(c.getClmPayeeParty().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmPayeeTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmPayeeTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPayee().getType().getCoding().size() < i0+1) { claim.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPayee().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmPayeeTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmPayeeTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPayee().getType().getCoding().size() < i0+1) { claim.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPayee().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmPayeeTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmPayeeTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPayee().getType().getCoding().size() < i0+1) { claim.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPayee().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPayeeTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmPayeeTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPayee().getType().getCoding().size() < i0+1) { claim.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPayee().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPayeeTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmPayeeTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPayee().getType().getCoding().size() < i0+1) { claim.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPayee().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Payee_Typ_Txt ********************************************************************************/
		if(c.getClmPayeeTypTxt() != null ) {

			if(c.getClmPayeeTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmPayeeTypTxt()==null) {} else {
			claim.getPayee().getType().setText(c.getClmPayeeTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Prescription ********************************************************************************/
		if(c.getClmPrescription() != null ) {

			if(c.getClmPrescription().replace("[","").replace("]","").equals("NULL") | c.getClmPrescription()==null) {} else {
			claim.setPrescription(new org.hl7.fhir.r4.model.Reference(c.getClmPrescription().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Priority_Cdg_Cd ********************************************************************************/
		if(c.getClmPriorityCdgCd() != null ) {

			String[] arrayi0 = c.getClmPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPriority().getCoding().size() < i0+1) { claim.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPriority().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Priority_Cdg_Dsply ********************************************************************************/
		if(c.getClmPriorityCdgDsply() != null ) {

			String[] arrayi0 = c.getClmPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPriority().getCoding().size() < i0+1) { claim.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPriority().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Priority_Cdg_Sys ********************************************************************************/
		if(c.getClmPriorityCdgSys() != null ) {

			String[] arrayi0 = c.getClmPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPriority().getCoding().size() < i0+1) { claim.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPriority().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Priority_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPriorityCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPriority().getCoding().size() < i0+1) { claim.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPriority().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Priority_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPriorityCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getPriority().getCoding().size() < i0+1) { claim.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getPriority().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Priority_Txt ********************************************************************************/
		if(c.getClmPriorityTxt() != null ) {

			if(c.getClmPriorityTxt().replace("[","").replace("]","").equals("NULL") | c.getClmPriorityTxt()==null) {} else {
			claim.getPriority().setText(c.getClmPriorityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Prcdr_Dt ********************************************************************************/
		if(c.getClmPrcdrDt() != null ) {

			String[] arrayi0 = c.getClmPrcdrDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getProcedure().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrPrcdrCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { claim.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrPrcdrCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { claim.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrPrcdrCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { claim.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrPrcdrCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { claim.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrPrcdrCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { claim.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getProcedure().get(i0).getProcedureCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Prcdr_PrcdrRfrnc ********************************************************************************/
		if(c.getClmPrcdrPrcdrRfrnc() != null ) {

			String[] arrayi0 = c.getClmPrcdrPrcdrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getProcedure().get(i0).setProcedure(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Prcdr_Sqnc ********************************************************************************/
		if(c.getClmPrcdrSqnc() != null ) {

			String[] arrayi0 = c.getClmPrcdrSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getProcedure().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmPrcdrTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getType().size() < i1+1) { claim.getProcedure().get(i0).addType(); }
					String[] arrayi2 = c.getClmPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmPrcdrTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getType().size() < i1+1) { claim.getProcedure().get(i0).addType(); }
					String[] arrayi2 = c.getClmPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmPrcdrTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getType().size() < i1+1) { claim.getProcedure().get(i0).addType(); }
					String[] arrayi2 = c.getClmPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPrcdrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getType().size() < i1+1) { claim.getProcedure().get(i0).addType(); }
					String[] arrayi2 = c.getClmPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Clm_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPrcdrTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getType().size() < i1+1) { claim.getProcedure().get(i0).addType(); }
					String[] arrayi2 = c.getClmPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claim.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { claim.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claim.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Clm_Prcdr_Typ_Txt ********************************************************************************/
		if(c.getClmPrcdrTypTxt() != null ) {

			String[] arrayi0 = c.getClmPrcdrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				String[] arrayi1 = c.getClmPrcdrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getProcedure().get(i0).getType().size() < i1+1) { claim.getProcedure().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getProcedure().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Prcdr_Udi ********************************************************************************/
		if(c.getClmPrcdrUdi() != null ) {

			String[] arrayi0 = c.getClmPrcdrUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getProcedure().size() < i0+1) { claim.addProcedure(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claim.getProcedure().get(i0).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Provider ********************************************************************************/
		if(c.getClmProvider() != null ) {

			if(c.getClmProvider().replace("[","").replace("]","").equals("NULL") | c.getClmProvider()==null) {} else {
			claim.setProvider(new org.hl7.fhir.r4.model.Reference(c.getClmProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Referral ********************************************************************************/
		if(c.getClmReferral() != null ) {

			if(c.getClmReferral().replace("[","").replace("]","").equals("NULL") | c.getClmReferral()==null) {} else {
			claim.setReferral(new org.hl7.fhir.r4.model.Reference(c.getClmReferral().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_Rlted_Clm ********************************************************************************/
		if(c.getClmRltedClm() != null ) {

			String[] arrayi0 = c.getClmRltedClm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).setClaim(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(c.getClmRltedRfrncAssigner() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(c.getClmRltedRfrncPrdEnd() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(c.getClmRltedRfrncPrdStrt() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Sys ********************************************************************************/
		if(c.getClmRltedRfrncSys() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { claim.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getReference().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { claim.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getReference().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { claim.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getReference().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { claim.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getReference().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { claim.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getReference().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(c.getClmRltedRfrncTypTxt() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Use ********************************************************************************/
		if(c.getClmRltedRfrncUse() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Rlted_Rfrnc_Vl ********************************************************************************/
		if(c.getClmRltedRfrncVl() != null ) {

			String[] arrayi0 = c.getClmRltedRfrncVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getReference().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(c.getClmRltedRltnshipCdgCd() != null ) {

			String[] arrayi0 = c.getClmRltedRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { claim.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getRelationship().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(c.getClmRltedRltnshipCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRltedRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { claim.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getRelationship().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(c.getClmRltedRltnshipCdgSys() != null ) {

			String[] arrayi0 = c.getClmRltedRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { claim.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getRelationship().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRltedRltnshipCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRltedRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { claim.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getRelationship().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRltedRltnshipCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRltedRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				String[] arrayi1 = c.getClmRltedRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { claim.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getRelated().get(i0).getRelationship().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_Rlted_Rltnship_Txt ********************************************************************************/
		if(c.getClmRltedRltnshipTxt() != null ) {

			String[] arrayi0 = c.getClmRltedRltnshipTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getRelated().size() < i0+1) { claim.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getRelated().get(i0).getRelationship().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Sts ********************************************************************************/
		if(c.getClmSts() != null ) {

			if(c.getClmSts().replace("[","").replace("]","").equals("NULL") | c.getClmSts()==null) {} else {
			claim.setStatus(new org.hl7.fhir.r4.model.Claim.ClaimStatusEnumFactory().fromCode(c.getClmSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Clm_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getClmSubTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSubType().getCoding().size() < i0+1) { claim.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSubType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getClmSubTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSubType().getCoding().size() < i0+1) { claim.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSubType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getClmSubTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSubType().getCoding().size() < i0+1) { claim.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSubType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSubTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSubType().getCoding().size() < i0+1) { claim.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSubType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSubTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSubType().getCoding().size() < i0+1) { claim.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSubType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SubTyp_Txt ********************************************************************************/
		if(c.getClmSubTypTxt() != null ) {

			if(c.getClmSubTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmSubTypTxt()==null) {} else {
			claim.getSubType().setText(c.getClmSubTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(c.getClmSprtingInfoCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Cd_Txt ********************************************************************************/
		if(c.getClmSprtingInfoCdTxt() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getReason().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getReason().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getReason().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getReason().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getReason().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getReason().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getReason().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getReason().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				String[] arrayi1 = c.getClmSprtingInfoRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claim.getSupportingInfo().get(i0).getReason().getCoding().size() < i1+1) { claim.getSupportingInfo().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claim.getSupportingInfo().get(i0).getReason().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Clm_SprtingInfo_Rsn_Txt ********************************************************************************/
		if(c.getClmSprtingInfoRsnTxt() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getReason().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_Sqnc ********************************************************************************/
		if(c.getClmSprtingInfoSqnc() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(c.getClmSprtingInfoTmgDtTyp() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoTmgDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).setTiming(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(c.getClmSprtingInfoTmgPrdEnd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoTmgPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getTimingPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(c.getClmSprtingInfoTmgPrdStrt() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoTmgPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getTimingPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntCreation() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntData() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntHash() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntSz() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntTtl() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntUrl() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(c.getClmSprtingInfoVlBooleanTyp() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyCd() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlQnty_Cmprtr ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(c.getClmSprtingInfoVlQntySys() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyUnt() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyVl() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Clm_SprtingInfo_VlRfrnc ********************************************************************************/
		if(c.getClmSprtingInfoVlRfrnc() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(c.getClmSprtingInfoVlStrgTyp() != null ) {

			String[] arrayi0 = c.getClmSprtingInfoVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getSupportingInfo().size() < i0+1) { claim.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getSupportingInfo().get(i0).setValue(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Total_Crncy ********************************************************************************/
		if(c.getClmTotalCrncy() != null ) {

			if(c.getClmTotalCrncy().replace("[","").replace("]","").equals("NULL") | c.getClmTotalCrncy()==null) {} else {
			claim.getTotal().setCurrency(c.getClmTotalCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Total_Vl ********************************************************************************/
		if(c.getClmTotalVl() != null ) {

			if(c.getClmTotalVl().replace("[","").replace("]","").equals("NULL") | c.getClmTotalVl()==null) {} else {
			claim.getTotal().setValue((new java.math.BigDecimal((c.getClmTotalVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Clm_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getType().getCoding().size() < i0+1) { claim.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getType().getCoding().size() < i0+1) { claim.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getType().getCoding().size() < i0+1) { claim.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getType().getCoding().size() < i0+1) { claim.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Clm_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claim.getType().getCoding().size() < i0+1) { claim.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claim.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Clm_Typ_Txt ********************************************************************************/
		if(c.getClmTypTxt() != null ) {

			if(c.getClmTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmTypTxt()==null) {} else {
			claim.getType().setText(c.getClmTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Clm_Use ********************************************************************************/
		if(c.getClmUse() != null ) {

			if(c.getClmUse().replace("[","").replace("]","").equals("NULL") | c.getClmUse()==null) {} else {
			claim.setUse(new org.hl7.fhir.r4.model.Claim.UseEnumFactory().fromCode(c.getClmUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return claim;
	}
}
