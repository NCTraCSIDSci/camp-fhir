package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CapabilityStatement;
public class CapabilityStatementBidirectionalConversion 
{
	public CapabilityStatement CapabilityStatements(org.hl7.fhir.r4.model.CapabilityStatement capabilitystatement) throws ParseException
	{
		 main.java.com.campfhir.model.CapabilityStatement c = new  main.java.com.campfhir.model.CapabilityStatement();

		/******************** id ********************************************************************************/
		c.setId(capabilitystatement.getIdElement().getIdPart());

		/******************** CapbltyStmnt_Nm ********************************************************************************/
		if(capabilitystatement.hasName()) {

			c.addCapbltyStmntNm(String.valueOf(capabilitystatement.getName()));
		} else {
			c.addCapbltyStmntNm("NULL");
		}


		/******************** CapbltyStmnt_Vrsn ********************************************************************************/
		if(capabilitystatement.hasVersion()) {

			c.addCapbltyStmntVrsn(String.valueOf(capabilitystatement.getVersion()));
		} else {
			c.addCapbltyStmntVrsn("NULL");
		}


		/******************** CapbltyStmnt_Dt ********************************************************************************/
		if(capabilitystatement.hasDate()) {

			c.addCapbltyStmntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(capabilitystatement.getDate())+"\"");
		} else {
			c.addCapbltyStmntDt("NULL");
		}


		/******************** capabilitystatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus capabilitystatementstatus = capabilitystatement.getStatus();
		if(capabilitystatementstatus!=null) {
			c.addCapbltyStmntSts(capabilitystatementstatus.toCode());
		} else {
			c.addCapbltyStmntSts("NULL");
		}

		/******************** CapbltyStmnt_Dscrptn ********************************************************************************/
		if(capabilitystatement.hasDescription()) {

			c.addCapbltyStmntDscrptn(String.valueOf(capabilitystatement.getDescription()));
		} else {
			c.addCapbltyStmntDscrptn("NULL");
		}


		/******************** capabilitystatementcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> capabilitystatementcontactlist = capabilitystatement.getContact();
		for(int capabilitystatementcontacti = 0; capabilitystatementcontacti<capabilitystatementcontactlist.size();capabilitystatementcontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  capabilitystatementcontact = capabilitystatementcontactlist.get(capabilitystatementcontacti);

		/******************** CapbltyStmnt_Cntct_Nm ********************************************************************************/
		if(capabilitystatementcontacti == 0) {c.addCapbltyStmntCntctNm("[");}
		if(capabilitystatementcontact.hasName()) {

			c.addCapbltyStmntCntctNm(String.valueOf(capabilitystatementcontact.getName()));
		} else {
			c.addCapbltyStmntCntctNm("NULL");
		}

		if(capabilitystatementcontacti == capabilitystatementcontactlist.size()-1) {c.addCapbltyStmntCntctNm("]");}


		/******************** capabilitystatementcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> capabilitystatementcontacttelecomlist = capabilitystatementcontact.getTelecom();
		for(int capabilitystatementcontacttelecomi = 0; capabilitystatementcontacttelecomi<capabilitystatementcontacttelecomlist.size();capabilitystatementcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  capabilitystatementcontacttelecom = capabilitystatementcontacttelecomlist.get(capabilitystatementcontacttelecomi);

		/******************** CapbltyStmnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(capabilitystatementcontacttelecomi == 0) {c.addCapbltyStmntCntctTlcmVl("[[");}
		if(capabilitystatementcontacttelecom.hasValue()) {

			c.addCapbltyStmntCntctTlcmVl(String.valueOf(capabilitystatementcontacttelecom.getValue()));
		} else {
			c.addCapbltyStmntCntctTlcmVl("NULL");
		}

		if(capabilitystatementcontacttelecomi == capabilitystatementcontacttelecomlist.size()-1) {c.addCapbltyStmntCntctTlcmVl("]]");}


		/******************** capabilitystatementcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period capabilitystatementcontacttelecomperiod = capabilitystatementcontacttelecom.getPeriod();

		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(capabilitystatementcontacttelecomi == 0) {c.addCapbltyStmntCntctTlcmPrdStrt("[[");}
		if(capabilitystatementcontacttelecomperiod.hasStart()) {

			c.addCapbltyStmntCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(capabilitystatementcontacttelecomperiod.getStart())+"\"");
		} else {
			c.addCapbltyStmntCntctTlcmPrdStrt("NULL");
		}

		if(capabilitystatementcontacttelecomi == capabilitystatementcontacttelecomlist.size()-1) {c.addCapbltyStmntCntctTlcmPrdStrt("]]");}


		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(capabilitystatementcontacttelecomi == 0) {c.addCapbltyStmntCntctTlcmPrdEnd("[[");}
		if(capabilitystatementcontacttelecomperiod.hasEnd()) {

			c.addCapbltyStmntCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(capabilitystatementcontacttelecomperiod.getEnd())+"\"");
		} else {
			c.addCapbltyStmntCntctTlcmPrdEnd("NULL");
		}

		if(capabilitystatementcontacttelecomi == capabilitystatementcontacttelecomlist.size()-1) {c.addCapbltyStmntCntctTlcmPrdEnd("]]");}


		/******************** capabilitystatementcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse capabilitystatementcontacttelecomuse = capabilitystatementcontacttelecom.getUse();
		if(capabilitystatementcontacttelecomuse!=null) {
		if(capabilitystatementcontacttelecomi == 0) {

		c.addCapbltyStmntCntctTlcmUse("[[");		}
			c.addCapbltyStmntCntctTlcmUse(capabilitystatementcontacttelecomuse.toCode());
		if(capabilitystatementcontacttelecomi == capabilitystatementcontacttelecomlist.size()-1) {

		c.addCapbltyStmntCntctTlcmUse("]]");		}

		} else {
			c.addCapbltyStmntCntctTlcmUse("NULL");
		}

		/******************** capabilitystatementcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem capabilitystatementcontacttelecomsystem = capabilitystatementcontacttelecom.getSystem();
		if(capabilitystatementcontacttelecomsystem!=null) {
		if(capabilitystatementcontacttelecomi == 0) {

		c.addCapbltyStmntCntctTlcmSys("[[");		}
			c.addCapbltyStmntCntctTlcmSys(capabilitystatementcontacttelecomsystem.toCode());
		if(capabilitystatementcontacttelecomi == capabilitystatementcontacttelecomlist.size()-1) {

		c.addCapbltyStmntCntctTlcmSys("]]");		}

		} else {
			c.addCapbltyStmntCntctTlcmSys("NULL");
		}

		/******************** CapbltyStmnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(capabilitystatementcontacttelecomi == 0) {c.addCapbltyStmntCntctTlcmRnk("[[");}
		if(capabilitystatementcontacttelecom.hasRank()) {

			c.addCapbltyStmntCntctTlcmRnk(String.valueOf(capabilitystatementcontacttelecom.getRank()));
		} else {
			c.addCapbltyStmntCntctTlcmRnk("NULL");
		}

		if(capabilitystatementcontacttelecomi == capabilitystatementcontacttelecomlist.size()-1) {c.addCapbltyStmntCntctTlcmRnk("]]");}


		 };
		 };
		/******************** CapbltyStmnt_Instantiates ********************************************************************************/
		if(capabilitystatement.hasInstantiates()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatement.getInstantiates().size(); incr++) {
				array = array + capabilitystatement.getInstantiates().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntInstantiates(array);

		} else {
			c.addCapbltyStmntInstantiates("NULL");
		}


		/******************** CapbltyStmnt_Copyright ********************************************************************************/
		if(capabilitystatement.hasCopyright()) {

			c.addCapbltyStmntCopyright(String.valueOf(capabilitystatement.getCopyright()));
		} else {
			c.addCapbltyStmntCopyright("NULL");
		}


		/******************** capabilitystatementkind ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind capabilitystatementkind = capabilitystatement.getKind();
		if(capabilitystatementkind!=null) {
			c.addCapbltyStmntKind(capabilitystatementkind.toCode());
		} else {
			c.addCapbltyStmntKind("NULL");
		}

		/******************** CapbltyStmnt_ImplementationGuide ********************************************************************************/
		if(capabilitystatement.hasImplementationGuide()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatement.getImplementationGuide().size(); incr++) {
				array = array + capabilitystatement.getImplementationGuide().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntImplementationGuide(array);

		} else {
			c.addCapbltyStmntImplementationGuide("NULL");
		}


		/******************** CapbltyStmnt_Ttl ********************************************************************************/
		if(capabilitystatement.hasTitle()) {

			c.addCapbltyStmntTtl(String.valueOf(capabilitystatement.getTitle()));
		} else {
			c.addCapbltyStmntTtl("NULL");
		}


