package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Account;
public class AccountConversion 
{
	public org.hl7.fhir.r4.model.Account Accounts(Account a) throws ParseException
	{
		org.hl7.fhir.r4.model.Account account = new org.hl7.fhir.r4.model.Account();

		/******************** id ********************************************************************************/
		account.setId(a.getId());

		/******************** Account_Cvg_Cvg ********************************************************************************/
		if(a.getAccountCvgCvg() != null ) {

			String[] arrayi0 = a.getAccountCvgCvg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getCoverage().size() < i0+1) { account.addCoverage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getCoverage().get(i0).setCoverage(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Cvg_Priority ********************************************************************************/
		if(a.getAccountCvgPriority() != null ) {

			String[] arrayi0 = a.getAccountCvgPriority().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getCoverage().size() < i0+1) { account.addCoverage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getCoverage().get(i0).setPriority(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Dscrptn ********************************************************************************/
		if(a.getAccountDscrptn() != null ) {

			if(a.getAccountDscrptn().replace("[","").replace("]","").equals("NULL") | a.getAccountDscrptn()==null) {} else {
			account.setDescription(a.getAccountDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Account_Guarantor_OnHold ********************************************************************************/
		if(a.getAccountGuarantorOnHold() != null ) {

			String[] arrayi0 = a.getAccountGuarantorOnHold().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getGuarantor().size() < i0+1) { account.addGuarantor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getGuarantor().get(i0).setOnHold(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Guarantor_Party ********************************************************************************/
		if(a.getAccountGuarantorParty() != null ) {

			String[] arrayi0 = a.getAccountGuarantorParty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getGuarantor().size() < i0+1) { account.addGuarantor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getGuarantor().get(i0).setParty(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Guarantor_Prd_End ********************************************************************************/
		if(a.getAccountGuarantorPrdEnd() != null ) {

			String[] arrayi0 = a.getAccountGuarantorPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getGuarantor().size() < i0+1) { account.addGuarantor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getGuarantor().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Guarantor_Prd_Strt ********************************************************************************/
		if(a.getAccountGuarantorPrdStrt() != null ) {

			String[] arrayi0 = a.getAccountGuarantorPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getGuarantor().size() < i0+1) { account.addGuarantor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getGuarantor().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Id_Assigner ********************************************************************************/
		if(a.getAccountIdAssigner() != null ) {

			String[] arrayi0 = a.getAccountIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Id_Prd_End ********************************************************************************/
		if(a.getAccountIdPrdEnd() != null ) {

			String[] arrayi0 = a.getAccountIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Id_Prd_Strt ********************************************************************************/
		if(a.getAccountIdPrdStrt() != null ) {

			String[] arrayi0 = a.getAccountIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Id_Sys ********************************************************************************/
		if(a.getAccountIdSys() != null ) {

			String[] arrayi0 = a.getAccountIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAccountIdTypCdgCd() != null ) {

			String[] arrayi0 = a.getAccountIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				String[] arrayi1 = a.getAccountIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(account.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { account.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {account.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Account_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAccountIdTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAccountIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				String[] arrayi1 = a.getAccountIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(account.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { account.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {account.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Account_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAccountIdTypCdgSys() != null ) {

			String[] arrayi0 = a.getAccountIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				String[] arrayi1 = a.getAccountIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(account.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { account.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {account.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Account_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAccountIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAccountIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				String[] arrayi1 = a.getAccountIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(account.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { account.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {account.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Account_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAccountIdTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAccountIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				String[] arrayi1 = a.getAccountIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(account.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { account.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {account.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Account_Id_Typ_Txt ********************************************************************************/
		if(a.getAccountIdTypTxt() != null ) {

			String[] arrayi0 = a.getAccountIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Id_Use ********************************************************************************/
		if(a.getAccountIdUse() != null ) {

			String[] arrayi0 = a.getAccountIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Id_Vl ********************************************************************************/
		if(a.getAccountIdVl() != null ) {

			String[] arrayi0 = a.getAccountIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getIdentifier().size() < i0+1) { account.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Nm ********************************************************************************/
		if(a.getAccountNm() != null ) {

			if(a.getAccountNm().replace("[","").replace("]","").equals("NULL") | a.getAccountNm()==null) {} else {
			account.setName(a.getAccountNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Account_Owner ********************************************************************************/
		if(a.getAccountOwner() != null ) {

			if(a.getAccountOwner().replace("[","").replace("]","").equals("NULL") | a.getAccountOwner()==null) {} else {
			account.setOwner(new org.hl7.fhir.r4.model.Reference(a.getAccountOwner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Account_PartOf ********************************************************************************/
		if(a.getAccountPartOf() != null ) {

			if(a.getAccountPartOf().replace("[","").replace("]","").equals("NULL") | a.getAccountPartOf()==null) {} else {
			account.setPartOf(new org.hl7.fhir.r4.model.Reference(a.getAccountPartOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Account_SrvPrd_End ********************************************************************************/
		if(a.getAccountSrvPrdEnd() != null ) {

			if(a.getAccountSrvPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAccountSrvPrdEnd()==null) {} else {
			account.getServicePeriod().setEnd(a.getAccountSrvPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAccountSrvPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAccountSrvPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Account_SrvPrd_Strt ********************************************************************************/
		if(a.getAccountSrvPrdStrt() != null ) {

			if(a.getAccountSrvPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAccountSrvPrdStrt()==null) {} else {
			account.getServicePeriod().setStart(a.getAccountSrvPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAccountSrvPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAccountSrvPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Account_Sts ********************************************************************************/
		if(a.getAccountSts() != null ) {

			if(a.getAccountSts().replace("[","").replace("]","").equals("NULL") | a.getAccountSts()==null) {} else {
			account.setStatus(new org.hl7.fhir.r4.model.Account.AccountStatusEnumFactory().fromCode(a.getAccountSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Account_Sbjct ********************************************************************************/
		if(a.getAccountSbjct() != null ) {

				for( String currListStrSplit : a.getAccountSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			account.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Account_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAccountTypCdgCd() != null ) {

			String[] arrayi0 = a.getAccountTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getType().getCoding().size() < i0+1) { account.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAccountTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAccountTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getType().getCoding().size() < i0+1) { account.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAccountTypCdgSys() != null ) {

			String[] arrayi0 = a.getAccountTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getType().getCoding().size() < i0+1) { account.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAccountTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAccountTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getType().getCoding().size() < i0+1) { account.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Account_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAccountTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAccountTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(account.getType().getCoding().size() < i0+1) { account.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {account.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Account_Typ_Txt ********************************************************************************/
		if(a.getAccountTypTxt() != null ) {

			if(a.getAccountTypTxt().replace("[","").replace("]","").equals("NULL") | a.getAccountTypTxt()==null) {} else {
			account.getType().setText(a.getAccountTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return account;
	}
}
