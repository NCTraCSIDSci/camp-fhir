package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Organization;
public class OrganizationConversion 
{
	public org.hl7.fhir.r4.model.Organization Organizations(Organization o) throws ParseException
	{
		org.hl7.fhir.r4.model.Organization organization = new org.hl7.fhir.r4.model.Organization();

		/******************** id ********************************************************************************/
		organization.setId(o.getId());

		/******************** Orgnztn_Active ********************************************************************************/
		if(o.getOrgnztnActive() != null) {
			organization.setActive(Boolean.parseBoolean(o.getOrgnztnActive()));
		}
		/******************** organizationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address organizationaddress =  new org.hl7.fhir.r4.model.Address();
		organization.addAddress(organizationaddress);

		/******************** Orgnztn_Addr_City ********************************************************************************/
		if(o.getOrgnztnAddrCity() != null) {
			organizationaddress.setCity(o.getOrgnztnAddrCity());
		}
		/******************** Orgnztn_Addr_Cntry ********************************************************************************/
		if(o.getOrgnztnAddrCntry() != null) {
			organizationaddress.setCountry(o.getOrgnztnAddrCntry());
		}
		/******************** Orgnztn_Addr_District ********************************************************************************/
		if(o.getOrgnztnAddrDistrict() != null) {
			organizationaddress.setDistrict(o.getOrgnztnAddrDistrict());
		}
		/******************** Orgnztn_Addr_Line ********************************************************************************/
		if(o.getOrgnztnAddrLine() != null) {
			organizationaddress.addLine(o.getOrgnztnAddrLine());
		}
		/******************** organizationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		organizationaddress.setPeriod(organizationaddressperiod);

		/******************** Orgnztn_Addr_Prd_End ********************************************************************************/
		if(o.getOrgnztnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Orgnztn_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Addr_Prd_Enddate = Orgnztn_Addr_Prd_Endsdf.parse(o.getOrgnztnAddrPrdEnd());
			organizationaddressperiod.setEnd(Orgnztn_Addr_Prd_Enddate);
		}
		/******************** Orgnztn_Addr_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Orgnztn_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Addr_Prd_Strtdate = Orgnztn_Addr_Prd_Strtsdf.parse(o.getOrgnztnAddrPrdStrt());
			organizationaddressperiod.setStart(Orgnztn_Addr_Prd_Strtdate);
		}
		/******************** Orgnztn_Addr_PostalCd ********************************************************************************/
		if(o.getOrgnztnAddrPostalCd() != null) {
			organizationaddress.setPostalCode(o.getOrgnztnAddrPostalCd());
		}
		/******************** Orgnztn_Addr_State ********************************************************************************/
		if(o.getOrgnztnAddrState() != null) {
			organizationaddress.setState(o.getOrgnztnAddrState());
		}
		/******************** Orgnztn_Addr_Txt ********************************************************************************/
		if(o.getOrgnztnAddrTxt() != null) {
			organizationaddress.setText(o.getOrgnztnAddrTxt());
		}
		/******************** organizationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory organizationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		organizationaddress.setType(organizationaddresstype.fromCode(o.getOrgnztnAddrTyp()));

		/******************** organizationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory organizationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		organizationaddress.setUse(organizationaddressuse.fromCode(o.getOrgnztnAddrUse()));

		/******************** Orgnztn_Alias ********************************************************************************/
		if(o.getOrgnztnAlias() != null) {
			organization.addAlias(o.getOrgnztnAlias());
		}
		/******************** organizationcontact ********************************************************************************/
		org.hl7.fhir.r4.model.Organization.OrganizationContactComponent organizationcontact =  new org.hl7.fhir.r4.model.Organization.OrganizationContactComponent();
		organization.addContact(organizationcontact);

		/******************** organizationcontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address organizationcontactaddress =  new org.hl7.fhir.r4.model.Address();
		organizationcontact.setAddress(organizationcontactaddress);

		/******************** Orgnztn_Cntct_Addr_City ********************************************************************************/
		if(o.getOrgnztnCntctAddrCity() != null) {
			organizationcontactaddress.setCity(o.getOrgnztnCntctAddrCity());
		}
		/******************** Orgnztn_Cntct_Addr_Cntry ********************************************************************************/
		if(o.getOrgnztnCntctAddrCntry() != null) {
			organizationcontactaddress.setCountry(o.getOrgnztnCntctAddrCntry());
		}
		/******************** Orgnztn_Cntct_Addr_District ********************************************************************************/
		if(o.getOrgnztnCntctAddrDistrict() != null) {
			organizationcontactaddress.setDistrict(o.getOrgnztnCntctAddrDistrict());
		}
		/******************** Orgnztn_Cntct_Addr_Line ********************************************************************************/
		if(o.getOrgnztnCntctAddrLine() != null) {
			organizationcontactaddress.addLine(o.getOrgnztnCntctAddrLine());
		}
		/******************** organizationcontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontactaddressperiod =  new org.hl7.fhir.r4.model.Period();
		organizationcontactaddress.setPeriod(organizationcontactaddressperiod);

		/******************** Orgnztn_Cntct_Addr_Prd_End ********************************************************************************/
		if(o.getOrgnztnCntctAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Orgnztn_Cntct_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Cntct_Addr_Prd_Enddate = Orgnztn_Cntct_Addr_Prd_Endsdf.parse(o.getOrgnztnCntctAddrPrdEnd());
			organizationcontactaddressperiod.setEnd(Orgnztn_Cntct_Addr_Prd_Enddate);
		}
		/******************** Orgnztn_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnCntctAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Orgnztn_Cntct_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Cntct_Addr_Prd_Strtdate = Orgnztn_Cntct_Addr_Prd_Strtsdf.parse(o.getOrgnztnCntctAddrPrdStrt());
			organizationcontactaddressperiod.setStart(Orgnztn_Cntct_Addr_Prd_Strtdate);
		}
		/******************** Orgnztn_Cntct_Addr_PostalCd ********************************************************************************/
		if(o.getOrgnztnCntctAddrPostalCd() != null) {
			organizationcontactaddress.setPostalCode(o.getOrgnztnCntctAddrPostalCd());
		}
		/******************** Orgnztn_Cntct_Addr_State ********************************************************************************/
		if(o.getOrgnztnCntctAddrState() != null) {
			organizationcontactaddress.setState(o.getOrgnztnCntctAddrState());
		}
		/******************** Orgnztn_Cntct_Addr_Txt ********************************************************************************/
		if(o.getOrgnztnCntctAddrTxt() != null) {
			organizationcontactaddress.setText(o.getOrgnztnCntctAddrTxt());
		}
		/******************** organizationcontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory organizationcontactaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		organizationcontactaddress.setType(organizationcontactaddresstype.fromCode(o.getOrgnztnCntctAddrTyp()));

		/******************** organizationcontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory organizationcontactaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		organizationcontactaddress.setUse(organizationcontactaddressuse.fromCode(o.getOrgnztnCntctAddrUse()));

		/******************** organizationcontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName organizationcontactname =  new org.hl7.fhir.r4.model.HumanName();
		organizationcontact.setName(organizationcontactname);

		/******************** Orgnztn_Cntct_Nm_Fmly ********************************************************************************/
		if(o.getOrgnztnCntctNmFmly() != null) {
			organizationcontactname.setFamily(o.getOrgnztnCntctNmFmly());
		}
		/******************** Orgnztn_Cntct_Nm_Given ********************************************************************************/
		if(o.getOrgnztnCntctNmGiven() != null) {
			organizationcontactname.addGiven(o.getOrgnztnCntctNmGiven());
		}
		/******************** organizationcontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontactnameperiod =  new org.hl7.fhir.r4.model.Period();
		organizationcontactname.setPeriod(organizationcontactnameperiod);

		/******************** Orgnztn_Cntct_Nm_Prd_End ********************************************************************************/
		if(o.getOrgnztnCntctNmPrdEnd() != null) {
			java.text.SimpleDateFormat Orgnztn_Cntct_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Cntct_Nm_Prd_Enddate = Orgnztn_Cntct_Nm_Prd_Endsdf.parse(o.getOrgnztnCntctNmPrdEnd());
			organizationcontactnameperiod.setEnd(Orgnztn_Cntct_Nm_Prd_Enddate);
		}
		/******************** Orgnztn_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnCntctNmPrdStrt() != null) {
			java.text.SimpleDateFormat Orgnztn_Cntct_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Cntct_Nm_Prd_Strtdate = Orgnztn_Cntct_Nm_Prd_Strtsdf.parse(o.getOrgnztnCntctNmPrdStrt());
			organizationcontactnameperiod.setStart(Orgnztn_Cntct_Nm_Prd_Strtdate);
		}
		/******************** Orgnztn_Cntct_Nm_Prefix ********************************************************************************/
		if(o.getOrgnztnCntctNmPrefix() != null) {
			organizationcontactname.addPrefix(o.getOrgnztnCntctNmPrefix());
		}
		/******************** Orgnztn_Cntct_Nm_Suffix ********************************************************************************/
		if(o.getOrgnztnCntctNmSuffix() != null) {
			organizationcontactname.addSuffix(o.getOrgnztnCntctNmSuffix());
		}
		/******************** Orgnztn_Cntct_Nm_Txt ********************************************************************************/
		if(o.getOrgnztnCntctNmTxt() != null) {
			organizationcontactname.setText(o.getOrgnztnCntctNmTxt());
		}
		/******************** organizationcontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory organizationcontactnameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		organizationcontactname.setUse(organizationcontactnameuse.fromCode(o.getOrgnztnCntctNmUse()));

		/******************** organizationcontactpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationcontactpurpose =  new org.hl7.fhir.r4.model.CodeableConcept();
		organizationcontact.setPurpose(organizationcontactpurpose);

		/******************** organizationcontactpurposecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationcontactpurposecoding =  new org.hl7.fhir.r4.model.Coding();
		organizationcontactpurpose.addCoding(organizationcontactpurposecoding);

		/******************** Orgnztn_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgCd() != null) {
			organizationcontactpurposecoding.setCode(o.getOrgnztnCntctPrpseCdgCd());
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgDsply() != null) {
			organizationcontactpurposecoding.setDisplay(o.getOrgnztnCntctPrpseCdgDsply());
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgSys() != null) {
			organizationcontactpurposecoding.setSystem(o.getOrgnztnCntctPrpseCdgSys());
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgUsrSltd() != null) {
			organizationcontactpurposecoding.setUserSelected(Boolean.parseBoolean(o.getOrgnztnCntctPrpseCdgUsrSltd()));
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgVrsn() != null) {
			organizationcontactpurposecoding.setVersion(o.getOrgnztnCntctPrpseCdgVrsn());
		}
		/******************** Orgnztn_Cntct_Prpse_Txt ********************************************************************************/
		if(o.getOrgnztnCntctPrpseTxt() != null) {
			organizationcontactpurpose.setText(o.getOrgnztnCntctPrpseTxt());
		}
		/******************** organizationcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint organizationcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		organizationcontact.addTelecom(organizationcontacttelecom);

		/******************** organizationcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		organizationcontacttelecom.setPeriod(organizationcontacttelecomperiod);

		/******************** Orgnztn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(o.getOrgnztnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Orgnztn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Cntct_Tlcm_Prd_Enddate = Orgnztn_Cntct_Tlcm_Prd_Endsdf.parse(o.getOrgnztnCntctTlcmPrdEnd());
			organizationcontacttelecomperiod.setEnd(Orgnztn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** Orgnztn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Orgnztn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Cntct_Tlcm_Prd_Strtdate = Orgnztn_Cntct_Tlcm_Prd_Strtsdf.parse(o.getOrgnztnCntctTlcmPrdStrt());
			organizationcontacttelecomperiod.setStart(Orgnztn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** Orgnztn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(o.getOrgnztnCntctTlcmRnk() != null) {
			organizationcontacttelecom.setRank(Integer.parseInt(o.getOrgnztnCntctTlcmRnk()));
		}
		/******************** organizationcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory organizationcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		organizationcontacttelecom.setSystem(organizationcontacttelecomsystem.fromCode(o.getOrgnztnCntctTlcmSys()));

		/******************** organizationcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory organizationcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		organizationcontacttelecom.setUse(organizationcontacttelecomuse.fromCode(o.getOrgnztnCntctTlcmUse()));

		/******************** Orgnztn_Cntct_Tlcm_Vl ********************************************************************************/
		if(o.getOrgnztnCntctTlcmVl() != null) {
			organizationcontacttelecom.setValue(o.getOrgnztnCntctTlcmVl());
		}
		/******************** Orgnztn_Endpoint ********************************************************************************/
		if(o.getOrgnztnEndpoint() != null) {
			organization.addEndpoint( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnEndpoint()));
		}
		/******************** organizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier organizationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		organization.addIdentifier(organizationidentifier);

		/******************** Orgnztn_Id_Assigner ********************************************************************************/
		if(o.getOrgnztnIdAssigner() != null) {
			organizationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnIdAssigner()));
		}
		/******************** organizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		organizationidentifier.setPeriod(organizationidentifierperiod);

		/******************** Orgnztn_Id_Prd_End ********************************************************************************/
		if(o.getOrgnztnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Orgnztn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Id_Prd_Enddate = Orgnztn_Id_Prd_Endsdf.parse(o.getOrgnztnIdPrdEnd());
			organizationidentifierperiod.setEnd(Orgnztn_Id_Prd_Enddate);
		}
		/******************** Orgnztn_Id_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Orgnztn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Id_Prd_Strtdate = Orgnztn_Id_Prd_Strtsdf.parse(o.getOrgnztnIdPrdStrt());
			organizationidentifierperiod.setStart(Orgnztn_Id_Prd_Strtdate);
		}
		/******************** Orgnztn_Id_Sys ********************************************************************************/
		if(o.getOrgnztnIdSys() != null) {
			organizationidentifier.setSystem(o.getOrgnztnIdSys());
		}
		/******************** organizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		organizationidentifier.setType(organizationidentifiertype);

		/******************** organizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		organizationidentifiertype.addCoding(organizationidentifiertypecoding);

		/******************** Orgnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnIdTypCdgCd() != null) {
			organizationidentifiertypecoding.setCode(o.getOrgnztnIdTypCdgCd());
		}
		/******************** Orgnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnIdTypCdgDsply() != null) {
			organizationidentifiertypecoding.setDisplay(o.getOrgnztnIdTypCdgDsply());
		}
		/******************** Orgnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnIdTypCdgSys() != null) {
			organizationidentifiertypecoding.setSystem(o.getOrgnztnIdTypCdgSys());
		}
		/******************** Orgnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnIdTypCdgUsrSltd() != null) {
			organizationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(o.getOrgnztnIdTypCdgUsrSltd()));
		}
		/******************** Orgnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnIdTypCdgVrsn() != null) {
			organizationidentifiertypecoding.setVersion(o.getOrgnztnIdTypCdgVrsn());
		}
		/******************** Orgnztn_Id_Typ_Txt ********************************************************************************/
		if(o.getOrgnztnIdTypTxt() != null) {
			organizationidentifiertype.setText(o.getOrgnztnIdTypTxt());
		}
		/******************** organizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory organizationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		organizationidentifier.setUse(organizationidentifieruse.fromCode(o.getOrgnztnIdUse()));

		/******************** Orgnztn_Id_Vl ********************************************************************************/
		if(o.getOrgnztnIdVl() != null) {
			organizationidentifier.setValue(o.getOrgnztnIdVl());
		}
		/******************** Orgnztn_Nm ********************************************************************************/
		if(o.getOrgnztnNm() != null) {
			organization.setName(o.getOrgnztnNm());
		}
		/******************** Orgnztn_PartOf ********************************************************************************/
		if(o.getOrgnztnPartOf() != null) {
			organization.setPartOf( new org.hl7.fhir.r4.model.Reference(o.getOrgnztnPartOf()));
		}
		/******************** organizationtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint organizationtelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		organization.addTelecom(organizationtelecom);

		/******************** organizationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationtelecomperiod =  new org.hl7.fhir.r4.model.Period();
		organizationtelecom.setPeriod(organizationtelecomperiod);

		/******************** Orgnztn_Tlcm_Prd_End ********************************************************************************/
		if(o.getOrgnztnTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Orgnztn_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Tlcm_Prd_Enddate = Orgnztn_Tlcm_Prd_Endsdf.parse(o.getOrgnztnTlcmPrdEnd());
			organizationtelecomperiod.setEnd(Orgnztn_Tlcm_Prd_Enddate);
		}
		/******************** Orgnztn_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Orgnztn_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Orgnztn_Tlcm_Prd_Strtdate = Orgnztn_Tlcm_Prd_Strtsdf.parse(o.getOrgnztnTlcmPrdStrt());
			organizationtelecomperiod.setStart(Orgnztn_Tlcm_Prd_Strtdate);
		}
		/******************** Orgnztn_Tlcm_Rnk ********************************************************************************/
		if(o.getOrgnztnTlcmRnk() != null) {
			organizationtelecom.setRank(Integer.parseInt(o.getOrgnztnTlcmRnk()));
		}
		/******************** organizationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory organizationtelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		organizationtelecom.setSystem(organizationtelecomsystem.fromCode(o.getOrgnztnTlcmSys()));

		/******************** organizationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory organizationtelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		organizationtelecom.setUse(organizationtelecomuse.fromCode(o.getOrgnztnTlcmUse()));

		/******************** Orgnztn_Tlcm_Vl ********************************************************************************/
		if(o.getOrgnztnTlcmVl() != null) {
			organizationtelecom.setValue(o.getOrgnztnTlcmVl());
		}
		/******************** organizationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		organization.addType(organizationtype);

		/******************** organizationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		organizationtype.addCoding(organizationtypecoding);

		/******************** Orgnztn_Typ_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnTypCdgCd() != null) {
			organizationtypecoding.setCode(o.getOrgnztnTypCdgCd());
		}
		/******************** Orgnztn_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnTypCdgDsply() != null) {
			organizationtypecoding.setDisplay(o.getOrgnztnTypCdgDsply());
		}
		/******************** Orgnztn_Typ_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnTypCdgSys() != null) {
			organizationtypecoding.setSystem(o.getOrgnztnTypCdgSys());
		}
		/******************** Orgnztn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnTypCdgUsrSltd() != null) {
			organizationtypecoding.setUserSelected(Boolean.parseBoolean(o.getOrgnztnTypCdgUsrSltd()));
		}
		/******************** Orgnztn_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnTypCdgVrsn() != null) {
			organizationtypecoding.setVersion(o.getOrgnztnTypCdgVrsn());
		}
		/******************** Orgnztn_Typ_Txt ********************************************************************************/
		if(o.getOrgnztnTypTxt() != null) {
			organizationtype.setText(o.getOrgnztnTypTxt());
		}
		return organization;
	}
}
