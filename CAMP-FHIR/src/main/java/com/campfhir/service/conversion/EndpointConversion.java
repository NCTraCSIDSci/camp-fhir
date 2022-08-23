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
		if(e.getEndpointAddr() != null ) {

			if(e.getEndpointAddr().replace("[","").replace("]","").equals("NULL") | e.getEndpointAddr()==null) {} else {
			endpoint.setAddress(e.getEndpointAddr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Endpoint_ConnectionTyp_Cd ********************************************************************************/
		if(e.getEndpointConnectionTypCd() != null ) {

			if(e.getEndpointConnectionTypCd().replace("[","").replace("]","").equals("NULL") | e.getEndpointConnectionTypCd()==null) {} else {
			endpoint.getConnectionType().setCode(e.getEndpointConnectionTypCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Endpoint_ConnectionTyp_Dsply ********************************************************************************/
		if(e.getEndpointConnectionTypDsply() != null ) {

			if(e.getEndpointConnectionTypDsply().replace("[","").replace("]","").equals("NULL") | e.getEndpointConnectionTypDsply()==null) {} else {
			endpoint.getConnectionType().setDisplay(e.getEndpointConnectionTypDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Endpoint_ConnectionTyp_Sys ********************************************************************************/
		if(e.getEndpointConnectionTypSys() != null ) {

			if(e.getEndpointConnectionTypSys().replace("[","").replace("]","").equals("NULL") | e.getEndpointConnectionTypSys()==null) {} else {
			endpoint.getConnectionType().setSystem(e.getEndpointConnectionTypSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Endpoint_ConnectionTyp_UsrSltd ********************************************************************************/
		if(e.getEndpointConnectionTypUsrSltd() != null ) {

			if(e.getEndpointConnectionTypUsrSltd().replace("[","").replace("]","").equals("NULL") | e.getEndpointConnectionTypUsrSltd()==null) {} else {
			endpoint.getConnectionType().setUserSelected(Boolean.parseBoolean(e.getEndpointConnectionTypUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Endpoint_ConnectionTyp_Vrsn ********************************************************************************/
		if(e.getEndpointConnectionTypVrsn() != null ) {

			if(e.getEndpointConnectionTypVrsn().replace("[","").replace("]","").equals("NULL") | e.getEndpointConnectionTypVrsn()==null) {} else {
			endpoint.getConnectionType().setVersion(e.getEndpointConnectionTypVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Endpoint_Cntct_Prd_End ********************************************************************************/
		if(e.getEndpointCntctPrdEnd() != null ) {

			String[] arrayi0 = e.getEndpointCntctPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getContact().size() < i0+1) { endpoint.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getContact().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Cntct_Prd_Strt ********************************************************************************/
		if(e.getEndpointCntctPrdStrt() != null ) {

			String[] arrayi0 = e.getEndpointCntctPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getContact().size() < i0+1) { endpoint.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getContact().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Cntct_Rnk ********************************************************************************/
		if(e.getEndpointCntctRnk() != null ) {

			String[] arrayi0 = e.getEndpointCntctRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getContact().size() < i0+1) { endpoint.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getContact().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Cntct_Sys ********************************************************************************/
		if(e.getEndpointCntctSys() != null ) {

			String[] arrayi0 = e.getEndpointCntctSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getContact().size() < i0+1) { endpoint.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getContact().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Cntct_Use ********************************************************************************/
		if(e.getEndpointCntctUse() != null ) {

			String[] arrayi0 = e.getEndpointCntctUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getContact().size() < i0+1) { endpoint.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getContact().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Cntct_Vl ********************************************************************************/
		if(e.getEndpointCntctVl() != null ) {

			String[] arrayi0 = e.getEndpointCntctVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getContact().size() < i0+1) { endpoint.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getContact().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Endpoint_Header ********************************************************************************/
		if(e.getEndpointHeader() != null ) {

				for( String currListStrSplit : e.getEndpointHeader().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			endpoint.addHeader(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Endpoint_Id_Assigner ********************************************************************************/
		if(e.getEndpointIdAssigner() != null ) {

			String[] arrayi0 = e.getEndpointIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Id_Prd_End ********************************************************************************/
		if(e.getEndpointIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEndpointIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Id_Prd_Strt ********************************************************************************/
		if(e.getEndpointIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEndpointIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Id_Sys ********************************************************************************/
		if(e.getEndpointIdSys() != null ) {

			String[] arrayi0 = e.getEndpointIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Endpoint_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEndpointIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEndpointIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				String[] arrayi1 = e.getEndpointIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { endpoint.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEndpointIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEndpointIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				String[] arrayi1 = e.getEndpointIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { endpoint.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEndpointIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEndpointIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				String[] arrayi1 = e.getEndpointIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { endpoint.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEndpointIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEndpointIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				String[] arrayi1 = e.getEndpointIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { endpoint.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Endpoint_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEndpointIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEndpointIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				String[] arrayi1 = e.getEndpointIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { endpoint.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_Id_Typ_Txt ********************************************************************************/
		if(e.getEndpointIdTypTxt() != null ) {

			String[] arrayi0 = e.getEndpointIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Endpoint_Id_Use ********************************************************************************/
		if(e.getEndpointIdUse() != null ) {

			String[] arrayi0 = e.getEndpointIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Endpoint_Id_Vl ********************************************************************************/
		if(e.getEndpointIdVl() != null ) {

			String[] arrayi0 = e.getEndpointIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getIdentifier().size() < i0+1) { endpoint.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Endpoint_ManagingOrgnztn ********************************************************************************/
		if(e.getEndpointManagingOrgnztn() != null ) {

			if(e.getEndpointManagingOrgnztn().replace("[","").replace("]","").equals("NULL") | e.getEndpointManagingOrgnztn()==null) {} else {
			endpoint.setManagingOrganization(new org.hl7.fhir.r4.model.Reference(e.getEndpointManagingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Endpoint_Nm ********************************************************************************/
		if(e.getEndpointNm() != null ) {

			if(e.getEndpointNm().replace("[","").replace("]","").equals("NULL") | e.getEndpointNm()==null) {} else {
			endpoint.setName(e.getEndpointNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Endpoint_PayloadMimeTyp ********************************************************************************/
		if(e.getEndpointPayloadMimeTyp() != null ) {

				for( String currListStrSplit : e.getEndpointPayloadMimeTyp().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			endpoint.addPayloadMimeType(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Endpoint_PayloadTyp_Cdg_Cd ********************************************************************************/
		if(e.getEndpointPayloadTypCdgCd() != null ) {

			String[] arrayi0 = e.getEndpointPayloadTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getPayloadType().size() < i0+1) { endpoint.addPayloadType(); }
				String[] arrayi1 = e.getEndpointPayloadTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getPayloadType().get(i0).getCoding().size() < i1+1) { endpoint.getPayloadType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getPayloadType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_PayloadTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEndpointPayloadTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEndpointPayloadTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getPayloadType().size() < i0+1) { endpoint.addPayloadType(); }
				String[] arrayi1 = e.getEndpointPayloadTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getPayloadType().get(i0).getCoding().size() < i1+1) { endpoint.getPayloadType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getPayloadType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_PayloadTyp_Cdg_Sys ********************************************************************************/
		if(e.getEndpointPayloadTypCdgSys() != null ) {

			String[] arrayi0 = e.getEndpointPayloadTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getPayloadType().size() < i0+1) { endpoint.addPayloadType(); }
				String[] arrayi1 = e.getEndpointPayloadTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getPayloadType().get(i0).getCoding().size() < i1+1) { endpoint.getPayloadType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getPayloadType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_PayloadTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEndpointPayloadTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEndpointPayloadTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getPayloadType().size() < i0+1) { endpoint.addPayloadType(); }
				String[] arrayi1 = e.getEndpointPayloadTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getPayloadType().get(i0).getCoding().size() < i1+1) { endpoint.getPayloadType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getPayloadType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Endpoint_PayloadTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEndpointPayloadTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEndpointPayloadTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getPayloadType().size() < i0+1) { endpoint.addPayloadType(); }
				String[] arrayi1 = e.getEndpointPayloadTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(endpoint.getPayloadType().get(i0).getCoding().size() < i1+1) { endpoint.getPayloadType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {endpoint.getPayloadType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Endpoint_PayloadTyp_Txt ********************************************************************************/
		if(e.getEndpointPayloadTypTxt() != null ) {

			String[] arrayi0 = e.getEndpointPayloadTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(endpoint.getPayloadType().size() < i0+1) { endpoint.addPayloadType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {endpoint.getPayloadType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Endpoint_Prd_End ********************************************************************************/
		if(e.getEndpointPrdEnd() != null ) {

			if(e.getEndpointPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEndpointPrdEnd()==null) {} else {
			endpoint.getPeriod().setEnd(e.getEndpointPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEndpointPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEndpointPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Endpoint_Prd_Strt ********************************************************************************/
		if(e.getEndpointPrdStrt() != null ) {

			if(e.getEndpointPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEndpointPrdStrt()==null) {} else {
			endpoint.getPeriod().setStart(e.getEndpointPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEndpointPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEndpointPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Endpoint_Sts ********************************************************************************/
		if(e.getEndpointSts() != null ) {

			if(e.getEndpointSts().replace("[","").replace("]","").equals("NULL") | e.getEndpointSts()==null) {} else {
			endpoint.setStatus(new org.hl7.fhir.r4.model.Endpoint.EndpointStatusEnumFactory().fromCode(e.getEndpointSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return endpoint;
	}
}
