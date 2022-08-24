package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Endpoint;
public class EndpointBidirectionalConversion 
{
	public Endpoint Endpoints(org.hl7.fhir.r4.model.Endpoint endpoint) throws ParseException
	{
		 main.java.com.campfhir.model.Endpoint e = new  main.java.com.campfhir.model.Endpoint();

		/******************** id ********************************************************************************/
		e.setId(endpoint.getIdElement().getIdPart());

		/******************** Endpoint_Nm ********************************************************************************/
		if(endpoint.hasName()) {

			e.addEndpointNm(String.valueOf(endpoint.getName()));
		} else {
			e.addEndpointNm("NULL");
		}


		/******************** Endpoint_Addr ********************************************************************************/
		if(endpoint.hasAddress()) {

			e.addEndpointAddr(String.valueOf(endpoint.getAddress()));
		} else {
			e.addEndpointAddr("NULL");
		}


		/******************** Endpoint_Header ********************************************************************************/
		if(endpoint.hasHeader()) {

			String  array = "[";
			for(int incr=0; incr<endpoint.getHeader().size(); incr++) {
				array = array + endpoint.getHeader().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEndpointHeader(array);

		} else {
			e.addEndpointHeader("NULL");
		}


		/******************** endpointstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Endpoint.EndpointStatus endpointstatus = endpoint.getStatus();
		if(endpointstatus!=null) {
			e.addEndpointSts(endpointstatus.toCode());
		} else {
			e.addEndpointSts("NULL");
		}

		/******************** endpointperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointperiod = endpoint.getPeriod();

		/******************** Endpoint_Prd_Strt ********************************************************************************/
		if(endpointperiod.hasStart()) {

			e.addEndpointPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(endpointperiod.getStart())+"\"");
		} else {
			e.addEndpointPrdStrt("NULL");
		}


		/******************** Endpoint_Prd_End ********************************************************************************/
		if(endpointperiod.hasEnd()) {

			e.addEndpointPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(endpointperiod.getEnd())+"\"");
		} else {
			e.addEndpointPrdEnd("NULL");
		}


		/******************** endpointidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> endpointidentifierlist = endpoint.getIdentifier();
		for(int endpointidentifieri = 0; endpointidentifieri<endpointidentifierlist.size();endpointidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  endpointidentifier = endpointidentifierlist.get(endpointidentifieri);

		/******************** Endpoint_Id_Vl ********************************************************************************/
		if(endpointidentifieri == 0) {e.addEndpointIdVl("[");}
		if(endpointidentifier.hasValue()) {

			e.addEndpointIdVl(String.valueOf(endpointidentifier.getValue()));
		} else {
			e.addEndpointIdVl("NULL");
		}

		if(endpointidentifieri == endpointidentifierlist.size()-1) {e.addEndpointIdVl("]");}


		/******************** endpointidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept endpointidentifiertype = endpointidentifier.getType();

		/******************** Endpoint_Id_Typ_Txt ********************************************************************************/
		if(endpointidentifieri == 0) {e.addEndpointIdTypTxt("[");}
		if(endpointidentifiertype.hasText()) {

			e.addEndpointIdTypTxt(String.valueOf(endpointidentifiertype.getText()));
		} else {
			e.addEndpointIdTypTxt("NULL");
		}

		if(endpointidentifieri == endpointidentifierlist.size()-1) {e.addEndpointIdTypTxt("]");}


