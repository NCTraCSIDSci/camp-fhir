package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Endpoint;
public class EndpointConversion 
{
	public org.hl7.fhir.r4.model.Endpoint Endpoints(Endpoint e) throws ParseException
	{
		org.hl7.fhir.r4.model.Endpoint endpoint = new org.hl7.fhir.r4.model.Endpoint();

		/******************** id ********************************************************************************/
		endpoint.setId(e.getId());

		/******************** Endpoint_Addr ********************************************************************************/
		if(e.getEndpointAddr() != null) {
			endpoint.setAddress(e.getEndpointAddr());
		}
		/******************** endpointconnectiontype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointconnectiontype =  new org.hl7.fhir.r4.model.Coding();
		endpoint.setConnectionType(endpointconnectiontype);

		/******************** Endpoint_ConnectionTyp_Cd ********************************************************************************/
		if(e.getEndpointConnectionTypCd() != null) {
			endpointconnectiontype.setCode(e.getEndpointConnectionTypCd());
		}
		/******************** Endpoint_ConnectionTyp_Dsply ********************************************************************************/
		if(e.getEndpointConnectionTypDsply() != null) {
			endpointconnectiontype.setDisplay(e.getEndpointConnectionTypDsply());
		}
		/******************** Endpoint_ConnectionTyp_Sys ********************************************************************************/
		if(e.getEndpointConnectionTypSys() != null) {
			endpointconnectiontype.setSystem(e.getEndpointConnectionTypSys());
		}
		/******************** Endpoint_ConnectionTyp_UsrSltd ********************************************************************************/
		if(e.getEndpointConnectionTypUsrSltd() != null) {
			endpointconnectiontype.setUserSelected(Boolean.parseBoolean(e.getEndpointConnectionTypUsrSltd()));
		}
		/******************** Endpoint_ConnectionTyp_Vrsn ********************************************************************************/
		if(e.getEndpointConnectionTypVrsn() != null) {
			endpointconnectiontype.setVersion(e.getEndpointConnectionTypVrsn());
		}
		/******************** endpointcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint endpointcontact =  new org.hl7.fhir.r4.model.ContactPoint();
		endpoint.addContact(endpointcontact);

		/******************** endpointcontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointcontactperiod =  new org.hl7.fhir.r4.model.Period();
		endpointcontact.setPeriod(endpointcontactperiod);

		/******************** Endpoint_Cntct_Prd_End ********************************************************************************/
		if(e.getEndpointCntctPrdEnd() != null) {
			java.text.SimpleDateFormat Endpoint_Cntct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Endpoint_Cntct_Prd_Enddate = Endpoint_Cntct_Prd_Endsdf.parse(e.getEndpointCntctPrdEnd());
			endpointcontactperiod.setEnd(Endpoint_Cntct_Prd_Enddate);
		}
		/******************** Endpoint_Cntct_Prd_Strt ********************************************************************************/
		if(e.getEndpointCntctPrdStrt() != null) {
			java.text.SimpleDateFormat Endpoint_Cntct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Endpoint_Cntct_Prd_Strtdate = Endpoint_Cntct_Prd_Strtsdf.parse(e.getEndpointCntctPrdStrt());
			endpointcontactperiod.setStart(Endpoint_Cntct_Prd_Strtdate);
		}
		/******************** Endpoint_Cntct_Rnk ********************************************************************************/
		if(e.getEndpointCntctRnk() != null) {
			endpointcontact.setRank(Integer.parseInt(e.getEndpointCntctRnk()));
		}
		/******************** endpointcontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory endpointcontactsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		endpointcontact.setSystem(endpointcontactsystem.fromCode(e.getEndpointCntctSys()));

		/******************** endpointcontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory endpointcontactuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		endpointcontact.setUse(endpointcontactuse.fromCode(e.getEndpointCntctUse()));

		/******************** Endpoint_Cntct_Vl ********************************************************************************/
		if(e.getEndpointCntctVl() != null) {
			endpointcontact.setValue(e.getEndpointCntctVl());
		}
		/******************** Endpoint_Header ********************************************************************************/
		if(e.getEndpointHeader() != null) {
			endpoint.addHeader(e.getEndpointHeader());
		}
		/******************** endpointidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier endpointidentifier =  new org.hl7.fhir.r4.model.Identifier();
		endpoint.addIdentifier(endpointidentifier);

		/******************** Endpoint_Id_Assigner ********************************************************************************/
		if(e.getEndpointIdAssigner() != null) {
			endpointidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEndpointIdAssigner()));
		}
		/******************** endpointidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		endpointidentifier.setPeriod(endpointidentifierperiod);

		/******************** Endpoint_Id_Prd_End ********************************************************************************/
		if(e.getEndpointIdPrdEnd() != null) {
			java.text.SimpleDateFormat Endpoint_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Endpoint_Id_Prd_Enddate = Endpoint_Id_Prd_Endsdf.parse(e.getEndpointIdPrdEnd());
			endpointidentifierperiod.setEnd(Endpoint_Id_Prd_Enddate);
		}
		/******************** Endpoint_Id_Prd_Strt ********************************************************************************/
		if(e.getEndpointIdPrdStrt() != null) {
			java.text.SimpleDateFormat Endpoint_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Endpoint_Id_Prd_Strtdate = Endpoint_Id_Prd_Strtsdf.parse(e.getEndpointIdPrdStrt());
			endpointidentifierperiod.setStart(Endpoint_Id_Prd_Strtdate);
		}
		/******************** Endpoint_Id_Sys ********************************************************************************/
		if(e.getEndpointIdSys() != null) {
			endpointidentifier.setSystem(e.getEndpointIdSys());
		}
		/******************** endpointidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept endpointidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		endpointidentifier.setType(endpointidentifiertype);

		/******************** endpointidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		endpointidentifiertype.addCoding(endpointidentifiertypecoding);

		/******************** Endpoint_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEndpointIdTypCdgCd() != null) {
			endpointidentifiertypecoding.setCode(e.getEndpointIdTypCdgCd());
		}
		/******************** Endpoint_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEndpointIdTypCdgDsply() != null) {
			endpointidentifiertypecoding.setDisplay(e.getEndpointIdTypCdgDsply());
		}
		/******************** Endpoint_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEndpointIdTypCdgSys() != null) {
			endpointidentifiertypecoding.setSystem(e.getEndpointIdTypCdgSys());
		}
		/******************** Endpoint_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEndpointIdTypCdgUsrSltd() != null) {
			endpointidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEndpointIdTypCdgUsrSltd()));
		}
		/******************** Endpoint_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEndpointIdTypCdgVrsn() != null) {
			endpointidentifiertypecoding.setVersion(e.getEndpointIdTypCdgVrsn());
		}
		/******************** Endpoint_Id_Typ_Txt ********************************************************************************/
		if(e.getEndpointIdTypTxt() != null) {
			endpointidentifiertype.setText(e.getEndpointIdTypTxt());
		}
		/******************** endpointidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory endpointidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		endpointidentifier.setUse(endpointidentifieruse.fromCode(e.getEndpointIdUse()));

		/******************** Endpoint_Id_Vl ********************************************************************************/
		if(e.getEndpointIdVl() != null) {
			endpointidentifier.setValue(e.getEndpointIdVl());
		}
		/******************** Endpoint_ManagingOrgnztn ********************************************************************************/
		if(e.getEndpointManagingOrgnztn() != null) {
			endpoint.setManagingOrganization( new org.hl7.fhir.r4.model.Reference(e.getEndpointManagingOrgnztn()));
		}
		/******************** Endpoint_Nm ********************************************************************************/
		if(e.getEndpointNm() != null) {
			endpoint.setName(e.getEndpointNm());
		}
		/******************** Endpoint_PayloadMimeTyp ********************************************************************************/
		if(e.getEndpointPayloadMimeTyp() != null) {
			endpoint.addPayloadMimeType(e.getEndpointPayloadMimeTyp());
		}
		/******************** endpointpayloadtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept endpointpayloadtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		endpoint.addPayloadType(endpointpayloadtype);

		/******************** endpointpayloadtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointpayloadtypecoding =  new org.hl7.fhir.r4.model.Coding();
		endpointpayloadtype.addCoding(endpointpayloadtypecoding);

		/******************** Endpoint_PayloadTyp_Cdg_Cd ********************************************************************************/
		if(e.getEndpointPayloadTypCdgCd() != null) {
			endpointpayloadtypecoding.setCode(e.getEndpointPayloadTypCdgCd());
		}
		/******************** Endpoint_PayloadTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEndpointPayloadTypCdgDsply() != null) {
			endpointpayloadtypecoding.setDisplay(e.getEndpointPayloadTypCdgDsply());
		}
		/******************** Endpoint_PayloadTyp_Cdg_Sys ********************************************************************************/
		if(e.getEndpointPayloadTypCdgSys() != null) {
			endpointpayloadtypecoding.setSystem(e.getEndpointPayloadTypCdgSys());
		}
		/******************** Endpoint_PayloadTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEndpointPayloadTypCdgUsrSltd() != null) {
			endpointpayloadtypecoding.setUserSelected(Boolean.parseBoolean(e.getEndpointPayloadTypCdgUsrSltd()));
		}
		/******************** Endpoint_PayloadTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEndpointPayloadTypCdgVrsn() != null) {
			endpointpayloadtypecoding.setVersion(e.getEndpointPayloadTypCdgVrsn());
		}
		/******************** Endpoint_PayloadTyp_Txt ********************************************************************************/
		if(e.getEndpointPayloadTypTxt() != null) {
			endpointpayloadtype.setText(e.getEndpointPayloadTypTxt());
		}
		/******************** endpointperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointperiod =  new org.hl7.fhir.r4.model.Period();
		endpoint.setPeriod(endpointperiod);

		/******************** Endpoint_Prd_End ********************************************************************************/
		if(e.getEndpointPrdEnd() != null) {
			java.text.SimpleDateFormat Endpoint_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Endpoint_Prd_Enddate = Endpoint_Prd_Endsdf.parse(e.getEndpointPrdEnd());
			endpointperiod.setEnd(Endpoint_Prd_Enddate);
		}
		/******************** Endpoint_Prd_Strt ********************************************************************************/
		if(e.getEndpointPrdStrt() != null) {
			java.text.SimpleDateFormat Endpoint_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Endpoint_Prd_Strtdate = Endpoint_Prd_Strtsdf.parse(e.getEndpointPrdStrt());
			endpointperiod.setStart(Endpoint_Prd_Strtdate);
		}
		/******************** endpointstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Endpoint.EndpointStatusEnumFactory endpointstatus =  new org.hl7.fhir.r4.model.Endpoint.EndpointStatusEnumFactory();
		endpoint.setStatus(endpointstatus.fromCode(e.getEndpointSts()));

		return endpoint;
	}
}
