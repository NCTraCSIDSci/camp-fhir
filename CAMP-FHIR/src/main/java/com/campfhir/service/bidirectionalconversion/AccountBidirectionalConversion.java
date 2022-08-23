package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Account;
public class AccountBidirectionalConversion 
{
	public Account Accounts(org.hl7.fhir.r4.model.Account account) throws ParseException
	{
		 main.java.com.campfhir.model.Account a = new  main.java.com.campfhir.model.Account();

		/******************** id ********************************************************************************/
		a.setId(account.getIdElement().getIdPart());

		/******************** Account_Nm ********************************************************************************/
		if(account.hasName()) {

			a.addAccountNm(String.valueOf(account.getName()));
		} else {
			a.addAccountNm("NULL");
		}


		/******************** accounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept accounttype = account.getType();

		/******************** Account_Typ_Txt ********************************************************************************/
		if(accounttype.hasText()) {

			a.addAccountTypTxt(String.valueOf(accounttype.getText()));
		} else {
			a.addAccountTypTxt("NULL");
		}


		/******************** accounttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> accounttypecodinglist = accounttype.getCoding();
		for(int accounttypecodingi = 0; accounttypecodingi<accounttypecodinglist.size();accounttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  accounttypecoding = accounttypecodinglist.get(accounttypecodingi);

		/******************** Account_Typ_Cdg_Dsply ********************************************************************************/
		if(accounttypecodingi == 0) {a.addAccountTypCdgDsply("[");}
		if(accounttypecoding.hasDisplay()) {

			a.addAccountTypCdgDsply(String.valueOf(accounttypecoding.getDisplay()));
		} else {
			a.addAccountTypCdgDsply("NULL");
		}

		if(accounttypecodingi == accounttypecodinglist.size()-1) {a.addAccountTypCdgDsply("]");}


		/******************** Account_Typ_Cdg_Vrsn ********************************************************************************/
		if(accounttypecodingi == 0) {a.addAccountTypCdgVrsn("[");}
		if(accounttypecoding.hasVersion()) {

			a.addAccountTypCdgVrsn(String.valueOf(accounttypecoding.getVersion()));
		} else {
			a.addAccountTypCdgVrsn("NULL");
		}

		if(accounttypecodingi == accounttypecodinglist.size()-1) {a.addAccountTypCdgVrsn("]");}


		/******************** Account_Typ_Cdg_Cd ********************************************************************************/
		if(accounttypecodingi == 0) {a.addAccountTypCdgCd("[");}
		if(accounttypecoding.hasCode()) {

			a.addAccountTypCdgCd(String.valueOf(accounttypecoding.getCode()));
		} else {
			a.addAccountTypCdgCd("NULL");
		}

		if(accounttypecodingi == accounttypecodinglist.size()-1) {a.addAccountTypCdgCd("]");}


		/******************** Account_Typ_Cdg_UsrSltd ********************************************************************************/
		if(accounttypecodingi == 0) {a.addAccountTypCdgUsrSltd("[");}
		if(accounttypecoding.hasUserSelected()) {

			a.addAccountTypCdgUsrSltd(String.valueOf(accounttypecoding.getUserSelected()));
		} else {
			a.addAccountTypCdgUsrSltd("NULL");
		}

		if(accounttypecodingi == accounttypecodinglist.size()-1) {a.addAccountTypCdgUsrSltd("]");}


		/******************** Account_Typ_Cdg_Sys ********************************************************************************/
		if(accounttypecodingi == 0) {a.addAccountTypCdgSys("[");}
		if(accounttypecoding.hasSystem()) {

			a.addAccountTypCdgSys(String.valueOf(accounttypecoding.getSystem()));
		} else {
			a.addAccountTypCdgSys("NULL");
		}

		if(accounttypecodingi == accounttypecodinglist.size()-1) {a.addAccountTypCdgSys("]");}


		 };
		/******************** Account_Sbjct ********************************************************************************/
		if(account.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<account.getSubject().size(); incr++) {
				array = array + account.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAccountSbjct(array);

		} else {
			a.addAccountSbjct("NULL");
		}