		/******************** endpointidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> endpointidentifiertypecodinglist = endpointidentifiertype.getCoding();
		for(int endpointidentifiertypecodingi = 0; endpointidentifiertypecodingi<endpointidentifiertypecodinglist.size();endpointidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  endpointidentifiertypecoding = endpointidentifiertypecodinglist.get(endpointidentifiertypecodingi);

		/******************** Endpoint_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(endpointidentifiertypecodingi == 0) {e.addEndpointIdTypCdgDsply("[[");}
		if(endpointidentifiertypecoding.hasDisplay()) {

			e.addEndpointIdTypCdgDsply(String.valueOf(endpointidentifiertypecoding.getDisplay()));
		} else {
			e.addEndpointIdTypCdgDsply("NULL");
		}

		if(endpointidentifiertypecodingi == endpointidentifiertypecodinglist.size()-1) {e.addEndpointIdTypCdgDsply("]]");}


		/******************** Endpoint_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(endpointidentifiertypecodingi == 0) {e.addEndpointIdTypCdgVrsn("[[");}
		if(endpointidentifiertypecoding.hasVersion()) {

			e.addEndpointIdTypCdgVrsn(String.valueOf(endpointidentifiertypecoding.getVersion()));
		} else {
			e.addEndpointIdTypCdgVrsn("NULL");
		}

		if(endpointidentifiertypecodingi == endpointidentifiertypecodinglist.size()-1) {e.addEndpointIdTypCdgVrsn("]]");}


		/******************** Endpoint_Id_Typ_Cdg_Cd ********************************************************************************/
		if(endpointidentifiertypecodingi == 0) {e.addEndpointIdTypCdgCd("[[");}
		if(endpointidentifiertypecoding.hasCode()) {

			e.addEndpointIdTypCdgCd(String.valueOf(endpointidentifiertypecoding.getCode()));
		} else {
			e.addEndpointIdTypCdgCd("NULL");
		}

		if(endpointidentifiertypecodingi == endpointidentifiertypecodinglist.size()-1) {e.addEndpointIdTypCdgCd("]]");}


		/******************** Endpoint_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(endpointidentifiertypecodingi == 0) {e.addEndpointIdTypCdgUsrSltd("[[");}
		if(endpointidentifiertypecoding.hasUserSelected()) {

			e.addEndpointIdTypCdgUsrSltd(String.valueOf(endpointidentifiertypecoding.getUserSelected()));
		} else {
			e.addEndpointIdTypCdgUsrSltd("NULL");
		}

		if(endpointidentifiertypecodingi == endpointidentifiertypecodinglist.size()-1) {e.addEndpointIdTypCdgUsrSltd("]]");}


		/******************** Endpoint_Id_Typ_Cdg_Sys ********************************************************************************/
		if(endpointidentifiertypecodingi == 0) {e.addEndpointIdTypCdgSys("[[");}
		if(endpointidentifiertypecoding.hasSystem()) {

			e.addEndpointIdTypCdgSys(String.valueOf(endpointidentifiertypecoding.getSystem()));
		} else {
			e.addEndpointIdTypCdgSys("NULL");
		}