		/******************** CapbltyStmnt_Prpse ********************************************************************************/
		if(capabilitystatement.hasPurpose()) {

			c.addCapbltyStmntPrpse(String.valueOf(capabilitystatement.getPurpose()));
		} else {
			c.addCapbltyStmntPrpse("NULL");
		}


		/******************** CapbltyStmnt_Url ********************************************************************************/
		if(capabilitystatement.hasUrl()) {

			c.addCapbltyStmntUrl(String.valueOf(capabilitystatement.getUrl()));
		} else {
			c.addCapbltyStmntUrl("NULL");
		}


		/******************** capabilitystatementfhirversion ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.FHIRVersion capabilitystatementfhirversion = capabilitystatement.getFhirVersion();
		if(capabilitystatementfhirversion!=null) {
			c.addCapbltyStmntFhirVrsn(capabilitystatementfhirversion.toCode());
		} else {
			c.addCapbltyStmntFhirVrsn("NULL");
		}

		/******************** CapbltyStmnt_Imports ********************************************************************************/
		if(capabilitystatement.hasImports()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatement.getImports().size(); incr++) {
				array = array + capabilitystatement.getImports().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntImports(array);

		} else {
			c.addCapbltyStmntImports("NULL");
		}


		/******************** CapbltyStmnt_Frmat ********************************************************************************/
		if(capabilitystatement.hasFormat()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatement.getFormat().size(); incr++) {
				array = array + capabilitystatement.getFormat().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntFrmat(array);

		} else {
			c.addCapbltyStmntFrmat("NULL");
		}


		/******************** capabilitystatementdocument ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent> capabilitystatementdocumentlist = capabilitystatement.getDocument();
		for(int capabilitystatementdocumenti = 0; capabilitystatementdocumenti<capabilitystatementdocumentlist.size();capabilitystatementdocumenti++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent  capabilitystatementdocument = capabilitystatementdocumentlist.get(capabilitystatementdocumenti);

		/******************** capabilitystatementdocumentmode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode capabilitystatementdocumentmode = capabilitystatementdocument.getMode();
		if(capabilitystatementdocumentmode!=null) {
		if(capabilitystatementdocumenti == 0) {

		c.addCapbltyStmntDocMode("[");		}
			c.addCapbltyStmntDocMode(capabilitystatementdocumentmode.toCode());
		if(capabilitystatementdocumenti == capabilitystatementdocumentlist.size()-1) {

		c.addCapbltyStmntDocMode("]");		}

		} else {
			c.addCapbltyStmntDocMode("NULL");
		}

		/******************** CapbltyStmnt_Doc_Profile ********************************************************************************/
		if(capabilitystatementdocumenti == 0) {c.addCapbltyStmntDocProfile("[");}
		if(capabilitystatementdocument.hasProfile()) {

			c.addCapbltyStmntDocProfile(String.valueOf(capabilitystatementdocument.getProfile()));
		} else {
			c.addCapbltyStmntDocProfile("NULL");
		}