		/******************** accountstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Account.AccountStatus accountstatus = account.getStatus();
		if(accountstatus!=null) {
			a.addAccountSts(accountstatus.toCode());
		} else {
			a.addAccountSts("NULL");
		}

		/******************** Account_Dscrptn ********************************************************************************/
		if(account.hasDescription()) {

			a.addAccountDscrptn(String.valueOf(account.getDescription()));
		} else {
			a.addAccountDscrptn("NULL");
		}


		/******************** accountidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> accountidentifierlist = account.getIdentifier();
		for(int accountidentifieri = 0; accountidentifieri<accountidentifierlist.size();accountidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  accountidentifier = accountidentifierlist.get(accountidentifieri);

		/******************** Account_Id_Vl ********************************************************************************/
		if(accountidentifieri == 0) {a.addAccountIdVl("[");}
		if(accountidentifier.hasValue()) {

			a.addAccountIdVl(String.valueOf(accountidentifier.getValue()));
		} else {
			a.addAccountIdVl("NULL");
		}

		if(accountidentifieri == accountidentifierlist.size()-1) {a.addAccountIdVl("]");}


		/******************** accountidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept accountidentifiertype = accountidentifier.getType();

		/******************** Account_Id_Typ_Txt ********************************************************************************/
		if(accountidentifieri == 0) {a.addAccountIdTypTxt("[");}
		if(accountidentifiertype.hasText()) {

			a.addAccountIdTypTxt(String.valueOf(accountidentifiertype.getText()));
		} else {
			a.addAccountIdTypTxt("NULL");
		}

		if(accountidentifieri == accountidentifierlist.size()-1) {a.addAccountIdTypTxt("]");}


		/******************** accountidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> accountidentifiertypecodinglist = accountidentifiertype.getCoding();
		for(int accountidentifiertypecodingi = 0; accountidentifiertypecodingi<accountidentifiertypecodinglist.size();accountidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  accountidentifiertypecoding = accountidentifiertypecodinglist.get(accountidentifiertypecodingi);

		/******************** Account_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(accountidentifiertypecodingi == 0) {a.addAccountIdTypCdgDsply("[[");}
		if(accountidentifiertypecoding.hasDisplay()) {

			a.addAccountIdTypCdgDsply(String.valueOf(accountidentifiertypecoding.getDisplay()));
		} else {
			a.addAccountIdTypCdgDsply("NULL");
		}

		if(accountidentifiertypecodingi == accountidentifiertypecodinglist.size()-1) {a.addAccountIdTypCdgDsply("]]");}


		/******************** Account_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(accountidentifiertypecodingi == 0) {a.addAccountIdTypCdgVrsn("[[");}
		if(accountidentifiertypecoding.hasVersion()) {

			a.addAccountIdTypCdgVrsn(String.valueOf(accountidentifiertypecoding.getVersion()));
		} else {
			a.addAccountIdTypCdgVrsn("NULL");
		}

		if(accountidentifiertypecodingi == accountidentifiertypecodinglist.size()-1) {a.addAccountIdTypCdgVrsn("]]");}


		/******************** Account_Id_Typ_Cdg_Cd ********************************************************************************/
		if(accountidentifiertypecodingi == 0) {a.addAccountIdTypCdgCd("[[");}
		if(accountidentifiertypecoding.hasCode()) {

			a.addAccountIdTypCdgCd(String.valueOf(accountidentifiertypecoding.getCode()));
		} else {
			a.addAccountIdTypCdgCd("NULL");
		}

		if(accountidentifiertypecodingi == accountidentifiertypecodinglist.size()-1) {a.addAccountIdTypCdgCd("]]");}