		if(endpointidentifiertypecodingi == endpointidentifiertypecodinglist.size()-1) {e.addEndpointIdTypCdgSys("]]");}


		 };
		/******************** endpointidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointidentifierperiod = endpointidentifier.getPeriod();

		/******************** Endpoint_Id_Prd_Strt ********************************************************************************/
		if(endpointidentifieri == 0) {e.addEndpointIdPrdStrt("[");}
		if(endpointidentifierperiod.hasStart()) {

			e.addEndpointIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(endpointidentifierperiod.getStart())+"\"");
		} else {
			e.addEndpointIdPrdStrt("NULL");
		}

		if(endpointidentifieri == endpointidentifierlist.size()-1) {e.addEndpointIdPrdStrt("]");}


		/******************** Endpoint_Id_Prd_End ********************************************************************************/
		if(endpointidentifieri == 0) {e.addEndpointIdPrdEnd("[");}
		if(endpointidentifierperiod.hasEnd()) {

			e.addEndpointIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(endpointidentifierperiod.getEnd())+"\"");
		} else {
			e.addEndpointIdPrdEnd("NULL");
		}

		if(endpointidentifieri == endpointidentifierlist.size()-1) {e.addEndpointIdPrdEnd("]");}


		/******************** endpointidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse endpointidentifieruse = endpointidentifier.getUse();
		if(endpointidentifieruse!=null) {
		if(endpointidentifieri == 0) {

		e.addEndpointIdUse("[");		}
			e.addEndpointIdUse(endpointidentifieruse.toCode());
		if(endpointidentifieri == endpointidentifierlist.size()-1) {

		e.addEndpointIdUse("]");		}

		} else {
			e.addEndpointIdUse("NULL");
		}

		/******************** Endpoint_Id_Assigner ********************************************************************************/
		if(endpointidentifieri == 0) {e.addEndpointIdAssigner("[");}
		if(endpointidentifier.hasAssigner()) {

			if(endpointidentifier.getAssigner().getReference() != null) {
			e.addEndpointIdAssigner(endpointidentifier.getAssigner().getReference());
			}
		} else {
			e.addEndpointIdAssigner("NULL");
		}

		if(endpointidentifieri == endpointidentifierlist.size()-1) {e.addEndpointIdAssigner("]");}


		/******************** Endpoint_Id_Sys ********************************************************************************/
		if(endpointidentifieri == 0) {e.addEndpointIdSys("[");}
		if(endpointidentifier.hasSystem()) {

			e.addEndpointIdSys(String.valueOf(endpointidentifier.getSystem()));
		} else {
			e.addEndpointIdSys("NULL");
		}

		if(endpointidentifieri == endpointidentifierlist.size()-1) {e.addEndpointIdSys("]");}


		 };
		/******************** endpointconnectiontype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding endpointconnectiontype = endpoint.getConnectionType();

		/******************** Endpoint_ConnectionTyp_Dsply ********************************************************************************/
		if(endpointconnectiontype.hasDisplay()) {

			e.addEndpointConnectionTypDsply(String.valueOf(endpointconnectiontype.getDisplay()));
		} else {
			e.addEndpointConnectionTypDsply("NULL");
		}


		/******************** Endpoint_ConnectionTyp_Vrsn ********************************************************************************/
		if(endpointconnectiontype.hasVersion()) {

			e.addEndpointConnectionTypVrsn(String.valueOf(endpointconnectiontype.getVersion()));
		} else {
			e.addEndpointConnectionTypVrsn("NULL");
		}


		/******************** Endpoint_ConnectionTyp_Cd ********************************************************************************/
		if(endpointconnectiontype.hasCode()) {

			e.addEndpointConnectionTypCd(String.valueOf(endpointconnectiontype.getCode()));
		} else {
			e.addEndpointConnectionTypCd("NULL");
		}


		/******************** Endpoint_ConnectionTyp_UsrSltd ********************************************************************************/
		if(endpointconnectiontype.hasUserSelected()) {

			e.addEndpointConnectionTypUsrSltd(String.valueOf(endpointconnectiontype.getUserSelected()));
		} else {
			e.addEndpointConnectionTypUsrSltd("NULL");
		}


		/******************** Endpoint_ConnectionTyp_Sys ********************************************************************************/
		if(endpointconnectiontype.hasSystem()) {

			e.addEndpointConnectionTypSys(String.valueOf(endpointconnectiontype.getSystem()));
		} else {
			e.addEndpointConnectionTypSys("NULL");
		}


		/******************** Endpoint_PayloadMimeTyp ********************************************************************************/
		if(endpoint.hasPayloadMimeType()) {

			String  array = "[";
			for(int incr=0; incr<endpoint.getPayloadMimeType().size(); incr++) {
				array = array + endpoint.getPayloadMimeType().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEndpointPayloadMimeTyp(array);

		} else {
			e.addEndpointPayloadMimeTyp("NULL");
		}


		/******************** endpointpayloadtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> endpointpayloadtypelist = endpoint.getPayloadType();
		for(int endpointpayloadtypei = 0; endpointpayloadtypei<endpointpayloadtypelist.size();endpointpayloadtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  endpointpayloadtype = endpointpayloadtypelist.get(endpointpayloadtypei);

		/******************** Endpoint_PayloadTyp_Txt ********************************************************************************/
		if(endpointpayloadtypei == 0) {e.addEndpointPayloadTypTxt("[");}
		if(endpointpayloadtype.hasText()) {

			e.addEndpointPayloadTypTxt(String.valueOf(endpointpayloadtype.getText()));
		} else {
			e.addEndpointPayloadTypTxt("NULL");
		}

		if(endpointpayloadtypei == endpointpayloadtypelist.size()-1) {e.addEndpointPayloadTypTxt("]");}


		/******************** endpointpayloadtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> endpointpayloadtypecodinglist = endpointpayloadtype.getCoding();
		for(int endpointpayloadtypecodingi = 0; endpointpayloadtypecodingi<endpointpayloadtypecodinglist.size();endpointpayloadtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  endpointpayloadtypecoding = endpointpayloadtypecodinglist.get(endpointpayloadtypecodingi);

		/******************** Endpoint_PayloadTyp_Cdg_Dsply ********************************************************************************/
		if(endpointpayloadtypecodingi == 0) {e.addEndpointPayloadTypCdgDsply("[[");}
		if(endpointpayloadtypecoding.hasDisplay()) {

			e.addEndpointPayloadTypCdgDsply(String.valueOf(endpointpayloadtypecoding.getDisplay()));
		} else {
			e.addEndpointPayloadTypCdgDsply("NULL");
		}

		if(endpointpayloadtypecodingi == endpointpayloadtypecodinglist.size()-1) {e.addEndpointPayloadTypCdgDsply("]]");}


		/******************** Endpoint_PayloadTyp_Cdg_Vrsn ********************************************************************************/
		if(endpointpayloadtypecodingi == 0) {e.addEndpointPayloadTypCdgVrsn("[[");}
		if(endpointpayloadtypecoding.hasVersion()) {

			e.addEndpointPayloadTypCdgVrsn(String.valueOf(endpointpayloadtypecoding.getVersion()));
		} else {
			e.addEndpointPayloadTypCdgVrsn("NULL");
		}

		if(endpointpayloadtypecodingi == endpointpayloadtypecodinglist.size()-1) {e.addEndpointPayloadTypCdgVrsn("]]");}


		/******************** Endpoint_PayloadTyp_Cdg_Cd ********************************************************************************/
		if(endpointpayloadtypecodingi == 0) {e.addEndpointPayloadTypCdgCd("[[");}
		if(endpointpayloadtypecoding.hasCode()) {

			e.addEndpointPayloadTypCdgCd(String.valueOf(endpointpayloadtypecoding.getCode()));
		} else {
			e.addEndpointPayloadTypCdgCd("NULL");
		}

		if(endpointpayloadtypecodingi == endpointpayloadtypecodinglist.size()-1) {e.addEndpointPayloadTypCdgCd("]]");}


		/******************** Endpoint_PayloadTyp_Cdg_UsrSltd ********************************************************************************/
		if(endpointpayloadtypecodingi == 0) {e.addEndpointPayloadTypCdgUsrSltd("[[");}
		if(endpointpayloadtypecoding.hasUserSelected()) {

			e.addEndpointPayloadTypCdgUsrSltd(String.valueOf(endpointpayloadtypecoding.getUserSelected()));
		} else {
			e.addEndpointPayloadTypCdgUsrSltd("NULL");
		}

		if(endpointpayloadtypecodingi == endpointpayloadtypecodinglist.size()-1) {e.addEndpointPayloadTypCdgUsrSltd("]]");}


		/******************** Endpoint_PayloadTyp_Cdg_Sys ********************************************************************************/
		if(endpointpayloadtypecodingi == 0) {e.addEndpointPayloadTypCdgSys("[[");}
		if(endpointpayloadtypecoding.hasSystem()) {

			e.addEndpointPayloadTypCdgSys(String.valueOf(endpointpayloadtypecoding.getSystem()));
		} else {
			e.addEndpointPayloadTypCdgSys("NULL");
		}

		if(endpointpayloadtypecodingi == endpointpayloadtypecodinglist.size()-1) {e.addEndpointPayloadTypCdgSys("]]");}


		 };
		 };
		/******************** endpointcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> endpointcontactlist = endpoint.getContact();
		for(int endpointcontacti = 0; endpointcontacti<endpointcontactlist.size();endpointcontacti++ ) {
		org.hl7.fhir.r4.model.ContactPoint  endpointcontact = endpointcontactlist.get(endpointcontacti);

		/******************** Endpoint_Cntct_Vl ********************************************************************************/
		if(endpointcontacti == 0) {e.addEndpointCntctVl("[");}
		if(endpointcontact.hasValue()) {

			e.addEndpointCntctVl(String.valueOf(endpointcontact.getValue()));
		} else {
			e.addEndpointCntctVl("NULL");
		}

		if(endpointcontacti == endpointcontactlist.size()-1) {e.addEndpointCntctVl("]");}


		/******************** endpointcontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period endpointcontactperiod = endpointcontact.getPeriod();

		/******************** Endpoint_Cntct_Prd_Strt ********************************************************************************/
		if(endpointcontacti == 0) {e.addEndpointCntctPrdStrt("[");}
		if(endpointcontactperiod.hasStart()) {

			e.addEndpointCntctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(endpointcontactperiod.getStart())+"\"");
		} else {
			e.addEndpointCntctPrdStrt("NULL");
		}

		if(endpointcontacti == endpointcontactlist.size()-1) {e.addEndpointCntctPrdStrt("]");}


		/******************** Endpoint_Cntct_Prd_End ********************************************************************************/
		if(endpointcontacti == 0) {e.addEndpointCntctPrdEnd("[");}
		if(endpointcontactperiod.hasEnd()) {

			e.addEndpointCntctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(endpointcontactperiod.getEnd())+"\"");
		} else {
			e.addEndpointCntctPrdEnd("NULL");
		}

		if(endpointcontacti == endpointcontactlist.size()-1) {e.addEndpointCntctPrdEnd("]");}


		/******************** endpointcontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse endpointcontactuse = endpointcontact.getUse();
		if(endpointcontactuse!=null) {
		if(endpointcontacti == 0) {

		e.addEndpointCntctUse("[");		}
			e.addEndpointCntctUse(endpointcontactuse.toCode());
		if(endpointcontacti == endpointcontactlist.size()-1) {

		e.addEndpointCntctUse("]");		}

		} else {
			e.addEndpointCntctUse("NULL");
		}

		/******************** endpointcontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem endpointcontactsystem = endpointcontact.getSystem();
		if(endpointcontactsystem!=null) {
		if(endpointcontacti == 0) {

		e.addEndpointCntctSys("[");		}
			e.addEndpointCntctSys(endpointcontactsystem.toCode());
		if(endpointcontacti == endpointcontactlist.size()-1) {

		e.addEndpointCntctSys("]");		}

		} else {
			e.addEndpointCntctSys("NULL");
		}

		/******************** Endpoint_Cntct_Rnk ********************************************************************************/
		if(endpointcontacti == 0) {e.addEndpointCntctRnk("[");}
		if(endpointcontact.hasRank()) {

			e.addEndpointCntctRnk(String.valueOf(endpointcontact.getRank()));
		} else {
			e.addEndpointCntctRnk("NULL");
		}

		if(endpointcontacti == endpointcontactlist.size()-1) {e.addEndpointCntctRnk("]");}


		 };
		/******************** Endpoint_ManagingOrgnztn ********************************************************************************/
		if(endpoint.hasManagingOrganization()) {

			if(endpoint.getManagingOrganization().getReference() != null) {
			e.addEndpointManagingOrgnztn(endpoint.getManagingOrganization().getReference());
			}
		} else {
			e.addEndpointManagingOrgnztn("NULL");
		}


		return e;
	}
}
