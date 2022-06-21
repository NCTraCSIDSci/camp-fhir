package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Organization;
public class OrganizationBidirectionalConversion 
{
	public Organization Organizations(org.hl7.fhir.r4.model.Organization organization) throws ParseException
	{
		 main.java.com.campfhir.model.Organization o = new  main.java.com.campfhir.model.Organization();

		/******************** id ********************************************************************************/
		organization.setId(o.getId());

		/******************** Orgnztn_Nm ********************************************************************************/
		if(organization.hasName()) {
			o.setOrgnztnNm(String.valueOf(organization.getName()));
		}
		/******************** Orgnztn_Endpoint ********************************************************************************/
		if(organization.hasEndpoint()) {
			o.setOrgnztnEndpoint(String.valueOf(organization.getEndpointFirstRep()));
		}
		/******************** organizationcontact ********************************************************************************/
		org.hl7.fhir.r4.model.Organization.OrganizationContactComponent organizationcontact = organization.getContactFirstRep();

		/******************** organizationcontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName organizationcontactname = organizationcontact.getName();

		/******************** Orgnztn_Cntct_Nm_Txt ********************************************************************************/
		if(organizationcontactname.hasText()) {
			o.setOrgnztnCntctNmTxt(String.valueOf(organizationcontactname.getText()));
		}
		/******************** organizationcontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontactnameperiod = organizationcontactname.getPeriod();

		/******************** Orgnztn_Cntct_Nm_Prd_End ********************************************************************************/
		if(organizationcontactnameperiod.hasEnd()) {
			o.setOrgnztnCntctNmPrdEnd(String.valueOf(organizationcontactnameperiod.getEnd()));
		}
		/******************** Orgnztn_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(organizationcontactnameperiod.hasStart()) {
			o.setOrgnztnCntctNmPrdStrt(String.valueOf(organizationcontactnameperiod.getStart()));
		}
		/******************** Orgnztn_Cntct_Nm_Suffix ********************************************************************************/
		if(organizationcontactname.hasSuffix()) {
			o.setOrgnztnCntctNmSuffix(String.valueOf(organizationcontactname.getSuffixAsSingleString()));
		}
		/******************** Orgnztn_Cntct_Nm_Prefix ********************************************************************************/
		if(organizationcontactname.hasPrefix()) {
			o.setOrgnztnCntctNmPrefix(String.valueOf(organizationcontactname.getPrefixAsSingleString()));
		}
		/******************** Orgnztn_Cntct_Nm_Given ********************************************************************************/
		if(organizationcontactname.hasGiven()) {
			o.setOrgnztnCntctNmGiven(String.valueOf(organizationcontactname.getGivenAsSingleString()));
		}
		/******************** Orgnztn_Cntct_Nm_Fmly ********************************************************************************/
		if(organizationcontactname.hasFamily()) {
			o.setOrgnztnCntctNmFmly(String.valueOf(organizationcontactname.getFamily()));
		}
		/******************** organizationcontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse organizationcontactnameuse = organizationcontactname.getUse();
		o.setOrgnztnCntctNmUse(organizationcontactnameuse.toCode());

		/******************** organizationcontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address organizationcontactaddress = organizationcontact.getAddress();

		/******************** Orgnztn_Cntct_Addr_State ********************************************************************************/
		if(organizationcontactaddress.hasState()) {
			o.setOrgnztnCntctAddrState(String.valueOf(organizationcontactaddress.getState()));
		}
		/******************** organizationcontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType organizationcontactaddresstype = organizationcontactaddress.getType();
		o.setOrgnztnCntctAddrTyp(organizationcontactaddresstype.toCode());

		/******************** Orgnztn_Cntct_Addr_Cntry ********************************************************************************/
		if(organizationcontactaddress.hasCountry()) {
			o.setOrgnztnCntctAddrCntry(String.valueOf(organizationcontactaddress.getCountry()));
		}
		/******************** Orgnztn_Cntct_Addr_Txt ********************************************************************************/
		if(organizationcontactaddress.hasText()) {
			o.setOrgnztnCntctAddrTxt(String.valueOf(organizationcontactaddress.getText()));
		}
		/******************** organizationcontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontactaddressperiod = organizationcontactaddress.getPeriod();

		/******************** Orgnztn_Cntct_Addr_Prd_End ********************************************************************************/
		if(organizationcontactaddressperiod.hasEnd()) {
			o.setOrgnztnCntctAddrPrdEnd(String.valueOf(organizationcontactaddressperiod.getEnd()));
		}
		/******************** Orgnztn_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(organizationcontactaddressperiod.hasStart()) {
			o.setOrgnztnCntctAddrPrdStrt(String.valueOf(organizationcontactaddressperiod.getStart()));
		}
		/******************** Orgnztn_Cntct_Addr_PostalCd ********************************************************************************/
		if(organizationcontactaddress.hasPostalCode()) {
			o.setOrgnztnCntctAddrPostalCd(String.valueOf(organizationcontactaddress.getPostalCode()));
		}
		/******************** Orgnztn_Cntct_Addr_City ********************************************************************************/
		if(organizationcontactaddress.hasCity()) {
			o.setOrgnztnCntctAddrCity(String.valueOf(organizationcontactaddress.getCity()));
		}
		/******************** Orgnztn_Cntct_Addr_District ********************************************************************************/
		if(organizationcontactaddress.hasDistrict()) {
			o.setOrgnztnCntctAddrDistrict(String.valueOf(organizationcontactaddress.getDistrict()));
		}
		/******************** organizationcontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse organizationcontactaddressuse = organizationcontactaddress.getUse();
		o.setOrgnztnCntctAddrUse(organizationcontactaddressuse.toCode());

		/******************** organizationcontactpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationcontactpurpose = organizationcontact.getPurpose();

		/******************** organizationcontactpurposecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationcontactpurposecoding = organizationcontactpurpose.getCodingFirstRep();

		/******************** Orgnztn_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(organizationcontactpurposecoding.hasDisplay()) {
			o.setOrgnztnCntctPrpseCdgDsply(String.valueOf(organizationcontactpurposecoding.getDisplay()));
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(organizationcontactpurposecoding.hasVersion()) {
			o.setOrgnztnCntctPrpseCdgVrsn(String.valueOf(organizationcontactpurposecoding.getVersion()));
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(organizationcontactpurposecoding.hasCode()) {
			o.setOrgnztnCntctPrpseCdgCd(String.valueOf(organizationcontactpurposecoding.getCode()));
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(organizationcontactpurposecoding.hasSystem()) {
			o.setOrgnztnCntctPrpseCdgSys(String.valueOf(organizationcontactpurposecoding.getSystem()));
		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(organizationcontactpurposecoding.hasUserSelected()) {
			o.setOrgnztnCntctPrpseCdgUsrSltd(String.valueOf(organizationcontactpurposecoding.getUserSelected()));
		}
		/******************** Orgnztn_Cntct_Prpse_Txt ********************************************************************************/
		if(organizationcontactpurpose.hasText()) {
			o.setOrgnztnCntctPrpseTxt(String.valueOf(organizationcontactpurpose.getText()));
		}
		/******************** organizationcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint organizationcontacttelecom = organizationcontact.getTelecomFirstRep();

		/******************** Orgnztn_Cntct_Tlcm_Vl ********************************************************************************/
		if(organizationcontacttelecom.hasValue()) {
			o.setOrgnztnCntctTlcmVl(String.valueOf(organizationcontacttelecom.getValue()));
		}
		/******************** organizationcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem organizationcontacttelecomsystem = organizationcontacttelecom.getSystem();
		o.setOrgnztnCntctTlcmSys(organizationcontacttelecomsystem.toCode());

		/******************** organizationcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontacttelecomperiod = organizationcontacttelecom.getPeriod();

		/******************** Orgnztn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(organizationcontacttelecomperiod.hasEnd()) {
			o.setOrgnztnCntctTlcmPrdEnd(String.valueOf(organizationcontacttelecomperiod.getEnd()));
		}
		/******************** Orgnztn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(organizationcontacttelecomperiod.hasStart()) {
			o.setOrgnztnCntctTlcmPrdStrt(String.valueOf(organizationcontacttelecomperiod.getStart()));
		}
		/******************** organizationcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse organizationcontacttelecomuse = organizationcontacttelecom.getUse();
		o.setOrgnztnCntctTlcmUse(organizationcontacttelecomuse.toCode());

		/******************** Orgnztn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(organizationcontacttelecom.hasRank()) {
			o.setOrgnztnCntctTlcmRnk(String.valueOf(organizationcontacttelecom.getRank()));
		}
		/******************** organizationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationtype = organization.getTypeFirstRep();

		/******************** organizationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationtypecoding = organizationtype.getCodingFirstRep();

		/******************** Orgnztn_Typ_Cdg_Dsply ********************************************************************************/
		if(organizationtypecoding.hasDisplay()) {
			o.setOrgnztnTypCdgDsply(String.valueOf(organizationtypecoding.getDisplay()));
		}
		/******************** Orgnztn_Typ_Cdg_Vrsn ********************************************************************************/
		if(organizationtypecoding.hasVersion()) {
			o.setOrgnztnTypCdgVrsn(String.valueOf(organizationtypecoding.getVersion()));
		}
		/******************** Orgnztn_Typ_Cdg_Cd ********************************************************************************/
		if(organizationtypecoding.hasCode()) {
			o.setOrgnztnTypCdgCd(String.valueOf(organizationtypecoding.getCode()));
		}
		/******************** Orgnztn_Typ_Cdg_Sys ********************************************************************************/
		if(organizationtypecoding.hasSystem()) {
			o.setOrgnztnTypCdgSys(String.valueOf(organizationtypecoding.getSystem()));
		}
		/******************** Orgnztn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(organizationtypecoding.hasUserSelected()) {
			o.setOrgnztnTypCdgUsrSltd(String.valueOf(organizationtypecoding.getUserSelected()));
		}
		/******************** Orgnztn_Typ_Txt ********************************************************************************/
		if(organizationtype.hasText()) {
			o.setOrgnztnTypTxt(String.valueOf(organizationtype.getText()));
		}
		/******************** Orgnztn_PartOf ********************************************************************************/
		if(organization.hasPartOf()) {
			o.setOrgnztnPartOf(String.valueOf(organization.getPartOf()));
		}
		/******************** organizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier organizationidentifier = organization.getIdentifierFirstRep();

		/******************** Orgnztn_Id_Vl ********************************************************************************/
		if(organizationidentifier.hasValue()) {
			o.setOrgnztnIdVl(String.valueOf(organizationidentifier.getValue()));
		}
		/******************** organizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationidentifiertype = organizationidentifier.getType();

		/******************** organizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding organizationidentifiertypecoding = organizationidentifiertype.getCodingFirstRep();

		/******************** Orgnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(organizationidentifiertypecoding.hasDisplay()) {
			o.setOrgnztnIdTypCdgDsply(String.valueOf(organizationidentifiertypecoding.getDisplay()));
		}
		/******************** Orgnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(organizationidentifiertypecoding.hasVersion()) {
			o.setOrgnztnIdTypCdgVrsn(String.valueOf(organizationidentifiertypecoding.getVersion()));
		}
		/******************** Orgnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(organizationidentifiertypecoding.hasCode()) {
			o.setOrgnztnIdTypCdgCd(String.valueOf(organizationidentifiertypecoding.getCode()));
		}
		/******************** Orgnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(organizationidentifiertypecoding.hasSystem()) {
			o.setOrgnztnIdTypCdgSys(String.valueOf(organizationidentifiertypecoding.getSystem()));
		}
		/******************** Orgnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(organizationidentifiertypecoding.hasUserSelected()) {
			o.setOrgnztnIdTypCdgUsrSltd(String.valueOf(organizationidentifiertypecoding.getUserSelected()));
		}
		/******************** Orgnztn_Id_Typ_Txt ********************************************************************************/
		if(organizationidentifiertype.hasText()) {
			o.setOrgnztnIdTypTxt(String.valueOf(organizationidentifiertype.getText()));
		}
		/******************** Orgnztn_Id_Sys ********************************************************************************/
		if(organizationidentifier.hasSystem()) {
			o.setOrgnztnIdSys(String.valueOf(organizationidentifier.getSystem()));
		}
		/******************** Orgnztn_Id_Assigner ********************************************************************************/
		if(organizationidentifier.hasAssigner()) {
			o.setOrgnztnIdAssigner(String.valueOf(organizationidentifier.getAssigner()));
		}
		/******************** organizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationidentifierperiod = organizationidentifier.getPeriod();

		/******************** Orgnztn_Id_Prd_End ********************************************************************************/
		if(organizationidentifierperiod.hasEnd()) {
			o.setOrgnztnIdPrdEnd(String.valueOf(organizationidentifierperiod.getEnd()));
		}
		/******************** Orgnztn_Id_Prd_Strt ********************************************************************************/
		if(organizationidentifierperiod.hasStart()) {
			o.setOrgnztnIdPrdStrt(String.valueOf(organizationidentifierperiod.getStart()));
		}
		/******************** organizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse organizationidentifieruse = organizationidentifier.getUse();
		o.setOrgnztnIdUse(organizationidentifieruse.toCode());

		/******************** Orgnztn_Active ********************************************************************************/
		if(organization.hasActive()) {
			o.setOrgnztnActive(String.valueOf(organization.getActive()));
		}
		/******************** organizationtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint organizationtelecom = organization.getTelecomFirstRep();

		/******************** Orgnztn_Tlcm_Vl ********************************************************************************/
		if(organizationtelecom.hasValue()) {
			o.setOrgnztnTlcmVl(String.valueOf(organizationtelecom.getValue()));
		}
		/******************** organizationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem organizationtelecomsystem = organizationtelecom.getSystem();
		o.setOrgnztnTlcmSys(organizationtelecomsystem.toCode());

		/******************** organizationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationtelecomperiod = organizationtelecom.getPeriod();

		/******************** Orgnztn_Tlcm_Prd_End ********************************************************************************/
		if(organizationtelecomperiod.hasEnd()) {
			o.setOrgnztnTlcmPrdEnd(String.valueOf(organizationtelecomperiod.getEnd()));
		}
		/******************** Orgnztn_Tlcm_Prd_Strt ********************************************************************************/
		if(organizationtelecomperiod.hasStart()) {
			o.setOrgnztnTlcmPrdStrt(String.valueOf(organizationtelecomperiod.getStart()));
		}
		/******************** organizationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse organizationtelecomuse = organizationtelecom.getUse();
		o.setOrgnztnTlcmUse(organizationtelecomuse.toCode());

		/******************** Orgnztn_Tlcm_Rnk ********************************************************************************/
		if(organizationtelecom.hasRank()) {
			o.setOrgnztnTlcmRnk(String.valueOf(organizationtelecom.getRank()));
		}
		/******************** organizationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address organizationaddress = organization.getAddressFirstRep();

		/******************** Orgnztn_Addr_State ********************************************************************************/
		if(organizationaddress.hasState()) {
			o.setOrgnztnAddrState(String.valueOf(organizationaddress.getState()));
		}
		/******************** organizationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType organizationaddresstype = organizationaddress.getType();
		o.setOrgnztnAddrTyp(organizationaddresstype.toCode());

		/******************** Orgnztn_Addr_Cntry ********************************************************************************/
		if(organizationaddress.hasCountry()) {
			o.setOrgnztnAddrCntry(String.valueOf(organizationaddress.getCountry()));
		}
		/******************** Orgnztn_Addr_Txt ********************************************************************************/
		if(organizationaddress.hasText()) {
			o.setOrgnztnAddrTxt(String.valueOf(organizationaddress.getText()));
		}
		/******************** organizationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaddressperiod = organizationaddress.getPeriod();

		/******************** Orgnztn_Addr_Prd_End ********************************************************************************/
		if(organizationaddressperiod.hasEnd()) {
			o.setOrgnztnAddrPrdEnd(String.valueOf(organizationaddressperiod.getEnd()));
		}
		/******************** Orgnztn_Addr_Prd_Strt ********************************************************************************/
		if(organizationaddressperiod.hasStart()) {
			o.setOrgnztnAddrPrdStrt(String.valueOf(organizationaddressperiod.getStart()));
		}
		/******************** Orgnztn_Addr_PostalCd ********************************************************************************/
		if(organizationaddress.hasPostalCode()) {
			o.setOrgnztnAddrPostalCd(String.valueOf(organizationaddress.getPostalCode()));
		}
		/******************** Orgnztn_Addr_City ********************************************************************************/
		if(organizationaddress.hasCity()) {
			o.setOrgnztnAddrCity(String.valueOf(organizationaddress.getCity()));
		}
		/******************** Orgnztn_Addr_District ********************************************************************************/
		if(organizationaddress.hasDistrict()) {
			o.setOrgnztnAddrDistrict(String.valueOf(organizationaddress.getDistrict()));
		}
		/******************** organizationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse organizationaddressuse = organizationaddress.getUse();
		o.setOrgnztnAddrUse(organizationaddressuse.toCode());

		return o;
	}
}