		/******************** Account_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(accountidentifiertypecodingi == 0) {a.addAccountIdTypCdgUsrSltd("[[");}
		if(accountidentifiertypecoding.hasUserSelected()) {

			a.addAccountIdTypCdgUsrSltd(String.valueOf(accountidentifiertypecoding.getUserSelected()));
		} else {
			a.addAccountIdTypCdgUsrSltd("NULL");
		}

		if(accountidentifiertypecodingi == accountidentifiertypecodinglist.size()-1) {a.addAccountIdTypCdgUsrSltd("]]");}


		/******************** Account_Id_Typ_Cdg_Sys ********************************************************************************/
		if(accountidentifiertypecodingi == 0) {a.addAccountIdTypCdgSys("[[");}
		if(accountidentifiertypecoding.hasSystem()) {

			a.addAccountIdTypCdgSys(String.valueOf(accountidentifiertypecoding.getSystem()));
		} else {
			a.addAccountIdTypCdgSys("NULL");
		}

		if(accountidentifiertypecodingi == accountidentifiertypecodinglist.size()-1) {a.addAccountIdTypCdgSys("]]");}


		 };
		/******************** accountidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountidentifierperiod = accountidentifier.getPeriod();

		/******************** Account_Id_Prd_Strt ********************************************************************************/
		if(accountidentifieri == 0) {a.addAccountIdPrdStrt("[");}
		if(accountidentifierperiod.hasStart()) {

			a.addAccountIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(accountidentifierperiod.getStart())+"\"");
		} else {
			a.addAccountIdPrdStrt("NULL");
		}

		if(accountidentifieri == accountidentifierlist.size()-1) {a.addAccountIdPrdStrt("]");}


		/******************** Account_Id_Prd_End ********************************************************************************/
		if(accountidentifieri == 0) {a.addAccountIdPrdEnd("[");}
		if(accountidentifierperiod.hasEnd()) {

			a.addAccountIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(accountidentifierperiod.getEnd())+"\"");
		} else {
			a.addAccountIdPrdEnd("NULL");
		}

		if(accountidentifieri == accountidentifierlist.size()-1) {a.addAccountIdPrdEnd("]");}


		/******************** accountidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse accountidentifieruse = accountidentifier.getUse();
		if(accountidentifieruse!=null) {
		if(accountidentifieri == 0) {

		a.addAccountIdUse("[");		}
			a.addAccountIdUse(accountidentifieruse.toCode());
		if(accountidentifieri == accountidentifierlist.size()-1) {

		a.addAccountIdUse("]");		}

		} else {
			a.addAccountIdUse("NULL");
		}

		/******************** Account_Id_Assigner ********************************************************************************/
		if(accountidentifieri == 0) {a.addAccountIdAssigner("[");}
		if(accountidentifier.hasAssigner()) {

			if(accountidentifier.getAssigner().getReference() != null) {
			a.addAccountIdAssigner(accountidentifier.getAssigner().getReference());
			}
		} else {
			a.addAccountIdAssigner("NULL");
		}

		if(accountidentifieri == accountidentifierlist.size()-1) {a.addAccountIdAssigner("]");}


		/******************** Account_Id_Sys ********************************************************************************/
		if(accountidentifieri == 0) {a.addAccountIdSys("[");}
		if(accountidentifier.hasSystem()) {

			a.addAccountIdSys(String.valueOf(accountidentifier.getSystem()));
		} else {
			a.addAccountIdSys("NULL");
		}

		if(accountidentifieri == accountidentifierlist.size()-1) {a.addAccountIdSys("]");}


		 };
		/******************** accountcoverage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Account.CoverageComponent> accountcoveragelist = account.getCoverage();
		for(int accountcoveragei = 0; accountcoveragei<accountcoveragelist.size();accountcoveragei++ ) {
		org.hl7.fhir.r4.model.Account.CoverageComponent  accountcoverage = accountcoveragelist.get(accountcoveragei);

		/******************** Account_Cvg_Priority ********************************************************************************/
		if(accountcoveragei == 0) {a.addAccountCvgPriority("[");}
		if(accountcoverage.hasPriority()) {

			a.addAccountCvgPriority(String.valueOf(accountcoverage.getPriority()));
		} else {
			a.addAccountCvgPriority("NULL");
		}

		if(accountcoveragei == accountcoveragelist.size()-1) {a.addAccountCvgPriority("]");}


		 };
		/******************** accountserviceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountserviceperiod = account.getServicePeriod();

		/******************** Account_SrvPrd_Strt ********************************************************************************/
		if(accountserviceperiod.hasStart()) {

			a.addAccountSrvPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(accountserviceperiod.getStart())+"\"");
		} else {
			a.addAccountSrvPrdStrt("NULL");
		}


		/******************** Account_SrvPrd_End ********************************************************************************/
		if(accountserviceperiod.hasEnd()) {

			a.addAccountSrvPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(accountserviceperiod.getEnd())+"\"");
		} else {
			a.addAccountSrvPrdEnd("NULL");
		}


		/******************** accountguarantor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Account.GuarantorComponent> accountguarantorlist = account.getGuarantor();
		for(int accountguarantori = 0; accountguarantori<accountguarantorlist.size();accountguarantori++ ) {
		org.hl7.fhir.r4.model.Account.GuarantorComponent  accountguarantor = accountguarantorlist.get(accountguarantori);

		/******************** accountguarantorperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period accountguarantorperiod = accountguarantor.getPeriod();

		/******************** Account_Guarantor_Prd_Strt ********************************************************************************/
		if(accountguarantori == 0) {a.addAccountGuarantorPrdStrt("[");}
		if(accountguarantorperiod.hasStart()) {

			a.addAccountGuarantorPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(accountguarantorperiod.getStart())+"\"");
		} else {
			a.addAccountGuarantorPrdStrt("NULL");
		}

		if(accountguarantori == accountguarantorlist.size()-1) {a.addAccountGuarantorPrdStrt("]");}


		/******************** Account_Guarantor_Prd_End ********************************************************************************/
		if(accountguarantori == 0) {a.addAccountGuarantorPrdEnd("[");}
		if(accountguarantorperiod.hasEnd()) {

			a.addAccountGuarantorPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(accountguarantorperiod.getEnd())+"\"");
		} else {
			a.addAccountGuarantorPrdEnd("NULL");
		}

		if(accountguarantori == accountguarantorlist.size()-1) {a.addAccountGuarantorPrdEnd("]");}


		/******************** Account_Guarantor_OnHold ********************************************************************************/
		if(accountguarantori == 0) {a.addAccountGuarantorOnHold("[");}
		if(accountguarantor.hasOnHold()) {

			a.addAccountGuarantorOnHold(String.valueOf(accountguarantor.getOnHold()));
		} else {
			a.addAccountGuarantorOnHold("NULL");
		}

		if(accountguarantori == accountguarantorlist.size()-1) {a.addAccountGuarantorOnHold("]");}


		/******************** Account_Guarantor_Party ********************************************************************************/
		if(accountguarantori == 0) {a.addAccountGuarantorParty("[");}
		if(accountguarantor.hasParty()) {

			if(accountguarantor.getParty().getReference() != null) {
			a.addAccountGuarantorParty(accountguarantor.getParty().getReference());
			}
		} else {
			a.addAccountGuarantorParty("NULL");
		}

		if(accountguarantori == accountguarantorlist.size()-1) {a.addAccountGuarantorParty("]");}


		 };
		/******************** Account_PartOf ********************************************************************************/
		if(account.hasPartOf()) {

			if(account.getPartOf().getReference() != null) {
			a.addAccountPartOf(account.getPartOf().getReference());
			}
		} else {
			a.addAccountPartOf("NULL");
		}


		/******************** Account_Owner ********************************************************************************/
		if(account.hasOwner()) {

			if(account.getOwner().getReference() != null) {
			a.addAccountOwner(account.getOwner().getReference());
			}
		} else {
			a.addAccountOwner("NULL");
		}


		return a;
	}
}