		if(capabilitystatementdocumenti == capabilitystatementdocumentlist.size()-1) {c.addCapbltyStmntDocProfile("]");}


		 };
		/******************** CapbltyStmnt_PatchFrmat ********************************************************************************/
		if(capabilitystatement.hasPatchFormat()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatement.getPatchFormat().size(); incr++) {
				array = array + capabilitystatement.getPatchFormat().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntPatchFrmat(array);

		} else {
			c.addCapbltyStmntPatchFrmat("NULL");
		}


		/******************** capabilitystatementrest ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent> capabilitystatementrestlist = capabilitystatement.getRest();
		for(int capabilitystatementresti = 0; capabilitystatementresti<capabilitystatementrestlist.size();capabilitystatementresti++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent  capabilitystatementrest = capabilitystatementrestlist.get(capabilitystatementresti);

		/******************** capabilitystatementrestresource ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent> capabilitystatementrestresourcelist = capabilitystatementrest.getResource();
		for(int capabilitystatementrestresourcei = 0; capabilitystatementrestresourcei<capabilitystatementrestresourcelist.size();capabilitystatementrestresourcei++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent  capabilitystatementrestresource = capabilitystatementrestresourcelist.get(capabilitystatementrestresourcei);

		/******************** CapbltyStmnt_Rest_Rsrc_Typ ********************************************************************************/
		if(capabilitystatementrestresourcei == 0) {c.addCapbltyStmntRestRsrcTyp("[[");}
		if(capabilitystatementrestresource.hasType()) {

			c.addCapbltyStmntRestRsrcTyp(String.valueOf(capabilitystatementrestresource.getType()));
		} else {
			c.addCapbltyStmntRestRsrcTyp("NULL");
		}

		if(capabilitystatementrestresourcei == capabilitystatementrestresourcelist.size()-1) {c.addCapbltyStmntRestRsrcTyp("]]");}


		/******************** capabilitystatementrestresourceinteraction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent> capabilitystatementrestresourceinteractionlist = capabilitystatementrestresource.getInteraction();
		for(int capabilitystatementrestresourceinteractioni = 0; capabilitystatementrestresourceinteractioni<capabilitystatementrestresourceinteractionlist.size();capabilitystatementrestresourceinteractioni++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent  capabilitystatementrestresourceinteraction = capabilitystatementrestresourceinteractionlist.get(capabilitystatementrestresourceinteractioni);

		/******************** capabilitystatementrestresourceinteractioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction capabilitystatementrestresourceinteractioncode = capabilitystatementrestresourceinteraction.getCode();
		if(capabilitystatementrestresourceinteractioncode!=null) {
		if(capabilitystatementrestresourceinteractioni == 0) {

		c.addCapbltyStmntRestRsrcInteractionCd("[[[");		}
			c.addCapbltyStmntRestRsrcInteractionCd(capabilitystatementrestresourceinteractioncode.toCode());
		if(capabilitystatementrestresourceinteractioni == capabilitystatementrestresourceinteractionlist.size()-1) {

		c.addCapbltyStmntRestRsrcInteractionCd("]]]");		}

		} else {
			c.addCapbltyStmntRestRsrcInteractionCd("NULL");
		}

		/******************** CapbltyStmnt_Rest_Rsrc_Interaction_Docation ********************************************************************************/
		if(capabilitystatementrestresourceinteractioni == 0) {c.addCapbltyStmntRestRsrcInteractionDocation("[[[");}
		if(capabilitystatementrestresourceinteraction.hasDocumentation()) {

			c.addCapbltyStmntRestRsrcInteractionDocation(String.valueOf(capabilitystatementrestresourceinteraction.getDocumentation()));
		} else {
			c.addCapbltyStmntRestRsrcInteractionDocation("NULL");
		}

		if(capabilitystatementrestresourceinteractioni == capabilitystatementrestresourceinteractionlist.size()-1) {c.addCapbltyStmntRestRsrcInteractionDocation("]]]");}


		 };
		/******************** capabilitystatementrestresourceconditionaldelete ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus capabilitystatementrestresourceconditionaldelete = capabilitystatementrestresource.getConditionalDelete();
		if(capabilitystatementrestresourceconditionaldelete!=null) {
			c.addCapbltyStmntRestRsrcCndtnalDelete(capabilitystatementrestresourceconditionaldelete.toCode());
		} else {
			c.addCapbltyStmntRestRsrcCndtnalDelete("NULL");
		}

		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalUpdate ********************************************************************************/
		if(capabilitystatementrestresource.hasConditionalUpdate()) {

			c.addCapbltyStmntRestRsrcCndtnalUpdate(String.valueOf(capabilitystatementrestresource.getConditionalUpdate()));
		} else {
			c.addCapbltyStmntRestRsrcCndtnalUpdate("NULL");
		}


		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalCreate ********************************************************************************/
		if(capabilitystatementrestresource.hasConditionalCreate()) {

			c.addCapbltyStmntRestRsrcCndtnalCreate(String.valueOf(capabilitystatementrestresource.getConditionalCreate()));
		} else {
			c.addCapbltyStmntRestRsrcCndtnalCreate("NULL");
		}


		/******************** CapbltyStmnt_Rest_Rsrc_SrchRevInclude ********************************************************************************/
		if(capabilitystatementrestresource.hasSearchRevInclude()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatementrestresource.getSearchRevInclude().size(); incr++) {
				array = array + capabilitystatementrestresource.getSearchRevInclude().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntRestRsrcSrchRevInclude(array);

		} else {
			c.addCapbltyStmntRestRsrcSrchRevInclude("NULL");
		}


		/******************** CapbltyStmnt_Rest_Rsrc_SupportedProfile ********************************************************************************/
		if(capabilitystatementrestresource.hasSupportedProfile()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatementrestresource.getSupportedProfile().size(); incr++) {
				array = array + capabilitystatementrestresource.getSupportedProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntRestRsrcSupportedProfile(array);

		} else {
			c.addCapbltyStmntRestRsrcSupportedProfile("NULL");
		}


		/******************** CapbltyStmnt_Rest_Rsrc_Profile ********************************************************************************/
		if(capabilitystatementrestresource.hasProfile()) {

			c.addCapbltyStmntRestRsrcProfile(String.valueOf(capabilitystatementrestresource.getProfile()));
		} else {
			c.addCapbltyStmntRestRsrcProfile("NULL");
		}


		/******************** capabilitystatementrestresourceoperation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent> capabilitystatementrestresourceoperationlist = capabilitystatementrestresource.getOperation();
		for(int capabilitystatementrestresourceoperationi = 0; capabilitystatementrestresourceoperationi<capabilitystatementrestresourceoperationlist.size();capabilitystatementrestresourceoperationi++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent  capabilitystatementrestresourceoperation = capabilitystatementrestresourceoperationlist.get(capabilitystatementrestresourceoperationi);

		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Nm ********************************************************************************/
		if(capabilitystatementrestresourceoperationi == 0) {c.addCapbltyStmntRestRsrcOprtnNm("[[[");}
		if(capabilitystatementrestresourceoperation.hasName()) {

			c.addCapbltyStmntRestRsrcOprtnNm(String.valueOf(capabilitystatementrestresourceoperation.getName()));
		} else {
			c.addCapbltyStmntRestRsrcOprtnNm("NULL");
		}

		if(capabilitystatementrestresourceoperationi == capabilitystatementrestresourceoperationlist.size()-1) {c.addCapbltyStmntRestRsrcOprtnNm("]]]");}


		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Dfn ********************************************************************************/
		if(capabilitystatementrestresourceoperationi == 0) {c.addCapbltyStmntRestRsrcOprtnDfn("[[[");}
		if(capabilitystatementrestresourceoperation.hasDefinition()) {

			c.addCapbltyStmntRestRsrcOprtnDfn(String.valueOf(capabilitystatementrestresourceoperation.getDefinition()));
		} else {
			c.addCapbltyStmntRestRsrcOprtnDfn("NULL");
		}

		if(capabilitystatementrestresourceoperationi == capabilitystatementrestresourceoperationlist.size()-1) {c.addCapbltyStmntRestRsrcOprtnDfn("]]]");}


		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Docation ********************************************************************************/
		if(capabilitystatementrestresourceoperationi == 0) {c.addCapbltyStmntRestRsrcOprtnDocation("[[[");}
		if(capabilitystatementrestresourceoperation.hasDocumentation()) {

			c.addCapbltyStmntRestRsrcOprtnDocation(String.valueOf(capabilitystatementrestresourceoperation.getDocumentation()));
		} else {
			c.addCapbltyStmntRestRsrcOprtnDocation("NULL");
		}

		if(capabilitystatementrestresourceoperationi == capabilitystatementrestresourceoperationlist.size()-1) {c.addCapbltyStmntRestRsrcOprtnDocation("]]]");}


		 };
		/******************** CapbltyStmnt_Rest_Rsrc_Docation ********************************************************************************/
		if(capabilitystatementrestresource.hasDocumentation()) {

			c.addCapbltyStmntRestRsrcDocation(String.valueOf(capabilitystatementrestresource.getDocumentation()));
		} else {
			c.addCapbltyStmntRestRsrcDocation("NULL");
		}


		/******************** capabilitystatementrestresourcesearchparam ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent> capabilitystatementrestresourcesearchparamlist = capabilitystatementrestresource.getSearchParam();
		for(int capabilitystatementrestresourcesearchparami = 0; capabilitystatementrestresourcesearchparami<capabilitystatementrestresourcesearchparamlist.size();capabilitystatementrestresourcesearchparami++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent  capabilitystatementrestresourcesearchparam = capabilitystatementrestresourcesearchparamlist.get(capabilitystatementrestresourcesearchparami);

		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Nm ********************************************************************************/
		if(capabilitystatementrestresourcesearchparami == 0) {c.addCapbltyStmntRestRsrcSrchParamNm("[[[");}
		if(capabilitystatementrestresourcesearchparam.hasName()) {

			c.addCapbltyStmntRestRsrcSrchParamNm(String.valueOf(capabilitystatementrestresourcesearchparam.getName()));
		} else {
			c.addCapbltyStmntRestRsrcSrchParamNm("NULL");
		}

		if(capabilitystatementrestresourcesearchparami == capabilitystatementrestresourcesearchparamlist.size()-1) {c.addCapbltyStmntRestRsrcSrchParamNm("]]]");}


		/******************** capabilitystatementrestresourcesearchparamtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType capabilitystatementrestresourcesearchparamtype = capabilitystatementrestresourcesearchparam.getType();
		if(capabilitystatementrestresourcesearchparamtype!=null) {
		if(capabilitystatementrestresourcesearchparami == 0) {

		c.addCapbltyStmntRestRsrcSrchParamTyp("[[[");		}
			c.addCapbltyStmntRestRsrcSrchParamTyp(capabilitystatementrestresourcesearchparamtype.toCode());
		if(capabilitystatementrestresourcesearchparami == capabilitystatementrestresourcesearchparamlist.size()-1) {

		c.addCapbltyStmntRestRsrcSrchParamTyp("]]]");		}

		} else {
			c.addCapbltyStmntRestRsrcSrchParamTyp("NULL");
		}

		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Dfn ********************************************************************************/
		if(capabilitystatementrestresourcesearchparami == 0) {c.addCapbltyStmntRestRsrcSrchParamDfn("[[[");}
		if(capabilitystatementrestresourcesearchparam.hasDefinition()) {

			c.addCapbltyStmntRestRsrcSrchParamDfn(String.valueOf(capabilitystatementrestresourcesearchparam.getDefinition()));
		} else {
			c.addCapbltyStmntRestRsrcSrchParamDfn("NULL");
		}

		if(capabilitystatementrestresourcesearchparami == capabilitystatementrestresourcesearchparamlist.size()-1) {c.addCapbltyStmntRestRsrcSrchParamDfn("]]]");}


		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Docation ********************************************************************************/
		if(capabilitystatementrestresourcesearchparami == 0) {c.addCapbltyStmntRestRsrcSrchParamDocation("[[[");}
		if(capabilitystatementrestresourcesearchparam.hasDocumentation()) {

			c.addCapbltyStmntRestRsrcSrchParamDocation(String.valueOf(capabilitystatementrestresourcesearchparam.getDocumentation()));
		} else {
			c.addCapbltyStmntRestRsrcSrchParamDocation("NULL");
		}

		if(capabilitystatementrestresourcesearchparami == capabilitystatementrestresourcesearchparamlist.size()-1) {c.addCapbltyStmntRestRsrcSrchParamDocation("]]]");}


		 };
		/******************** CapbltyStmnt_Rest_Rsrc_ReadHis ********************************************************************************/
		if(capabilitystatementrestresource.hasReadHistory()) {

			c.addCapbltyStmntRestRsrcReadHis(String.valueOf(capabilitystatementrestresource.getReadHistory()));
		} else {
			c.addCapbltyStmntRestRsrcReadHis("NULL");
		}


		/******************** CapbltyStmnt_Rest_Rsrc_UpdateCreate ********************************************************************************/
		if(capabilitystatementrestresource.hasUpdateCreate()) {

			c.addCapbltyStmntRestRsrcUpdateCreate(String.valueOf(capabilitystatementrestresource.getUpdateCreate()));
		} else {
			c.addCapbltyStmntRestRsrcUpdateCreate("NULL");
		}


		/******************** capabilitystatementrestresourceversioning ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy capabilitystatementrestresourceversioning = capabilitystatementrestresource.getVersioning();
		if(capabilitystatementrestresourceversioning!=null) {
			c.addCapbltyStmntRestRsrcVrsning(capabilitystatementrestresourceversioning.toCode());
		} else {
			c.addCapbltyStmntRestRsrcVrsning("NULL");
		}

		/******************** capabilitystatementrestresourceconditionalread ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus capabilitystatementrestresourceconditionalread = capabilitystatementrestresource.getConditionalRead();
		if(capabilitystatementrestresourceconditionalread!=null) {
			c.addCapbltyStmntRestRsrcCndtnalRead(capabilitystatementrestresourceconditionalread.toCode());
		} else {
			c.addCapbltyStmntRestRsrcCndtnalRead("NULL");
		}

		/******************** CapbltyStmnt_Rest_Rsrc_SrchInclude ********************************************************************************/
		if(capabilitystatementrestresource.hasSearchInclude()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatementrestresource.getSearchInclude().size(); incr++) {
				array = array + capabilitystatementrestresource.getSearchInclude().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntRestRsrcSrchInclude(array);

		} else {
			c.addCapbltyStmntRestRsrcSrchInclude("NULL");
		}


		/******************** capabilitystatementrestresourcereferencepolicy ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy>> capabilitystatementrestresourcereferencepolicylist = capabilitystatementrestresource.getReferencePolicy();
		for(int capabilitystatementrestresourcereferencepolicyi = 0; capabilitystatementrestresourcereferencepolicyi<capabilitystatementrestresourcereferencepolicylist.size();capabilitystatementrestresourcereferencepolicyi++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy>  capabilitystatementrestresourcereferencepolicy = capabilitystatementrestresourcereferencepolicylist.get(capabilitystatementrestresourcereferencepolicyi);
		if(capabilitystatementrestresourcereferencepolicy!=null) {
			c.addCapbltyStmntRestRsrcRfrncPolicy(capabilitystatementrestresourcereferencepolicy.getCode());
		} else {
			c.addCapbltyStmntRestRsrcRfrncPolicy("NULL");
		}
		 };

		 };
		/******************** capabilitystatementrestmode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode capabilitystatementrestmode = capabilitystatementrest.getMode();
		if(capabilitystatementrestmode!=null) {
			c.addCapbltyStmntRestMode(capabilitystatementrestmode.toCode());
		} else {
			c.addCapbltyStmntRestMode("NULL");
		}

		/******************** capabilitystatementrestinteraction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent> capabilitystatementrestinteractionlist = capabilitystatementrest.getInteraction();
		for(int capabilitystatementrestinteractioni = 0; capabilitystatementrestinteractioni<capabilitystatementrestinteractionlist.size();capabilitystatementrestinteractioni++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent  capabilitystatementrestinteraction = capabilitystatementrestinteractionlist.get(capabilitystatementrestinteractioni);

		/******************** capabilitystatementrestinteractioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction capabilitystatementrestinteractioncode = capabilitystatementrestinteraction.getCode();
		if(capabilitystatementrestinteractioncode!=null) {
		if(capabilitystatementrestinteractioni == 0) {

		c.addCapbltyStmntRestInteractionCd("[[");		}
			c.addCapbltyStmntRestInteractionCd(capabilitystatementrestinteractioncode.toCode());
		if(capabilitystatementrestinteractioni == capabilitystatementrestinteractionlist.size()-1) {

		c.addCapbltyStmntRestInteractionCd("]]");		}

		} else {
			c.addCapbltyStmntRestInteractionCd("NULL");
		}

		/******************** CapbltyStmnt_Rest_Interaction_Docation ********************************************************************************/
		if(capabilitystatementrestinteractioni == 0) {c.addCapbltyStmntRestInteractionDocation("[[");}
		if(capabilitystatementrestinteraction.hasDocumentation()) {

			c.addCapbltyStmntRestInteractionDocation(String.valueOf(capabilitystatementrestinteraction.getDocumentation()));
		} else {
			c.addCapbltyStmntRestInteractionDocation("NULL");
		}

		if(capabilitystatementrestinteractioni == capabilitystatementrestinteractionlist.size()-1) {c.addCapbltyStmntRestInteractionDocation("]]");}


		 };
		/******************** capabilitystatementrestsecurity ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent capabilitystatementrestsecurity = capabilitystatementrest.getSecurity();

		/******************** CapbltyStmnt_Rest_Security_Dscrptn ********************************************************************************/
		if(capabilitystatementrestsecurity.hasDescription()) {

			c.addCapbltyStmntRestSecurityDscrptn(String.valueOf(capabilitystatementrestsecurity.getDescription()));
		} else {
			c.addCapbltyStmntRestSecurityDscrptn("NULL");
		}


		/******************** capabilitystatementrestsecurityservice ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> capabilitystatementrestsecurityservicelist = capabilitystatementrestsecurity.getService();
		for(int capabilitystatementrestsecurityservicei = 0; capabilitystatementrestsecurityservicei<capabilitystatementrestsecurityservicelist.size();capabilitystatementrestsecurityservicei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  capabilitystatementrestsecurityservice = capabilitystatementrestsecurityservicelist.get(capabilitystatementrestsecurityservicei);

		/******************** CapbltyStmnt_Rest_Security_Srv_Txt ********************************************************************************/
		if(capabilitystatementrestsecurityservicei == 0) {c.addCapbltyStmntRestSecuritySrvTxt("[[");}
		if(capabilitystatementrestsecurityservice.hasText()) {

			c.addCapbltyStmntRestSecuritySrvTxt(String.valueOf(capabilitystatementrestsecurityservice.getText()));
		} else {
			c.addCapbltyStmntRestSecuritySrvTxt("NULL");
		}

		if(capabilitystatementrestsecurityservicei == capabilitystatementrestsecurityservicelist.size()-1) {c.addCapbltyStmntRestSecuritySrvTxt("]]");}


		/******************** capabilitystatementrestsecurityservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> capabilitystatementrestsecurityservicecodinglist = capabilitystatementrestsecurityservice.getCoding();
		for(int capabilitystatementrestsecurityservicecodingi = 0; capabilitystatementrestsecurityservicecodingi<capabilitystatementrestsecurityservicecodinglist.size();capabilitystatementrestsecurityservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  capabilitystatementrestsecurityservicecoding = capabilitystatementrestsecurityservicecodinglist.get(capabilitystatementrestsecurityservicecodingi);

		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Dsply ********************************************************************************/
		if(capabilitystatementrestsecurityservicecodingi == 0) {c.addCapbltyStmntRestSecuritySrvCdgDsply("[[[");}
		if(capabilitystatementrestsecurityservicecoding.hasDisplay()) {

			c.addCapbltyStmntRestSecuritySrvCdgDsply(String.valueOf(capabilitystatementrestsecurityservicecoding.getDisplay()));
		} else {
			c.addCapbltyStmntRestSecuritySrvCdgDsply("NULL");
		}

		if(capabilitystatementrestsecurityservicecodingi == capabilitystatementrestsecurityservicecodinglist.size()-1) {c.addCapbltyStmntRestSecuritySrvCdgDsply("]]]");}


		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Vrsn ********************************************************************************/
		if(capabilitystatementrestsecurityservicecodingi == 0) {c.addCapbltyStmntRestSecuritySrvCdgVrsn("[[[");}
		if(capabilitystatementrestsecurityservicecoding.hasVersion()) {

			c.addCapbltyStmntRestSecuritySrvCdgVrsn(String.valueOf(capabilitystatementrestsecurityservicecoding.getVersion()));
		} else {
			c.addCapbltyStmntRestSecuritySrvCdgVrsn("NULL");
		}

		if(capabilitystatementrestsecurityservicecodingi == capabilitystatementrestsecurityservicecodinglist.size()-1) {c.addCapbltyStmntRestSecuritySrvCdgVrsn("]]]");}


		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Cd ********************************************************************************/
		if(capabilitystatementrestsecurityservicecodingi == 0) {c.addCapbltyStmntRestSecuritySrvCdgCd("[[[");}
		if(capabilitystatementrestsecurityservicecoding.hasCode()) {

			c.addCapbltyStmntRestSecuritySrvCdgCd(String.valueOf(capabilitystatementrestsecurityservicecoding.getCode()));
		} else {
			c.addCapbltyStmntRestSecuritySrvCdgCd("NULL");
		}

		if(capabilitystatementrestsecurityservicecodingi == capabilitystatementrestsecurityservicecodinglist.size()-1) {c.addCapbltyStmntRestSecuritySrvCdgCd("]]]");}


		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_UsrSltd ********************************************************************************/
		if(capabilitystatementrestsecurityservicecodingi == 0) {c.addCapbltyStmntRestSecuritySrvCdgUsrSltd("[[[");}
		if(capabilitystatementrestsecurityservicecoding.hasUserSelected()) {

			c.addCapbltyStmntRestSecuritySrvCdgUsrSltd(String.valueOf(capabilitystatementrestsecurityservicecoding.getUserSelected()));
		} else {
			c.addCapbltyStmntRestSecuritySrvCdgUsrSltd("NULL");
		}

		if(capabilitystatementrestsecurityservicecodingi == capabilitystatementrestsecurityservicecodinglist.size()-1) {c.addCapbltyStmntRestSecuritySrvCdgUsrSltd("]]]");}


		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Sys ********************************************************************************/
		if(capabilitystatementrestsecurityservicecodingi == 0) {c.addCapbltyStmntRestSecuritySrvCdgSys("[[[");}
		if(capabilitystatementrestsecurityservicecoding.hasSystem()) {

			c.addCapbltyStmntRestSecuritySrvCdgSys(String.valueOf(capabilitystatementrestsecurityservicecoding.getSystem()));
		} else {
			c.addCapbltyStmntRestSecuritySrvCdgSys("NULL");
		}

		if(capabilitystatementrestsecurityservicecodingi == capabilitystatementrestsecurityservicecodinglist.size()-1) {c.addCapbltyStmntRestSecuritySrvCdgSys("]]]");}


		 };
		 };
		/******************** CapbltyStmnt_Rest_Security_Cors ********************************************************************************/
		if(capabilitystatementrestsecurity.hasCors()) {

			c.addCapbltyStmntRestSecurityCors(String.valueOf(capabilitystatementrestsecurity.getCors()));
		} else {
			c.addCapbltyStmntRestSecurityCors("NULL");
		}


		/******************** capabilitystatementrestoperation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent> capabilitystatementrestoperationlist = capabilitystatementrest.getOperation();
		for(int capabilitystatementrestoperationi = 0; capabilitystatementrestoperationi<capabilitystatementrestoperationlist.size();capabilitystatementrestoperationi++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent  capabilitystatementrestoperation = capabilitystatementrestoperationlist.get(capabilitystatementrestoperationi);

		/******************** CapbltyStmnt_Rest_Oprtn_Nm ********************************************************************************/
		if(capabilitystatementrestoperationi == 0) {c.addCapbltyStmntRestOprtnNm("[[");}
		if(capabilitystatementrestoperation.hasName()) {

			c.addCapbltyStmntRestOprtnNm(String.valueOf(capabilitystatementrestoperation.getName()));
		} else {
			c.addCapbltyStmntRestOprtnNm("NULL");
		}

		if(capabilitystatementrestoperationi == capabilitystatementrestoperationlist.size()-1) {c.addCapbltyStmntRestOprtnNm("]]");}


		/******************** CapbltyStmnt_Rest_Oprtn_Dfn ********************************************************************************/
		if(capabilitystatementrestoperationi == 0) {c.addCapbltyStmntRestOprtnDfn("[[");}
		if(capabilitystatementrestoperation.hasDefinition()) {

			c.addCapbltyStmntRestOprtnDfn(String.valueOf(capabilitystatementrestoperation.getDefinition()));
		} else {
			c.addCapbltyStmntRestOprtnDfn("NULL");
		}

		if(capabilitystatementrestoperationi == capabilitystatementrestoperationlist.size()-1) {c.addCapbltyStmntRestOprtnDfn("]]");}


		/******************** CapbltyStmnt_Rest_Oprtn_Docation ********************************************************************************/
		if(capabilitystatementrestoperationi == 0) {c.addCapbltyStmntRestOprtnDocation("[[");}
		if(capabilitystatementrestoperation.hasDocumentation()) {

			c.addCapbltyStmntRestOprtnDocation(String.valueOf(capabilitystatementrestoperation.getDocumentation()));
		} else {
			c.addCapbltyStmntRestOprtnDocation("NULL");
		}

		if(capabilitystatementrestoperationi == capabilitystatementrestoperationlist.size()-1) {c.addCapbltyStmntRestOprtnDocation("]]");}


		 };
		/******************** CapbltyStmnt_Rest_Docation ********************************************************************************/
		if(capabilitystatementrest.hasDocumentation()) {

			c.addCapbltyStmntRestDocation(String.valueOf(capabilitystatementrest.getDocumentation()));
		} else {
			c.addCapbltyStmntRestDocation("NULL");
		}


		/******************** capabilitystatementrestsearchparam ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent> capabilitystatementrestsearchparamlist = capabilitystatementrest.getSearchParam();
		for(int capabilitystatementrestsearchparami = 0; capabilitystatementrestsearchparami<capabilitystatementrestsearchparamlist.size();capabilitystatementrestsearchparami++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent  capabilitystatementrestsearchparam = capabilitystatementrestsearchparamlist.get(capabilitystatementrestsearchparami);

		/******************** CapbltyStmnt_Rest_SrchParam_Nm ********************************************************************************/
		if(capabilitystatementrestsearchparami == 0) {c.addCapbltyStmntRestSrchParamNm("[[");}
		if(capabilitystatementrestsearchparam.hasName()) {

			c.addCapbltyStmntRestSrchParamNm(String.valueOf(capabilitystatementrestsearchparam.getName()));
		} else {
			c.addCapbltyStmntRestSrchParamNm("NULL");
		}

		if(capabilitystatementrestsearchparami == capabilitystatementrestsearchparamlist.size()-1) {c.addCapbltyStmntRestSrchParamNm("]]");}


		/******************** capabilitystatementrestsearchparamtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType capabilitystatementrestsearchparamtype = capabilitystatementrestsearchparam.getType();
		if(capabilitystatementrestsearchparamtype!=null) {
		if(capabilitystatementrestsearchparami == 0) {

		c.addCapbltyStmntRestSrchParamTyp("[[");		}
			c.addCapbltyStmntRestSrchParamTyp(capabilitystatementrestsearchparamtype.toCode());
		if(capabilitystatementrestsearchparami == capabilitystatementrestsearchparamlist.size()-1) {

		c.addCapbltyStmntRestSrchParamTyp("]]");		}

		} else {
			c.addCapbltyStmntRestSrchParamTyp("NULL");
		}

		/******************** CapbltyStmnt_Rest_SrchParam_Dfn ********************************************************************************/
		if(capabilitystatementrestsearchparami == 0) {c.addCapbltyStmntRestSrchParamDfn("[[");}
		if(capabilitystatementrestsearchparam.hasDefinition()) {

			c.addCapbltyStmntRestSrchParamDfn(String.valueOf(capabilitystatementrestsearchparam.getDefinition()));
		} else {
			c.addCapbltyStmntRestSrchParamDfn("NULL");
		}

		if(capabilitystatementrestsearchparami == capabilitystatementrestsearchparamlist.size()-1) {c.addCapbltyStmntRestSrchParamDfn("]]");}


		/******************** CapbltyStmnt_Rest_SrchParam_Docation ********************************************************************************/
		if(capabilitystatementrestsearchparami == 0) {c.addCapbltyStmntRestSrchParamDocation("[[");}
		if(capabilitystatementrestsearchparam.hasDocumentation()) {

			c.addCapbltyStmntRestSrchParamDocation(String.valueOf(capabilitystatementrestsearchparam.getDocumentation()));
		} else {
			c.addCapbltyStmntRestSrchParamDocation("NULL");
		}

		if(capabilitystatementrestsearchparami == capabilitystatementrestsearchparamlist.size()-1) {c.addCapbltyStmntRestSrchParamDocation("]]");}


		 };
		/******************** CapbltyStmnt_Rest_Cmprtmnt ********************************************************************************/
		if(capabilitystatementrest.hasCompartment()) {

			String  array = "[";
			for(int incr=0; incr<capabilitystatementrest.getCompartment().size(); incr++) {
				array = array + capabilitystatementrest.getCompartment().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCapbltyStmntRestCmprtmnt(array);

		} else {
			c.addCapbltyStmntRestCmprtmnt("NULL");
		}


		 };
		/******************** capabilitystatementmessaging ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent> capabilitystatementmessaginglist = capabilitystatement.getMessaging();
		for(int capabilitystatementmessagingi = 0; capabilitystatementmessagingi<capabilitystatementmessaginglist.size();capabilitystatementmessagingi++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent  capabilitystatementmessaging = capabilitystatementmessaginglist.get(capabilitystatementmessagingi);

		/******************** capabilitystatementmessagingendpoint ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent> capabilitystatementmessagingendpointlist = capabilitystatementmessaging.getEndpoint();
		for(int capabilitystatementmessagingendpointi = 0; capabilitystatementmessagingendpointi<capabilitystatementmessagingendpointlist.size();capabilitystatementmessagingendpointi++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent  capabilitystatementmessagingendpoint = capabilitystatementmessagingendpointlist.get(capabilitystatementmessagingendpointi);

		/******************** CapbltyStmnt_Messaging_Endpoint_Addr ********************************************************************************/
		if(capabilitystatementmessagingendpointi == 0) {c.addCapbltyStmntMessagingEndpointAddr("[[");}
		if(capabilitystatementmessagingendpoint.hasAddress()) {

			c.addCapbltyStmntMessagingEndpointAddr(String.valueOf(capabilitystatementmessagingendpoint.getAddress()));
		} else {
			c.addCapbltyStmntMessagingEndpointAddr("NULL");
		}

		if(capabilitystatementmessagingendpointi == capabilitystatementmessagingendpointlist.size()-1) {c.addCapbltyStmntMessagingEndpointAddr("]]");}


		/******************** capabilitystatementmessagingendpointprotocol ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementmessagingendpointprotocol = capabilitystatementmessagingendpoint.getProtocol();

		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Dsply ********************************************************************************/
		if(capabilitystatementmessagingendpointi == 0) {c.addCapbltyStmntMessagingEndpointProtocolDsply("[[");}
		if(capabilitystatementmessagingendpointprotocol.hasDisplay()) {

			c.addCapbltyStmntMessagingEndpointProtocolDsply(String.valueOf(capabilitystatementmessagingendpointprotocol.getDisplay()));
		} else {
			c.addCapbltyStmntMessagingEndpointProtocolDsply("NULL");
		}

		if(capabilitystatementmessagingendpointi == capabilitystatementmessagingendpointlist.size()-1) {c.addCapbltyStmntMessagingEndpointProtocolDsply("]]");}


		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Vrsn ********************************************************************************/
		if(capabilitystatementmessagingendpointi == 0) {c.addCapbltyStmntMessagingEndpointProtocolVrsn("[[");}
		if(capabilitystatementmessagingendpointprotocol.hasVersion()) {

			c.addCapbltyStmntMessagingEndpointProtocolVrsn(String.valueOf(capabilitystatementmessagingendpointprotocol.getVersion()));
		} else {
			c.addCapbltyStmntMessagingEndpointProtocolVrsn("NULL");
		}

		if(capabilitystatementmessagingendpointi == capabilitystatementmessagingendpointlist.size()-1) {c.addCapbltyStmntMessagingEndpointProtocolVrsn("]]");}


		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Cd ********************************************************************************/
		if(capabilitystatementmessagingendpointi == 0) {c.addCapbltyStmntMessagingEndpointProtocolCd("[[");}
		if(capabilitystatementmessagingendpointprotocol.hasCode()) {

			c.addCapbltyStmntMessagingEndpointProtocolCd(String.valueOf(capabilitystatementmessagingendpointprotocol.getCode()));
		} else {
			c.addCapbltyStmntMessagingEndpointProtocolCd("NULL");
		}

		if(capabilitystatementmessagingendpointi == capabilitystatementmessagingendpointlist.size()-1) {c.addCapbltyStmntMessagingEndpointProtocolCd("]]");}


		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_UsrSltd ********************************************************************************/
		if(capabilitystatementmessagingendpointi == 0) {c.addCapbltyStmntMessagingEndpointProtocolUsrSltd("[[");}
		if(capabilitystatementmessagingendpointprotocol.hasUserSelected()) {

			c.addCapbltyStmntMessagingEndpointProtocolUsrSltd(String.valueOf(capabilitystatementmessagingendpointprotocol.getUserSelected()));
		} else {
			c.addCapbltyStmntMessagingEndpointProtocolUsrSltd("NULL");
		}

		if(capabilitystatementmessagingendpointi == capabilitystatementmessagingendpointlist.size()-1) {c.addCapbltyStmntMessagingEndpointProtocolUsrSltd("]]");}


		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Sys ********************************************************************************/
		if(capabilitystatementmessagingendpointi == 0) {c.addCapbltyStmntMessagingEndpointProtocolSys("[[");}
		if(capabilitystatementmessagingendpointprotocol.hasSystem()) {

			c.addCapbltyStmntMessagingEndpointProtocolSys(String.valueOf(capabilitystatementmessagingendpointprotocol.getSystem()));
		} else {
			c.addCapbltyStmntMessagingEndpointProtocolSys("NULL");
		}

		if(capabilitystatementmessagingendpointi == capabilitystatementmessagingendpointlist.size()-1) {c.addCapbltyStmntMessagingEndpointProtocolSys("]]");}


		 };
		/******************** capabilitystatementmessagingsupportedmessage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent> capabilitystatementmessagingsupportedmessagelist = capabilitystatementmessaging.getSupportedMessage();
		for(int capabilitystatementmessagingsupportedmessagei = 0; capabilitystatementmessagingsupportedmessagei<capabilitystatementmessagingsupportedmessagelist.size();capabilitystatementmessagingsupportedmessagei++ ) {
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent  capabilitystatementmessagingsupportedmessage = capabilitystatementmessagingsupportedmessagelist.get(capabilitystatementmessagingsupportedmessagei);

		/******************** CapbltyStmnt_Messaging_SupportedMsg_Dfn ********************************************************************************/
		if(capabilitystatementmessagingsupportedmessagei == 0) {c.addCapbltyStmntMessagingSupportedMsgDfn("[[");}
		if(capabilitystatementmessagingsupportedmessage.hasDefinition()) {

			c.addCapbltyStmntMessagingSupportedMsgDfn(String.valueOf(capabilitystatementmessagingsupportedmessage.getDefinition()));
		} else {
			c.addCapbltyStmntMessagingSupportedMsgDfn("NULL");
		}

		if(capabilitystatementmessagingsupportedmessagei == capabilitystatementmessagingsupportedmessagelist.size()-1) {c.addCapbltyStmntMessagingSupportedMsgDfn("]]");}


		/******************** capabilitystatementmessagingsupportedmessagemode ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode capabilitystatementmessagingsupportedmessagemode = capabilitystatementmessagingsupportedmessage.getMode();
		if(capabilitystatementmessagingsupportedmessagemode!=null) {
		if(capabilitystatementmessagingsupportedmessagei == 0) {

		c.addCapbltyStmntMessagingSupportedMsgMode("[[");		}
			c.addCapbltyStmntMessagingSupportedMsgMode(capabilitystatementmessagingsupportedmessagemode.toCode());
		if(capabilitystatementmessagingsupportedmessagei == capabilitystatementmessagingsupportedmessagelist.size()-1) {

		c.addCapbltyStmntMessagingSupportedMsgMode("]]");		}

		} else {
			c.addCapbltyStmntMessagingSupportedMsgMode("NULL");
		}

		 };
		/******************** CapbltyStmnt_Messaging_Docation ********************************************************************************/
		if(capabilitystatementmessaging.hasDocumentation()) {

			c.addCapbltyStmntMessagingDocation(String.valueOf(capabilitystatementmessaging.getDocumentation()));
		} else {
			c.addCapbltyStmntMessagingDocation("NULL");
		}


		/******************** CapbltyStmnt_Messaging_ReliableCache ********************************************************************************/
		if(capabilitystatementmessaging.hasReliableCache()) {

			c.addCapbltyStmntMessagingReliableCache(String.valueOf(capabilitystatementmessaging.getReliableCache()));
		} else {
			c.addCapbltyStmntMessagingReliableCache("NULL");
		}


		 };
		/******************** capabilitystatementjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> capabilitystatementjurisdictionlist = capabilitystatement.getJurisdiction();
		for(int capabilitystatementjurisdictioni = 0; capabilitystatementjurisdictioni<capabilitystatementjurisdictionlist.size();capabilitystatementjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  capabilitystatementjurisdiction = capabilitystatementjurisdictionlist.get(capabilitystatementjurisdictioni);

		/******************** CapbltyStmnt_Jrsdctn_Txt ********************************************************************************/
		if(capabilitystatementjurisdictioni == 0) {c.addCapbltyStmntJrsdctnTxt("[");}
		if(capabilitystatementjurisdiction.hasText()) {

			c.addCapbltyStmntJrsdctnTxt(String.valueOf(capabilitystatementjurisdiction.getText()));
		} else {
			c.addCapbltyStmntJrsdctnTxt("NULL");
		}

		if(capabilitystatementjurisdictioni == capabilitystatementjurisdictionlist.size()-1) {c.addCapbltyStmntJrsdctnTxt("]");}


		/******************** capabilitystatementjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> capabilitystatementjurisdictioncodinglist = capabilitystatementjurisdiction.getCoding();
		for(int capabilitystatementjurisdictioncodingi = 0; capabilitystatementjurisdictioncodingi<capabilitystatementjurisdictioncodinglist.size();capabilitystatementjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  capabilitystatementjurisdictioncoding = capabilitystatementjurisdictioncodinglist.get(capabilitystatementjurisdictioncodingi);

		/******************** CapbltyStmnt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(capabilitystatementjurisdictioncodingi == 0) {c.addCapbltyStmntJrsdctnCdgDsply("[[");}
		if(capabilitystatementjurisdictioncoding.hasDisplay()) {

			c.addCapbltyStmntJrsdctnCdgDsply(String.valueOf(capabilitystatementjurisdictioncoding.getDisplay()));
		} else {
			c.addCapbltyStmntJrsdctnCdgDsply("NULL");
		}

		if(capabilitystatementjurisdictioncodingi == capabilitystatementjurisdictioncodinglist.size()-1) {c.addCapbltyStmntJrsdctnCdgDsply("]]");}


		/******************** CapbltyStmnt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(capabilitystatementjurisdictioncodingi == 0) {c.addCapbltyStmntJrsdctnCdgVrsn("[[");}
		if(capabilitystatementjurisdictioncoding.hasVersion()) {

			c.addCapbltyStmntJrsdctnCdgVrsn(String.valueOf(capabilitystatementjurisdictioncoding.getVersion()));
		} else {
			c.addCapbltyStmntJrsdctnCdgVrsn("NULL");
		}

		if(capabilitystatementjurisdictioncodingi == capabilitystatementjurisdictioncodinglist.size()-1) {c.addCapbltyStmntJrsdctnCdgVrsn("]]");}


		/******************** CapbltyStmnt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(capabilitystatementjurisdictioncodingi == 0) {c.addCapbltyStmntJrsdctnCdgCd("[[");}
		if(capabilitystatementjurisdictioncoding.hasCode()) {

			c.addCapbltyStmntJrsdctnCdgCd(String.valueOf(capabilitystatementjurisdictioncoding.getCode()));
		} else {
			c.addCapbltyStmntJrsdctnCdgCd("NULL");
		}

		if(capabilitystatementjurisdictioncodingi == capabilitystatementjurisdictioncodinglist.size()-1) {c.addCapbltyStmntJrsdctnCdgCd("]]");}


		/******************** CapbltyStmnt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(capabilitystatementjurisdictioncodingi == 0) {c.addCapbltyStmntJrsdctnCdgUsrSltd("[[");}
		if(capabilitystatementjurisdictioncoding.hasUserSelected()) {

			c.addCapbltyStmntJrsdctnCdgUsrSltd(String.valueOf(capabilitystatementjurisdictioncoding.getUserSelected()));
		} else {
			c.addCapbltyStmntJrsdctnCdgUsrSltd("NULL");
		}

		if(capabilitystatementjurisdictioncodingi == capabilitystatementjurisdictioncodinglist.size()-1) {c.addCapbltyStmntJrsdctnCdgUsrSltd("]]");}


		/******************** CapbltyStmnt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(capabilitystatementjurisdictioncodingi == 0) {c.addCapbltyStmntJrsdctnCdgSys("[[");}
		if(capabilitystatementjurisdictioncoding.hasSystem()) {

			c.addCapbltyStmntJrsdctnCdgSys(String.valueOf(capabilitystatementjurisdictioncoding.getSystem()));
		} else {
			c.addCapbltyStmntJrsdctnCdgSys("NULL");
		}

		if(capabilitystatementjurisdictioncodingi == capabilitystatementjurisdictioncodinglist.size()-1) {c.addCapbltyStmntJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** capabilitystatementusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> capabilitystatementusecontextlist = capabilitystatement.getUseContext();
		for(int capabilitystatementusecontexti = 0; capabilitystatementusecontexti<capabilitystatementusecontextlist.size();capabilitystatementusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  capabilitystatementusecontext = capabilitystatementusecontextlist.get(capabilitystatementusecontexti);

		/******************** capabilitystatementusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding capabilitystatementusecontextcode = capabilitystatementusecontext.getCode();

		/******************** CapbltyStmnt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtCdDsply("[");}
		if(capabilitystatementusecontextcode.hasDisplay()) {

			c.addCapbltyStmntUseCntxtCdDsply(String.valueOf(capabilitystatementusecontextcode.getDisplay()));
		} else {
			c.addCapbltyStmntUseCntxtCdDsply("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtCdDsply("]");}


		/******************** CapbltyStmnt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtCdVrsn("[");}
		if(capabilitystatementusecontextcode.hasVersion()) {

			c.addCapbltyStmntUseCntxtCdVrsn(String.valueOf(capabilitystatementusecontextcode.getVersion()));
		} else {
			c.addCapbltyStmntUseCntxtCdVrsn("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtCdVrsn("]");}


		/******************** CapbltyStmnt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtCdUsrSltd("[");}
		if(capabilitystatementusecontextcode.hasUserSelected()) {

			c.addCapbltyStmntUseCntxtCdUsrSltd(String.valueOf(capabilitystatementusecontextcode.getUserSelected()));
		} else {
			c.addCapbltyStmntUseCntxtCdUsrSltd("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtCdUsrSltd("]");}


		/******************** CapbltyStmnt_UseCntxt_Cd_Sys ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtCdSys("[");}
		if(capabilitystatementusecontextcode.hasSystem()) {

			c.addCapbltyStmntUseCntxtCdSys(String.valueOf(capabilitystatementusecontextcode.getSystem()));
		} else {
			c.addCapbltyStmntUseCntxtCdSys("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtCdSys("]");}


		/******************** CapbltyStmnt_UseCntxt_VlRfrnc ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRfrnc("[");}
		if(capabilitystatementusecontext.hasValueReference()) {

			if(capabilitystatementusecontext.getValueReference().getReference() != null) {
			c.addCapbltyStmntUseCntxtVlRfrnc(capabilitystatementusecontext.getValueReference().getReference());
			}
		} else {
			c.addCapbltyStmntUseCntxtVlRfrnc("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRfrnc("]");}


		/******************** capabilitystatementusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept capabilitystatementusecontextvaluecodeableconcept = capabilitystatementusecontext.getValueCodeableConcept();

		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlCdbleCncptTxt("[");}
		if(capabilitystatementusecontextvaluecodeableconcept.hasText()) {

			c.addCapbltyStmntUseCntxtVlCdbleCncptTxt(String.valueOf(capabilitystatementusecontextvaluecodeableconcept.getText()));
		} else {
			c.addCapbltyStmntUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlCdbleCncptTxt("]");}


		/******************** capabilitystatementusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> capabilitystatementusecontextvaluecodeableconceptcodinglist = capabilitystatementusecontextvaluecodeableconcept.getCoding();
		for(int capabilitystatementusecontextvaluecodeableconceptcodingi = 0; capabilitystatementusecontextvaluecodeableconceptcodingi<capabilitystatementusecontextvaluecodeableconceptcodinglist.size();capabilitystatementusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  capabilitystatementusecontextvaluecodeableconceptcoding = capabilitystatementusecontextvaluecodeableconceptcodinglist.get(capabilitystatementusecontextvaluecodeableconceptcodingi);

		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcodingi == 0) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasDisplay()) {

			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgDsply(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(capabilitystatementusecontextvaluecodeableconceptcodingi == capabilitystatementusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcodingi == 0) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasVersion()) {

			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(capabilitystatementusecontextvaluecodeableconceptcodingi == capabilitystatementusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcodingi == 0) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgCd("[[");}
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasCode()) {

			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgCd(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(capabilitystatementusecontextvaluecodeableconceptcodingi == capabilitystatementusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcodingi == 0) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(capabilitystatementusecontextvaluecodeableconceptcodingi == capabilitystatementusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(capabilitystatementusecontextvaluecodeableconceptcodingi == 0) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgSys("[[");}
		if(capabilitystatementusecontextvaluecodeableconceptcoding.hasSystem()) {

			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgSys(String.valueOf(capabilitystatementusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			c.addCapbltyStmntUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(capabilitystatementusecontextvaluecodeableconceptcodingi == capabilitystatementusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCapbltyStmntUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** capabilitystatementusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range capabilitystatementusecontextvaluerange = capabilitystatementusecontext.getValueRange();

		/******************** capabilitystatementusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluerangelow = capabilitystatementusecontextvaluerange.getLow();

		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngLwVl("[");}
		if(capabilitystatementusecontextvaluerangelow.hasValue()) {

			c.addCapbltyStmntUseCntxtVlRngLwVl(String.valueOf(capabilitystatementusecontextvaluerangelow.getValue()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngLwVl("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngLwVl("]");}


		/******************** capabilitystatementusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator capabilitystatementusecontextvaluerangelowcomparator = capabilitystatementusecontextvaluerangelow.getComparator();
		if(capabilitystatementusecontextvaluerangelowcomparator!=null) {
		if(capabilitystatementusecontexti == 0) {

		c.addCapbltyStmntUseCntxtVlRngLwCmprtr("[");		}
			c.addCapbltyStmntUseCntxtVlRngLwCmprtr(capabilitystatementusecontextvaluerangelowcomparator.toCode());
		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {

		c.addCapbltyStmntUseCntxtVlRngLwCmprtr("]");		}

		} else {
			c.addCapbltyStmntUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngLwCd("[");}
		if(capabilitystatementusecontextvaluerangelow.hasCode()) {

			c.addCapbltyStmntUseCntxtVlRngLwCd(String.valueOf(capabilitystatementusecontextvaluerangelow.getCode()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngLwCd("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngLwCd("]");}


		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngLwUnt("[");}
		if(capabilitystatementusecontextvaluerangelow.hasUnit()) {

			c.addCapbltyStmntUseCntxtVlRngLwUnt(String.valueOf(capabilitystatementusecontextvaluerangelow.getUnit()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngLwUnt("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngLwUnt("]");}


		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngLwSys("[");}
		if(capabilitystatementusecontextvaluerangelow.hasSystem()) {

			c.addCapbltyStmntUseCntxtVlRngLwSys(String.valueOf(capabilitystatementusecontextvaluerangelow.getSystem()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngLwSys("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngLwSys("]");}


		/******************** capabilitystatementusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluerangehigh = capabilitystatementusecontextvaluerange.getHigh();

		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngHiVl("[");}
		if(capabilitystatementusecontextvaluerangehigh.hasValue()) {

			c.addCapbltyStmntUseCntxtVlRngHiVl(String.valueOf(capabilitystatementusecontextvaluerangehigh.getValue()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngHiVl("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngHiVl("]");}


		/******************** capabilitystatementusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator capabilitystatementusecontextvaluerangehighcomparator = capabilitystatementusecontextvaluerangehigh.getComparator();
		if(capabilitystatementusecontextvaluerangehighcomparator!=null) {
		if(capabilitystatementusecontexti == 0) {

		c.addCapbltyStmntUseCntxtVlRngHiCmprtr("[");		}
			c.addCapbltyStmntUseCntxtVlRngHiCmprtr(capabilitystatementusecontextvaluerangehighcomparator.toCode());
		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {

		c.addCapbltyStmntUseCntxtVlRngHiCmprtr("]");		}

		} else {
			c.addCapbltyStmntUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngHiCd("[");}
		if(capabilitystatementusecontextvaluerangehigh.hasCode()) {

			c.addCapbltyStmntUseCntxtVlRngHiCd(String.valueOf(capabilitystatementusecontextvaluerangehigh.getCode()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngHiCd("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngHiCd("]");}


		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngHiUnt("[");}
		if(capabilitystatementusecontextvaluerangehigh.hasUnit()) {

			c.addCapbltyStmntUseCntxtVlRngHiUnt(String.valueOf(capabilitystatementusecontextvaluerangehigh.getUnit()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngHiUnt("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngHiUnt("]");}


		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlRngHiSys("[");}
		if(capabilitystatementusecontextvaluerangehigh.hasSystem()) {

			c.addCapbltyStmntUseCntxtVlRngHiSys(String.valueOf(capabilitystatementusecontextvaluerangehigh.getSystem()));
		} else {
			c.addCapbltyStmntUseCntxtVlRngHiSys("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlRngHiSys("]");}


		/******************** capabilitystatementusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity capabilitystatementusecontextvaluequantity = capabilitystatementusecontext.getValueQuantity();

		/******************** CapbltyStmnt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlQntyVl("[");}
		if(capabilitystatementusecontextvaluequantity.hasValue()) {

			c.addCapbltyStmntUseCntxtVlQntyVl(String.valueOf(capabilitystatementusecontextvaluequantity.getValue()));
		} else {
			c.addCapbltyStmntUseCntxtVlQntyVl("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlQntyVl("]");}


		/******************** capabilitystatementusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator capabilitystatementusecontextvaluequantitycomparator = capabilitystatementusecontextvaluequantity.getComparator();
		if(capabilitystatementusecontextvaluequantitycomparator!=null) {
		if(capabilitystatementusecontexti == 0) {

		c.addCapbltyStmntUseCntxtVlQntyCmprtr("[");		}
			c.addCapbltyStmntUseCntxtVlQntyCmprtr(capabilitystatementusecontextvaluequantitycomparator.toCode());
		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {

		c.addCapbltyStmntUseCntxtVlQntyCmprtr("]");		}

		} else {
			c.addCapbltyStmntUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** CapbltyStmnt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlQntyCd("[");}
		if(capabilitystatementusecontextvaluequantity.hasCode()) {

			c.addCapbltyStmntUseCntxtVlQntyCd(String.valueOf(capabilitystatementusecontextvaluequantity.getCode()));
		} else {
			c.addCapbltyStmntUseCntxtVlQntyCd("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlQntyCd("]");}


		/******************** CapbltyStmnt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlQntyUnt("[");}
		if(capabilitystatementusecontextvaluequantity.hasUnit()) {

			c.addCapbltyStmntUseCntxtVlQntyUnt(String.valueOf(capabilitystatementusecontextvaluequantity.getUnit()));
		} else {
			c.addCapbltyStmntUseCntxtVlQntyUnt("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlQntyUnt("]");}


		/******************** CapbltyStmnt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(capabilitystatementusecontexti == 0) {c.addCapbltyStmntUseCntxtVlQntySys("[");}
		if(capabilitystatementusecontextvaluequantity.hasSystem()) {

			c.addCapbltyStmntUseCntxtVlQntySys(String.valueOf(capabilitystatementusecontextvaluequantity.getSystem()));
		} else {
			c.addCapbltyStmntUseCntxtVlQntySys("NULL");
		}

		if(capabilitystatementusecontexti == capabilitystatementusecontextlist.size()-1) {c.addCapbltyStmntUseCntxtVlQntySys("]");}


		 };
		/******************** CapbltyStmnt_Exprmtl ********************************************************************************/
		if(capabilitystatement.hasExperimental()) {

			c.addCapbltyStmntExprmtl(String.valueOf(capabilitystatement.getExperimental()));
		} else {
			c.addCapbltyStmntExprmtl("NULL");
		}


		/******************** CapbltyStmnt_Pblshr ********************************************************************************/
		if(capabilitystatement.hasPublisher()) {

			c.addCapbltyStmntPblshr(String.valueOf(capabilitystatement.getPublisher()));
		} else {
			c.addCapbltyStmntPblshr("NULL");
		}


		/******************** capabilitystatementimplementation ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent capabilitystatementimplementation = capabilitystatement.getImplementation();

		/******************** CapbltyStmnt_Implementation_Dscrptn ********************************************************************************/
		if(capabilitystatementimplementation.hasDescription()) {

			c.addCapbltyStmntImplementationDscrptn(String.valueOf(capabilitystatementimplementation.getDescription()));
		} else {
			c.addCapbltyStmntImplementationDscrptn("NULL");
		}


		/******************** CapbltyStmnt_Implementation_Custodian ********************************************************************************/
		if(capabilitystatementimplementation.hasCustodian()) {

			if(capabilitystatementimplementation.getCustodian().getReference() != null) {
			c.addCapbltyStmntImplementationCustodian(capabilitystatementimplementation.getCustodian().getReference());
			}
		} else {
			c.addCapbltyStmntImplementationCustodian("NULL");
		}


		/******************** CapbltyStmnt_Implementation_Url ********************************************************************************/
		if(capabilitystatementimplementation.hasUrl()) {

			c.addCapbltyStmntImplementationUrl(String.valueOf(capabilitystatementimplementation.getUrl()));
		} else {
			c.addCapbltyStmntImplementationUrl("NULL");
		}


		/******************** capabilitystatementsoftware ********************************************************************************/
		org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent capabilitystatementsoftware = capabilitystatement.getSoftware();

		/******************** CapbltyStmnt_Software_Nm ********************************************************************************/
		if(capabilitystatementsoftware.hasName()) {

			c.addCapbltyStmntSoftwareNm(String.valueOf(capabilitystatementsoftware.getName()));
		} else {
			c.addCapbltyStmntSoftwareNm("NULL");
		}


		/******************** CapbltyStmnt_Software_ReleaseDt ********************************************************************************/
		if(capabilitystatementsoftware.hasReleaseDate()) {

			c.addCapbltyStmntSoftwareReleaseDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(capabilitystatementsoftware.getReleaseDate())+"\"");
		} else {
			c.addCapbltyStmntSoftwareReleaseDt("NULL");
		}


		return c;
	}
}
