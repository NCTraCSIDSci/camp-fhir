package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Contract;
public class ContractBidirectionalConversion 
{
	public Contract Contracts(org.hl7.fhir.r4.model.Contract contract) throws ParseException
	{
		 main.java.com.campfhir.model.Contract c = new  main.java.com.campfhir.model.Contract();

		/******************** id ********************************************************************************/
		c.setId(contract.getIdElement().getIdPart());

		/******************** Cnct_Nm ********************************************************************************/
		if(contract.hasName()) {

			c.addCnctNm(String.valueOf(contract.getName()));
		} else {
			c.addCnctNm("NULL");
		}


		/******************** contracttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttype = contract.getType();

		/******************** Cnct_Typ_Txt ********************************************************************************/
		if(contracttype.hasText()) {

			c.addCnctTypTxt(String.valueOf(contracttype.getText()));
		} else {
			c.addCnctTypTxt("NULL");
		}


		/******************** contracttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttypecodinglist = contracttype.getCoding();
		for(int contracttypecodingi = 0; contracttypecodingi<contracttypecodinglist.size();contracttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttypecoding = contracttypecodinglist.get(contracttypecodingi);

		/******************** Cnct_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttypecodingi == 0) {c.addCnctTypCdgDsply("[");}
		if(contracttypecoding.hasDisplay()) {

			c.addCnctTypCdgDsply(String.valueOf(contracttypecoding.getDisplay()));
		} else {
			c.addCnctTypCdgDsply("NULL");
		}

		if(contracttypecodingi == contracttypecodinglist.size()-1) {c.addCnctTypCdgDsply("]");}


		/******************** Cnct_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttypecodingi == 0) {c.addCnctTypCdgVrsn("[");}
		if(contracttypecoding.hasVersion()) {

			c.addCnctTypCdgVrsn(String.valueOf(contracttypecoding.getVersion()));
		} else {
			c.addCnctTypCdgVrsn("NULL");
		}

		if(contracttypecodingi == contracttypecodinglist.size()-1) {c.addCnctTypCdgVrsn("]");}


		/******************** Cnct_Typ_Cdg_Cd ********************************************************************************/
		if(contracttypecodingi == 0) {c.addCnctTypCdgCd("[");}
		if(contracttypecoding.hasCode()) {

			c.addCnctTypCdgCd(String.valueOf(contracttypecoding.getCode()));
		} else {
			c.addCnctTypCdgCd("NULL");
		}

		if(contracttypecodingi == contracttypecodinglist.size()-1) {c.addCnctTypCdgCd("]");}


		/******************** Cnct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttypecodingi == 0) {c.addCnctTypCdgUsrSltd("[");}
		if(contracttypecoding.hasUserSelected()) {

			c.addCnctTypCdgUsrSltd(String.valueOf(contracttypecoding.getUserSelected()));
		} else {
			c.addCnctTypCdgUsrSltd("NULL");
		}

		if(contracttypecodingi == contracttypecodinglist.size()-1) {c.addCnctTypCdgUsrSltd("]");}


		/******************** Cnct_Typ_Cdg_Sys ********************************************************************************/
		if(contracttypecodingi == 0) {c.addCnctTypCdgSys("[");}
		if(contracttypecoding.hasSystem()) {

			c.addCnctTypCdgSys(String.valueOf(contracttypecoding.getSystem()));
		} else {
			c.addCnctTypCdgSys("NULL");
		}

		if(contracttypecodingi == contracttypecodinglist.size()-1) {c.addCnctTypCdgSys("]");}


		 };
		/******************** Cnct_Athrity ********************************************************************************/
		if(contract.hasAuthority()) {

			String  array = "[";
			for(int incr=0; incr<contract.getAuthority().size(); incr++) {
				array = array + contract.getAuthority().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctAthrity(array);

		} else {
			c.addCnctAthrity("NULL");
		}


		/******************** Cnct_Vrsn ********************************************************************************/
		if(contract.hasVersion()) {

			c.addCnctVrsn(String.valueOf(contract.getVersion()));
		} else {
			c.addCnctVrsn("NULL");
		}


		/******************** Cnct_Sbjct ********************************************************************************/
		if(contract.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<contract.getSubject().size(); incr++) {
				array = array + contract.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctSbjct(array);

		} else {
			c.addCnctSbjct("NULL");
		}


		/******************** contractstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractStatus contractstatus = contract.getStatus();
		if(contractstatus!=null) {
			c.addCnctSts(contractstatus.toCode());
		} else {
			c.addCnctSts("NULL");
		}

		/******************** contractidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> contractidentifierlist = contract.getIdentifier();
		for(int contractidentifieri = 0; contractidentifieri<contractidentifierlist.size();contractidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  contractidentifier = contractidentifierlist.get(contractidentifieri);

		/******************** Cnct_Id_Vl ********************************************************************************/
		if(contractidentifieri == 0) {c.addCnctIdVl("[");}
		if(contractidentifier.hasValue()) {

			c.addCnctIdVl(String.valueOf(contractidentifier.getValue()));
		} else {
			c.addCnctIdVl("NULL");
		}

		if(contractidentifieri == contractidentifierlist.size()-1) {c.addCnctIdVl("]");}


		/******************** contractidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractidentifiertype = contractidentifier.getType();

		/******************** Cnct_Id_Typ_Txt ********************************************************************************/
		if(contractidentifieri == 0) {c.addCnctIdTypTxt("[");}
		if(contractidentifiertype.hasText()) {

			c.addCnctIdTypTxt(String.valueOf(contractidentifiertype.getText()));
		} else {
			c.addCnctIdTypTxt("NULL");
		}

		if(contractidentifieri == contractidentifierlist.size()-1) {c.addCnctIdTypTxt("]");}


		/******************** contractidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractidentifiertypecodinglist = contractidentifiertype.getCoding();
		for(int contractidentifiertypecodingi = 0; contractidentifiertypecodingi<contractidentifiertypecodinglist.size();contractidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractidentifiertypecoding = contractidentifiertypecodinglist.get(contractidentifiertypecodingi);

		/******************** Cnct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contractidentifiertypecodingi == 0) {c.addCnctIdTypCdgDsply("[[");}
		if(contractidentifiertypecoding.hasDisplay()) {

			c.addCnctIdTypCdgDsply(String.valueOf(contractidentifiertypecoding.getDisplay()));
		} else {
			c.addCnctIdTypCdgDsply("NULL");
		}

		if(contractidentifiertypecodingi == contractidentifiertypecodinglist.size()-1) {c.addCnctIdTypCdgDsply("]]");}


		/******************** Cnct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contractidentifiertypecodingi == 0) {c.addCnctIdTypCdgVrsn("[[");}
		if(contractidentifiertypecoding.hasVersion()) {

			c.addCnctIdTypCdgVrsn(String.valueOf(contractidentifiertypecoding.getVersion()));
		} else {
			c.addCnctIdTypCdgVrsn("NULL");
		}

		if(contractidentifiertypecodingi == contractidentifiertypecodinglist.size()-1) {c.addCnctIdTypCdgVrsn("]]");}


		/******************** Cnct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contractidentifiertypecodingi == 0) {c.addCnctIdTypCdgCd("[[");}
		if(contractidentifiertypecoding.hasCode()) {

			c.addCnctIdTypCdgCd(String.valueOf(contractidentifiertypecoding.getCode()));
		} else {
			c.addCnctIdTypCdgCd("NULL");
		}

		if(contractidentifiertypecodingi == contractidentifiertypecodinglist.size()-1) {c.addCnctIdTypCdgCd("]]");}


		/******************** Cnct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contractidentifiertypecodingi == 0) {c.addCnctIdTypCdgUsrSltd("[[");}
		if(contractidentifiertypecoding.hasUserSelected()) {

			c.addCnctIdTypCdgUsrSltd(String.valueOf(contractidentifiertypecoding.getUserSelected()));
		} else {
			c.addCnctIdTypCdgUsrSltd("NULL");
		}

		if(contractidentifiertypecodingi == contractidentifiertypecodinglist.size()-1) {c.addCnctIdTypCdgUsrSltd("]]");}


		/******************** Cnct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contractidentifiertypecodingi == 0) {c.addCnctIdTypCdgSys("[[");}
		if(contractidentifiertypecoding.hasSystem()) {

			c.addCnctIdTypCdgSys(String.valueOf(contractidentifiertypecoding.getSystem()));
		} else {
			c.addCnctIdTypCdgSys("NULL");
		}

		if(contractidentifiertypecodingi == contractidentifiertypecodinglist.size()-1) {c.addCnctIdTypCdgSys("]]");}


		 };
		/******************** contractidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contractidentifierperiod = contractidentifier.getPeriod();

		/******************** Cnct_Id_Prd_Strt ********************************************************************************/
		if(contractidentifieri == 0) {c.addCnctIdPrdStrt("[");}
		if(contractidentifierperiod.hasStart()) {

			c.addCnctIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractidentifierperiod.getStart())+"\"");
		} else {
			c.addCnctIdPrdStrt("NULL");
		}

		if(contractidentifieri == contractidentifierlist.size()-1) {c.addCnctIdPrdStrt("]");}


		/******************** Cnct_Id_Prd_End ********************************************************************************/
		if(contractidentifieri == 0) {c.addCnctIdPrdEnd("[");}
		if(contractidentifierperiod.hasEnd()) {

			c.addCnctIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractidentifierperiod.getEnd())+"\"");
		} else {
			c.addCnctIdPrdEnd("NULL");
		}

		if(contractidentifieri == contractidentifierlist.size()-1) {c.addCnctIdPrdEnd("]");}


		/******************** contractidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contractidentifieruse = contractidentifier.getUse();
		if(contractidentifieruse!=null) {
		if(contractidentifieri == 0) {

		c.addCnctIdUse("[");		}
			c.addCnctIdUse(contractidentifieruse.toCode());
		if(contractidentifieri == contractidentifierlist.size()-1) {

		c.addCnctIdUse("]");		}

		} else {
			c.addCnctIdUse("NULL");
		}

		/******************** Cnct_Id_Assigner ********************************************************************************/
		if(contractidentifieri == 0) {c.addCnctIdAssigner("[");}
		if(contractidentifier.hasAssigner()) {

			if(contractidentifier.getAssigner().getReference() != null) {
			c.addCnctIdAssigner(contractidentifier.getAssigner().getReference());
			}
		} else {
			c.addCnctIdAssigner("NULL");
		}

		if(contractidentifieri == contractidentifierlist.size()-1) {c.addCnctIdAssigner("]");}


		/******************** Cnct_Id_Sys ********************************************************************************/
		if(contractidentifieri == 0) {c.addCnctIdSys("[");}
		if(contractidentifier.hasSystem()) {

			c.addCnctIdSys(String.valueOf(contractidentifier.getSystem()));
		} else {
			c.addCnctIdSys("NULL");
		}

		if(contractidentifieri == contractidentifierlist.size()-1) {c.addCnctIdSys("]");}


		 };
		/******************** contractscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractscope = contract.getScope();

		/******************** Cnct_Scope_Txt ********************************************************************************/
		if(contractscope.hasText()) {

			c.addCnctScopeTxt(String.valueOf(contractscope.getText()));
		} else {
			c.addCnctScopeTxt("NULL");
		}


		/******************** contractscopecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractscopecodinglist = contractscope.getCoding();
		for(int contractscopecodingi = 0; contractscopecodingi<contractscopecodinglist.size();contractscopecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractscopecoding = contractscopecodinglist.get(contractscopecodingi);

		/******************** Cnct_Scope_Cdg_Dsply ********************************************************************************/
		if(contractscopecodingi == 0) {c.addCnctScopeCdgDsply("[");}
		if(contractscopecoding.hasDisplay()) {

			c.addCnctScopeCdgDsply(String.valueOf(contractscopecoding.getDisplay()));
		} else {
			c.addCnctScopeCdgDsply("NULL");
		}

		if(contractscopecodingi == contractscopecodinglist.size()-1) {c.addCnctScopeCdgDsply("]");}


		/******************** Cnct_Scope_Cdg_Vrsn ********************************************************************************/
		if(contractscopecodingi == 0) {c.addCnctScopeCdgVrsn("[");}
		if(contractscopecoding.hasVersion()) {

			c.addCnctScopeCdgVrsn(String.valueOf(contractscopecoding.getVersion()));
		} else {
			c.addCnctScopeCdgVrsn("NULL");
		}

		if(contractscopecodingi == contractscopecodinglist.size()-1) {c.addCnctScopeCdgVrsn("]");}


		/******************** Cnct_Scope_Cdg_Cd ********************************************************************************/
		if(contractscopecodingi == 0) {c.addCnctScopeCdgCd("[");}
		if(contractscopecoding.hasCode()) {

			c.addCnctScopeCdgCd(String.valueOf(contractscopecoding.getCode()));
		} else {
			c.addCnctScopeCdgCd("NULL");
		}

		if(contractscopecodingi == contractscopecodinglist.size()-1) {c.addCnctScopeCdgCd("]");}


		/******************** Cnct_Scope_Cdg_UsrSltd ********************************************************************************/
		if(contractscopecodingi == 0) {c.addCnctScopeCdgUsrSltd("[");}
		if(contractscopecoding.hasUserSelected()) {

			c.addCnctScopeCdgUsrSltd(String.valueOf(contractscopecoding.getUserSelected()));
		} else {
			c.addCnctScopeCdgUsrSltd("NULL");
		}

		if(contractscopecodingi == contractscopecodinglist.size()-1) {c.addCnctScopeCdgUsrSltd("]");}


		/******************** Cnct_Scope_Cdg_Sys ********************************************************************************/
		if(contractscopecodingi == 0) {c.addCnctScopeCdgSys("[");}
		if(contractscopecoding.hasSystem()) {

			c.addCnctScopeCdgSys(String.valueOf(contractscopecoding.getSystem()));
		} else {
			c.addCnctScopeCdgSys("NULL");
		}

		if(contractscopecodingi == contractscopecodinglist.size()-1) {c.addCnctScopeCdgSys("]");}


		 };
		/******************** Cnct_InstantiatesUri ********************************************************************************/
		if(contract.hasInstantiatesUri()) {

			c.addCnctInstantiatesUri(String.valueOf(contract.getInstantiatesUri()));
		} else {
			c.addCnctInstantiatesUri("NULL");
		}


		/******************** Cnct_Domain ********************************************************************************/
		if(contract.hasDomain()) {

			String  array = "[";
			for(int incr=0; incr<contract.getDomain().size(); incr++) {
				array = array + contract.getDomain().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctDomain(array);

		} else {
			c.addCnctDomain("NULL");
		}


		/******************** Cnct_Ttl ********************************************************************************/
		if(contract.hasTitle()) {

			c.addCnctTtl(String.valueOf(contract.getTitle()));
		} else {
			c.addCnctTtl("NULL");
		}


		/******************** Cnct_Site ********************************************************************************/
		if(contract.hasSite()) {

			String  array = "[";
			for(int incr=0; incr<contract.getSite().size(); incr++) {
				array = array + contract.getSite().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctSite(array);

		} else {
			c.addCnctSite("NULL");
		}


		/******************** contracttopiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttopiccodeableconcept = contract.getTopicCodeableConcept();

		/******************** Cnct_TopicCdbleCncpt_Txt ********************************************************************************/
		if(contracttopiccodeableconcept.hasText()) {

			c.addCnctTopicCdbleCncptTxt(String.valueOf(contracttopiccodeableconcept.getText()));
		} else {
			c.addCnctTopicCdbleCncptTxt("NULL");
		}


		/******************** contracttopiccodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttopiccodeableconceptcodinglist = contracttopiccodeableconcept.getCoding();
		for(int contracttopiccodeableconceptcodingi = 0; contracttopiccodeableconceptcodingi<contracttopiccodeableconceptcodinglist.size();contracttopiccodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttopiccodeableconceptcoding = contracttopiccodeableconceptcodinglist.get(contracttopiccodeableconceptcodingi);

		/******************** Cnct_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(contracttopiccodeableconceptcodingi == 0) {c.addCnctTopicCdbleCncptCdgDsply("[");}
		if(contracttopiccodeableconceptcoding.hasDisplay()) {

			c.addCnctTopicCdbleCncptCdgDsply(String.valueOf(contracttopiccodeableconceptcoding.getDisplay()));
		} else {
			c.addCnctTopicCdbleCncptCdgDsply("NULL");
		}

		if(contracttopiccodeableconceptcodingi == contracttopiccodeableconceptcodinglist.size()-1) {c.addCnctTopicCdbleCncptCdgDsply("]");}


		/******************** Cnct_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(contracttopiccodeableconceptcodingi == 0) {c.addCnctTopicCdbleCncptCdgVrsn("[");}
		if(contracttopiccodeableconceptcoding.hasVersion()) {

			c.addCnctTopicCdbleCncptCdgVrsn(String.valueOf(contracttopiccodeableconceptcoding.getVersion()));
		} else {
			c.addCnctTopicCdbleCncptCdgVrsn("NULL");
		}

		if(contracttopiccodeableconceptcodingi == contracttopiccodeableconceptcodinglist.size()-1) {c.addCnctTopicCdbleCncptCdgVrsn("]");}


		/******************** Cnct_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(contracttopiccodeableconceptcodingi == 0) {c.addCnctTopicCdbleCncptCdgCd("[");}
		if(contracttopiccodeableconceptcoding.hasCode()) {

			c.addCnctTopicCdbleCncptCdgCd(String.valueOf(contracttopiccodeableconceptcoding.getCode()));
		} else {
			c.addCnctTopicCdbleCncptCdgCd("NULL");
		}

		if(contracttopiccodeableconceptcodingi == contracttopiccodeableconceptcodinglist.size()-1) {c.addCnctTopicCdbleCncptCdgCd("]");}


		/******************** Cnct_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(contracttopiccodeableconceptcodingi == 0) {c.addCnctTopicCdbleCncptCdgUsrSltd("[");}
		if(contracttopiccodeableconceptcoding.hasUserSelected()) {

			c.addCnctTopicCdbleCncptCdgUsrSltd(String.valueOf(contracttopiccodeableconceptcoding.getUserSelected()));
		} else {
			c.addCnctTopicCdbleCncptCdgUsrSltd("NULL");
		}

		if(contracttopiccodeableconceptcodingi == contracttopiccodeableconceptcodinglist.size()-1) {c.addCnctTopicCdbleCncptCdgUsrSltd("]");}


		/******************** Cnct_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(contracttopiccodeableconceptcodingi == 0) {c.addCnctTopicCdbleCncptCdgSys("[");}
		if(contracttopiccodeableconceptcoding.hasSystem()) {

			c.addCnctTopicCdbleCncptCdgSys(String.valueOf(contracttopiccodeableconceptcoding.getSystem()));
		} else {
			c.addCnctTopicCdbleCncptCdgSys("NULL");
		}

		if(contracttopiccodeableconceptcodingi == contracttopiccodeableconceptcodinglist.size()-1) {c.addCnctTopicCdbleCncptCdgSys("]");}


		 };
		/******************** contractcontentdefinition ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContentDefinitionComponent contractcontentdefinition = contract.getContentDefinition();

		/******************** contractcontentdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentdefinitiontype = contractcontentdefinition.getType();

		/******************** Cnct_CntntDfn_Typ_Txt ********************************************************************************/
		if(contractcontentdefinitiontype.hasText()) {

			c.addCnctCntntDfnTypTxt(String.valueOf(contractcontentdefinitiontype.getText()));
		} else {
			c.addCnctCntntDfnTypTxt("NULL");
		}


		/******************** contractcontentdefinitiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractcontentdefinitiontypecodinglist = contractcontentdefinitiontype.getCoding();
		for(int contractcontentdefinitiontypecodingi = 0; contractcontentdefinitiontypecodingi<contractcontentdefinitiontypecodinglist.size();contractcontentdefinitiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractcontentdefinitiontypecoding = contractcontentdefinitiontypecodinglist.get(contractcontentdefinitiontypecodingi);

		/******************** Cnct_CntntDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(contractcontentdefinitiontypecodingi == 0) {c.addCnctCntntDfnTypCdgDsply("[");}
		if(contractcontentdefinitiontypecoding.hasDisplay()) {

			c.addCnctCntntDfnTypCdgDsply(String.valueOf(contractcontentdefinitiontypecoding.getDisplay()));
		} else {
			c.addCnctCntntDfnTypCdgDsply("NULL");
		}

		if(contractcontentdefinitiontypecodingi == contractcontentdefinitiontypecodinglist.size()-1) {c.addCnctCntntDfnTypCdgDsply("]");}


		/******************** Cnct_CntntDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(contractcontentdefinitiontypecodingi == 0) {c.addCnctCntntDfnTypCdgVrsn("[");}
		if(contractcontentdefinitiontypecoding.hasVersion()) {

			c.addCnctCntntDfnTypCdgVrsn(String.valueOf(contractcontentdefinitiontypecoding.getVersion()));
		} else {
			c.addCnctCntntDfnTypCdgVrsn("NULL");
		}

		if(contractcontentdefinitiontypecodingi == contractcontentdefinitiontypecodinglist.size()-1) {c.addCnctCntntDfnTypCdgVrsn("]");}


		/******************** Cnct_CntntDfn_Typ_Cdg_Cd ********************************************************************************/
		if(contractcontentdefinitiontypecodingi == 0) {c.addCnctCntntDfnTypCdgCd("[");}
		if(contractcontentdefinitiontypecoding.hasCode()) {

			c.addCnctCntntDfnTypCdgCd(String.valueOf(contractcontentdefinitiontypecoding.getCode()));
		} else {
			c.addCnctCntntDfnTypCdgCd("NULL");
		}

		if(contractcontentdefinitiontypecodingi == contractcontentdefinitiontypecodinglist.size()-1) {c.addCnctCntntDfnTypCdgCd("]");}


		/******************** Cnct_CntntDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contractcontentdefinitiontypecodingi == 0) {c.addCnctCntntDfnTypCdgUsrSltd("[");}
		if(contractcontentdefinitiontypecoding.hasUserSelected()) {

			c.addCnctCntntDfnTypCdgUsrSltd(String.valueOf(contractcontentdefinitiontypecoding.getUserSelected()));
		} else {
			c.addCnctCntntDfnTypCdgUsrSltd("NULL");
		}

		if(contractcontentdefinitiontypecodingi == contractcontentdefinitiontypecodinglist.size()-1) {c.addCnctCntntDfnTypCdgUsrSltd("]");}


		/******************** Cnct_CntntDfn_Typ_Cdg_Sys ********************************************************************************/
		if(contractcontentdefinitiontypecodingi == 0) {c.addCnctCntntDfnTypCdgSys("[");}
		if(contractcontentdefinitiontypecoding.hasSystem()) {

			c.addCnctCntntDfnTypCdgSys(String.valueOf(contractcontentdefinitiontypecoding.getSystem()));
		} else {
			c.addCnctCntntDfnTypCdgSys("NULL");
		}

		if(contractcontentdefinitiontypecodingi == contractcontentdefinitiontypecodinglist.size()-1) {c.addCnctCntntDfnTypCdgSys("]");}


		 };
		/******************** contractcontentdefinitionpublicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractPublicationStatus contractcontentdefinitionpublicationstatus = contractcontentdefinition.getPublicationStatus();
		if(contractcontentdefinitionpublicationstatus!=null) {
			c.addCnctCntntDfnPublicationSts(contractcontentdefinitionpublicationstatus.toCode());
		} else {
			c.addCnctCntntDfnPublicationSts("NULL");
		}

		/******************** Cnct_CntntDfn_Copyright ********************************************************************************/
		if(contractcontentdefinition.hasCopyright()) {

			c.addCnctCntntDfnCopyright(String.valueOf(contractcontentdefinition.getCopyright()));
		} else {
			c.addCnctCntntDfnCopyright("NULL");
		}


		/******************** contractcontentdefinitionsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentdefinitionsubtype = contractcontentdefinition.getSubType();

		/******************** Cnct_CntntDfn_SubTyp_Txt ********************************************************************************/
		if(contractcontentdefinitionsubtype.hasText()) {

			c.addCnctCntntDfnSubTypTxt(String.valueOf(contractcontentdefinitionsubtype.getText()));
		} else {
			c.addCnctCntntDfnSubTypTxt("NULL");
		}


		/******************** contractcontentdefinitionsubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractcontentdefinitionsubtypecodinglist = contractcontentdefinitionsubtype.getCoding();
		for(int contractcontentdefinitionsubtypecodingi = 0; contractcontentdefinitionsubtypecodingi<contractcontentdefinitionsubtypecodinglist.size();contractcontentdefinitionsubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractcontentdefinitionsubtypecoding = contractcontentdefinitionsubtypecodinglist.get(contractcontentdefinitionsubtypecodingi);

		/******************** Cnct_CntntDfn_SubTyp_Cdg_Dsply ********************************************************************************/
		if(contractcontentdefinitionsubtypecodingi == 0) {c.addCnctCntntDfnSubTypCdgDsply("[");}
		if(contractcontentdefinitionsubtypecoding.hasDisplay()) {

			c.addCnctCntntDfnSubTypCdgDsply(String.valueOf(contractcontentdefinitionsubtypecoding.getDisplay()));
		} else {
			c.addCnctCntntDfnSubTypCdgDsply("NULL");
		}

		if(contractcontentdefinitionsubtypecodingi == contractcontentdefinitionsubtypecodinglist.size()-1) {c.addCnctCntntDfnSubTypCdgDsply("]");}


		/******************** Cnct_CntntDfn_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(contractcontentdefinitionsubtypecodingi == 0) {c.addCnctCntntDfnSubTypCdgVrsn("[");}
		if(contractcontentdefinitionsubtypecoding.hasVersion()) {

			c.addCnctCntntDfnSubTypCdgVrsn(String.valueOf(contractcontentdefinitionsubtypecoding.getVersion()));
		} else {
			c.addCnctCntntDfnSubTypCdgVrsn("NULL");
		}

		if(contractcontentdefinitionsubtypecodingi == contractcontentdefinitionsubtypecodinglist.size()-1) {c.addCnctCntntDfnSubTypCdgVrsn("]");}


		/******************** Cnct_CntntDfn_SubTyp_Cdg_Cd ********************************************************************************/
		if(contractcontentdefinitionsubtypecodingi == 0) {c.addCnctCntntDfnSubTypCdgCd("[");}
		if(contractcontentdefinitionsubtypecoding.hasCode()) {

			c.addCnctCntntDfnSubTypCdgCd(String.valueOf(contractcontentdefinitionsubtypecoding.getCode()));
		} else {
			c.addCnctCntntDfnSubTypCdgCd("NULL");
		}

		if(contractcontentdefinitionsubtypecodingi == contractcontentdefinitionsubtypecodinglist.size()-1) {c.addCnctCntntDfnSubTypCdgCd("]");}


		/******************** Cnct_CntntDfn_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(contractcontentdefinitionsubtypecodingi == 0) {c.addCnctCntntDfnSubTypCdgUsrSltd("[");}
		if(contractcontentdefinitionsubtypecoding.hasUserSelected()) {

			c.addCnctCntntDfnSubTypCdgUsrSltd(String.valueOf(contractcontentdefinitionsubtypecoding.getUserSelected()));
		} else {
			c.addCnctCntntDfnSubTypCdgUsrSltd("NULL");
		}

		if(contractcontentdefinitionsubtypecodingi == contractcontentdefinitionsubtypecodinglist.size()-1) {c.addCnctCntntDfnSubTypCdgUsrSltd("]");}


		/******************** Cnct_CntntDfn_SubTyp_Cdg_Sys ********************************************************************************/
		if(contractcontentdefinitionsubtypecodingi == 0) {c.addCnctCntntDfnSubTypCdgSys("[");}
		if(contractcontentdefinitionsubtypecoding.hasSystem()) {

			c.addCnctCntntDfnSubTypCdgSys(String.valueOf(contractcontentdefinitionsubtypecoding.getSystem()));
		} else {
			c.addCnctCntntDfnSubTypCdgSys("NULL");
		}

		if(contractcontentdefinitionsubtypecodingi == contractcontentdefinitionsubtypecodinglist.size()-1) {c.addCnctCntntDfnSubTypCdgSys("]");}


		 };
		/******************** Cnct_CntntDfn_Pblshr ********************************************************************************/
		if(contractcontentdefinition.hasPublisher()) {

			if(contractcontentdefinition.getPublisher().getReference() != null) {
			c.addCnctCntntDfnPblshr(contractcontentdefinition.getPublisher().getReference());
			}
		} else {
			c.addCnctCntntDfnPblshr("NULL");
		}


		/******************** Cnct_CntntDfn_PublicationDt ********************************************************************************/
		if(contractcontentdefinition.hasPublicationDate()) {

			c.addCnctCntntDfnPublicationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractcontentdefinition.getPublicationDate())+"\"");
		} else {
			c.addCnctCntntDfnPublicationDt("NULL");
		}


		/******************** contractlegallybindingattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractlegallybindingattachment = contract.getLegallyBindingAttachment();

		/******************** Cnct_LegallyBindingAttchmnt_Sz ********************************************************************************/
		if(contractlegallybindingattachment.hasSize()) {

			c.addCnctLegallyBindingAttchmntSz(String.valueOf(contractlegallybindingattachment.getSize()));
		} else {
			c.addCnctLegallyBindingAttchmntSz("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_Lnguage ********************************************************************************/
		if(contractlegallybindingattachment.hasLanguage()) {

			c.addCnctLegallyBindingAttchmntLnguage(String.valueOf(contractlegallybindingattachment.getLanguage()));
		} else {
			c.addCnctLegallyBindingAttchmntLnguage("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_CntntTyp ********************************************************************************/
		if(contractlegallybindingattachment.hasContentType()) {

			c.addCnctLegallyBindingAttchmntCntntTyp(String.valueOf(contractlegallybindingattachment.getContentType()));
		} else {
			c.addCnctLegallyBindingAttchmntCntntTyp("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_Hash ********************************************************************************/
		if(contractlegallybindingattachment.hasHash()) {

			c.addCnctLegallyBindingAttchmntHash(new String(contractlegallybindingattachment.getHash()));
		} else {
			c.addCnctLegallyBindingAttchmntHash("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_Data ********************************************************************************/
		if(contractlegallybindingattachment.hasData()) {

			c.addCnctLegallyBindingAttchmntData(new String(contractlegallybindingattachment.getData()));
		} else {
			c.addCnctLegallyBindingAttchmntData("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_Creation ********************************************************************************/
		if(contractlegallybindingattachment.hasCreation()) {

			c.addCnctLegallyBindingAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractlegallybindingattachment.getCreation())+"\"");
		} else {
			c.addCnctLegallyBindingAttchmntCreation("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_Ttl ********************************************************************************/
		if(contractlegallybindingattachment.hasTitle()) {

			c.addCnctLegallyBindingAttchmntTtl(String.valueOf(contractlegallybindingattachment.getTitle()));
		} else {
			c.addCnctLegallyBindingAttchmntTtl("NULL");
		}


		/******************** Cnct_LegallyBindingAttchmnt_Url ********************************************************************************/
		if(contractlegallybindingattachment.hasUrl()) {

			c.addCnctLegallyBindingAttchmntUrl(String.valueOf(contractlegallybindingattachment.getUrl()));
		} else {
			c.addCnctLegallyBindingAttchmntUrl("NULL");
		}


		/******************** Cnct_LegallyBindingRfrnc ********************************************************************************/
		if(contract.hasLegallyBindingReference()) {

			if(contract.getLegallyBindingReference().getReference() != null) {
			c.addCnctLegallyBindingRfrnc(contract.getLegallyBindingReference().getReference());
			}
		} else {
			c.addCnctLegallyBindingRfrnc("NULL");
		}


		/******************** contractcontentderivative ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentderivative = contract.getContentDerivative();

		/******************** Cnct_CntntDerivative_Txt ********************************************************************************/
		if(contractcontentderivative.hasText()) {

			c.addCnctCntntDerivativeTxt(String.valueOf(contractcontentderivative.getText()));
		} else {
			c.addCnctCntntDerivativeTxt("NULL");
		}


		/******************** contractcontentderivativecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractcontentderivativecodinglist = contractcontentderivative.getCoding();
		for(int contractcontentderivativecodingi = 0; contractcontentderivativecodingi<contractcontentderivativecodinglist.size();contractcontentderivativecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractcontentderivativecoding = contractcontentderivativecodinglist.get(contractcontentderivativecodingi);

		/******************** Cnct_CntntDerivative_Cdg_Dsply ********************************************************************************/
		if(contractcontentderivativecodingi == 0) {c.addCnctCntntDerivativeCdgDsply("[");}
		if(contractcontentderivativecoding.hasDisplay()) {

			c.addCnctCntntDerivativeCdgDsply(String.valueOf(contractcontentderivativecoding.getDisplay()));
		} else {
			c.addCnctCntntDerivativeCdgDsply("NULL");
		}

		if(contractcontentderivativecodingi == contractcontentderivativecodinglist.size()-1) {c.addCnctCntntDerivativeCdgDsply("]");}


		/******************** Cnct_CntntDerivative_Cdg_Vrsn ********************************************************************************/
		if(contractcontentderivativecodingi == 0) {c.addCnctCntntDerivativeCdgVrsn("[");}
		if(contractcontentderivativecoding.hasVersion()) {

			c.addCnctCntntDerivativeCdgVrsn(String.valueOf(contractcontentderivativecoding.getVersion()));
		} else {
			c.addCnctCntntDerivativeCdgVrsn("NULL");
		}

		if(contractcontentderivativecodingi == contractcontentderivativecodinglist.size()-1) {c.addCnctCntntDerivativeCdgVrsn("]");}


		/******************** Cnct_CntntDerivative_Cdg_Cd ********************************************************************************/
		if(contractcontentderivativecodingi == 0) {c.addCnctCntntDerivativeCdgCd("[");}
		if(contractcontentderivativecoding.hasCode()) {

			c.addCnctCntntDerivativeCdgCd(String.valueOf(contractcontentderivativecoding.getCode()));
		} else {
			c.addCnctCntntDerivativeCdgCd("NULL");
		}

		if(contractcontentderivativecodingi == contractcontentderivativecodinglist.size()-1) {c.addCnctCntntDerivativeCdgCd("]");}


		/******************** Cnct_CntntDerivative_Cdg_UsrSltd ********************************************************************************/
		if(contractcontentderivativecodingi == 0) {c.addCnctCntntDerivativeCdgUsrSltd("[");}
		if(contractcontentderivativecoding.hasUserSelected()) {

			c.addCnctCntntDerivativeCdgUsrSltd(String.valueOf(contractcontentderivativecoding.getUserSelected()));
		} else {
			c.addCnctCntntDerivativeCdgUsrSltd("NULL");
		}

		if(contractcontentderivativecodingi == contractcontentderivativecodinglist.size()-1) {c.addCnctCntntDerivativeCdgUsrSltd("]");}


		/******************** Cnct_CntntDerivative_Cdg_Sys ********************************************************************************/
		if(contractcontentderivativecodingi == 0) {c.addCnctCntntDerivativeCdgSys("[");}
		if(contractcontentderivativecoding.hasSystem()) {

			c.addCnctCntntDerivativeCdgSys(String.valueOf(contractcontentderivativecoding.getSystem()));
		} else {
			c.addCnctCntntDerivativeCdgSys("NULL");
		}

		if(contractcontentderivativecodingi == contractcontentderivativecodinglist.size()-1) {c.addCnctCntntDerivativeCdgSys("]");}


		 };
		/******************** Cnct_SprtingInfo ********************************************************************************/
		if(contract.hasSupportingInfo()) {

			String  array = "[";
			for(int incr=0; incr<contract.getSupportingInfo().size(); incr++) {
				array = array + contract.getSupportingInfo().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctSprtingInfo(array);

		} else {
			c.addCnctSprtingInfo("NULL");
		}


		/******************** Cnct_Url ********************************************************************************/
		if(contract.hasUrl()) {

			c.addCnctUrl(String.valueOf(contract.getUrl()));
		} else {
			c.addCnctUrl("NULL");
		}


		/******************** contractlegalstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractlegalstate = contract.getLegalState();

		/******************** Cnct_LegalState_Txt ********************************************************************************/
		if(contractlegalstate.hasText()) {

			c.addCnctLegalStateTxt(String.valueOf(contractlegalstate.getText()));
		} else {
			c.addCnctLegalStateTxt("NULL");
		}


		/******************** contractlegalstatecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractlegalstatecodinglist = contractlegalstate.getCoding();
		for(int contractlegalstatecodingi = 0; contractlegalstatecodingi<contractlegalstatecodinglist.size();contractlegalstatecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractlegalstatecoding = contractlegalstatecodinglist.get(contractlegalstatecodingi);

		/******************** Cnct_LegalState_Cdg_Dsply ********************************************************************************/
		if(contractlegalstatecodingi == 0) {c.addCnctLegalStateCdgDsply("[");}
		if(contractlegalstatecoding.hasDisplay()) {

			c.addCnctLegalStateCdgDsply(String.valueOf(contractlegalstatecoding.getDisplay()));
		} else {
			c.addCnctLegalStateCdgDsply("NULL");
		}

		if(contractlegalstatecodingi == contractlegalstatecodinglist.size()-1) {c.addCnctLegalStateCdgDsply("]");}


		/******************** Cnct_LegalState_Cdg_Vrsn ********************************************************************************/
		if(contractlegalstatecodingi == 0) {c.addCnctLegalStateCdgVrsn("[");}
		if(contractlegalstatecoding.hasVersion()) {

			c.addCnctLegalStateCdgVrsn(String.valueOf(contractlegalstatecoding.getVersion()));
		} else {
			c.addCnctLegalStateCdgVrsn("NULL");
		}

		if(contractlegalstatecodingi == contractlegalstatecodinglist.size()-1) {c.addCnctLegalStateCdgVrsn("]");}


		/******************** Cnct_LegalState_Cdg_Cd ********************************************************************************/
		if(contractlegalstatecodingi == 0) {c.addCnctLegalStateCdgCd("[");}
		if(contractlegalstatecoding.hasCode()) {

			c.addCnctLegalStateCdgCd(String.valueOf(contractlegalstatecoding.getCode()));
		} else {
			c.addCnctLegalStateCdgCd("NULL");
		}

		if(contractlegalstatecodingi == contractlegalstatecodinglist.size()-1) {c.addCnctLegalStateCdgCd("]");}


		/******************** Cnct_LegalState_Cdg_UsrSltd ********************************************************************************/
		if(contractlegalstatecodingi == 0) {c.addCnctLegalStateCdgUsrSltd("[");}
		if(contractlegalstatecoding.hasUserSelected()) {

			c.addCnctLegalStateCdgUsrSltd(String.valueOf(contractlegalstatecoding.getUserSelected()));
		} else {
			c.addCnctLegalStateCdgUsrSltd("NULL");
		}

		if(contractlegalstatecodingi == contractlegalstatecodinglist.size()-1) {c.addCnctLegalStateCdgUsrSltd("]");}


		/******************** Cnct_LegalState_Cdg_Sys ********************************************************************************/
		if(contractlegalstatecodingi == 0) {c.addCnctLegalStateCdgSys("[");}
		if(contractlegalstatecoding.hasSystem()) {

			c.addCnctLegalStateCdgSys(String.valueOf(contractlegalstatecoding.getSystem()));
		} else {
			c.addCnctLegalStateCdgSys("NULL");
		}

		if(contractlegalstatecodingi == contractlegalstatecodinglist.size()-1) {c.addCnctLegalStateCdgSys("]");}


		 };
		/******************** contractapplies ********************************************************************************/
		org.hl7.fhir.r4.model.Period contractapplies = contract.getApplies();

		/******************** Cnct_Applies_Strt ********************************************************************************/
		if(contractapplies.hasStart()) {

			c.addCnctAppliesStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractapplies.getStart())+"\"");
		} else {
			c.addCnctAppliesStrt("NULL");
		}


		/******************** Cnct_Applies_End ********************************************************************************/
		if(contractapplies.hasEnd()) {

			c.addCnctAppliesEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractapplies.getEnd())+"\"");
		} else {
			c.addCnctAppliesEnd("NULL");
		}


		/******************** Cnct_Subtitle ********************************************************************************/
		if(contract.hasSubtitle()) {

			c.addCnctSubtitle(String.valueOf(contract.getSubtitle()));
		} else {
			c.addCnctSubtitle("NULL");
		}


		/******************** Cnct_Issued ********************************************************************************/
		if(contract.hasIssued()) {

			c.addCnctIssued("\""+ca.uhn.fhir.util.DateUtils.formatDate(contract.getIssued())+"\"");
		} else {
			c.addCnctIssued("NULL");
		}


		/******************** contractexpirationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractexpirationtype = contract.getExpirationType();

		/******************** Cnct_ExpirationTyp_Txt ********************************************************************************/
		if(contractexpirationtype.hasText()) {

			c.addCnctExpirationTypTxt(String.valueOf(contractexpirationtype.getText()));
		} else {
			c.addCnctExpirationTypTxt("NULL");
		}


		/******************** contractexpirationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractexpirationtypecodinglist = contractexpirationtype.getCoding();
		for(int contractexpirationtypecodingi = 0; contractexpirationtypecodingi<contractexpirationtypecodinglist.size();contractexpirationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractexpirationtypecoding = contractexpirationtypecodinglist.get(contractexpirationtypecodingi);

		/******************** Cnct_ExpirationTyp_Cdg_Dsply ********************************************************************************/
		if(contractexpirationtypecodingi == 0) {c.addCnctExpirationTypCdgDsply("[");}
		if(contractexpirationtypecoding.hasDisplay()) {

			c.addCnctExpirationTypCdgDsply(String.valueOf(contractexpirationtypecoding.getDisplay()));
		} else {
			c.addCnctExpirationTypCdgDsply("NULL");
		}

		if(contractexpirationtypecodingi == contractexpirationtypecodinglist.size()-1) {c.addCnctExpirationTypCdgDsply("]");}


		/******************** Cnct_ExpirationTyp_Cdg_Vrsn ********************************************************************************/
		if(contractexpirationtypecodingi == 0) {c.addCnctExpirationTypCdgVrsn("[");}
		if(contractexpirationtypecoding.hasVersion()) {

			c.addCnctExpirationTypCdgVrsn(String.valueOf(contractexpirationtypecoding.getVersion()));
		} else {
			c.addCnctExpirationTypCdgVrsn("NULL");
		}

		if(contractexpirationtypecodingi == contractexpirationtypecodinglist.size()-1) {c.addCnctExpirationTypCdgVrsn("]");}


		/******************** Cnct_ExpirationTyp_Cdg_Cd ********************************************************************************/
		if(contractexpirationtypecodingi == 0) {c.addCnctExpirationTypCdgCd("[");}
		if(contractexpirationtypecoding.hasCode()) {

			c.addCnctExpirationTypCdgCd(String.valueOf(contractexpirationtypecoding.getCode()));
		} else {
			c.addCnctExpirationTypCdgCd("NULL");
		}

		if(contractexpirationtypecodingi == contractexpirationtypecodinglist.size()-1) {c.addCnctExpirationTypCdgCd("]");}


		/******************** Cnct_ExpirationTyp_Cdg_UsrSltd ********************************************************************************/
		if(contractexpirationtypecodingi == 0) {c.addCnctExpirationTypCdgUsrSltd("[");}
		if(contractexpirationtypecoding.hasUserSelected()) {

			c.addCnctExpirationTypCdgUsrSltd(String.valueOf(contractexpirationtypecoding.getUserSelected()));
		} else {
			c.addCnctExpirationTypCdgUsrSltd("NULL");
		}

		if(contractexpirationtypecodingi == contractexpirationtypecodinglist.size()-1) {c.addCnctExpirationTypCdgUsrSltd("]");}


		/******************** Cnct_ExpirationTyp_Cdg_Sys ********************************************************************************/
		if(contractexpirationtypecodingi == 0) {c.addCnctExpirationTypCdgSys("[");}
		if(contractexpirationtypecoding.hasSystem()) {

			c.addCnctExpirationTypCdgSys(String.valueOf(contractexpirationtypecoding.getSystem()));
		} else {
			c.addCnctExpirationTypCdgSys("NULL");
		}

		if(contractexpirationtypecodingi == contractexpirationtypecodinglist.size()-1) {c.addCnctExpirationTypCdgSys("]");}


		 };
		/******************** Cnct_Alias ********************************************************************************/
		if(contract.hasAlias()) {

			String  array = "[";
			for(int incr=0; incr<contract.getAlias().size(); incr++) {
				array = array + contract.getAlias().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctAlias(array);

		} else {
			c.addCnctAlias("NULL");
		}


		/******************** Cnct_TopicRfrnc ********************************************************************************/
		if(contract.hasTopicReference()) {

			if(contract.getTopicReference().getReference() != null) {
			c.addCnctTopicRfrnc(contract.getTopicReference().getReference());
			}
		} else {
			c.addCnctTopicRfrnc("NULL");
		}


		/******************** contractsubtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contractsubtypelist = contract.getSubType();
		for(int contractsubtypei = 0; contractsubtypei<contractsubtypelist.size();contractsubtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contractsubtype = contractsubtypelist.get(contractsubtypei);

		/******************** Cnct_SubTyp_Txt ********************************************************************************/
		if(contractsubtypei == 0) {c.addCnctSubTypTxt("[");}
		if(contractsubtype.hasText()) {

			c.addCnctSubTypTxt(String.valueOf(contractsubtype.getText()));
		} else {
			c.addCnctSubTypTxt("NULL");
		}

		if(contractsubtypei == contractsubtypelist.size()-1) {c.addCnctSubTypTxt("]");}


		/******************** contractsubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractsubtypecodinglist = contractsubtype.getCoding();
		for(int contractsubtypecodingi = 0; contractsubtypecodingi<contractsubtypecodinglist.size();contractsubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contractsubtypecoding = contractsubtypecodinglist.get(contractsubtypecodingi);

		/******************** Cnct_SubTyp_Cdg_Dsply ********************************************************************************/
		if(contractsubtypecodingi == 0) {c.addCnctSubTypCdgDsply("[[");}
		if(contractsubtypecoding.hasDisplay()) {

			c.addCnctSubTypCdgDsply(String.valueOf(contractsubtypecoding.getDisplay()));
		} else {
			c.addCnctSubTypCdgDsply("NULL");
		}

		if(contractsubtypecodingi == contractsubtypecodinglist.size()-1) {c.addCnctSubTypCdgDsply("]]");}


		/******************** Cnct_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(contractsubtypecodingi == 0) {c.addCnctSubTypCdgVrsn("[[");}
		if(contractsubtypecoding.hasVersion()) {

			c.addCnctSubTypCdgVrsn(String.valueOf(contractsubtypecoding.getVersion()));
		} else {
			c.addCnctSubTypCdgVrsn("NULL");
		}

		if(contractsubtypecodingi == contractsubtypecodinglist.size()-1) {c.addCnctSubTypCdgVrsn("]]");}


		/******************** Cnct_SubTyp_Cdg_Cd ********************************************************************************/
		if(contractsubtypecodingi == 0) {c.addCnctSubTypCdgCd("[[");}
		if(contractsubtypecoding.hasCode()) {

			c.addCnctSubTypCdgCd(String.valueOf(contractsubtypecoding.getCode()));
		} else {
			c.addCnctSubTypCdgCd("NULL");
		}

		if(contractsubtypecodingi == contractsubtypecodinglist.size()-1) {c.addCnctSubTypCdgCd("]]");}


		/******************** Cnct_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(contractsubtypecodingi == 0) {c.addCnctSubTypCdgUsrSltd("[[");}
		if(contractsubtypecoding.hasUserSelected()) {

			c.addCnctSubTypCdgUsrSltd(String.valueOf(contractsubtypecoding.getUserSelected()));
		} else {
			c.addCnctSubTypCdgUsrSltd("NULL");
		}

		if(contractsubtypecodingi == contractsubtypecodinglist.size()-1) {c.addCnctSubTypCdgUsrSltd("]]");}


		/******************** Cnct_SubTyp_Cdg_Sys ********************************************************************************/
		if(contractsubtypecodingi == 0) {c.addCnctSubTypCdgSys("[[");}
		if(contractsubtypecoding.hasSystem()) {

			c.addCnctSubTypCdgSys(String.valueOf(contractsubtypecoding.getSystem()));
		} else {
			c.addCnctSubTypCdgSys("NULL");
		}

		if(contractsubtypecodingi == contractsubtypecodinglist.size()-1) {c.addCnctSubTypCdgSys("]]");}


		 };
		 };
		/******************** contractterm ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.TermComponent> contracttermlist = contract.getTerm();
		for(int contracttermi = 0; contracttermi<contracttermlist.size();contracttermi++ ) {
		org.hl7.fhir.r4.model.Contract.TermComponent  contractterm = contracttermlist.get(contracttermi);

		/******************** contracttermtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermtype = contractterm.getType();

		/******************** Cnct_Trm_Typ_Txt ********************************************************************************/
		if(contracttermi == 0) {c.addCnctTrmTypTxt("[");}
		if(contracttermtype.hasText()) {

			c.addCnctTrmTypTxt(String.valueOf(contracttermtype.getText()));
		} else {
			c.addCnctTrmTypTxt("NULL");
		}

		if(contracttermi == contracttermlist.size()-1) {c.addCnctTrmTypTxt("]");}


		/******************** contracttermtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermtypecodinglist = contracttermtype.getCoding();
		for(int contracttermtypecodingi = 0; contracttermtypecodingi<contracttermtypecodinglist.size();contracttermtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermtypecoding = contracttermtypecodinglist.get(contracttermtypecodingi);

		/******************** Cnct_Trm_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermtypecodingi == 0) {c.addCnctTrmTypCdgDsply("[[");}
		if(contracttermtypecoding.hasDisplay()) {

			c.addCnctTrmTypCdgDsply(String.valueOf(contracttermtypecoding.getDisplay()));
		} else {
			c.addCnctTrmTypCdgDsply("NULL");
		}

		if(contracttermtypecodingi == contracttermtypecodinglist.size()-1) {c.addCnctTrmTypCdgDsply("]]");}


		/******************** Cnct_Trm_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermtypecodingi == 0) {c.addCnctTrmTypCdgVrsn("[[");}
		if(contracttermtypecoding.hasVersion()) {

			c.addCnctTrmTypCdgVrsn(String.valueOf(contracttermtypecoding.getVersion()));
		} else {
			c.addCnctTrmTypCdgVrsn("NULL");
		}

		if(contracttermtypecodingi == contracttermtypecodinglist.size()-1) {c.addCnctTrmTypCdgVrsn("]]");}


		/******************** Cnct_Trm_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermtypecodingi == 0) {c.addCnctTrmTypCdgCd("[[");}
		if(contracttermtypecoding.hasCode()) {

			c.addCnctTrmTypCdgCd(String.valueOf(contracttermtypecoding.getCode()));
		} else {
			c.addCnctTrmTypCdgCd("NULL");
		}

		if(contracttermtypecodingi == contracttermtypecodinglist.size()-1) {c.addCnctTrmTypCdgCd("]]");}


		/******************** Cnct_Trm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermtypecodingi == 0) {c.addCnctTrmTypCdgUsrSltd("[[");}
		if(contracttermtypecoding.hasUserSelected()) {

			c.addCnctTrmTypCdgUsrSltd(String.valueOf(contracttermtypecoding.getUserSelected()));
		} else {
			c.addCnctTrmTypCdgUsrSltd("NULL");
		}

		if(contracttermtypecodingi == contracttermtypecodinglist.size()-1) {c.addCnctTrmTypCdgUsrSltd("]]");}


		/******************** Cnct_Trm_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermtypecodingi == 0) {c.addCnctTrmTypCdgSys("[[");}
		if(contracttermtypecoding.hasSystem()) {

			c.addCnctTrmTypCdgSys(String.valueOf(contracttermtypecoding.getSystem()));
		} else {
			c.addCnctTrmTypCdgSys("NULL");
		}

		if(contracttermtypecodingi == contracttermtypecodinglist.size()-1) {c.addCnctTrmTypCdgSys("]]");}


		 };
		/******************** contracttermaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.ActionComponent> contracttermactionlist = contractterm.getAction();
		for(int contracttermactioni = 0; contracttermactioni<contracttermactionlist.size();contracttermactioni++ ) {
		org.hl7.fhir.r4.model.Contract.ActionComponent  contracttermaction = contracttermactionlist.get(contracttermactioni);

		/******************** Cnct_Trm_Actn_Cntxt ********************************************************************************/
		if(contracttermactioni == 0) {c.addCnctTrmActnCntxt("[[");}
		if(contracttermaction.hasContext()) {

			if(contracttermaction.getContext().getReference() != null) {
			c.addCnctTrmActnCntxt(contracttermaction.getContext().getReference());
			}
		} else {
			c.addCnctTrmActnCntxt("NULL");
		}

		if(contracttermactioni == contracttermactionlist.size()-1) {c.addCnctTrmActnCntxt("]]");}


		/******************** contracttermactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactiontype = contracttermaction.getType();

		/******************** Cnct_Trm_Actn_Typ_Txt ********************************************************************************/
		if(contracttermactioni == 0) {c.addCnctTrmActnTypTxt("[[");}
		if(contracttermactiontype.hasText()) {

			c.addCnctTrmActnTypTxt(String.valueOf(contracttermactiontype.getText()));
		} else {
			c.addCnctTrmActnTypTxt("NULL");
		}

		if(contracttermactioni == contracttermactionlist.size()-1) {c.addCnctTrmActnTypTxt("]]");}


		/******************** contracttermactiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactiontypecodinglist = contracttermactiontype.getCoding();
		for(int contracttermactiontypecodingi = 0; contracttermactiontypecodingi<contracttermactiontypecodinglist.size();contracttermactiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactiontypecoding = contracttermactiontypecodinglist.get(contracttermactiontypecodingi);

		/******************** Cnct_Trm_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermactiontypecodingi == 0) {c.addCnctTrmActnTypCdgDsply("[[[");}
		if(contracttermactiontypecoding.hasDisplay()) {

			c.addCnctTrmActnTypCdgDsply(String.valueOf(contracttermactiontypecoding.getDisplay()));
		} else {
			c.addCnctTrmActnTypCdgDsply("NULL");
		}

		if(contracttermactiontypecodingi == contracttermactiontypecodinglist.size()-1) {c.addCnctTrmActnTypCdgDsply("]]]");}


		/******************** Cnct_Trm_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermactiontypecodingi == 0) {c.addCnctTrmActnTypCdgVrsn("[[[");}
		if(contracttermactiontypecoding.hasVersion()) {

			c.addCnctTrmActnTypCdgVrsn(String.valueOf(contracttermactiontypecoding.getVersion()));
		} else {
			c.addCnctTrmActnTypCdgVrsn("NULL");
		}

		if(contracttermactiontypecodingi == contracttermactiontypecodinglist.size()-1) {c.addCnctTrmActnTypCdgVrsn("]]]");}


		/******************** Cnct_Trm_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermactiontypecodingi == 0) {c.addCnctTrmActnTypCdgCd("[[[");}
		if(contracttermactiontypecoding.hasCode()) {

			c.addCnctTrmActnTypCdgCd(String.valueOf(contracttermactiontypecoding.getCode()));
		} else {
			c.addCnctTrmActnTypCdgCd("NULL");
		}

		if(contracttermactiontypecodingi == contracttermactiontypecodinglist.size()-1) {c.addCnctTrmActnTypCdgCd("]]]");}


		/******************** Cnct_Trm_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactiontypecodingi == 0) {c.addCnctTrmActnTypCdgUsrSltd("[[[");}
		if(contracttermactiontypecoding.hasUserSelected()) {

			c.addCnctTrmActnTypCdgUsrSltd(String.valueOf(contracttermactiontypecoding.getUserSelected()));
		} else {
			c.addCnctTrmActnTypCdgUsrSltd("NULL");
		}

		if(contracttermactiontypecodingi == contracttermactiontypecodinglist.size()-1) {c.addCnctTrmActnTypCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermactiontypecodingi == 0) {c.addCnctTrmActnTypCdgSys("[[[");}
		if(contracttermactiontypecoding.hasSystem()) {

			c.addCnctTrmActnTypCdgSys(String.valueOf(contracttermactiontypecoding.getSystem()));
		} else {
			c.addCnctTrmActnTypCdgSys("NULL");
		}

		if(contracttermactiontypecodingi == contracttermactiontypecodinglist.size()-1) {c.addCnctTrmActnTypCdgSys("]]]");}


		 };
		/******************** Cnct_Trm_Actn_Rsn ********************************************************************************/
		if(contracttermactioni == 0) {c.addCnctTrmActnRsn("[[");}
		if(contracttermaction.hasReason()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getReason().size(); incr++) {
				array = array + contracttermaction.getReason().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnRsn(array);

		} else {
			c.addCnctTrmActnRsn("NULL");
		}

		if(contracttermactioni == contracttermactionlist.size()-1) {c.addCnctTrmActnRsn("]]");}


		/******************** contracttermactionsubject ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.ActionSubjectComponent> contracttermactionsubjectlist = contracttermaction.getSubject();
		for(int contracttermactionsubjecti = 0; contracttermactionsubjecti<contracttermactionsubjectlist.size();contracttermactionsubjecti++ ) {
		org.hl7.fhir.r4.model.Contract.ActionSubjectComponent  contracttermactionsubject = contracttermactionsubjectlist.get(contracttermactionsubjecti);

		/******************** Cnct_Trm_Actn_Sbjct_Rfrnc ********************************************************************************/
		if(contracttermactionsubjecti == 0) {c.addCnctTrmActnSbjctRfrnc("[[[");}
		if(contracttermactionsubject.hasReference()) {

			String  array = "[";
			for(int incr=0; incr<contracttermactionsubject.getReference().size(); incr++) {
				array = array + contracttermactionsubject.getReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnSbjctRfrnc(array);

		} else {
			c.addCnctTrmActnSbjctRfrnc("NULL");
		}

		if(contracttermactionsubjecti == contracttermactionsubjectlist.size()-1) {c.addCnctTrmActnSbjctRfrnc("]]]");}


		/******************** contracttermactionsubjectrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionsubjectrole = contracttermactionsubject.getRole();

		/******************** Cnct_Trm_Actn_Sbjct_Role_Txt ********************************************************************************/
		if(contracttermactionsubjecti == 0) {c.addCnctTrmActnSbjctRoleTxt("[[[");}
		if(contracttermactionsubjectrole.hasText()) {

			c.addCnctTrmActnSbjctRoleTxt(String.valueOf(contracttermactionsubjectrole.getText()));
		} else {
			c.addCnctTrmActnSbjctRoleTxt("NULL");
		}

		if(contracttermactionsubjecti == contracttermactionsubjectlist.size()-1) {c.addCnctTrmActnSbjctRoleTxt("]]]");}


		/******************** contracttermactionsubjectrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionsubjectrolecodinglist = contracttermactionsubjectrole.getCoding();
		for(int contracttermactionsubjectrolecodingi = 0; contracttermactionsubjectrolecodingi<contracttermactionsubjectrolecodinglist.size();contracttermactionsubjectrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionsubjectrolecoding = contracttermactionsubjectrolecodinglist.get(contracttermactionsubjectrolecodingi);

		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Dsply ********************************************************************************/
		if(contracttermactionsubjectrolecodingi == 0) {c.addCnctTrmActnSbjctRoleCdgDsply("[[[[");}
		if(contracttermactionsubjectrolecoding.hasDisplay()) {

			c.addCnctTrmActnSbjctRoleCdgDsply(String.valueOf(contracttermactionsubjectrolecoding.getDisplay()));
		} else {
			c.addCnctTrmActnSbjctRoleCdgDsply("NULL");
		}

		if(contracttermactionsubjectrolecodingi == contracttermactionsubjectrolecodinglist.size()-1) {c.addCnctTrmActnSbjctRoleCdgDsply("]]]]");}


		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionsubjectrolecodingi == 0) {c.addCnctTrmActnSbjctRoleCdgVrsn("[[[[");}
		if(contracttermactionsubjectrolecoding.hasVersion()) {

			c.addCnctTrmActnSbjctRoleCdgVrsn(String.valueOf(contracttermactionsubjectrolecoding.getVersion()));
		} else {
			c.addCnctTrmActnSbjctRoleCdgVrsn("NULL");
		}

		if(contracttermactionsubjectrolecodingi == contracttermactionsubjectrolecodinglist.size()-1) {c.addCnctTrmActnSbjctRoleCdgVrsn("]]]]");}


		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Cd ********************************************************************************/
		if(contracttermactionsubjectrolecodingi == 0) {c.addCnctTrmActnSbjctRoleCdgCd("[[[[");}
		if(contracttermactionsubjectrolecoding.hasCode()) {

			c.addCnctTrmActnSbjctRoleCdgCd(String.valueOf(contracttermactionsubjectrolecoding.getCode()));
		} else {
			c.addCnctTrmActnSbjctRoleCdgCd("NULL");
		}

		if(contracttermactionsubjectrolecodingi == contracttermactionsubjectrolecodinglist.size()-1) {c.addCnctTrmActnSbjctRoleCdgCd("]]]]");}


		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionsubjectrolecodingi == 0) {c.addCnctTrmActnSbjctRoleCdgUsrSltd("[[[[");}
		if(contracttermactionsubjectrolecoding.hasUserSelected()) {

			c.addCnctTrmActnSbjctRoleCdgUsrSltd(String.valueOf(contracttermactionsubjectrolecoding.getUserSelected()));
		} else {
			c.addCnctTrmActnSbjctRoleCdgUsrSltd("NULL");
		}

		if(contracttermactionsubjectrolecodingi == contracttermactionsubjectrolecodinglist.size()-1) {c.addCnctTrmActnSbjctRoleCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Sys ********************************************************************************/
		if(contracttermactionsubjectrolecodingi == 0) {c.addCnctTrmActnSbjctRoleCdgSys("[[[[");}
		if(contracttermactionsubjectrolecoding.hasSystem()) {

			c.addCnctTrmActnSbjctRoleCdgSys(String.valueOf(contracttermactionsubjectrolecoding.getSystem()));
		} else {
			c.addCnctTrmActnSbjctRoleCdgSys("NULL");
		}

		if(contracttermactionsubjectrolecodingi == contracttermactionsubjectrolecodinglist.size()-1) {c.addCnctTrmActnSbjctRoleCdgSys("]]]]");}


		 };
		 };
		/******************** contracttermactionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionstatus = contracttermaction.getStatus();

		/******************** Cnct_Trm_Actn_Sts_Txt ********************************************************************************/
		if(contracttermactionstatus.hasText()) {

			c.addCnctTrmActnStsTxt(String.valueOf(contracttermactionstatus.getText()));
		} else {
			c.addCnctTrmActnStsTxt("NULL");
		}


		/******************** contracttermactionstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionstatuscodinglist = contracttermactionstatus.getCoding();
		for(int contracttermactionstatuscodingi = 0; contracttermactionstatuscodingi<contracttermactionstatuscodinglist.size();contracttermactionstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionstatuscoding = contracttermactionstatuscodinglist.get(contracttermactionstatuscodingi);

		/******************** Cnct_Trm_Actn_Sts_Cdg_Dsply ********************************************************************************/
		if(contracttermactionstatuscodingi == 0) {c.addCnctTrmActnStsCdgDsply("[[[");}
		if(contracttermactionstatuscoding.hasDisplay()) {

			c.addCnctTrmActnStsCdgDsply(String.valueOf(contracttermactionstatuscoding.getDisplay()));
		} else {
			c.addCnctTrmActnStsCdgDsply("NULL");
		}

		if(contracttermactionstatuscodingi == contracttermactionstatuscodinglist.size()-1) {c.addCnctTrmActnStsCdgDsply("]]]");}


		/******************** Cnct_Trm_Actn_Sts_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionstatuscodingi == 0) {c.addCnctTrmActnStsCdgVrsn("[[[");}
		if(contracttermactionstatuscoding.hasVersion()) {

			c.addCnctTrmActnStsCdgVrsn(String.valueOf(contracttermactionstatuscoding.getVersion()));
		} else {
			c.addCnctTrmActnStsCdgVrsn("NULL");
		}

		if(contracttermactionstatuscodingi == contracttermactionstatuscodinglist.size()-1) {c.addCnctTrmActnStsCdgVrsn("]]]");}


		/******************** Cnct_Trm_Actn_Sts_Cdg_Cd ********************************************************************************/
		if(contracttermactionstatuscodingi == 0) {c.addCnctTrmActnStsCdgCd("[[[");}
		if(contracttermactionstatuscoding.hasCode()) {

			c.addCnctTrmActnStsCdgCd(String.valueOf(contracttermactionstatuscoding.getCode()));
		} else {
			c.addCnctTrmActnStsCdgCd("NULL");
		}

		if(contracttermactionstatuscodingi == contracttermactionstatuscodinglist.size()-1) {c.addCnctTrmActnStsCdgCd("]]]");}


		/******************** Cnct_Trm_Actn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionstatuscodingi == 0) {c.addCnctTrmActnStsCdgUsrSltd("[[[");}
		if(contracttermactionstatuscoding.hasUserSelected()) {

			c.addCnctTrmActnStsCdgUsrSltd(String.valueOf(contracttermactionstatuscoding.getUserSelected()));
		} else {
			c.addCnctTrmActnStsCdgUsrSltd("NULL");
		}

		if(contracttermactionstatuscodingi == contracttermactionstatuscodinglist.size()-1) {c.addCnctTrmActnStsCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Actn_Sts_Cdg_Sys ********************************************************************************/
		if(contracttermactionstatuscodingi == 0) {c.addCnctTrmActnStsCdgSys("[[[");}
		if(contracttermactionstatuscoding.hasSystem()) {

			c.addCnctTrmActnStsCdgSys(String.valueOf(contracttermactionstatuscoding.getSystem()));
		} else {
			c.addCnctTrmActnStsCdgSys("NULL");
		}

		if(contracttermactionstatuscodingi == contracttermactionstatuscodinglist.size()-1) {c.addCnctTrmActnStsCdgSys("]]]");}


		 };
		/******************** contracttermactionreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermactionreasoncodelist = contracttermaction.getReasonCode();
		for(int contracttermactionreasoncodei = 0; contracttermactionreasoncodei<contracttermactionreasoncodelist.size();contracttermactionreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermactionreasoncode = contracttermactionreasoncodelist.get(contracttermactionreasoncodei);

		/******************** Cnct_Trm_Actn_RsnCd_Txt ********************************************************************************/
		if(contracttermactionreasoncodei == 0) {c.addCnctTrmActnRsnCdTxt("[[[");}
		if(contracttermactionreasoncode.hasText()) {

			c.addCnctTrmActnRsnCdTxt(String.valueOf(contracttermactionreasoncode.getText()));
		} else {
			c.addCnctTrmActnRsnCdTxt("NULL");
		}

		if(contracttermactionreasoncodei == contracttermactionreasoncodelist.size()-1) {c.addCnctTrmActnRsnCdTxt("]]]");}


		/******************** contracttermactionreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionreasoncodecodinglist = contracttermactionreasoncode.getCoding();
		for(int contracttermactionreasoncodecodingi = 0; contracttermactionreasoncodecodingi<contracttermactionreasoncodecodinglist.size();contracttermactionreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionreasoncodecoding = contracttermactionreasoncodecodinglist.get(contracttermactionreasoncodecodingi);

		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(contracttermactionreasoncodecodingi == 0) {c.addCnctTrmActnRsnCdCdgDsply("[[[[");}
		if(contracttermactionreasoncodecoding.hasDisplay()) {

			c.addCnctTrmActnRsnCdCdgDsply(String.valueOf(contracttermactionreasoncodecoding.getDisplay()));
		} else {
			c.addCnctTrmActnRsnCdCdgDsply("NULL");
		}

		if(contracttermactionreasoncodecodingi == contracttermactionreasoncodecodinglist.size()-1) {c.addCnctTrmActnRsnCdCdgDsply("]]]]");}


		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionreasoncodecodingi == 0) {c.addCnctTrmActnRsnCdCdgVrsn("[[[[");}
		if(contracttermactionreasoncodecoding.hasVersion()) {

			c.addCnctTrmActnRsnCdCdgVrsn(String.valueOf(contracttermactionreasoncodecoding.getVersion()));
		} else {
			c.addCnctTrmActnRsnCdCdgVrsn("NULL");
		}

		if(contracttermactionreasoncodecodingi == contracttermactionreasoncodecodinglist.size()-1) {c.addCnctTrmActnRsnCdCdgVrsn("]]]]");}


		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Cd ********************************************************************************/
		if(contracttermactionreasoncodecodingi == 0) {c.addCnctTrmActnRsnCdCdgCd("[[[[");}
		if(contracttermactionreasoncodecoding.hasCode()) {

			c.addCnctTrmActnRsnCdCdgCd(String.valueOf(contracttermactionreasoncodecoding.getCode()));
		} else {
			c.addCnctTrmActnRsnCdCdgCd("NULL");
		}

		if(contracttermactionreasoncodecodingi == contracttermactionreasoncodecodinglist.size()-1) {c.addCnctTrmActnRsnCdCdgCd("]]]]");}


		/******************** Cnct_Trm_Actn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionreasoncodecodingi == 0) {c.addCnctTrmActnRsnCdCdgUsrSltd("[[[[");}
		if(contracttermactionreasoncodecoding.hasUserSelected()) {

			c.addCnctTrmActnRsnCdCdgUsrSltd(String.valueOf(contracttermactionreasoncodecoding.getUserSelected()));
		} else {
			c.addCnctTrmActnRsnCdCdgUsrSltd("NULL");
		}

		if(contracttermactionreasoncodecodingi == contracttermactionreasoncodecodinglist.size()-1) {c.addCnctTrmActnRsnCdCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Sys ********************************************************************************/
		if(contracttermactionreasoncodecodingi == 0) {c.addCnctTrmActnRsnCdCdgSys("[[[[");}
		if(contracttermactionreasoncodecoding.hasSystem()) {

			c.addCnctTrmActnRsnCdCdgSys(String.valueOf(contracttermactionreasoncodecoding.getSystem()));
		} else {
			c.addCnctTrmActnRsnCdCdgSys("NULL");
		}

		if(contracttermactionreasoncodecodingi == contracttermactionreasoncodecodinglist.size()-1) {c.addCnctTrmActnRsnCdCdgSys("]]]]");}


		 };
		 };
		/******************** contracttermactionnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> contracttermactionnotelist = contracttermaction.getNote();
		for(int contracttermactionnotei = 0; contracttermactionnotei<contracttermactionnotelist.size();contracttermactionnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  contracttermactionnote = contracttermactionnotelist.get(contracttermactionnotei);

		/******************** Cnct_Trm_Actn_Nt_Time ********************************************************************************/
		if(contracttermactionnotei == 0) {c.addCnctTrmActnNtTime("[[[");}
		if(contracttermactionnote.hasTime()) {

			c.addCnctTrmActnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermactionnote.getTime())+"\"");
		} else {
			c.addCnctTrmActnNtTime("NULL");
		}

		if(contracttermactionnotei == contracttermactionnotelist.size()-1) {c.addCnctTrmActnNtTime("]]]");}


		/******************** Cnct_Trm_Actn_Nt_AthrRfrnc ********************************************************************************/
		if(contracttermactionnotei == 0) {c.addCnctTrmActnNtAthrRfrnc("[[[");}
		if(contracttermactionnote.hasAuthorReference()) {

			if(contracttermactionnote.getAuthorReference().getReference() != null) {
			c.addCnctTrmActnNtAthrRfrnc(contracttermactionnote.getAuthorReference().getReference());
			}
		} else {
			c.addCnctTrmActnNtAthrRfrnc("NULL");
		}

		if(contracttermactionnotei == contracttermactionnotelist.size()-1) {c.addCnctTrmActnNtAthrRfrnc("]]]");}


		/******************** Cnct_Trm_Actn_Nt_Txt ********************************************************************************/
		if(contracttermactionnotei == 0) {c.addCnctTrmActnNtTxt("[[[");}
		if(contracttermactionnote.hasText()) {

			c.addCnctTrmActnNtTxt(String.valueOf(contracttermactionnote.getText()));
		} else {
			c.addCnctTrmActnNtTxt("NULL");
		}

		if(contracttermactionnotei == contracttermactionnotelist.size()-1) {c.addCnctTrmActnNtTxt("]]]");}


		/******************** Cnct_Trm_Actn_Nt_AthrStrgTyp ********************************************************************************/
		if(contracttermactionnotei == 0) {c.addCnctTrmActnNtAthrStrgTyp("[[[");}
		if(contracttermactionnote.hasAuthorStringType()) {

			c.addCnctTrmActnNtAthrStrgTyp("\""+contracttermactionnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmActnNtAthrStrgTyp("NULL");
		}

		if(contracttermactionnotei == contracttermactionnotelist.size()-1) {c.addCnctTrmActnNtAthrStrgTyp("]]]");}


		 };
		/******************** Cnct_Trm_Actn_RsnRfrnc ********************************************************************************/
		if(contracttermaction.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getReasonReference().size(); incr++) {
				array = array + contracttermaction.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnRsnRfrnc(array);

		} else {
			c.addCnctTrmActnRsnRfrnc("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceDtTimeTyp ********************************************************************************/
		if(contracttermaction.hasOccurrenceDateTimeType()) {

			c.addCnctTrmActnOccrnceDtTimeTyp("\""+contracttermaction.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmActnOccrnceDtTimeTyp("NULL");
		}


		/******************** contracttermactionoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermactionoccurrenceperiod = contracttermaction.getOccurrencePeriod();

		/******************** Cnct_Trm_Actn_OccrncePrd_Strt ********************************************************************************/
		if(contracttermactionoccurrenceperiod.hasStart()) {

			c.addCnctTrmActnOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermactionoccurrenceperiod.getStart())+"\"");
		} else {
			c.addCnctTrmActnOccrncePrdStrt("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrncePrd_End ********************************************************************************/
		if(contracttermactionoccurrenceperiod.hasEnd()) {

			c.addCnctTrmActnOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermactionoccurrenceperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmActnOccrncePrdEnd("NULL");
		}


		/******************** Cnct_Trm_Actn_Rqster ********************************************************************************/
		if(contracttermaction.hasRequester()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getRequester().size(); incr++) {
				array = array + contracttermaction.getRequester().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnRqster(array);

		} else {
			c.addCnctTrmActnRqster("NULL");
		}


		/******************** contracttermactionperformertype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermactionperformertypelist = contracttermaction.getPerformerType();
		for(int contracttermactionperformertypei = 0; contracttermactionperformertypei<contracttermactionperformertypelist.size();contracttermactionperformertypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermactionperformertype = contracttermactionperformertypelist.get(contracttermactionperformertypei);

		/******************** Cnct_Trm_Actn_PrfrmrTyp_Txt ********************************************************************************/
		if(contracttermactionperformertypei == 0) {c.addCnctTrmActnPrfrmrTypTxt("[[[");}
		if(contracttermactionperformertype.hasText()) {

			c.addCnctTrmActnPrfrmrTypTxt(String.valueOf(contracttermactionperformertype.getText()));
		} else {
			c.addCnctTrmActnPrfrmrTypTxt("NULL");
		}

		if(contracttermactionperformertypei == contracttermactionperformertypelist.size()-1) {c.addCnctTrmActnPrfrmrTypTxt("]]]");}


		/******************** contracttermactionperformertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionperformertypecodinglist = contracttermactionperformertype.getCoding();
		for(int contracttermactionperformertypecodingi = 0; contracttermactionperformertypecodingi<contracttermactionperformertypecodinglist.size();contracttermactionperformertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionperformertypecoding = contracttermactionperformertypecodinglist.get(contracttermactionperformertypecodingi);

		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(contracttermactionperformertypecodingi == 0) {c.addCnctTrmActnPrfrmrTypCdgDsply("[[[[");}
		if(contracttermactionperformertypecoding.hasDisplay()) {

			c.addCnctTrmActnPrfrmrTypCdgDsply(String.valueOf(contracttermactionperformertypecoding.getDisplay()));
		} else {
			c.addCnctTrmActnPrfrmrTypCdgDsply("NULL");
		}

		if(contracttermactionperformertypecodingi == contracttermactionperformertypecodinglist.size()-1) {c.addCnctTrmActnPrfrmrTypCdgDsply("]]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionperformertypecodingi == 0) {c.addCnctTrmActnPrfrmrTypCdgVrsn("[[[[");}
		if(contracttermactionperformertypecoding.hasVersion()) {

			c.addCnctTrmActnPrfrmrTypCdgVrsn(String.valueOf(contracttermactionperformertypecoding.getVersion()));
		} else {
			c.addCnctTrmActnPrfrmrTypCdgVrsn("NULL");
		}

		if(contracttermactionperformertypecodingi == contracttermactionperformertypecodinglist.size()-1) {c.addCnctTrmActnPrfrmrTypCdgVrsn("]]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(contracttermactionperformertypecodingi == 0) {c.addCnctTrmActnPrfrmrTypCdgCd("[[[[");}
		if(contracttermactionperformertypecoding.hasCode()) {

			c.addCnctTrmActnPrfrmrTypCdgCd(String.valueOf(contracttermactionperformertypecoding.getCode()));
		} else {
			c.addCnctTrmActnPrfrmrTypCdgCd("NULL");
		}

		if(contracttermactionperformertypecodingi == contracttermactionperformertypecodinglist.size()-1) {c.addCnctTrmActnPrfrmrTypCdgCd("]]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionperformertypecodingi == 0) {c.addCnctTrmActnPrfrmrTypCdgUsrSltd("[[[[");}
		if(contracttermactionperformertypecoding.hasUserSelected()) {

			c.addCnctTrmActnPrfrmrTypCdgUsrSltd(String.valueOf(contracttermactionperformertypecoding.getUserSelected()));
		} else {
			c.addCnctTrmActnPrfrmrTypCdgUsrSltd("NULL");
		}

		if(contracttermactionperformertypecodingi == contracttermactionperformertypecodinglist.size()-1) {c.addCnctTrmActnPrfrmrTypCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(contracttermactionperformertypecodingi == 0) {c.addCnctTrmActnPrfrmrTypCdgSys("[[[[");}
		if(contracttermactionperformertypecoding.hasSystem()) {

			c.addCnctTrmActnPrfrmrTypCdgSys(String.valueOf(contracttermactionperformertypecoding.getSystem()));
		} else {
			c.addCnctTrmActnPrfrmrTypCdgSys("NULL");
		}

		if(contracttermactionperformertypecodingi == contracttermactionperformertypecodinglist.size()-1) {c.addCnctTrmActnPrfrmrTypCdgSys("]]]]");}


		 };
		 };
		/******************** Cnct_Trm_Actn_SecurityLblNmbr ********************************************************************************/
		if(contracttermaction.hasSecurityLabelNumber()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getSecurityLabelNumber().size(); incr++) {
				array = array + contracttermaction.getSecurityLabelNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnSecurityLblNmbr(array);

		} else {
			c.addCnctTrmActnSecurityLblNmbr("NULL");
		}


		/******************** contracttermactionoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing contracttermactionoccurrencetiming = contracttermaction.getOccurrenceTiming();

		/******************** contracttermactionoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionoccurrencetimingcode = contracttermactionoccurrencetiming.getCode();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(contracttermactionoccurrencetimingcode.hasText()) {

			c.addCnctTrmActnOccrnceTmgCdTxt(String.valueOf(contracttermactionoccurrencetimingcode.getText()));
		} else {
			c.addCnctTrmActnOccrnceTmgCdTxt("NULL");
		}


		/******************** contracttermactionoccurrencetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionoccurrencetimingcodecodinglist = contracttermactionoccurrencetimingcode.getCoding();
		for(int contracttermactionoccurrencetimingcodecodingi = 0; contracttermactionoccurrencetimingcodecodingi<contracttermactionoccurrencetimingcodecodinglist.size();contracttermactionoccurrencetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionoccurrencetimingcodecoding = contracttermactionoccurrencetimingcodecodinglist.get(contracttermactionoccurrencetimingcodecodingi);

		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecodingi == 0) {c.addCnctTrmActnOccrnceTmgCdCdgDsply("[[[");}
		if(contracttermactionoccurrencetimingcodecoding.hasDisplay()) {

			c.addCnctTrmActnOccrnceTmgCdCdgDsply(String.valueOf(contracttermactionoccurrencetimingcodecoding.getDisplay()));
		} else {
			c.addCnctTrmActnOccrnceTmgCdCdgDsply("NULL");
		}

		if(contracttermactionoccurrencetimingcodecodingi == contracttermactionoccurrencetimingcodecodinglist.size()-1) {c.addCnctTrmActnOccrnceTmgCdCdgDsply("]]]");}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecodingi == 0) {c.addCnctTrmActnOccrnceTmgCdCdgVrsn("[[[");}
		if(contracttermactionoccurrencetimingcodecoding.hasVersion()) {

			c.addCnctTrmActnOccrnceTmgCdCdgVrsn(String.valueOf(contracttermactionoccurrencetimingcodecoding.getVersion()));
		} else {
			c.addCnctTrmActnOccrnceTmgCdCdgVrsn("NULL");
		}

		if(contracttermactionoccurrencetimingcodecodingi == contracttermactionoccurrencetimingcodecodinglist.size()-1) {c.addCnctTrmActnOccrnceTmgCdCdgVrsn("]]]");}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecodingi == 0) {c.addCnctTrmActnOccrnceTmgCdCdgCd("[[[");}
		if(contracttermactionoccurrencetimingcodecoding.hasCode()) {

			c.addCnctTrmActnOccrnceTmgCdCdgCd(String.valueOf(contracttermactionoccurrencetimingcodecoding.getCode()));
		} else {
			c.addCnctTrmActnOccrnceTmgCdCdgCd("NULL");
		}

		if(contracttermactionoccurrencetimingcodecodingi == contracttermactionoccurrencetimingcodecodinglist.size()-1) {c.addCnctTrmActnOccrnceTmgCdCdgCd("]]]");}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecodingi == 0) {c.addCnctTrmActnOccrnceTmgCdCdgUsrSltd("[[[");}
		if(contracttermactionoccurrencetimingcodecoding.hasUserSelected()) {

			c.addCnctTrmActnOccrnceTmgCdCdgUsrSltd(String.valueOf(contracttermactionoccurrencetimingcodecoding.getUserSelected()));
		} else {
			c.addCnctTrmActnOccrnceTmgCdCdgUsrSltd("NULL");
		}

		if(contracttermactionoccurrencetimingcodecodingi == contracttermactionoccurrencetimingcodecodinglist.size()-1) {c.addCnctTrmActnOccrnceTmgCdCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecodingi == 0) {c.addCnctTrmActnOccrnceTmgCdCdgSys("[[[");}
		if(contracttermactionoccurrencetimingcodecoding.hasSystem()) {

			c.addCnctTrmActnOccrnceTmgCdCdgSys(String.valueOf(contracttermactionoccurrencetimingcodecoding.getSystem()));
		} else {
			c.addCnctTrmActnOccrnceTmgCdCdgSys("NULL");
		}

		if(contracttermactionoccurrencetimingcodecodingi == contracttermactionoccurrencetimingcodecodinglist.size()-1) {c.addCnctTrmActnOccrnceTmgCdCdgSys("]]]");}


		 };
		/******************** Cnct_Trm_Actn_OccrnceTmg_Evnt ********************************************************************************/
		if(contracttermactionoccurrencetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<contracttermactionoccurrencetiming.getEvent().size(); incr++) {
				array = array + contracttermactionoccurrencetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnOccrnceTmgEvnt(array);

		} else {
			c.addCnctTrmActnOccrnceTmgEvnt("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent contracttermactionoccurrencetimingrepeat = contracttermactionoccurrencetiming.getRepeat();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasOffset()) {

			c.addCnctTrmActnOccrnceTmgRptOff(String.valueOf(contracttermactionoccurrencetimingrepeat.getOffset()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptOff("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasCount()) {

			c.addCnctTrmActnOccrnceTmgRptCnt(String.valueOf(contracttermactionoccurrencetimingrepeat.getCount()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptCnt("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasPeriod()) {

			c.addCnctTrmActnOccrnceTmgRptPrd(String.valueOf(contracttermactionoccurrencetimingrepeat.getPeriod()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptPrd("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasCountMax()) {

			c.addCnctTrmActnOccrnceTmgRptCntMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getCountMax()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptCntMx("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasDurationMax()) {

			c.addCnctTrmActnOccrnceTmgRptDurationMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getDurationMax()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptDurationMx("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermactionoccurrencetimingrepeatboundsperiod = contracttermactionoccurrencetimingrepeat.getBoundsPeriod();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsperiod.hasStart()) {

			c.addCnctTrmActnOccrnceTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermactionoccurrencetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsPrdStrt("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsperiod.hasEnd()) {

			c.addCnctTrmActnOccrnceTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermactionoccurrencetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsPrdEnd("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime contracttermactionoccurrencetimingrepeatdurationunit = contracttermactionoccurrencetimingrepeat.getDurationUnit();
		if(contracttermactionoccurrencetimingrepeatdurationunit!=null) {
			c.addCnctTrmActnOccrnceTmgRptDurationUnt(contracttermactionoccurrencetimingrepeatdurationunit.toCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptDurationUnt("NULL");
		}

		/******************** contracttermactionoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration contracttermactionoccurrencetimingrepeatboundsduration = contracttermactionoccurrencetimingrepeat.getBoundsDuration();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsduration.hasValue()) {

			c.addCnctTrmActnOccrnceTmgRptBndsDurationVl(String.valueOf(contracttermactionoccurrencetimingrepeatboundsduration.getValue()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsDurationVl("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermactionoccurrencetimingrepeatboundsdurationcomparator = contracttermactionoccurrencetimingrepeatboundsduration.getComparator();
		if(contracttermactionoccurrencetimingrepeatboundsdurationcomparator!=null) {
			c.addCnctTrmActnOccrnceTmgRptBndsDurationCmprtr(contracttermactionoccurrencetimingrepeatboundsdurationcomparator.toCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsduration.hasCode()) {

			c.addCnctTrmActnOccrnceTmgRptBndsDurationCd(String.valueOf(contracttermactionoccurrencetimingrepeatboundsduration.getCode()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsDurationCd("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsduration.hasUnit()) {

			c.addCnctTrmActnOccrnceTmgRptBndsDurationUnt(String.valueOf(contracttermactionoccurrencetimingrepeatboundsduration.getUnit()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsDurationUnt("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsduration.hasSystem()) {

			c.addCnctTrmActnOccrnceTmgRptBndsDurationSys(String.valueOf(contracttermactionoccurrencetimingrepeatboundsduration.getSystem()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsDurationSys("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range contracttermactionoccurrencetimingrepeatboundsrange = contracttermactionoccurrencetimingrepeat.getBoundsRange();

		/******************** contracttermactionoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermactionoccurrencetimingrepeatboundsrangelow = contracttermactionoccurrencetimingrepeatboundsrange.getLow();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasValue()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngLwVl(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getValue()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngLwVl("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermactionoccurrencetimingrepeatboundsrangelowcomparator = contracttermactionoccurrencetimingrepeatboundsrangelow.getComparator();
		if(contracttermactionoccurrencetimingrepeatboundsrangelowcomparator!=null) {
			c.addCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr(contracttermactionoccurrencetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasCode()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngLwCd(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getCode()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngLwCd("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasUnit()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngLwUnt(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getUnit()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngLwUnt("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasSystem()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngLwSys(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getSystem()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngLwSys("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermactionoccurrencetimingrepeatboundsrangehigh = contracttermactionoccurrencetimingrepeatboundsrange.getHigh();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasValue()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngHiVl(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getValue()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngHiVl("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermactionoccurrencetimingrepeatboundsrangehighcomparator = contracttermactionoccurrencetimingrepeatboundsrangehigh.getComparator();
		if(contracttermactionoccurrencetimingrepeatboundsrangehighcomparator!=null) {
			c.addCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr(contracttermactionoccurrencetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasCode()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngHiCd(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getCode()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngHiCd("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasUnit()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngHiUnt(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getUnit()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngHiUnt("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasSystem()) {

			c.addCnctTrmActnOccrnceTmgRptBndsRngHiSys(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getSystem()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptBndsRngHiSys("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasFrequencyMax()) {

			c.addCnctTrmActnOccrnceTmgRptFrqncyMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getFrequencyMax()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptFrqncyMx("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> contracttermactionoccurrencetimingrepeatwhenlist = contracttermactionoccurrencetimingrepeat.getWhen();
		for(int contracttermactionoccurrencetimingrepeatwheni = 0; contracttermactionoccurrencetimingrepeatwheni<contracttermactionoccurrencetimingrepeatwhenlist.size();contracttermactionoccurrencetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  contracttermactionoccurrencetimingrepeatwhen = contracttermactionoccurrencetimingrepeatwhenlist.get(contracttermactionoccurrencetimingrepeatwheni);
		if(contracttermactionoccurrencetimingrepeatwhen!=null) {
			c.addCnctTrmActnOccrnceTmgRptWhen(contracttermactionoccurrencetimingrepeatwhen.getCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptWhen("NULL");
		}
		 };

		/******************** contracttermactionoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime contracttermactionoccurrencetimingrepeatperiodunit = contracttermactionoccurrencetimingrepeat.getPeriodUnit();
		if(contracttermactionoccurrencetimingrepeatperiodunit!=null) {
			c.addCnctTrmActnOccrnceTmgRptPrdUnt(contracttermactionoccurrencetimingrepeatperiodunit.toCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptPrdUnt("NULL");
		}

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasPeriodMax()) {

			c.addCnctTrmActnOccrnceTmgRptPrdMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getPeriodMax()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptPrdMx("NULL");
		}


		/******************** contracttermactionoccurrencetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> contracttermactionoccurrencetimingrepeatdayofweeklist = contracttermactionoccurrencetimingrepeat.getDayOfWeek();
		for(int contracttermactionoccurrencetimingrepeatdayofweeki = 0; contracttermactionoccurrencetimingrepeatdayofweeki<contracttermactionoccurrencetimingrepeatdayofweeklist.size();contracttermactionoccurrencetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  contracttermactionoccurrencetimingrepeatdayofweek = contracttermactionoccurrencetimingrepeatdayofweeklist.get(contracttermactionoccurrencetimingrepeatdayofweeki);
		if(contracttermactionoccurrencetimingrepeatdayofweek!=null) {
			c.addCnctTrmActnOccrnceTmgRptDayOfWeek(contracttermactionoccurrencetimingrepeatdayofweek.getCode());
		} else {
			c.addCnctTrmActnOccrnceTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<contracttermactionoccurrencetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + contracttermactionoccurrencetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnOccrnceTmgRptTimeOfDay(array);

		} else {
			c.addCnctTrmActnOccrnceTmgRptTimeOfDay("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasDuration()) {

			c.addCnctTrmActnOccrnceTmgRptDuration(String.valueOf(contracttermactionoccurrencetimingrepeat.getDuration()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptDuration("NULL");
		}


		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasFrequency()) {

			c.addCnctTrmActnOccrnceTmgRptFrqncy(String.valueOf(contracttermactionoccurrencetimingrepeat.getFrequency()));
		} else {
			c.addCnctTrmActnOccrnceTmgRptFrqncy("NULL");
		}


		/******************** Cnct_Trm_Actn_Prfrmr ********************************************************************************/
		if(contracttermaction.hasPerformer()) {

			if(contracttermaction.getPerformer().getReference() != null) {
			c.addCnctTrmActnPrfrmr(contracttermaction.getPerformer().getReference());
			}
		} else {
			c.addCnctTrmActnPrfrmr("NULL");
		}


		/******************** Cnct_Trm_Actn_LinkId ********************************************************************************/
		if(contracttermaction.hasLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getLinkId().size(); incr++) {
				array = array + contracttermaction.getLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnLinkId(array);

		} else {
			c.addCnctTrmActnLinkId("NULL");
		}


		/******************** contracttermactionperformerrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionperformerrole = contracttermaction.getPerformerRole();

		/******************** Cnct_Trm_Actn_PrfrmrRole_Txt ********************************************************************************/
		if(contracttermactionperformerrole.hasText()) {

			c.addCnctTrmActnPrfrmrRoleTxt(String.valueOf(contracttermactionperformerrole.getText()));
		} else {
			c.addCnctTrmActnPrfrmrRoleTxt("NULL");
		}


		/******************** contracttermactionperformerrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionperformerrolecodinglist = contracttermactionperformerrole.getCoding();
		for(int contracttermactionperformerrolecodingi = 0; contracttermactionperformerrolecodingi<contracttermactionperformerrolecodinglist.size();contracttermactionperformerrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionperformerrolecoding = contracttermactionperformerrolecodinglist.get(contracttermactionperformerrolecodingi);

		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Dsply ********************************************************************************/
		if(contracttermactionperformerrolecodingi == 0) {c.addCnctTrmActnPrfrmrRoleCdgDsply("[[[");}
		if(contracttermactionperformerrolecoding.hasDisplay()) {

			c.addCnctTrmActnPrfrmrRoleCdgDsply(String.valueOf(contracttermactionperformerrolecoding.getDisplay()));
		} else {
			c.addCnctTrmActnPrfrmrRoleCdgDsply("NULL");
		}

		if(contracttermactionperformerrolecodingi == contracttermactionperformerrolecodinglist.size()-1) {c.addCnctTrmActnPrfrmrRoleCdgDsply("]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionperformerrolecodingi == 0) {c.addCnctTrmActnPrfrmrRoleCdgVrsn("[[[");}
		if(contracttermactionperformerrolecoding.hasVersion()) {

			c.addCnctTrmActnPrfrmrRoleCdgVrsn(String.valueOf(contracttermactionperformerrolecoding.getVersion()));
		} else {
			c.addCnctTrmActnPrfrmrRoleCdgVrsn("NULL");
		}

		if(contracttermactionperformerrolecodingi == contracttermactionperformerrolecodinglist.size()-1) {c.addCnctTrmActnPrfrmrRoleCdgVrsn("]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Cd ********************************************************************************/
		if(contracttermactionperformerrolecodingi == 0) {c.addCnctTrmActnPrfrmrRoleCdgCd("[[[");}
		if(contracttermactionperformerrolecoding.hasCode()) {

			c.addCnctTrmActnPrfrmrRoleCdgCd(String.valueOf(contracttermactionperformerrolecoding.getCode()));
		} else {
			c.addCnctTrmActnPrfrmrRoleCdgCd("NULL");
		}

		if(contracttermactionperformerrolecodingi == contracttermactionperformerrolecodinglist.size()-1) {c.addCnctTrmActnPrfrmrRoleCdgCd("]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionperformerrolecodingi == 0) {c.addCnctTrmActnPrfrmrRoleCdgUsrSltd("[[[");}
		if(contracttermactionperformerrolecoding.hasUserSelected()) {

			c.addCnctTrmActnPrfrmrRoleCdgUsrSltd(String.valueOf(contracttermactionperformerrolecoding.getUserSelected()));
		} else {
			c.addCnctTrmActnPrfrmrRoleCdgUsrSltd("NULL");
		}

		if(contracttermactionperformerrolecodingi == contracttermactionperformerrolecodinglist.size()-1) {c.addCnctTrmActnPrfrmrRoleCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Sys ********************************************************************************/
		if(contracttermactionperformerrolecodingi == 0) {c.addCnctTrmActnPrfrmrRoleCdgSys("[[[");}
		if(contracttermactionperformerrolecoding.hasSystem()) {

			c.addCnctTrmActnPrfrmrRoleCdgSys(String.valueOf(contracttermactionperformerrolecoding.getSystem()));
		} else {
			c.addCnctTrmActnPrfrmrRoleCdgSys("NULL");
		}

		if(contracttermactionperformerrolecodingi == contracttermactionperformerrolecodinglist.size()-1) {c.addCnctTrmActnPrfrmrRoleCdgSys("]]]");}


		 };
		/******************** Cnct_Trm_Actn_RsnLinkId ********************************************************************************/
		if(contracttermaction.hasReasonLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getReasonLinkId().size(); incr++) {
				array = array + contracttermaction.getReasonLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnRsnLinkId(array);

		} else {
			c.addCnctTrmActnRsnLinkId("NULL");
		}


		/******************** Cnct_Trm_Actn_RqsterLinkId ********************************************************************************/
		if(contracttermaction.hasRequesterLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getRequesterLinkId().size(); incr++) {
				array = array + contracttermaction.getRequesterLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnRqsterLinkId(array);

		} else {
			c.addCnctTrmActnRqsterLinkId("NULL");
		}


		/******************** Cnct_Trm_Actn_PrfrmrLinkId ********************************************************************************/
		if(contracttermaction.hasPerformerLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getPerformerLinkId().size(); incr++) {
				array = array + contracttermaction.getPerformerLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnPrfrmrLinkId(array);

		} else {
			c.addCnctTrmActnPrfrmrLinkId("NULL");
		}


		/******************** Cnct_Trm_Actn_CntxtLinkId ********************************************************************************/
		if(contracttermaction.hasContextLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermaction.getContextLinkId().size(); incr++) {
				array = array + contracttermaction.getContextLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmActnCntxtLinkId(array);

		} else {
			c.addCnctTrmActnCntxtLinkId("NULL");
		}


		/******************** contracttermactionintent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionintent = contracttermaction.getIntent();

		/******************** Cnct_Trm_Actn_Intent_Txt ********************************************************************************/
		if(contracttermactionintent.hasText()) {

			c.addCnctTrmActnIntentTxt(String.valueOf(contracttermactionintent.getText()));
		} else {
			c.addCnctTrmActnIntentTxt("NULL");
		}


		/******************** contracttermactionintentcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermactionintentcodinglist = contracttermactionintent.getCoding();
		for(int contracttermactionintentcodingi = 0; contracttermactionintentcodingi<contracttermactionintentcodinglist.size();contracttermactionintentcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermactionintentcoding = contracttermactionintentcodinglist.get(contracttermactionintentcodingi);

		/******************** Cnct_Trm_Actn_Intent_Cdg_Dsply ********************************************************************************/
		if(contracttermactionintentcodingi == 0) {c.addCnctTrmActnIntentCdgDsply("[[[");}
		if(contracttermactionintentcoding.hasDisplay()) {

			c.addCnctTrmActnIntentCdgDsply(String.valueOf(contracttermactionintentcoding.getDisplay()));
		} else {
			c.addCnctTrmActnIntentCdgDsply("NULL");
		}

		if(contracttermactionintentcodingi == contracttermactionintentcodinglist.size()-1) {c.addCnctTrmActnIntentCdgDsply("]]]");}


		/******************** Cnct_Trm_Actn_Intent_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionintentcodingi == 0) {c.addCnctTrmActnIntentCdgVrsn("[[[");}
		if(contracttermactionintentcoding.hasVersion()) {

			c.addCnctTrmActnIntentCdgVrsn(String.valueOf(contracttermactionintentcoding.getVersion()));
		} else {
			c.addCnctTrmActnIntentCdgVrsn("NULL");
		}

		if(contracttermactionintentcodingi == contracttermactionintentcodinglist.size()-1) {c.addCnctTrmActnIntentCdgVrsn("]]]");}


		/******************** Cnct_Trm_Actn_Intent_Cdg_Cd ********************************************************************************/
		if(contracttermactionintentcodingi == 0) {c.addCnctTrmActnIntentCdgCd("[[[");}
		if(contracttermactionintentcoding.hasCode()) {

			c.addCnctTrmActnIntentCdgCd(String.valueOf(contracttermactionintentcoding.getCode()));
		} else {
			c.addCnctTrmActnIntentCdgCd("NULL");
		}

		if(contracttermactionintentcodingi == contracttermactionintentcodinglist.size()-1) {c.addCnctTrmActnIntentCdgCd("]]]");}


		/******************** Cnct_Trm_Actn_Intent_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionintentcodingi == 0) {c.addCnctTrmActnIntentCdgUsrSltd("[[[");}
		if(contracttermactionintentcoding.hasUserSelected()) {

			c.addCnctTrmActnIntentCdgUsrSltd(String.valueOf(contracttermactionintentcoding.getUserSelected()));
		} else {
			c.addCnctTrmActnIntentCdgUsrSltd("NULL");
		}

		if(contracttermactionintentcodingi == contracttermactionintentcodinglist.size()-1) {c.addCnctTrmActnIntentCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Actn_Intent_Cdg_Sys ********************************************************************************/
		if(contracttermactionintentcodingi == 0) {c.addCnctTrmActnIntentCdgSys("[[[");}
		if(contracttermactionintentcoding.hasSystem()) {

			c.addCnctTrmActnIntentCdgSys(String.valueOf(contracttermactionintentcoding.getSystem()));
		} else {
			c.addCnctTrmActnIntentCdgSys("NULL");
		}

		if(contracttermactionintentcodingi == contracttermactionintentcodinglist.size()-1) {c.addCnctTrmActnIntentCdgSys("]]]");}


		 };
		/******************** Cnct_Trm_Actn_DoNotPerform ********************************************************************************/
		if(contracttermaction.hasDoNotPerform()) {

			c.addCnctTrmActnDoNotPerform(String.valueOf(contracttermaction.getDoNotPerform()));
		} else {
			c.addCnctTrmActnDoNotPerform("NULL");
		}


		 };
		/******************** contracttermidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermidentifier = contractterm.getIdentifier();

		/******************** Cnct_Trm_Id_Vl ********************************************************************************/
		if(contracttermidentifier.hasValue()) {

			c.addCnctTrmIdVl(String.valueOf(contracttermidentifier.getValue()));
		} else {
			c.addCnctTrmIdVl("NULL");
		}


		/******************** contracttermidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermidentifiertype = contracttermidentifier.getType();

		/******************** Cnct_Trm_Id_Typ_Txt ********************************************************************************/
		if(contracttermidentifiertype.hasText()) {

			c.addCnctTrmIdTypTxt(String.valueOf(contracttermidentifiertype.getText()));
		} else {
			c.addCnctTrmIdTypTxt("NULL");
		}


		/******************** contracttermidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermidentifiertypecodinglist = contracttermidentifiertype.getCoding();
		for(int contracttermidentifiertypecodingi = 0; contracttermidentifiertypecodingi<contracttermidentifiertypecodinglist.size();contracttermidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermidentifiertypecoding = contracttermidentifiertypecodinglist.get(contracttermidentifiertypecodingi);

		/******************** Cnct_Trm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermidentifiertypecodingi == 0) {c.addCnctTrmIdTypCdgDsply("[[");}
		if(contracttermidentifiertypecoding.hasDisplay()) {

			c.addCnctTrmIdTypCdgDsply(String.valueOf(contracttermidentifiertypecoding.getDisplay()));
		} else {
			c.addCnctTrmIdTypCdgDsply("NULL");
		}

		if(contracttermidentifiertypecodingi == contracttermidentifiertypecodinglist.size()-1) {c.addCnctTrmIdTypCdgDsply("]]");}


		/******************** Cnct_Trm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermidentifiertypecodingi == 0) {c.addCnctTrmIdTypCdgVrsn("[[");}
		if(contracttermidentifiertypecoding.hasVersion()) {

			c.addCnctTrmIdTypCdgVrsn(String.valueOf(contracttermidentifiertypecoding.getVersion()));
		} else {
			c.addCnctTrmIdTypCdgVrsn("NULL");
		}

		if(contracttermidentifiertypecodingi == contracttermidentifiertypecodinglist.size()-1) {c.addCnctTrmIdTypCdgVrsn("]]");}


		/******************** Cnct_Trm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermidentifiertypecodingi == 0) {c.addCnctTrmIdTypCdgCd("[[");}
		if(contracttermidentifiertypecoding.hasCode()) {

			c.addCnctTrmIdTypCdgCd(String.valueOf(contracttermidentifiertypecoding.getCode()));
		} else {
			c.addCnctTrmIdTypCdgCd("NULL");
		}

		if(contracttermidentifiertypecodingi == contracttermidentifiertypecodinglist.size()-1) {c.addCnctTrmIdTypCdgCd("]]");}


		/******************** Cnct_Trm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermidentifiertypecodingi == 0) {c.addCnctTrmIdTypCdgUsrSltd("[[");}
		if(contracttermidentifiertypecoding.hasUserSelected()) {

			c.addCnctTrmIdTypCdgUsrSltd(String.valueOf(contracttermidentifiertypecoding.getUserSelected()));
		} else {
			c.addCnctTrmIdTypCdgUsrSltd("NULL");
		}

		if(contracttermidentifiertypecodingi == contracttermidentifiertypecodinglist.size()-1) {c.addCnctTrmIdTypCdgUsrSltd("]]");}


		/******************** Cnct_Trm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermidentifiertypecodingi == 0) {c.addCnctTrmIdTypCdgSys("[[");}
		if(contracttermidentifiertypecoding.hasSystem()) {

			c.addCnctTrmIdTypCdgSys(String.valueOf(contracttermidentifiertypecoding.getSystem()));
		} else {
			c.addCnctTrmIdTypCdgSys("NULL");
		}

		if(contracttermidentifiertypecodingi == contracttermidentifiertypecodinglist.size()-1) {c.addCnctTrmIdTypCdgSys("]]");}


		 };
		/******************** contracttermidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermidentifierperiod = contracttermidentifier.getPeriod();

		/******************** Cnct_Trm_Id_Prd_Strt ********************************************************************************/
		if(contracttermidentifierperiod.hasStart()) {

			c.addCnctTrmIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermidentifierperiod.getStart())+"\"");
		} else {
			c.addCnctTrmIdPrdStrt("NULL");
		}


		/******************** Cnct_Trm_Id_Prd_End ********************************************************************************/
		if(contracttermidentifierperiod.hasEnd()) {

			c.addCnctTrmIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermidentifierperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmIdPrdEnd("NULL");
		}


		/******************** contracttermidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contracttermidentifieruse = contracttermidentifier.getUse();
		if(contracttermidentifieruse!=null) {
			c.addCnctTrmIdUse(contracttermidentifieruse.toCode());
		} else {
			c.addCnctTrmIdUse("NULL");
		}

		/******************** Cnct_Trm_Id_Assigner ********************************************************************************/
		if(contracttermidentifier.hasAssigner()) {

			if(contracttermidentifier.getAssigner().getReference() != null) {
			c.addCnctTrmIdAssigner(contracttermidentifier.getAssigner().getReference());
			}
		} else {
			c.addCnctTrmIdAssigner("NULL");
		}


		/******************** Cnct_Trm_Id_Sys ********************************************************************************/
		if(contracttermidentifier.hasSystem()) {

			c.addCnctTrmIdSys(String.valueOf(contracttermidentifier.getSystem()));
		} else {
			c.addCnctTrmIdSys("NULL");
		}


		/******************** contracttermtopiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermtopiccodeableconcept = contractterm.getTopicCodeableConcept();

		/******************** Cnct_Trm_TopicCdbleCncpt_Txt ********************************************************************************/
		if(contracttermtopiccodeableconcept.hasText()) {

			c.addCnctTrmTopicCdbleCncptTxt(String.valueOf(contracttermtopiccodeableconcept.getText()));
		} else {
			c.addCnctTrmTopicCdbleCncptTxt("NULL");
		}


		/******************** contracttermtopiccodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermtopiccodeableconceptcodinglist = contracttermtopiccodeableconcept.getCoding();
		for(int contracttermtopiccodeableconceptcodingi = 0; contracttermtopiccodeableconceptcodingi<contracttermtopiccodeableconceptcodinglist.size();contracttermtopiccodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermtopiccodeableconceptcoding = contracttermtopiccodeableconceptcodinglist.get(contracttermtopiccodeableconceptcodingi);

		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(contracttermtopiccodeableconceptcodingi == 0) {c.addCnctTrmTopicCdbleCncptCdgDsply("[[");}
		if(contracttermtopiccodeableconceptcoding.hasDisplay()) {

			c.addCnctTrmTopicCdbleCncptCdgDsply(String.valueOf(contracttermtopiccodeableconceptcoding.getDisplay()));
		} else {
			c.addCnctTrmTopicCdbleCncptCdgDsply("NULL");
		}

		if(contracttermtopiccodeableconceptcodingi == contracttermtopiccodeableconceptcodinglist.size()-1) {c.addCnctTrmTopicCdbleCncptCdgDsply("]]");}


		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(contracttermtopiccodeableconceptcodingi == 0) {c.addCnctTrmTopicCdbleCncptCdgVrsn("[[");}
		if(contracttermtopiccodeableconceptcoding.hasVersion()) {

			c.addCnctTrmTopicCdbleCncptCdgVrsn(String.valueOf(contracttermtopiccodeableconceptcoding.getVersion()));
		} else {
			c.addCnctTrmTopicCdbleCncptCdgVrsn("NULL");
		}

		if(contracttermtopiccodeableconceptcodingi == contracttermtopiccodeableconceptcodinglist.size()-1) {c.addCnctTrmTopicCdbleCncptCdgVrsn("]]");}


		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(contracttermtopiccodeableconceptcodingi == 0) {c.addCnctTrmTopicCdbleCncptCdgCd("[[");}
		if(contracttermtopiccodeableconceptcoding.hasCode()) {

			c.addCnctTrmTopicCdbleCncptCdgCd(String.valueOf(contracttermtopiccodeableconceptcoding.getCode()));
		} else {
			c.addCnctTrmTopicCdbleCncptCdgCd("NULL");
		}

		if(contracttermtopiccodeableconceptcodingi == contracttermtopiccodeableconceptcodinglist.size()-1) {c.addCnctTrmTopicCdbleCncptCdgCd("]]");}


		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(contracttermtopiccodeableconceptcodingi == 0) {c.addCnctTrmTopicCdbleCncptCdgUsrSltd("[[");}
		if(contracttermtopiccodeableconceptcoding.hasUserSelected()) {

			c.addCnctTrmTopicCdbleCncptCdgUsrSltd(String.valueOf(contracttermtopiccodeableconceptcoding.getUserSelected()));
		} else {
			c.addCnctTrmTopicCdbleCncptCdgUsrSltd("NULL");
		}

		if(contracttermtopiccodeableconceptcodingi == contracttermtopiccodeableconceptcodinglist.size()-1) {c.addCnctTrmTopicCdbleCncptCdgUsrSltd("]]");}


		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(contracttermtopiccodeableconceptcodingi == 0) {c.addCnctTrmTopicCdbleCncptCdgSys("[[");}
		if(contracttermtopiccodeableconceptcoding.hasSystem()) {

			c.addCnctTrmTopicCdbleCncptCdgSys(String.valueOf(contracttermtopiccodeableconceptcoding.getSystem()));
		} else {
			c.addCnctTrmTopicCdbleCncptCdgSys("NULL");
		}

		if(contracttermtopiccodeableconceptcodingi == contracttermtopiccodeableconceptcodinglist.size()-1) {c.addCnctTrmTopicCdbleCncptCdgSys("]]");}


		 };
		/******************** contracttermsecuritylabel ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.SecurityLabelComponent> contracttermsecuritylabellist = contractterm.getSecurityLabel();
		for(int contracttermsecuritylabeli = 0; contracttermsecuritylabeli<contracttermsecuritylabellist.size();contracttermsecuritylabeli++ ) {
		org.hl7.fhir.r4.model.Contract.SecurityLabelComponent  contracttermsecuritylabel = contracttermsecuritylabellist.get(contracttermsecuritylabeli);

		/******************** Cnct_Trm_SecurityLbl_Nmbr ********************************************************************************/
		if(contracttermsecuritylabeli == 0) {c.addCnctTrmSecurityLblNmbr("[[");}
		if(contracttermsecuritylabel.hasNumber()) {

			String  array = "[";
			for(int incr=0; incr<contracttermsecuritylabel.getNumber().size(); incr++) {
				array = array + contracttermsecuritylabel.getNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmSecurityLblNmbr(array);

		} else {
			c.addCnctTrmSecurityLblNmbr("NULL");
		}

		if(contracttermsecuritylabeli == contracttermsecuritylabellist.size()-1) {c.addCnctTrmSecurityLblNmbr("]]");}


		/******************** contracttermsecuritylabelcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermsecuritylabelcategorylist = contracttermsecuritylabel.getCategory();
		for(int contracttermsecuritylabelcategoryi = 0; contracttermsecuritylabelcategoryi<contracttermsecuritylabelcategorylist.size();contracttermsecuritylabelcategoryi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermsecuritylabelcategory = contracttermsecuritylabelcategorylist.get(contracttermsecuritylabelcategoryi);

		/******************** Cnct_Trm_SecurityLbl_Ctgry_Dsply ********************************************************************************/
		if(contracttermsecuritylabelcategoryi == 0) {c.addCnctTrmSecurityLblCtgryDsply("[[[");}
		if(contracttermsecuritylabelcategory.hasDisplay()) {

			c.addCnctTrmSecurityLblCtgryDsply(String.valueOf(contracttermsecuritylabelcategory.getDisplay()));
		} else {
			c.addCnctTrmSecurityLblCtgryDsply("NULL");
		}

		if(contracttermsecuritylabelcategoryi == contracttermsecuritylabelcategorylist.size()-1) {c.addCnctTrmSecurityLblCtgryDsply("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Ctgry_Vrsn ********************************************************************************/
		if(contracttermsecuritylabelcategoryi == 0) {c.addCnctTrmSecurityLblCtgryVrsn("[[[");}
		if(contracttermsecuritylabelcategory.hasVersion()) {

			c.addCnctTrmSecurityLblCtgryVrsn(String.valueOf(contracttermsecuritylabelcategory.getVersion()));
		} else {
			c.addCnctTrmSecurityLblCtgryVrsn("NULL");
		}

		if(contracttermsecuritylabelcategoryi == contracttermsecuritylabelcategorylist.size()-1) {c.addCnctTrmSecurityLblCtgryVrsn("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Ctgry_Cd ********************************************************************************/
		if(contracttermsecuritylabelcategoryi == 0) {c.addCnctTrmSecurityLblCtgryCd("[[[");}
		if(contracttermsecuritylabelcategory.hasCode()) {

			c.addCnctTrmSecurityLblCtgryCd(String.valueOf(contracttermsecuritylabelcategory.getCode()));
		} else {
			c.addCnctTrmSecurityLblCtgryCd("NULL");
		}

		if(contracttermsecuritylabelcategoryi == contracttermsecuritylabelcategorylist.size()-1) {c.addCnctTrmSecurityLblCtgryCd("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Ctgry_UsrSltd ********************************************************************************/
		if(contracttermsecuritylabelcategoryi == 0) {c.addCnctTrmSecurityLblCtgryUsrSltd("[[[");}
		if(contracttermsecuritylabelcategory.hasUserSelected()) {

			c.addCnctTrmSecurityLblCtgryUsrSltd(String.valueOf(contracttermsecuritylabelcategory.getUserSelected()));
		} else {
			c.addCnctTrmSecurityLblCtgryUsrSltd("NULL");
		}

		if(contracttermsecuritylabelcategoryi == contracttermsecuritylabelcategorylist.size()-1) {c.addCnctTrmSecurityLblCtgryUsrSltd("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Ctgry_Sys ********************************************************************************/
		if(contracttermsecuritylabelcategoryi == 0) {c.addCnctTrmSecurityLblCtgrySys("[[[");}
		if(contracttermsecuritylabelcategory.hasSystem()) {

			c.addCnctTrmSecurityLblCtgrySys(String.valueOf(contracttermsecuritylabelcategory.getSystem()));
		} else {
			c.addCnctTrmSecurityLblCtgrySys("NULL");
		}

		if(contracttermsecuritylabelcategoryi == contracttermsecuritylabelcategorylist.size()-1) {c.addCnctTrmSecurityLblCtgrySys("]]]");}


		 };
		/******************** contracttermsecuritylabelclassification ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelclassification = contracttermsecuritylabel.getClassification();

		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Dsply ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasDisplay()) {

			c.addCnctTrmSecurityLblClsfctnDsply(String.valueOf(contracttermsecuritylabelclassification.getDisplay()));
		} else {
			c.addCnctTrmSecurityLblClsfctnDsply("NULL");
		}


		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Vrsn ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasVersion()) {

			c.addCnctTrmSecurityLblClsfctnVrsn(String.valueOf(contracttermsecuritylabelclassification.getVersion()));
		} else {
			c.addCnctTrmSecurityLblClsfctnVrsn("NULL");
		}


		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Cd ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasCode()) {

			c.addCnctTrmSecurityLblClsfctnCd(String.valueOf(contracttermsecuritylabelclassification.getCode()));
		} else {
			c.addCnctTrmSecurityLblClsfctnCd("NULL");
		}


		/******************** Cnct_Trm_SecurityLbl_Clsfctn_UsrSltd ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasUserSelected()) {

			c.addCnctTrmSecurityLblClsfctnUsrSltd(String.valueOf(contracttermsecuritylabelclassification.getUserSelected()));
		} else {
			c.addCnctTrmSecurityLblClsfctnUsrSltd("NULL");
		}


		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Sys ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasSystem()) {

			c.addCnctTrmSecurityLblClsfctnSys(String.valueOf(contracttermsecuritylabelclassification.getSystem()));
		} else {
			c.addCnctTrmSecurityLblClsfctnSys("NULL");
		}


		/******************** contracttermsecuritylabelcontrol ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermsecuritylabelcontrollist = contracttermsecuritylabel.getControl();
		for(int contracttermsecuritylabelcontroli = 0; contracttermsecuritylabelcontroli<contracttermsecuritylabelcontrollist.size();contracttermsecuritylabelcontroli++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermsecuritylabelcontrol = contracttermsecuritylabelcontrollist.get(contracttermsecuritylabelcontroli);

		/******************** Cnct_Trm_SecurityLbl_Control_Dsply ********************************************************************************/
		if(contracttermsecuritylabelcontroli == 0) {c.addCnctTrmSecurityLblControlDsply("[[[");}
		if(contracttermsecuritylabelcontrol.hasDisplay()) {

			c.addCnctTrmSecurityLblControlDsply(String.valueOf(contracttermsecuritylabelcontrol.getDisplay()));
		} else {
			c.addCnctTrmSecurityLblControlDsply("NULL");
		}

		if(contracttermsecuritylabelcontroli == contracttermsecuritylabelcontrollist.size()-1) {c.addCnctTrmSecurityLblControlDsply("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Control_Vrsn ********************************************************************************/
		if(contracttermsecuritylabelcontroli == 0) {c.addCnctTrmSecurityLblControlVrsn("[[[");}
		if(contracttermsecuritylabelcontrol.hasVersion()) {

			c.addCnctTrmSecurityLblControlVrsn(String.valueOf(contracttermsecuritylabelcontrol.getVersion()));
		} else {
			c.addCnctTrmSecurityLblControlVrsn("NULL");
		}

		if(contracttermsecuritylabelcontroli == contracttermsecuritylabelcontrollist.size()-1) {c.addCnctTrmSecurityLblControlVrsn("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Control_Cd ********************************************************************************/
		if(contracttermsecuritylabelcontroli == 0) {c.addCnctTrmSecurityLblControlCd("[[[");}
		if(contracttermsecuritylabelcontrol.hasCode()) {

			c.addCnctTrmSecurityLblControlCd(String.valueOf(contracttermsecuritylabelcontrol.getCode()));
		} else {
			c.addCnctTrmSecurityLblControlCd("NULL");
		}

		if(contracttermsecuritylabelcontroli == contracttermsecuritylabelcontrollist.size()-1) {c.addCnctTrmSecurityLblControlCd("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Control_UsrSltd ********************************************************************************/
		if(contracttermsecuritylabelcontroli == 0) {c.addCnctTrmSecurityLblControlUsrSltd("[[[");}
		if(contracttermsecuritylabelcontrol.hasUserSelected()) {

			c.addCnctTrmSecurityLblControlUsrSltd(String.valueOf(contracttermsecuritylabelcontrol.getUserSelected()));
		} else {
			c.addCnctTrmSecurityLblControlUsrSltd("NULL");
		}

		if(contracttermsecuritylabelcontroli == contracttermsecuritylabelcontrollist.size()-1) {c.addCnctTrmSecurityLblControlUsrSltd("]]]");}


		/******************** Cnct_Trm_SecurityLbl_Control_Sys ********************************************************************************/
		if(contracttermsecuritylabelcontroli == 0) {c.addCnctTrmSecurityLblControlSys("[[[");}
		if(contracttermsecuritylabelcontrol.hasSystem()) {

			c.addCnctTrmSecurityLblControlSys(String.valueOf(contracttermsecuritylabelcontrol.getSystem()));
		} else {
			c.addCnctTrmSecurityLblControlSys("NULL");
		}

		if(contracttermsecuritylabelcontroli == contracttermsecuritylabelcontrollist.size()-1) {c.addCnctTrmSecurityLblControlSys("]]]");}


		 };
		 };
		/******************** Cnct_Trm_Txt ********************************************************************************/
		if(contractterm.hasText()) {

			c.addCnctTrmTxt(String.valueOf(contractterm.getText()));
		} else {
			c.addCnctTrmTxt("NULL");
		}


		/******************** contracttermapplies ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermapplies = contractterm.getApplies();

		/******************** Cnct_Trm_Applies_Strt ********************************************************************************/
		if(contracttermapplies.hasStart()) {

			c.addCnctTrmAppliesStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermapplies.getStart())+"\"");
		} else {
			c.addCnctTrmAppliesStrt("NULL");
		}


		/******************** Cnct_Trm_Applies_End ********************************************************************************/
		if(contracttermapplies.hasEnd()) {

			c.addCnctTrmAppliesEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermapplies.getEnd())+"\"");
		} else {
			c.addCnctTrmAppliesEnd("NULL");
		}


		/******************** Cnct_Trm_Issued ********************************************************************************/
		if(contractterm.hasIssued()) {

			c.addCnctTrmIssued("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractterm.getIssued())+"\"");
		} else {
			c.addCnctTrmIssued("NULL");
		}


		/******************** Cnct_Trm_TopicRfrnc ********************************************************************************/
		if(contractterm.hasTopicReference()) {

			if(contractterm.getTopicReference().getReference() != null) {
			c.addCnctTrmTopicRfrnc(contractterm.getTopicReference().getReference());
			}
		} else {
			c.addCnctTrmTopicRfrnc("NULL");
		}


		/******************** contracttermsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermsubtype = contractterm.getSubType();

		/******************** Cnct_Trm_SubTyp_Txt ********************************************************************************/
		if(contracttermsubtype.hasText()) {

			c.addCnctTrmSubTypTxt(String.valueOf(contracttermsubtype.getText()));
		} else {
			c.addCnctTrmSubTypTxt("NULL");
		}


		/******************** contracttermsubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermsubtypecodinglist = contracttermsubtype.getCoding();
		for(int contracttermsubtypecodingi = 0; contracttermsubtypecodingi<contracttermsubtypecodinglist.size();contracttermsubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermsubtypecoding = contracttermsubtypecodinglist.get(contracttermsubtypecodingi);

		/******************** Cnct_Trm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(contracttermsubtypecodingi == 0) {c.addCnctTrmSubTypCdgDsply("[[");}
		if(contracttermsubtypecoding.hasDisplay()) {

			c.addCnctTrmSubTypCdgDsply(String.valueOf(contracttermsubtypecoding.getDisplay()));
		} else {
			c.addCnctTrmSubTypCdgDsply("NULL");
		}

		if(contracttermsubtypecodingi == contracttermsubtypecodinglist.size()-1) {c.addCnctTrmSubTypCdgDsply("]]");}


		/******************** Cnct_Trm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(contracttermsubtypecodingi == 0) {c.addCnctTrmSubTypCdgVrsn("[[");}
		if(contracttermsubtypecoding.hasVersion()) {

			c.addCnctTrmSubTypCdgVrsn(String.valueOf(contracttermsubtypecoding.getVersion()));
		} else {
			c.addCnctTrmSubTypCdgVrsn("NULL");
		}

		if(contracttermsubtypecodingi == contracttermsubtypecodinglist.size()-1) {c.addCnctTrmSubTypCdgVrsn("]]");}


		/******************** Cnct_Trm_SubTyp_Cdg_Cd ********************************************************************************/
		if(contracttermsubtypecodingi == 0) {c.addCnctTrmSubTypCdgCd("[[");}
		if(contracttermsubtypecoding.hasCode()) {

			c.addCnctTrmSubTypCdgCd(String.valueOf(contracttermsubtypecoding.getCode()));
		} else {
			c.addCnctTrmSubTypCdgCd("NULL");
		}

		if(contracttermsubtypecodingi == contracttermsubtypecodinglist.size()-1) {c.addCnctTrmSubTypCdgCd("]]");}


		/******************** Cnct_Trm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(contracttermsubtypecodingi == 0) {c.addCnctTrmSubTypCdgUsrSltd("[[");}
		if(contracttermsubtypecoding.hasUserSelected()) {

			c.addCnctTrmSubTypCdgUsrSltd(String.valueOf(contracttermsubtypecoding.getUserSelected()));
		} else {
			c.addCnctTrmSubTypCdgUsrSltd("NULL");
		}

		if(contracttermsubtypecodingi == contracttermsubtypecodinglist.size()-1) {c.addCnctTrmSubTypCdgUsrSltd("]]");}


		/******************** Cnct_Trm_SubTyp_Cdg_Sys ********************************************************************************/
		if(contracttermsubtypecodingi == 0) {c.addCnctTrmSubTypCdgSys("[[");}
		if(contracttermsubtypecoding.hasSystem()) {

			c.addCnctTrmSubTypCdgSys(String.valueOf(contracttermsubtypecoding.getSystem()));
		} else {
			c.addCnctTrmSubTypCdgSys("NULL");
		}

		if(contracttermsubtypecodingi == contracttermsubtypecodinglist.size()-1) {c.addCnctTrmSubTypCdgSys("]]");}


		 };
		/******************** contracttermoffer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractOfferComponent contracttermoffer = contractterm.getOffer();

		/******************** contracttermoffertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermoffertype = contracttermoffer.getType();

		/******************** Cnct_Trm_Offr_Typ_Txt ********************************************************************************/
		if(contracttermoffertype.hasText()) {

			c.addCnctTrmOffrTypTxt(String.valueOf(contracttermoffertype.getText()));
		} else {
			c.addCnctTrmOffrTypTxt("NULL");
		}


		/******************** contracttermoffertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermoffertypecodinglist = contracttermoffertype.getCoding();
		for(int contracttermoffertypecodingi = 0; contracttermoffertypecodingi<contracttermoffertypecodinglist.size();contracttermoffertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermoffertypecoding = contracttermoffertypecodinglist.get(contracttermoffertypecodingi);

		/******************** Cnct_Trm_Offr_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermoffertypecodingi == 0) {c.addCnctTrmOffrTypCdgDsply("[[");}
		if(contracttermoffertypecoding.hasDisplay()) {

			c.addCnctTrmOffrTypCdgDsply(String.valueOf(contracttermoffertypecoding.getDisplay()));
		} else {
			c.addCnctTrmOffrTypCdgDsply("NULL");
		}

		if(contracttermoffertypecodingi == contracttermoffertypecodinglist.size()-1) {c.addCnctTrmOffrTypCdgDsply("]]");}


		/******************** Cnct_Trm_Offr_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermoffertypecodingi == 0) {c.addCnctTrmOffrTypCdgVrsn("[[");}
		if(contracttermoffertypecoding.hasVersion()) {

			c.addCnctTrmOffrTypCdgVrsn(String.valueOf(contracttermoffertypecoding.getVersion()));
		} else {
			c.addCnctTrmOffrTypCdgVrsn("NULL");
		}

		if(contracttermoffertypecodingi == contracttermoffertypecodinglist.size()-1) {c.addCnctTrmOffrTypCdgVrsn("]]");}


		/******************** Cnct_Trm_Offr_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermoffertypecodingi == 0) {c.addCnctTrmOffrTypCdgCd("[[");}
		if(contracttermoffertypecoding.hasCode()) {

			c.addCnctTrmOffrTypCdgCd(String.valueOf(contracttermoffertypecoding.getCode()));
		} else {
			c.addCnctTrmOffrTypCdgCd("NULL");
		}

		if(contracttermoffertypecodingi == contracttermoffertypecodinglist.size()-1) {c.addCnctTrmOffrTypCdgCd("]]");}


		/******************** Cnct_Trm_Offr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermoffertypecodingi == 0) {c.addCnctTrmOffrTypCdgUsrSltd("[[");}
		if(contracttermoffertypecoding.hasUserSelected()) {

			c.addCnctTrmOffrTypCdgUsrSltd(String.valueOf(contracttermoffertypecoding.getUserSelected()));
		} else {
			c.addCnctTrmOffrTypCdgUsrSltd("NULL");
		}

		if(contracttermoffertypecodingi == contracttermoffertypecodinglist.size()-1) {c.addCnctTrmOffrTypCdgUsrSltd("]]");}


		/******************** Cnct_Trm_Offr_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermoffertypecodingi == 0) {c.addCnctTrmOffrTypCdgSys("[[");}
		if(contracttermoffertypecoding.hasSystem()) {

			c.addCnctTrmOffrTypCdgSys(String.valueOf(contracttermoffertypecoding.getSystem()));
		} else {
			c.addCnctTrmOffrTypCdgSys("NULL");
		}

		if(contracttermoffertypecodingi == contracttermoffertypecodinglist.size()-1) {c.addCnctTrmOffrTypCdgSys("]]");}


		 };
		/******************** contracttermofferidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> contracttermofferidentifierlist = contracttermoffer.getIdentifier();
		for(int contracttermofferidentifieri = 0; contracttermofferidentifieri<contracttermofferidentifierlist.size();contracttermofferidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  contracttermofferidentifier = contracttermofferidentifierlist.get(contracttermofferidentifieri);

		/******************** Cnct_Trm_Offr_Id_Vl ********************************************************************************/
		if(contracttermofferidentifieri == 0) {c.addCnctTrmOffrIdVl("[[");}
		if(contracttermofferidentifier.hasValue()) {

			c.addCnctTrmOffrIdVl(String.valueOf(contracttermofferidentifier.getValue()));
		} else {
			c.addCnctTrmOffrIdVl("NULL");
		}

		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {c.addCnctTrmOffrIdVl("]]");}


		/******************** contracttermofferidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferidentifiertype = contracttermofferidentifier.getType();

		/******************** Cnct_Trm_Offr_Id_Typ_Txt ********************************************************************************/
		if(contracttermofferidentifieri == 0) {c.addCnctTrmOffrIdTypTxt("[[");}
		if(contracttermofferidentifiertype.hasText()) {

			c.addCnctTrmOffrIdTypTxt(String.valueOf(contracttermofferidentifiertype.getText()));
		} else {
			c.addCnctTrmOffrIdTypTxt("NULL");
		}

		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {c.addCnctTrmOffrIdTypTxt("]]");}


		/******************** contracttermofferidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermofferidentifiertypecodinglist = contracttermofferidentifiertype.getCoding();
		for(int contracttermofferidentifiertypecodingi = 0; contracttermofferidentifiertypecodingi<contracttermofferidentifiertypecodinglist.size();contracttermofferidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermofferidentifiertypecoding = contracttermofferidentifiertypecodinglist.get(contracttermofferidentifiertypecodingi);

		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermofferidentifiertypecodingi == 0) {c.addCnctTrmOffrIdTypCdgDsply("[[[");}
		if(contracttermofferidentifiertypecoding.hasDisplay()) {

			c.addCnctTrmOffrIdTypCdgDsply(String.valueOf(contracttermofferidentifiertypecoding.getDisplay()));
		} else {
			c.addCnctTrmOffrIdTypCdgDsply("NULL");
		}

		if(contracttermofferidentifiertypecodingi == contracttermofferidentifiertypecodinglist.size()-1) {c.addCnctTrmOffrIdTypCdgDsply("]]]");}


		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferidentifiertypecodingi == 0) {c.addCnctTrmOffrIdTypCdgVrsn("[[[");}
		if(contracttermofferidentifiertypecoding.hasVersion()) {

			c.addCnctTrmOffrIdTypCdgVrsn(String.valueOf(contracttermofferidentifiertypecoding.getVersion()));
		} else {
			c.addCnctTrmOffrIdTypCdgVrsn("NULL");
		}

		if(contracttermofferidentifiertypecodingi == contracttermofferidentifiertypecodinglist.size()-1) {c.addCnctTrmOffrIdTypCdgVrsn("]]]");}


		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermofferidentifiertypecodingi == 0) {c.addCnctTrmOffrIdTypCdgCd("[[[");}
		if(contracttermofferidentifiertypecoding.hasCode()) {

			c.addCnctTrmOffrIdTypCdgCd(String.valueOf(contracttermofferidentifiertypecoding.getCode()));
		} else {
			c.addCnctTrmOffrIdTypCdgCd("NULL");
		}

		if(contracttermofferidentifiertypecodingi == contracttermofferidentifiertypecodinglist.size()-1) {c.addCnctTrmOffrIdTypCdgCd("]]]");}


		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferidentifiertypecodingi == 0) {c.addCnctTrmOffrIdTypCdgUsrSltd("[[[");}
		if(contracttermofferidentifiertypecoding.hasUserSelected()) {

			c.addCnctTrmOffrIdTypCdgUsrSltd(String.valueOf(contracttermofferidentifiertypecoding.getUserSelected()));
		} else {
			c.addCnctTrmOffrIdTypCdgUsrSltd("NULL");
		}

		if(contracttermofferidentifiertypecodingi == contracttermofferidentifiertypecodinglist.size()-1) {c.addCnctTrmOffrIdTypCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermofferidentifiertypecodingi == 0) {c.addCnctTrmOffrIdTypCdgSys("[[[");}
		if(contracttermofferidentifiertypecoding.hasSystem()) {

			c.addCnctTrmOffrIdTypCdgSys(String.valueOf(contracttermofferidentifiertypecoding.getSystem()));
		} else {
			c.addCnctTrmOffrIdTypCdgSys("NULL");
		}

		if(contracttermofferidentifiertypecodingi == contracttermofferidentifiertypecodinglist.size()-1) {c.addCnctTrmOffrIdTypCdgSys("]]]");}


		 };
		/******************** contracttermofferidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermofferidentifierperiod = contracttermofferidentifier.getPeriod();

		/******************** Cnct_Trm_Offr_Id_Prd_Strt ********************************************************************************/
		if(contracttermofferidentifieri == 0) {c.addCnctTrmOffrIdPrdStrt("[[");}
		if(contracttermofferidentifierperiod.hasStart()) {

			c.addCnctTrmOffrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermofferidentifierperiod.getStart())+"\"");
		} else {
			c.addCnctTrmOffrIdPrdStrt("NULL");
		}

		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {c.addCnctTrmOffrIdPrdStrt("]]");}


		/******************** Cnct_Trm_Offr_Id_Prd_End ********************************************************************************/
		if(contracttermofferidentifieri == 0) {c.addCnctTrmOffrIdPrdEnd("[[");}
		if(contracttermofferidentifierperiod.hasEnd()) {

			c.addCnctTrmOffrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermofferidentifierperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmOffrIdPrdEnd("NULL");
		}

		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {c.addCnctTrmOffrIdPrdEnd("]]");}


		/******************** contracttermofferidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contracttermofferidentifieruse = contracttermofferidentifier.getUse();
		if(contracttermofferidentifieruse!=null) {
		if(contracttermofferidentifieri == 0) {

		c.addCnctTrmOffrIdUse("[[");		}
			c.addCnctTrmOffrIdUse(contracttermofferidentifieruse.toCode());
		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {

		c.addCnctTrmOffrIdUse("]]");		}

		} else {
			c.addCnctTrmOffrIdUse("NULL");
		}

		/******************** Cnct_Trm_Offr_Id_Assigner ********************************************************************************/
		if(contracttermofferidentifieri == 0) {c.addCnctTrmOffrIdAssigner("[[");}
		if(contracttermofferidentifier.hasAssigner()) {

			if(contracttermofferidentifier.getAssigner().getReference() != null) {
			c.addCnctTrmOffrIdAssigner(contracttermofferidentifier.getAssigner().getReference());
			}
		} else {
			c.addCnctTrmOffrIdAssigner("NULL");
		}

		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {c.addCnctTrmOffrIdAssigner("]]");}


		/******************** Cnct_Trm_Offr_Id_Sys ********************************************************************************/
		if(contracttermofferidentifieri == 0) {c.addCnctTrmOffrIdSys("[[");}
		if(contracttermofferidentifier.hasSystem()) {

			c.addCnctTrmOffrIdSys(String.valueOf(contracttermofferidentifier.getSystem()));
		} else {
			c.addCnctTrmOffrIdSys("NULL");
		}

		if(contracttermofferidentifieri == contracttermofferidentifierlist.size()-1) {c.addCnctTrmOffrIdSys("]]");}


		 };
		/******************** Cnct_Trm_Offr_SecurityLblNmbr ********************************************************************************/
		if(contracttermoffer.hasSecurityLabelNumber()) {

			String  array = "[";
			for(int incr=0; incr<contracttermoffer.getSecurityLabelNumber().size(); incr++) {
				array = array + contracttermoffer.getSecurityLabelNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmOffrSecurityLblNmbr(array);

		} else {
			c.addCnctTrmOffrSecurityLblNmbr("NULL");
		}


		/******************** Cnct_Trm_Offr_LinkId ********************************************************************************/
		if(contracttermoffer.hasLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermoffer.getLinkId().size(); incr++) {
				array = array + contracttermoffer.getLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmOffrLinkId(array);

		} else {
			c.addCnctTrmOffrLinkId("NULL");
		}


		/******************** contracttermofferdecisionmode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermofferdecisionmodelist = contracttermoffer.getDecisionMode();
		for(int contracttermofferdecisionmodei = 0; contracttermofferdecisionmodei<contracttermofferdecisionmodelist.size();contracttermofferdecisionmodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermofferdecisionmode = contracttermofferdecisionmodelist.get(contracttermofferdecisionmodei);

		/******************** Cnct_Trm_Offr_DecisionMode_Txt ********************************************************************************/
		if(contracttermofferdecisionmodei == 0) {c.addCnctTrmOffrDecisionModeTxt("[[");}
		if(contracttermofferdecisionmode.hasText()) {

			c.addCnctTrmOffrDecisionModeTxt(String.valueOf(contracttermofferdecisionmode.getText()));
		} else {
			c.addCnctTrmOffrDecisionModeTxt("NULL");
		}

		if(contracttermofferdecisionmodei == contracttermofferdecisionmodelist.size()-1) {c.addCnctTrmOffrDecisionModeTxt("]]");}


		/******************** contracttermofferdecisionmodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermofferdecisionmodecodinglist = contracttermofferdecisionmode.getCoding();
		for(int contracttermofferdecisionmodecodingi = 0; contracttermofferdecisionmodecodingi<contracttermofferdecisionmodecodinglist.size();contracttermofferdecisionmodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermofferdecisionmodecoding = contracttermofferdecisionmodecodinglist.get(contracttermofferdecisionmodecodingi);

		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Dsply ********************************************************************************/
		if(contracttermofferdecisionmodecodingi == 0) {c.addCnctTrmOffrDecisionModeCdgDsply("[[[");}
		if(contracttermofferdecisionmodecoding.hasDisplay()) {

			c.addCnctTrmOffrDecisionModeCdgDsply(String.valueOf(contracttermofferdecisionmodecoding.getDisplay()));
		} else {
			c.addCnctTrmOffrDecisionModeCdgDsply("NULL");
		}

		if(contracttermofferdecisionmodecodingi == contracttermofferdecisionmodecodinglist.size()-1) {c.addCnctTrmOffrDecisionModeCdgDsply("]]]");}


		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferdecisionmodecodingi == 0) {c.addCnctTrmOffrDecisionModeCdgVrsn("[[[");}
		if(contracttermofferdecisionmodecoding.hasVersion()) {

			c.addCnctTrmOffrDecisionModeCdgVrsn(String.valueOf(contracttermofferdecisionmodecoding.getVersion()));
		} else {
			c.addCnctTrmOffrDecisionModeCdgVrsn("NULL");
		}

		if(contracttermofferdecisionmodecodingi == contracttermofferdecisionmodecodinglist.size()-1) {c.addCnctTrmOffrDecisionModeCdgVrsn("]]]");}


		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Cd ********************************************************************************/
		if(contracttermofferdecisionmodecodingi == 0) {c.addCnctTrmOffrDecisionModeCdgCd("[[[");}
		if(contracttermofferdecisionmodecoding.hasCode()) {

			c.addCnctTrmOffrDecisionModeCdgCd(String.valueOf(contracttermofferdecisionmodecoding.getCode()));
		} else {
			c.addCnctTrmOffrDecisionModeCdgCd("NULL");
		}

		if(contracttermofferdecisionmodecodingi == contracttermofferdecisionmodecodinglist.size()-1) {c.addCnctTrmOffrDecisionModeCdgCd("]]]");}


		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferdecisionmodecodingi == 0) {c.addCnctTrmOffrDecisionModeCdgUsrSltd("[[[");}
		if(contracttermofferdecisionmodecoding.hasUserSelected()) {

			c.addCnctTrmOffrDecisionModeCdgUsrSltd(String.valueOf(contracttermofferdecisionmodecoding.getUserSelected()));
		} else {
			c.addCnctTrmOffrDecisionModeCdgUsrSltd("NULL");
		}

		if(contracttermofferdecisionmodecodingi == contracttermofferdecisionmodecodinglist.size()-1) {c.addCnctTrmOffrDecisionModeCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Sys ********************************************************************************/
		if(contracttermofferdecisionmodecodingi == 0) {c.addCnctTrmOffrDecisionModeCdgSys("[[[");}
		if(contracttermofferdecisionmodecoding.hasSystem()) {

			c.addCnctTrmOffrDecisionModeCdgSys(String.valueOf(contracttermofferdecisionmodecoding.getSystem()));
		} else {
			c.addCnctTrmOffrDecisionModeCdgSys("NULL");
		}

		if(contracttermofferdecisionmodecodingi == contracttermofferdecisionmodecodinglist.size()-1) {c.addCnctTrmOffrDecisionModeCdgSys("]]]");}


		 };
		 };
		/******************** contracttermofferdecision ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferdecision = contracttermoffer.getDecision();

		/******************** Cnct_Trm_Offr_Decision_Txt ********************************************************************************/
		if(contracttermofferdecision.hasText()) {

			c.addCnctTrmOffrDecisionTxt(String.valueOf(contracttermofferdecision.getText()));
		} else {
			c.addCnctTrmOffrDecisionTxt("NULL");
		}


		/******************** contracttermofferdecisioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermofferdecisioncodinglist = contracttermofferdecision.getCoding();
		for(int contracttermofferdecisioncodingi = 0; contracttermofferdecisioncodingi<contracttermofferdecisioncodinglist.size();contracttermofferdecisioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermofferdecisioncoding = contracttermofferdecisioncodinglist.get(contracttermofferdecisioncodingi);

		/******************** Cnct_Trm_Offr_Decision_Cdg_Dsply ********************************************************************************/
		if(contracttermofferdecisioncodingi == 0) {c.addCnctTrmOffrDecisionCdgDsply("[[");}
		if(contracttermofferdecisioncoding.hasDisplay()) {

			c.addCnctTrmOffrDecisionCdgDsply(String.valueOf(contracttermofferdecisioncoding.getDisplay()));
		} else {
			c.addCnctTrmOffrDecisionCdgDsply("NULL");
		}

		if(contracttermofferdecisioncodingi == contracttermofferdecisioncodinglist.size()-1) {c.addCnctTrmOffrDecisionCdgDsply("]]");}


		/******************** Cnct_Trm_Offr_Decision_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferdecisioncodingi == 0) {c.addCnctTrmOffrDecisionCdgVrsn("[[");}
		if(contracttermofferdecisioncoding.hasVersion()) {

			c.addCnctTrmOffrDecisionCdgVrsn(String.valueOf(contracttermofferdecisioncoding.getVersion()));
		} else {
			c.addCnctTrmOffrDecisionCdgVrsn("NULL");
		}

		if(contracttermofferdecisioncodingi == contracttermofferdecisioncodinglist.size()-1) {c.addCnctTrmOffrDecisionCdgVrsn("]]");}


		/******************** Cnct_Trm_Offr_Decision_Cdg_Cd ********************************************************************************/
		if(contracttermofferdecisioncodingi == 0) {c.addCnctTrmOffrDecisionCdgCd("[[");}
		if(contracttermofferdecisioncoding.hasCode()) {

			c.addCnctTrmOffrDecisionCdgCd(String.valueOf(contracttermofferdecisioncoding.getCode()));
		} else {
			c.addCnctTrmOffrDecisionCdgCd("NULL");
		}

		if(contracttermofferdecisioncodingi == contracttermofferdecisioncodinglist.size()-1) {c.addCnctTrmOffrDecisionCdgCd("]]");}


		/******************** Cnct_Trm_Offr_Decision_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferdecisioncodingi == 0) {c.addCnctTrmOffrDecisionCdgUsrSltd("[[");}
		if(contracttermofferdecisioncoding.hasUserSelected()) {

			c.addCnctTrmOffrDecisionCdgUsrSltd(String.valueOf(contracttermofferdecisioncoding.getUserSelected()));
		} else {
			c.addCnctTrmOffrDecisionCdgUsrSltd("NULL");
		}

		if(contracttermofferdecisioncodingi == contracttermofferdecisioncodinglist.size()-1) {c.addCnctTrmOffrDecisionCdgUsrSltd("]]");}


		/******************** Cnct_Trm_Offr_Decision_Cdg_Sys ********************************************************************************/
		if(contracttermofferdecisioncodingi == 0) {c.addCnctTrmOffrDecisionCdgSys("[[");}
		if(contracttermofferdecisioncoding.hasSystem()) {

			c.addCnctTrmOffrDecisionCdgSys(String.valueOf(contracttermofferdecisioncoding.getSystem()));
		} else {
			c.addCnctTrmOffrDecisionCdgSys("NULL");
		}

		if(contracttermofferdecisioncodingi == contracttermofferdecisioncodinglist.size()-1) {c.addCnctTrmOffrDecisionCdgSys("]]");}


		 };
		/******************** contracttermofferanswer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.AnswerComponent> contracttermofferanswerlist = contracttermoffer.getAnswer();
		for(int contracttermofferansweri = 0; contracttermofferansweri<contracttermofferanswerlist.size();contracttermofferansweri++ ) {
		org.hl7.fhir.r4.model.Contract.AnswerComponent  contracttermofferanswer = contracttermofferanswerlist.get(contracttermofferansweri);

		/******************** Cnct_Trm_Offr_Ans_VlDecimalTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlDecimalTyp("[[");}
		if(contracttermofferanswer.hasValueDecimalType()) {

			c.addCnctTrmOffrAnsVlDecimalTyp("\""+contracttermofferanswer.getValueDecimalType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlDecimalTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlDecimalTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlDtTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlDtTyp("[[");}
		if(contracttermofferanswer.hasValueDateType()) {

			c.addCnctTrmOffrAnsVlDtTyp("\""+contracttermofferanswer.getValueDateType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlDtTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlDtTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlUriTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlUriTyp("[[");}
		if(contracttermofferanswer.hasValueUriType()) {

			c.addCnctTrmOffrAnsVlUriTyp("\""+contracttermofferanswer.getValueUriType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlUriTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlUriTyp("]]");}


		/******************** contracttermofferanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contracttermofferanswervalueattachment = contracttermofferanswer.getValueAttachment();

		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntSz("[[");}
		if(contracttermofferanswervalueattachment.hasSize()) {

			c.addCnctTrmOffrAnsVlAttchmntSz(String.valueOf(contracttermofferanswervalueattachment.getSize()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntSz("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntSz("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntLnguage("[[");}
		if(contracttermofferanswervalueattachment.hasLanguage()) {

			c.addCnctTrmOffrAnsVlAttchmntLnguage(String.valueOf(contracttermofferanswervalueattachment.getLanguage()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntLnguage("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntLnguage("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntCntntTyp("[[");}
		if(contracttermofferanswervalueattachment.hasContentType()) {

			c.addCnctTrmOffrAnsVlAttchmntCntntTyp(String.valueOf(contracttermofferanswervalueattachment.getContentType()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntCntntTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntCntntTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntHash("[[");}
		if(contracttermofferanswervalueattachment.hasHash()) {

			c.addCnctTrmOffrAnsVlAttchmntHash(new String(contracttermofferanswervalueattachment.getHash()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntHash("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntHash("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Data ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntData("[[");}
		if(contracttermofferanswervalueattachment.hasData()) {

			c.addCnctTrmOffrAnsVlAttchmntData(new String(contracttermofferanswervalueattachment.getData()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntData("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntData("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntCreation("[[");}
		if(contracttermofferanswervalueattachment.hasCreation()) {

			c.addCnctTrmOffrAnsVlAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermofferanswervalueattachment.getCreation())+"\"");
		} else {
			c.addCnctTrmOffrAnsVlAttchmntCreation("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntCreation("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntTtl("[[");}
		if(contracttermofferanswervalueattachment.hasTitle()) {

			c.addCnctTrmOffrAnsVlAttchmntTtl(String.valueOf(contracttermofferanswervalueattachment.getTitle()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntTtl("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntTtl("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Url ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlAttchmntUrl("[[");}
		if(contracttermofferanswervalueattachment.hasUrl()) {

			c.addCnctTrmOffrAnsVlAttchmntUrl(String.valueOf(contracttermofferanswervalueattachment.getUrl()));
		} else {
			c.addCnctTrmOffrAnsVlAttchmntUrl("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlAttchmntUrl("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlRfrnc ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlRfrnc("[[");}
		if(contracttermofferanswer.hasValueReference()) {

			if(contracttermofferanswer.getValueReference().getReference() != null) {
			c.addCnctTrmOffrAnsVlRfrnc(contracttermofferanswer.getValueReference().getReference());
			}
		} else {
			c.addCnctTrmOffrAnsVlRfrnc("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlRfrnc("]]");}


		/******************** contracttermofferanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferanswervaluecoding = contracttermofferanswer.getValueCoding();

		/******************** Cnct_Trm_Offr_Ans_VlCdg_Dsply ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlCdgDsply("[[");}
		if(contracttermofferanswervaluecoding.hasDisplay()) {

			c.addCnctTrmOffrAnsVlCdgDsply(String.valueOf(contracttermofferanswervaluecoding.getDisplay()));
		} else {
			c.addCnctTrmOffrAnsVlCdgDsply("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlCdgDsply("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlCdg_Vrsn ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlCdgVrsn("[[");}
		if(contracttermofferanswervaluecoding.hasVersion()) {

			c.addCnctTrmOffrAnsVlCdgVrsn(String.valueOf(contracttermofferanswervaluecoding.getVersion()));
		} else {
			c.addCnctTrmOffrAnsVlCdgVrsn("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlCdgVrsn("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlCdg_Cd ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlCdgCd("[[");}
		if(contracttermofferanswervaluecoding.hasCode()) {

			c.addCnctTrmOffrAnsVlCdgCd(String.valueOf(contracttermofferanswervaluecoding.getCode()));
		} else {
			c.addCnctTrmOffrAnsVlCdgCd("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlCdgCd("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlCdgUsrSltd("[[");}
		if(contracttermofferanswervaluecoding.hasUserSelected()) {

			c.addCnctTrmOffrAnsVlCdgUsrSltd(String.valueOf(contracttermofferanswervaluecoding.getUserSelected()));
		} else {
			c.addCnctTrmOffrAnsVlCdgUsrSltd("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlCdgUsrSltd("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlCdg_Sys ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlCdgSys("[[");}
		if(contracttermofferanswervaluecoding.hasSystem()) {

			c.addCnctTrmOffrAnsVlCdgSys(String.valueOf(contracttermofferanswervaluecoding.getSystem()));
		} else {
			c.addCnctTrmOffrAnsVlCdgSys("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlCdgSys("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlBooleanTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlBooleanTyp("[[");}
		if(contracttermofferanswer.hasValueBooleanType()) {

			c.addCnctTrmOffrAnsVlBooleanTyp("\""+contracttermofferanswer.getValueBooleanType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlBooleanTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlBooleanTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlDtTimeTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlDtTimeTyp("[[");}
		if(contracttermofferanswer.hasValueDateTimeType()) {

			c.addCnctTrmOffrAnsVlDtTimeTyp("\""+contracttermofferanswer.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlDtTimeTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlDtTimeTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlIntegerTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlIntegerTyp("[[");}
		if(contracttermofferanswer.hasValueIntegerType()) {

			c.addCnctTrmOffrAnsVlIntegerTyp("\""+contracttermofferanswer.getValueIntegerType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlIntegerTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlIntegerTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlTimeTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlTimeTyp("[[");}
		if(contracttermofferanswer.hasValueTimeType()) {

			c.addCnctTrmOffrAnsVlTimeTyp("\""+contracttermofferanswer.getValueTimeType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlTimeTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlTimeTyp("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlStrgTyp ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlStrgTyp("[[");}
		if(contracttermofferanswer.hasValueStringType()) {

			c.addCnctTrmOffrAnsVlStrgTyp("\""+contracttermofferanswer.getValueStringType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmOffrAnsVlStrgTyp("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlStrgTyp("]]");}


		/******************** contracttermofferanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermofferanswervaluequantity = contracttermofferanswer.getValueQuantity();

		/******************** Cnct_Trm_Offr_Ans_VlQnty_Vl ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlQntyVl("[[");}
		if(contracttermofferanswervaluequantity.hasValue()) {

			c.addCnctTrmOffrAnsVlQntyVl(String.valueOf(contracttermofferanswervaluequantity.getValue()));
		} else {
			c.addCnctTrmOffrAnsVlQntyVl("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlQntyVl("]]");}


		/******************** contracttermofferanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermofferanswervaluequantitycomparator = contracttermofferanswervaluequantity.getComparator();
		if(contracttermofferanswervaluequantitycomparator!=null) {
		if(contracttermofferansweri == 0) {

		c.addCnctTrmOffrAnsVlQntyCmprtr("[[");		}
			c.addCnctTrmOffrAnsVlQntyCmprtr(contracttermofferanswervaluequantitycomparator.toCode());
		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {

		c.addCnctTrmOffrAnsVlQntyCmprtr("]]");		}

		} else {
			c.addCnctTrmOffrAnsVlQntyCmprtr("NULL");
		}

		/******************** Cnct_Trm_Offr_Ans_VlQnty_Cd ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlQntyCd("[[");}
		if(contracttermofferanswervaluequantity.hasCode()) {

			c.addCnctTrmOffrAnsVlQntyCd(String.valueOf(contracttermofferanswervaluequantity.getCode()));
		} else {
			c.addCnctTrmOffrAnsVlQntyCd("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlQntyCd("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlQnty_Unt ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlQntyUnt("[[");}
		if(contracttermofferanswervaluequantity.hasUnit()) {

			c.addCnctTrmOffrAnsVlQntyUnt(String.valueOf(contracttermofferanswervaluequantity.getUnit()));
		} else {
			c.addCnctTrmOffrAnsVlQntyUnt("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlQntyUnt("]]");}


		/******************** Cnct_Trm_Offr_Ans_VlQnty_Sys ********************************************************************************/
		if(contracttermofferansweri == 0) {c.addCnctTrmOffrAnsVlQntySys("[[");}
		if(contracttermofferanswervaluequantity.hasSystem()) {

			c.addCnctTrmOffrAnsVlQntySys(String.valueOf(contracttermofferanswervaluequantity.getSystem()));
		} else {
			c.addCnctTrmOffrAnsVlQntySys("NULL");
		}

		if(contracttermofferansweri == contracttermofferanswerlist.size()-1) {c.addCnctTrmOffrAnsVlQntySys("]]");}


		 };
		/******************** Cnct_Trm_Offr_Txt ********************************************************************************/
		if(contracttermoffer.hasText()) {

			c.addCnctTrmOffrTxt(String.valueOf(contracttermoffer.getText()));
		} else {
			c.addCnctTrmOffrTxt("NULL");
		}


		/******************** Cnct_Trm_Offr_Topic ********************************************************************************/
		if(contracttermoffer.hasTopic()) {

			if(contracttermoffer.getTopic().getReference() != null) {
			c.addCnctTrmOffrTopic(contracttermoffer.getTopic().getReference());
			}
		} else {
			c.addCnctTrmOffrTopic("NULL");
		}


		/******************** contracttermofferparty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.ContractPartyComponent> contracttermofferpartylist = contracttermoffer.getParty();
		for(int contracttermofferpartyi = 0; contracttermofferpartyi<contracttermofferpartylist.size();contracttermofferpartyi++ ) {
		org.hl7.fhir.r4.model.Contract.ContractPartyComponent  contracttermofferparty = contracttermofferpartylist.get(contracttermofferpartyi);

		/******************** Cnct_Trm_Offr_Party_Rfrnc ********************************************************************************/
		if(contracttermofferpartyi == 0) {c.addCnctTrmOffrPartyRfrnc("[[");}
		if(contracttermofferparty.hasReference()) {

			String  array = "[";
			for(int incr=0; incr<contracttermofferparty.getReference().size(); incr++) {
				array = array + contracttermofferparty.getReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmOffrPartyRfrnc(array);

		} else {
			c.addCnctTrmOffrPartyRfrnc("NULL");
		}

		if(contracttermofferpartyi == contracttermofferpartylist.size()-1) {c.addCnctTrmOffrPartyRfrnc("]]");}


		/******************** contracttermofferpartyrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferpartyrole = contracttermofferparty.getRole();

		/******************** Cnct_Trm_Offr_Party_Role_Txt ********************************************************************************/
		if(contracttermofferpartyi == 0) {c.addCnctTrmOffrPartyRoleTxt("[[");}
		if(contracttermofferpartyrole.hasText()) {

			c.addCnctTrmOffrPartyRoleTxt(String.valueOf(contracttermofferpartyrole.getText()));
		} else {
			c.addCnctTrmOffrPartyRoleTxt("NULL");
		}

		if(contracttermofferpartyi == contracttermofferpartylist.size()-1) {c.addCnctTrmOffrPartyRoleTxt("]]");}


		/******************** contracttermofferpartyrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermofferpartyrolecodinglist = contracttermofferpartyrole.getCoding();
		for(int contracttermofferpartyrolecodingi = 0; contracttermofferpartyrolecodingi<contracttermofferpartyrolecodinglist.size();contracttermofferpartyrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermofferpartyrolecoding = contracttermofferpartyrolecodinglist.get(contracttermofferpartyrolecodingi);

		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Dsply ********************************************************************************/
		if(contracttermofferpartyrolecodingi == 0) {c.addCnctTrmOffrPartyRoleCdgDsply("[[[");}
		if(contracttermofferpartyrolecoding.hasDisplay()) {

			c.addCnctTrmOffrPartyRoleCdgDsply(String.valueOf(contracttermofferpartyrolecoding.getDisplay()));
		} else {
			c.addCnctTrmOffrPartyRoleCdgDsply("NULL");
		}

		if(contracttermofferpartyrolecodingi == contracttermofferpartyrolecodinglist.size()-1) {c.addCnctTrmOffrPartyRoleCdgDsply("]]]");}


		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferpartyrolecodingi == 0) {c.addCnctTrmOffrPartyRoleCdgVrsn("[[[");}
		if(contracttermofferpartyrolecoding.hasVersion()) {

			c.addCnctTrmOffrPartyRoleCdgVrsn(String.valueOf(contracttermofferpartyrolecoding.getVersion()));
		} else {
			c.addCnctTrmOffrPartyRoleCdgVrsn("NULL");
		}

		if(contracttermofferpartyrolecodingi == contracttermofferpartyrolecodinglist.size()-1) {c.addCnctTrmOffrPartyRoleCdgVrsn("]]]");}


		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Cd ********************************************************************************/
		if(contracttermofferpartyrolecodingi == 0) {c.addCnctTrmOffrPartyRoleCdgCd("[[[");}
		if(contracttermofferpartyrolecoding.hasCode()) {

			c.addCnctTrmOffrPartyRoleCdgCd(String.valueOf(contracttermofferpartyrolecoding.getCode()));
		} else {
			c.addCnctTrmOffrPartyRoleCdgCd("NULL");
		}

		if(contracttermofferpartyrolecodingi == contracttermofferpartyrolecodinglist.size()-1) {c.addCnctTrmOffrPartyRoleCdgCd("]]]");}


		/******************** Cnct_Trm_Offr_Party_Role_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferpartyrolecodingi == 0) {c.addCnctTrmOffrPartyRoleCdgUsrSltd("[[[");}
		if(contracttermofferpartyrolecoding.hasUserSelected()) {

			c.addCnctTrmOffrPartyRoleCdgUsrSltd(String.valueOf(contracttermofferpartyrolecoding.getUserSelected()));
		} else {
			c.addCnctTrmOffrPartyRoleCdgUsrSltd("NULL");
		}

		if(contracttermofferpartyrolecodingi == contracttermofferpartyrolecodinglist.size()-1) {c.addCnctTrmOffrPartyRoleCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Sys ********************************************************************************/
		if(contracttermofferpartyrolecodingi == 0) {c.addCnctTrmOffrPartyRoleCdgSys("[[[");}
		if(contracttermofferpartyrolecoding.hasSystem()) {

			c.addCnctTrmOffrPartyRoleCdgSys(String.valueOf(contracttermofferpartyrolecoding.getSystem()));
		} else {
			c.addCnctTrmOffrPartyRoleCdgSys("NULL");
		}

		if(contracttermofferpartyrolecodingi == contracttermofferpartyrolecodinglist.size()-1) {c.addCnctTrmOffrPartyRoleCdgSys("]]]");}


		 };
		 };
		/******************** contracttermas ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.ContractAssetComponent> contracttermaslist = contractterm.getAsset();
		for(int contracttermasi = 0; contracttermasi<contracttermaslist.size();contracttermasi++ ) {
		org.hl7.fhir.r4.model.Contract.ContractAssetComponent  contracttermas = contracttermaslist.get(contracttermasi);

		/******************** contracttermascontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.AssetContextComponent> contracttermascontextlist = contracttermas.getContext();
		for(int contracttermascontexti = 0; contracttermascontexti<contracttermascontextlist.size();contracttermascontexti++ ) {
		org.hl7.fhir.r4.model.Contract.AssetContextComponent  contracttermascontext = contracttermascontextlist.get(contracttermascontexti);

		/******************** Cnct_Trm_As_Cntxt_Rfrnc ********************************************************************************/
		if(contracttermascontexti == 0) {c.addCnctTrmAsCntxtRfrnc("[[[");}
		if(contracttermascontext.hasReference()) {

			if(contracttermascontext.getReference().getReference() != null) {
			c.addCnctTrmAsCntxtRfrnc(contracttermascontext.getReference().getReference());
			}
		} else {
			c.addCnctTrmAsCntxtRfrnc("NULL");
		}

		if(contracttermascontexti == contracttermascontextlist.size()-1) {c.addCnctTrmAsCntxtRfrnc("]]]");}


		/******************** contracttermascontextcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermascontextcodelist = contracttermascontext.getCode();
		for(int contracttermascontextcodei = 0; contracttermascontextcodei<contracttermascontextcodelist.size();contracttermascontextcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermascontextcode = contracttermascontextcodelist.get(contracttermascontextcodei);

		/******************** Cnct_Trm_As_Cntxt_Cd_Txt ********************************************************************************/
		if(contracttermascontextcodei == 0) {c.addCnctTrmAsCntxtCdTxt("[[[[");}
		if(contracttermascontextcode.hasText()) {

			c.addCnctTrmAsCntxtCdTxt(String.valueOf(contracttermascontextcode.getText()));
		} else {
			c.addCnctTrmAsCntxtCdTxt("NULL");
		}

		if(contracttermascontextcodei == contracttermascontextcodelist.size()-1) {c.addCnctTrmAsCntxtCdTxt("]]]]");}


		/******************** contracttermascontextcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermascontextcodecodinglist = contracttermascontextcode.getCoding();
		for(int contracttermascontextcodecodingi = 0; contracttermascontextcodecodingi<contracttermascontextcodecodinglist.size();contracttermascontextcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermascontextcodecoding = contracttermascontextcodecodinglist.get(contracttermascontextcodecodingi);

		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Dsply ********************************************************************************/
		if(contracttermascontextcodecodingi == 0) {c.addCnctTrmAsCntxtCdCdgDsply("[[[[[");}
		if(contracttermascontextcodecoding.hasDisplay()) {

			c.addCnctTrmAsCntxtCdCdgDsply(String.valueOf(contracttermascontextcodecoding.getDisplay()));
		} else {
			c.addCnctTrmAsCntxtCdCdgDsply("NULL");
		}

		if(contracttermascontextcodecodingi == contracttermascontextcodecodinglist.size()-1) {c.addCnctTrmAsCntxtCdCdgDsply("]]]]]");}


		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Vrsn ********************************************************************************/
		if(contracttermascontextcodecodingi == 0) {c.addCnctTrmAsCntxtCdCdgVrsn("[[[[[");}
		if(contracttermascontextcodecoding.hasVersion()) {

			c.addCnctTrmAsCntxtCdCdgVrsn(String.valueOf(contracttermascontextcodecoding.getVersion()));
		} else {
			c.addCnctTrmAsCntxtCdCdgVrsn("NULL");
		}

		if(contracttermascontextcodecodingi == contracttermascontextcodecodinglist.size()-1) {c.addCnctTrmAsCntxtCdCdgVrsn("]]]]]");}


		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Cd ********************************************************************************/
		if(contracttermascontextcodecodingi == 0) {c.addCnctTrmAsCntxtCdCdgCd("[[[[[");}
		if(contracttermascontextcodecoding.hasCode()) {

			c.addCnctTrmAsCntxtCdCdgCd(String.valueOf(contracttermascontextcodecoding.getCode()));
		} else {
			c.addCnctTrmAsCntxtCdCdgCd("NULL");
		}

		if(contracttermascontextcodecodingi == contracttermascontextcodecodinglist.size()-1) {c.addCnctTrmAsCntxtCdCdgCd("]]]]]");}


		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(contracttermascontextcodecodingi == 0) {c.addCnctTrmAsCntxtCdCdgUsrSltd("[[[[[");}
		if(contracttermascontextcodecoding.hasUserSelected()) {

			c.addCnctTrmAsCntxtCdCdgUsrSltd(String.valueOf(contracttermascontextcodecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsCntxtCdCdgUsrSltd("NULL");
		}

		if(contracttermascontextcodecodingi == contracttermascontextcodecodinglist.size()-1) {c.addCnctTrmAsCntxtCdCdgUsrSltd("]]]]]");}


		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Sys ********************************************************************************/
		if(contracttermascontextcodecodingi == 0) {c.addCnctTrmAsCntxtCdCdgSys("[[[[[");}
		if(contracttermascontextcodecoding.hasSystem()) {

			c.addCnctTrmAsCntxtCdCdgSys(String.valueOf(contracttermascontextcodecoding.getSystem()));
		} else {
			c.addCnctTrmAsCntxtCdCdgSys("NULL");
		}

		if(contracttermascontextcodecodingi == contracttermascontextcodecodinglist.size()-1) {c.addCnctTrmAsCntxtCdCdgSys("]]]]]");}


		 };
		 };
		/******************** Cnct_Trm_As_Cntxt_Txt ********************************************************************************/
		if(contracttermascontext.hasText()) {

			c.addCnctTrmAsCntxtTxt(String.valueOf(contracttermascontext.getText()));
		} else {
			c.addCnctTrmAsCntxtTxt("NULL");
		}


		 };
		/******************** contracttermastype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermastypelist = contracttermas.getType();
		for(int contracttermastypei = 0; contracttermastypei<contracttermastypelist.size();contracttermastypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermastype = contracttermastypelist.get(contracttermastypei);

		/******************** Cnct_Trm_As_Typ_Txt ********************************************************************************/
		if(contracttermastypei == 0) {c.addCnctTrmAsTypTxt("[[[");}
		if(contracttermastype.hasText()) {

			c.addCnctTrmAsTypTxt(String.valueOf(contracttermastype.getText()));
		} else {
			c.addCnctTrmAsTypTxt("NULL");
		}

		if(contracttermastypei == contracttermastypelist.size()-1) {c.addCnctTrmAsTypTxt("]]]");}


		/******************** contracttermastypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermastypecodinglist = contracttermastype.getCoding();
		for(int contracttermastypecodingi = 0; contracttermastypecodingi<contracttermastypecodinglist.size();contracttermastypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermastypecoding = contracttermastypecodinglist.get(contracttermastypecodingi);

		/******************** Cnct_Trm_As_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermastypecodingi == 0) {c.addCnctTrmAsTypCdgDsply("[[[[");}
		if(contracttermastypecoding.hasDisplay()) {

			c.addCnctTrmAsTypCdgDsply(String.valueOf(contracttermastypecoding.getDisplay()));
		} else {
			c.addCnctTrmAsTypCdgDsply("NULL");
		}

		if(contracttermastypecodingi == contracttermastypecodinglist.size()-1) {c.addCnctTrmAsTypCdgDsply("]]]]");}


		/******************** Cnct_Trm_As_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermastypecodingi == 0) {c.addCnctTrmAsTypCdgVrsn("[[[[");}
		if(contracttermastypecoding.hasVersion()) {

			c.addCnctTrmAsTypCdgVrsn(String.valueOf(contracttermastypecoding.getVersion()));
		} else {
			c.addCnctTrmAsTypCdgVrsn("NULL");
		}

		if(contracttermastypecodingi == contracttermastypecodinglist.size()-1) {c.addCnctTrmAsTypCdgVrsn("]]]]");}


		/******************** Cnct_Trm_As_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermastypecodingi == 0) {c.addCnctTrmAsTypCdgCd("[[[[");}
		if(contracttermastypecoding.hasCode()) {

			c.addCnctTrmAsTypCdgCd(String.valueOf(contracttermastypecoding.getCode()));
		} else {
			c.addCnctTrmAsTypCdgCd("NULL");
		}

		if(contracttermastypecodingi == contracttermastypecodinglist.size()-1) {c.addCnctTrmAsTypCdgCd("]]]]");}


		/******************** Cnct_Trm_As_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermastypecodingi == 0) {c.addCnctTrmAsTypCdgUsrSltd("[[[[");}
		if(contracttermastypecoding.hasUserSelected()) {

			c.addCnctTrmAsTypCdgUsrSltd(String.valueOf(contracttermastypecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsTypCdgUsrSltd("NULL");
		}

		if(contracttermastypecodingi == contracttermastypecodinglist.size()-1) {c.addCnctTrmAsTypCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_As_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermastypecodingi == 0) {c.addCnctTrmAsTypCdgSys("[[[[");}
		if(contracttermastypecoding.hasSystem()) {

			c.addCnctTrmAsTypCdgSys(String.valueOf(contracttermastypecoding.getSystem()));
		} else {
			c.addCnctTrmAsTypCdgSys("NULL");
		}

		if(contracttermastypecodingi == contracttermastypecodinglist.size()-1) {c.addCnctTrmAsTypCdgSys("]]]]");}


		 };
		 };
		/******************** contracttermasperiod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Period> contracttermasperiodlist = contracttermas.getPeriod();
		for(int contracttermasperiodi = 0; contracttermasperiodi<contracttermasperiodlist.size();contracttermasperiodi++ ) {
		org.hl7.fhir.r4.model.Period  contracttermasperiod = contracttermasperiodlist.get(contracttermasperiodi);

		/******************** Cnct_Trm_As_Prd_Strt ********************************************************************************/
		if(contracttermasperiodi == 0) {c.addCnctTrmAsPrdStrt("[[[");}
		if(contracttermasperiod.hasStart()) {

			c.addCnctTrmAsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasperiod.getStart())+"\"");
		} else {
			c.addCnctTrmAsPrdStrt("NULL");
		}

		if(contracttermasperiodi == contracttermasperiodlist.size()-1) {c.addCnctTrmAsPrdStrt("]]]");}


		/******************** Cnct_Trm_As_Prd_End ********************************************************************************/
		if(contracttermasperiodi == 0) {c.addCnctTrmAsPrdEnd("[[[");}
		if(contracttermasperiod.hasEnd()) {

			c.addCnctTrmAsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmAsPrdEnd("NULL");
		}

		if(contracttermasperiodi == contracttermasperiodlist.size()-1) {c.addCnctTrmAsPrdEnd("]]]");}


		 };
		/******************** contracttermasscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasscope = contracttermas.getScope();

		/******************** Cnct_Trm_As_Scope_Txt ********************************************************************************/
		if(contracttermasscope.hasText()) {

			c.addCnctTrmAsScopeTxt(String.valueOf(contracttermasscope.getText()));
		} else {
			c.addCnctTrmAsScopeTxt("NULL");
		}


		/******************** contracttermasscopecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermasscopecodinglist = contracttermasscope.getCoding();
		for(int contracttermasscopecodingi = 0; contracttermasscopecodingi<contracttermasscopecodinglist.size();contracttermasscopecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermasscopecoding = contracttermasscopecodinglist.get(contracttermasscopecodingi);

		/******************** Cnct_Trm_As_Scope_Cdg_Dsply ********************************************************************************/
		if(contracttermasscopecodingi == 0) {c.addCnctTrmAsScopeCdgDsply("[[[");}
		if(contracttermasscopecoding.hasDisplay()) {

			c.addCnctTrmAsScopeCdgDsply(String.valueOf(contracttermasscopecoding.getDisplay()));
		} else {
			c.addCnctTrmAsScopeCdgDsply("NULL");
		}

		if(contracttermasscopecodingi == contracttermasscopecodinglist.size()-1) {c.addCnctTrmAsScopeCdgDsply("]]]");}


		/******************** Cnct_Trm_As_Scope_Cdg_Vrsn ********************************************************************************/
		if(contracttermasscopecodingi == 0) {c.addCnctTrmAsScopeCdgVrsn("[[[");}
		if(contracttermasscopecoding.hasVersion()) {

			c.addCnctTrmAsScopeCdgVrsn(String.valueOf(contracttermasscopecoding.getVersion()));
		} else {
			c.addCnctTrmAsScopeCdgVrsn("NULL");
		}

		if(contracttermasscopecodingi == contracttermasscopecodinglist.size()-1) {c.addCnctTrmAsScopeCdgVrsn("]]]");}


		/******************** Cnct_Trm_As_Scope_Cdg_Cd ********************************************************************************/
		if(contracttermasscopecodingi == 0) {c.addCnctTrmAsScopeCdgCd("[[[");}
		if(contracttermasscopecoding.hasCode()) {

			c.addCnctTrmAsScopeCdgCd(String.valueOf(contracttermasscopecoding.getCode()));
		} else {
			c.addCnctTrmAsScopeCdgCd("NULL");
		}

		if(contracttermasscopecodingi == contracttermasscopecodinglist.size()-1) {c.addCnctTrmAsScopeCdgCd("]]]");}


		/******************** Cnct_Trm_As_Scope_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasscopecodingi == 0) {c.addCnctTrmAsScopeCdgUsrSltd("[[[");}
		if(contracttermasscopecoding.hasUserSelected()) {

			c.addCnctTrmAsScopeCdgUsrSltd(String.valueOf(contracttermasscopecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsScopeCdgUsrSltd("NULL");
		}

		if(contracttermasscopecodingi == contracttermasscopecodinglist.size()-1) {c.addCnctTrmAsScopeCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_As_Scope_Cdg_Sys ********************************************************************************/
		if(contracttermasscopecodingi == 0) {c.addCnctTrmAsScopeCdgSys("[[[");}
		if(contracttermasscopecoding.hasSystem()) {

			c.addCnctTrmAsScopeCdgSys(String.valueOf(contracttermasscopecoding.getSystem()));
		} else {
			c.addCnctTrmAsScopeCdgSys("NULL");
		}

		if(contracttermasscopecodingi == contracttermasscopecodinglist.size()-1) {c.addCnctTrmAsScopeCdgSys("]]]");}


		 };
		/******************** Cnct_Trm_As_SecurityLblNmbr ********************************************************************************/
		if(contracttermas.hasSecurityLabelNumber()) {

			String  array = "[";
			for(int incr=0; incr<contracttermas.getSecurityLabelNumber().size(); incr++) {
				array = array + contracttermas.getSecurityLabelNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmAsSecurityLblNmbr(array);

		} else {
			c.addCnctTrmAsSecurityLblNmbr("NULL");
		}


		/******************** Cnct_Trm_As_Cndtn ********************************************************************************/
		if(contracttermas.hasCondition()) {

			c.addCnctTrmAsCndtn(String.valueOf(contracttermas.getCondition()));
		} else {
			c.addCnctTrmAsCndtn("NULL");
		}


		/******************** contracttermassubtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermassubtypelist = contracttermas.getSubtype();
		for(int contracttermassubtypei = 0; contracttermassubtypei<contracttermassubtypelist.size();contracttermassubtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermassubtype = contracttermassubtypelist.get(contracttermassubtypei);

		/******************** Cnct_Trm_As_Subtype_Txt ********************************************************************************/
		if(contracttermassubtypei == 0) {c.addCnctTrmAsSubtypeTxt("[[[");}
		if(contracttermassubtype.hasText()) {

			c.addCnctTrmAsSubtypeTxt(String.valueOf(contracttermassubtype.getText()));
		} else {
			c.addCnctTrmAsSubtypeTxt("NULL");
		}

		if(contracttermassubtypei == contracttermassubtypelist.size()-1) {c.addCnctTrmAsSubtypeTxt("]]]");}


		/******************** contracttermassubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermassubtypecodinglist = contracttermassubtype.getCoding();
		for(int contracttermassubtypecodingi = 0; contracttermassubtypecodingi<contracttermassubtypecodinglist.size();contracttermassubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermassubtypecoding = contracttermassubtypecodinglist.get(contracttermassubtypecodingi);

		/******************** Cnct_Trm_As_Subtype_Cdg_Dsply ********************************************************************************/
		if(contracttermassubtypecodingi == 0) {c.addCnctTrmAsSubtypeCdgDsply("[[[[");}
		if(contracttermassubtypecoding.hasDisplay()) {

			c.addCnctTrmAsSubtypeCdgDsply(String.valueOf(contracttermassubtypecoding.getDisplay()));
		} else {
			c.addCnctTrmAsSubtypeCdgDsply("NULL");
		}

		if(contracttermassubtypecodingi == contracttermassubtypecodinglist.size()-1) {c.addCnctTrmAsSubtypeCdgDsply("]]]]");}


		/******************** Cnct_Trm_As_Subtype_Cdg_Vrsn ********************************************************************************/
		if(contracttermassubtypecodingi == 0) {c.addCnctTrmAsSubtypeCdgVrsn("[[[[");}
		if(contracttermassubtypecoding.hasVersion()) {

			c.addCnctTrmAsSubtypeCdgVrsn(String.valueOf(contracttermassubtypecoding.getVersion()));
		} else {
			c.addCnctTrmAsSubtypeCdgVrsn("NULL");
		}

		if(contracttermassubtypecodingi == contracttermassubtypecodinglist.size()-1) {c.addCnctTrmAsSubtypeCdgVrsn("]]]]");}


		/******************** Cnct_Trm_As_Subtype_Cdg_Cd ********************************************************************************/
		if(contracttermassubtypecodingi == 0) {c.addCnctTrmAsSubtypeCdgCd("[[[[");}
		if(contracttermassubtypecoding.hasCode()) {

			c.addCnctTrmAsSubtypeCdgCd(String.valueOf(contracttermassubtypecoding.getCode()));
		} else {
			c.addCnctTrmAsSubtypeCdgCd("NULL");
		}

		if(contracttermassubtypecodingi == contracttermassubtypecodinglist.size()-1) {c.addCnctTrmAsSubtypeCdgCd("]]]]");}


		/******************** Cnct_Trm_As_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(contracttermassubtypecodingi == 0) {c.addCnctTrmAsSubtypeCdgUsrSltd("[[[[");}
		if(contracttermassubtypecoding.hasUserSelected()) {

			c.addCnctTrmAsSubtypeCdgUsrSltd(String.valueOf(contracttermassubtypecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsSubtypeCdgUsrSltd("NULL");
		}

		if(contracttermassubtypecodingi == contracttermassubtypecodinglist.size()-1) {c.addCnctTrmAsSubtypeCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_As_Subtype_Cdg_Sys ********************************************************************************/
		if(contracttermassubtypecodingi == 0) {c.addCnctTrmAsSubtypeCdgSys("[[[[");}
		if(contracttermassubtypecoding.hasSystem()) {

			c.addCnctTrmAsSubtypeCdgSys(String.valueOf(contracttermassubtypecoding.getSystem()));
		} else {
			c.addCnctTrmAsSubtypeCdgSys("NULL");
		}

		if(contracttermassubtypecodingi == contracttermassubtypecodinglist.size()-1) {c.addCnctTrmAsSubtypeCdgSys("]]]]");}


		 };
		 };
		/******************** contracttermasrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasrelationship = contracttermas.getRelationship();

		/******************** Cnct_Trm_As_Rltnship_Dsply ********************************************************************************/
		if(contracttermasrelationship.hasDisplay()) {

			c.addCnctTrmAsRltnshipDsply(String.valueOf(contracttermasrelationship.getDisplay()));
		} else {
			c.addCnctTrmAsRltnshipDsply("NULL");
		}


		/******************** Cnct_Trm_As_Rltnship_Vrsn ********************************************************************************/
		if(contracttermasrelationship.hasVersion()) {

			c.addCnctTrmAsRltnshipVrsn(String.valueOf(contracttermasrelationship.getVersion()));
		} else {
			c.addCnctTrmAsRltnshipVrsn("NULL");
		}


		/******************** Cnct_Trm_As_Rltnship_Cd ********************************************************************************/
		if(contracttermasrelationship.hasCode()) {

			c.addCnctTrmAsRltnshipCd(String.valueOf(contracttermasrelationship.getCode()));
		} else {
			c.addCnctTrmAsRltnshipCd("NULL");
		}


		/******************** Cnct_Trm_As_Rltnship_UsrSltd ********************************************************************************/
		if(contracttermasrelationship.hasUserSelected()) {

			c.addCnctTrmAsRltnshipUsrSltd(String.valueOf(contracttermasrelationship.getUserSelected()));
		} else {
			c.addCnctTrmAsRltnshipUsrSltd("NULL");
		}


		/******************** Cnct_Trm_As_Rltnship_Sys ********************************************************************************/
		if(contracttermasrelationship.hasSystem()) {

			c.addCnctTrmAsRltnshipSys(String.valueOf(contracttermasrelationship.getSystem()));
		} else {
			c.addCnctTrmAsRltnshipSys("NULL");
		}


		/******************** Cnct_Trm_As_LinkId ********************************************************************************/
		if(contracttermas.hasLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermas.getLinkId().size(); incr++) {
				array = array + contracttermas.getLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmAsLinkId(array);

		} else {
			c.addCnctTrmAsLinkId("NULL");
		}


		/******************** contracttermasanswer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.AnswerComponent> contracttermasanswerlist = contracttermas.getAnswer();
		for(int contracttermasansweri = 0; contracttermasansweri<contracttermasanswerlist.size();contracttermasansweri++ ) {
		org.hl7.fhir.r4.model.Contract.AnswerComponent  contracttermasanswer = contracttermasanswerlist.get(contracttermasansweri);

		/******************** Cnct_Trm_As_Ans_VlDecimalTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlDecimalTyp("[[[");}
		if(contracttermasanswer.hasValueDecimalType()) {

			c.addCnctTrmAsAnsVlDecimalTyp("\""+contracttermasanswer.getValueDecimalType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlDecimalTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlDecimalTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlDtTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlDtTyp("[[[");}
		if(contracttermasanswer.hasValueDateType()) {

			c.addCnctTrmAsAnsVlDtTyp("\""+contracttermasanswer.getValueDateType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlDtTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlDtTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlUriTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlUriTyp("[[[");}
		if(contracttermasanswer.hasValueUriType()) {

			c.addCnctTrmAsAnsVlUriTyp("\""+contracttermasanswer.getValueUriType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlUriTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlUriTyp("]]]");}


		/******************** contracttermasanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contracttermasanswervalueattachment = contracttermasanswer.getValueAttachment();

		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntSz("[[[");}
		if(contracttermasanswervalueattachment.hasSize()) {

			c.addCnctTrmAsAnsVlAttchmntSz(String.valueOf(contracttermasanswervalueattachment.getSize()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntSz("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntSz("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntLnguage("[[[");}
		if(contracttermasanswervalueattachment.hasLanguage()) {

			c.addCnctTrmAsAnsVlAttchmntLnguage(String.valueOf(contracttermasanswervalueattachment.getLanguage()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntLnguage("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntLnguage("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntCntntTyp("[[[");}
		if(contracttermasanswervalueattachment.hasContentType()) {

			c.addCnctTrmAsAnsVlAttchmntCntntTyp(String.valueOf(contracttermasanswervalueattachment.getContentType()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntCntntTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntCntntTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntHash("[[[");}
		if(contracttermasanswervalueattachment.hasHash()) {

			c.addCnctTrmAsAnsVlAttchmntHash(new String(contracttermasanswervalueattachment.getHash()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntHash("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntHash("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Data ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntData("[[[");}
		if(contracttermasanswervalueattachment.hasData()) {

			c.addCnctTrmAsAnsVlAttchmntData(new String(contracttermasanswervalueattachment.getData()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntData("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntData("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntCreation("[[[");}
		if(contracttermasanswervalueattachment.hasCreation()) {

			c.addCnctTrmAsAnsVlAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasanswervalueattachment.getCreation())+"\"");
		} else {
			c.addCnctTrmAsAnsVlAttchmntCreation("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntCreation("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntTtl("[[[");}
		if(contracttermasanswervalueattachment.hasTitle()) {

			c.addCnctTrmAsAnsVlAttchmntTtl(String.valueOf(contracttermasanswervalueattachment.getTitle()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntTtl("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntTtl("]]]");}


		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Url ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlAttchmntUrl("[[[");}
		if(contracttermasanswervalueattachment.hasUrl()) {

			c.addCnctTrmAsAnsVlAttchmntUrl(String.valueOf(contracttermasanswervalueattachment.getUrl()));
		} else {
			c.addCnctTrmAsAnsVlAttchmntUrl("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlAttchmntUrl("]]]");}


		/******************** Cnct_Trm_As_Ans_VlRfrnc ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlRfrnc("[[[");}
		if(contracttermasanswer.hasValueReference()) {

			if(contracttermasanswer.getValueReference().getReference() != null) {
			c.addCnctTrmAsAnsVlRfrnc(contracttermasanswer.getValueReference().getReference());
			}
		} else {
			c.addCnctTrmAsAnsVlRfrnc("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlRfrnc("]]]");}


		/******************** contracttermasanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasanswervaluecoding = contracttermasanswer.getValueCoding();

		/******************** Cnct_Trm_As_Ans_VlCdg_Dsply ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlCdgDsply("[[[");}
		if(contracttermasanswervaluecoding.hasDisplay()) {

			c.addCnctTrmAsAnsVlCdgDsply(String.valueOf(contracttermasanswervaluecoding.getDisplay()));
		} else {
			c.addCnctTrmAsAnsVlCdgDsply("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlCdgDsply("]]]");}


		/******************** Cnct_Trm_As_Ans_VlCdg_Vrsn ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlCdgVrsn("[[[");}
		if(contracttermasanswervaluecoding.hasVersion()) {

			c.addCnctTrmAsAnsVlCdgVrsn(String.valueOf(contracttermasanswervaluecoding.getVersion()));
		} else {
			c.addCnctTrmAsAnsVlCdgVrsn("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlCdgVrsn("]]]");}


		/******************** Cnct_Trm_As_Ans_VlCdg_Cd ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlCdgCd("[[[");}
		if(contracttermasanswervaluecoding.hasCode()) {

			c.addCnctTrmAsAnsVlCdgCd(String.valueOf(contracttermasanswervaluecoding.getCode()));
		} else {
			c.addCnctTrmAsAnsVlCdgCd("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlCdgCd("]]]");}


		/******************** Cnct_Trm_As_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlCdgUsrSltd("[[[");}
		if(contracttermasanswervaluecoding.hasUserSelected()) {

			c.addCnctTrmAsAnsVlCdgUsrSltd(String.valueOf(contracttermasanswervaluecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsAnsVlCdgUsrSltd("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlCdgUsrSltd("]]]");}


		/******************** Cnct_Trm_As_Ans_VlCdg_Sys ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlCdgSys("[[[");}
		if(contracttermasanswervaluecoding.hasSystem()) {

			c.addCnctTrmAsAnsVlCdgSys(String.valueOf(contracttermasanswervaluecoding.getSystem()));
		} else {
			c.addCnctTrmAsAnsVlCdgSys("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlCdgSys("]]]");}


		/******************** Cnct_Trm_As_Ans_VlBooleanTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlBooleanTyp("[[[");}
		if(contracttermasanswer.hasValueBooleanType()) {

			c.addCnctTrmAsAnsVlBooleanTyp("\""+contracttermasanswer.getValueBooleanType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlBooleanTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlBooleanTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlDtTimeTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlDtTimeTyp("[[[");}
		if(contracttermasanswer.hasValueDateTimeType()) {

			c.addCnctTrmAsAnsVlDtTimeTyp("\""+contracttermasanswer.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlDtTimeTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlDtTimeTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlIntegerTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlIntegerTyp("[[[");}
		if(contracttermasanswer.hasValueIntegerType()) {

			c.addCnctTrmAsAnsVlIntegerTyp("\""+contracttermasanswer.getValueIntegerType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlIntegerTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlIntegerTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlTimeTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlTimeTyp("[[[");}
		if(contracttermasanswer.hasValueTimeType()) {

			c.addCnctTrmAsAnsVlTimeTyp("\""+contracttermasanswer.getValueTimeType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlTimeTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlTimeTyp("]]]");}


		/******************** Cnct_Trm_As_Ans_VlStrgTyp ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlStrgTyp("[[[");}
		if(contracttermasanswer.hasValueStringType()) {

			c.addCnctTrmAsAnsVlStrgTyp("\""+contracttermasanswer.getValueStringType().getValueAsString()+"\"");
		} else {
			c.addCnctTrmAsAnsVlStrgTyp("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlStrgTyp("]]]");}


		/******************** contracttermasanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermasanswervaluequantity = contracttermasanswer.getValueQuantity();

		/******************** Cnct_Trm_As_Ans_VlQnty_Vl ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlQntyVl("[[[");}
		if(contracttermasanswervaluequantity.hasValue()) {

			c.addCnctTrmAsAnsVlQntyVl(String.valueOf(contracttermasanswervaluequantity.getValue()));
		} else {
			c.addCnctTrmAsAnsVlQntyVl("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlQntyVl("]]]");}


		/******************** contracttermasanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermasanswervaluequantitycomparator = contracttermasanswervaluequantity.getComparator();
		if(contracttermasanswervaluequantitycomparator!=null) {
		if(contracttermasansweri == 0) {

		c.addCnctTrmAsAnsVlQntyCmprtr("[[[");		}
			c.addCnctTrmAsAnsVlQntyCmprtr(contracttermasanswervaluequantitycomparator.toCode());
		if(contracttermasansweri == contracttermasanswerlist.size()-1) {

		c.addCnctTrmAsAnsVlQntyCmprtr("]]]");		}

		} else {
			c.addCnctTrmAsAnsVlQntyCmprtr("NULL");
		}

		/******************** Cnct_Trm_As_Ans_VlQnty_Cd ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlQntyCd("[[[");}
		if(contracttermasanswervaluequantity.hasCode()) {

			c.addCnctTrmAsAnsVlQntyCd(String.valueOf(contracttermasanswervaluequantity.getCode()));
		} else {
			c.addCnctTrmAsAnsVlQntyCd("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlQntyCd("]]]");}


		/******************** Cnct_Trm_As_Ans_VlQnty_Unt ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlQntyUnt("[[[");}
		if(contracttermasanswervaluequantity.hasUnit()) {

			c.addCnctTrmAsAnsVlQntyUnt(String.valueOf(contracttermasanswervaluequantity.getUnit()));
		} else {
			c.addCnctTrmAsAnsVlQntyUnt("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlQntyUnt("]]]");}


		/******************** Cnct_Trm_As_Ans_VlQnty_Sys ********************************************************************************/
		if(contracttermasansweri == 0) {c.addCnctTrmAsAnsVlQntySys("[[[");}
		if(contracttermasanswervaluequantity.hasSystem()) {

			c.addCnctTrmAsAnsVlQntySys(String.valueOf(contracttermasanswervaluequantity.getSystem()));
		} else {
			c.addCnctTrmAsAnsVlQntySys("NULL");
		}

		if(contracttermasansweri == contracttermasanswerlist.size()-1) {c.addCnctTrmAsAnsVlQntySys("]]]");}


		 };
		/******************** Cnct_Trm_As_Txt ********************************************************************************/
		if(contracttermas.hasText()) {

			c.addCnctTrmAsTxt(String.valueOf(contracttermas.getText()));
		} else {
			c.addCnctTrmAsTxt("NULL");
		}


		/******************** contracttermasperiodtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> contracttermasperiodtypelist = contracttermas.getPeriodType();
		for(int contracttermasperiodtypei = 0; contracttermasperiodtypei<contracttermasperiodtypelist.size();contracttermasperiodtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  contracttermasperiodtype = contracttermasperiodtypelist.get(contracttermasperiodtypei);

		/******************** Cnct_Trm_As_PrdTyp_Txt ********************************************************************************/
		if(contracttermasperiodtypei == 0) {c.addCnctTrmAsPrdTypTxt("[[[");}
		if(contracttermasperiodtype.hasText()) {

			c.addCnctTrmAsPrdTypTxt(String.valueOf(contracttermasperiodtype.getText()));
		} else {
			c.addCnctTrmAsPrdTypTxt("NULL");
		}

		if(contracttermasperiodtypei == contracttermasperiodtypelist.size()-1) {c.addCnctTrmAsPrdTypTxt("]]]");}


		/******************** contracttermasperiodtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermasperiodtypecodinglist = contracttermasperiodtype.getCoding();
		for(int contracttermasperiodtypecodingi = 0; contracttermasperiodtypecodingi<contracttermasperiodtypecodinglist.size();contracttermasperiodtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermasperiodtypecoding = contracttermasperiodtypecodinglist.get(contracttermasperiodtypecodingi);

		/******************** Cnct_Trm_As_PrdTyp_Cdg_Dsply ********************************************************************************/
		if(contracttermasperiodtypecodingi == 0) {c.addCnctTrmAsPrdTypCdgDsply("[[[[");}
		if(contracttermasperiodtypecoding.hasDisplay()) {

			c.addCnctTrmAsPrdTypCdgDsply(String.valueOf(contracttermasperiodtypecoding.getDisplay()));
		} else {
			c.addCnctTrmAsPrdTypCdgDsply("NULL");
		}

		if(contracttermasperiodtypecodingi == contracttermasperiodtypecodinglist.size()-1) {c.addCnctTrmAsPrdTypCdgDsply("]]]]");}


		/******************** Cnct_Trm_As_PrdTyp_Cdg_Vrsn ********************************************************************************/
		if(contracttermasperiodtypecodingi == 0) {c.addCnctTrmAsPrdTypCdgVrsn("[[[[");}
		if(contracttermasperiodtypecoding.hasVersion()) {

			c.addCnctTrmAsPrdTypCdgVrsn(String.valueOf(contracttermasperiodtypecoding.getVersion()));
		} else {
			c.addCnctTrmAsPrdTypCdgVrsn("NULL");
		}

		if(contracttermasperiodtypecodingi == contracttermasperiodtypecodinglist.size()-1) {c.addCnctTrmAsPrdTypCdgVrsn("]]]]");}


		/******************** Cnct_Trm_As_PrdTyp_Cdg_Cd ********************************************************************************/
		if(contracttermasperiodtypecodingi == 0) {c.addCnctTrmAsPrdTypCdgCd("[[[[");}
		if(contracttermasperiodtypecoding.hasCode()) {

			c.addCnctTrmAsPrdTypCdgCd(String.valueOf(contracttermasperiodtypecoding.getCode()));
		} else {
			c.addCnctTrmAsPrdTypCdgCd("NULL");
		}

		if(contracttermasperiodtypecodingi == contracttermasperiodtypecodinglist.size()-1) {c.addCnctTrmAsPrdTypCdgCd("]]]]");}


		/******************** Cnct_Trm_As_PrdTyp_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasperiodtypecodingi == 0) {c.addCnctTrmAsPrdTypCdgUsrSltd("[[[[");}
		if(contracttermasperiodtypecoding.hasUserSelected()) {

			c.addCnctTrmAsPrdTypCdgUsrSltd(String.valueOf(contracttermasperiodtypecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsPrdTypCdgUsrSltd("NULL");
		}

		if(contracttermasperiodtypecodingi == contracttermasperiodtypecodinglist.size()-1) {c.addCnctTrmAsPrdTypCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_As_PrdTyp_Cdg_Sys ********************************************************************************/
		if(contracttermasperiodtypecodingi == 0) {c.addCnctTrmAsPrdTypCdgSys("[[[[");}
		if(contracttermasperiodtypecoding.hasSystem()) {

			c.addCnctTrmAsPrdTypCdgSys(String.valueOf(contracttermasperiodtypecoding.getSystem()));
		} else {
			c.addCnctTrmAsPrdTypCdgSys("NULL");
		}

		if(contracttermasperiodtypecodingi == contracttermasperiodtypecodinglist.size()-1) {c.addCnctTrmAsPrdTypCdgSys("]]]]");}


		 };
		 };
		/******************** Cnct_Trm_As_TypRfrnc ********************************************************************************/
		if(contracttermas.hasTypeReference()) {

			String  array = "[";
			for(int incr=0; incr<contracttermas.getTypeReference().size(); incr++) {
				array = array + contracttermas.getTypeReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmAsTypRfrnc(array);

		} else {
			c.addCnctTrmAsTypRfrnc("NULL");
		}


		/******************** contracttermasvalueditem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.ValuedItemComponent> contracttermasvalueditemlist = contracttermas.getValuedItem();
		for(int contracttermasvalueditemi = 0; contracttermasvalueditemi<contracttermasvalueditemlist.size();contracttermasvalueditemi++ ) {
		org.hl7.fhir.r4.model.Contract.ValuedItemComponent  contracttermasvalueditem = contracttermasvalueditemlist.get(contracttermasvalueditemi);

		/******************** contracttermasvalueditemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermasvalueditemidentifier = contracttermasvalueditem.getIdentifier();

		/******************** Cnct_Trm_As_VldItm_Id_Vl ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmIdVl("[[[");}
		if(contracttermasvalueditemidentifier.hasValue()) {

			c.addCnctTrmAsVldItmIdVl(String.valueOf(contracttermasvalueditemidentifier.getValue()));
		} else {
			c.addCnctTrmAsVldItmIdVl("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmIdVl("]]]");}


		/******************** contracttermasvalueditemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasvalueditemidentifiertype = contracttermasvalueditemidentifier.getType();

		/******************** Cnct_Trm_As_VldItm_Id_Typ_Txt ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmIdTypTxt("[[[");}
		if(contracttermasvalueditemidentifiertype.hasText()) {

			c.addCnctTrmAsVldItmIdTypTxt(String.valueOf(contracttermasvalueditemidentifiertype.getText()));
		} else {
			c.addCnctTrmAsVldItmIdTypTxt("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmIdTypTxt("]]]");}


		/******************** contracttermasvalueditemidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermasvalueditemidentifiertypecodinglist = contracttermasvalueditemidentifiertype.getCoding();
		for(int contracttermasvalueditemidentifiertypecodingi = 0; contracttermasvalueditemidentifiertypecodingi<contracttermasvalueditemidentifiertypecodinglist.size();contracttermasvalueditemidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermasvalueditemidentifiertypecoding = contracttermasvalueditemidentifiertypecodinglist.get(contracttermasvalueditemidentifiertypecodingi);

		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecodingi == 0) {c.addCnctTrmAsVldItmIdTypCdgDsply("[[[[");}
		if(contracttermasvalueditemidentifiertypecoding.hasDisplay()) {

			c.addCnctTrmAsVldItmIdTypCdgDsply(String.valueOf(contracttermasvalueditemidentifiertypecoding.getDisplay()));
		} else {
			c.addCnctTrmAsVldItmIdTypCdgDsply("NULL");
		}

		if(contracttermasvalueditemidentifiertypecodingi == contracttermasvalueditemidentifiertypecodinglist.size()-1) {c.addCnctTrmAsVldItmIdTypCdgDsply("]]]]");}


		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecodingi == 0) {c.addCnctTrmAsVldItmIdTypCdgVrsn("[[[[");}
		if(contracttermasvalueditemidentifiertypecoding.hasVersion()) {

			c.addCnctTrmAsVldItmIdTypCdgVrsn(String.valueOf(contracttermasvalueditemidentifiertypecoding.getVersion()));
		} else {
			c.addCnctTrmAsVldItmIdTypCdgVrsn("NULL");
		}

		if(contracttermasvalueditemidentifiertypecodingi == contracttermasvalueditemidentifiertypecodinglist.size()-1) {c.addCnctTrmAsVldItmIdTypCdgVrsn("]]]]");}


		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecodingi == 0) {c.addCnctTrmAsVldItmIdTypCdgCd("[[[[");}
		if(contracttermasvalueditemidentifiertypecoding.hasCode()) {

			c.addCnctTrmAsVldItmIdTypCdgCd(String.valueOf(contracttermasvalueditemidentifiertypecoding.getCode()));
		} else {
			c.addCnctTrmAsVldItmIdTypCdgCd("NULL");
		}

		if(contracttermasvalueditemidentifiertypecodingi == contracttermasvalueditemidentifiertypecodinglist.size()-1) {c.addCnctTrmAsVldItmIdTypCdgCd("]]]]");}


		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecodingi == 0) {c.addCnctTrmAsVldItmIdTypCdgUsrSltd("[[[[");}
		if(contracttermasvalueditemidentifiertypecoding.hasUserSelected()) {

			c.addCnctTrmAsVldItmIdTypCdgUsrSltd(String.valueOf(contracttermasvalueditemidentifiertypecoding.getUserSelected()));
		} else {
			c.addCnctTrmAsVldItmIdTypCdgUsrSltd("NULL");
		}

		if(contracttermasvalueditemidentifiertypecodingi == contracttermasvalueditemidentifiertypecodinglist.size()-1) {c.addCnctTrmAsVldItmIdTypCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecodingi == 0) {c.addCnctTrmAsVldItmIdTypCdgSys("[[[[");}
		if(contracttermasvalueditemidentifiertypecoding.hasSystem()) {

			c.addCnctTrmAsVldItmIdTypCdgSys(String.valueOf(contracttermasvalueditemidentifiertypecoding.getSystem()));
		} else {
			c.addCnctTrmAsVldItmIdTypCdgSys("NULL");
		}

		if(contracttermasvalueditemidentifiertypecodingi == contracttermasvalueditemidentifiertypecodinglist.size()-1) {c.addCnctTrmAsVldItmIdTypCdgSys("]]]]");}


		 };
		/******************** contracttermasvalueditemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasvalueditemidentifierperiod = contracttermasvalueditemidentifier.getPeriod();

		/******************** Cnct_Trm_As_VldItm_Id_Prd_Strt ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmIdPrdStrt("[[[");}
		if(contracttermasvalueditemidentifierperiod.hasStart()) {

			c.addCnctTrmAsVldItmIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasvalueditemidentifierperiod.getStart())+"\"");
		} else {
			c.addCnctTrmAsVldItmIdPrdStrt("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmIdPrdStrt("]]]");}


		/******************** Cnct_Trm_As_VldItm_Id_Prd_End ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmIdPrdEnd("[[[");}
		if(contracttermasvalueditemidentifierperiod.hasEnd()) {

			c.addCnctTrmAsVldItmIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasvalueditemidentifierperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmAsVldItmIdPrdEnd("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmIdPrdEnd("]]]");}


		/******************** contracttermasvalueditemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contracttermasvalueditemidentifieruse = contracttermasvalueditemidentifier.getUse();
		if(contracttermasvalueditemidentifieruse!=null) {
		if(contracttermasvalueditemi == 0) {

		c.addCnctTrmAsVldItmIdUse("[[[");		}
			c.addCnctTrmAsVldItmIdUse(contracttermasvalueditemidentifieruse.toCode());
		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {

		c.addCnctTrmAsVldItmIdUse("]]]");		}

		} else {
			c.addCnctTrmAsVldItmIdUse("NULL");
		}

		/******************** Cnct_Trm_As_VldItm_Id_Assigner ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmIdAssigner("[[[");}
		if(contracttermasvalueditemidentifier.hasAssigner()) {

			if(contracttermasvalueditemidentifier.getAssigner().getReference() != null) {
			c.addCnctTrmAsVldItmIdAssigner(contracttermasvalueditemidentifier.getAssigner().getReference());
			}
		} else {
			c.addCnctTrmAsVldItmIdAssigner("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmIdAssigner("]]]");}


		/******************** Cnct_Trm_As_VldItm_Id_Sys ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmIdSys("[[[");}
		if(contracttermasvalueditemidentifier.hasSystem()) {

			c.addCnctTrmAsVldItmIdSys(String.valueOf(contracttermasvalueditemidentifier.getSystem()));
		} else {
			c.addCnctTrmAsVldItmIdSys("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmIdSys("]]]");}


		/******************** contracttermasvalueditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money contracttermasvalueditemunitprice = contracttermasvalueditem.getUnitPrice();

		/******************** Cnct_Trm_As_VldItm_UntPrice_Vl ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmUntPriceVl("[[[");}
		if(contracttermasvalueditemunitprice.hasValue()) {

			c.addCnctTrmAsVldItmUntPriceVl(String.valueOf(contracttermasvalueditemunitprice.getValue()));
		} else {
			c.addCnctTrmAsVldItmUntPriceVl("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmUntPriceVl("]]]");}


		/******************** Cnct_Trm_As_VldItm_UntPrice_Crncy ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmUntPriceCrncy("[[[");}
		if(contracttermasvalueditemunitprice.hasCurrency()) {

			c.addCnctTrmAsVldItmUntPriceCrncy(String.valueOf(contracttermasvalueditemunitprice.getCurrency()));
		} else {
			c.addCnctTrmAsVldItmUntPriceCrncy("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmUntPriceCrncy("]]]");}


		/******************** Cnct_Trm_As_VldItm_PymntDt ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmPymntDt("[[[");}
		if(contracttermasvalueditem.hasPaymentDate()) {

			c.addCnctTrmAsVldItmPymntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasvalueditem.getPaymentDate())+"\"");
		} else {
			c.addCnctTrmAsVldItmPymntDt("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmPymntDt("]]]");}


		/******************** contracttermasvalueditementitycodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasvalueditementitycodeableconcept = contracttermasvalueditem.getEntityCodeableConcept();

		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Txt ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmEntityCdbleCncptTxt("[[[");}
		if(contracttermasvalueditementitycodeableconcept.hasText()) {

			c.addCnctTrmAsVldItmEntityCdbleCncptTxt(String.valueOf(contracttermasvalueditementitycodeableconcept.getText()));
		} else {
			c.addCnctTrmAsVldItmEntityCdbleCncptTxt("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmEntityCdbleCncptTxt("]]]");}


		/******************** contracttermasvalueditementitycodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contracttermasvalueditementitycodeableconceptcodinglist = contracttermasvalueditementitycodeableconcept.getCoding();
		for(int contracttermasvalueditementitycodeableconceptcodingi = 0; contracttermasvalueditementitycodeableconceptcodingi<contracttermasvalueditementitycodeableconceptcodinglist.size();contracttermasvalueditementitycodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  contracttermasvalueditementitycodeableconceptcoding = contracttermasvalueditementitycodeableconceptcodinglist.get(contracttermasvalueditementitycodeableconceptcodingi);

		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcodingi == 0) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgDsply("[[[[");}
		if(contracttermasvalueditementitycodeableconceptcoding.hasDisplay()) {

			c.addCnctTrmAsVldItmEntityCdbleCncptCdgDsply(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getDisplay()));
		} else {
			c.addCnctTrmAsVldItmEntityCdbleCncptCdgDsply("NULL");
		}

		if(contracttermasvalueditementitycodeableconceptcodingi == contracttermasvalueditementitycodeableconceptcodinglist.size()-1) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgDsply("]]]]");}


		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcodingi == 0) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgVrsn("[[[[");}
		if(contracttermasvalueditementitycodeableconceptcoding.hasVersion()) {

			c.addCnctTrmAsVldItmEntityCdbleCncptCdgVrsn(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getVersion()));
		} else {
			c.addCnctTrmAsVldItmEntityCdbleCncptCdgVrsn("NULL");
		}

		if(contracttermasvalueditementitycodeableconceptcodingi == contracttermasvalueditementitycodeableconceptcodinglist.size()-1) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgVrsn("]]]]");}


		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcodingi == 0) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgCd("[[[[");}
		if(contracttermasvalueditementitycodeableconceptcoding.hasCode()) {

			c.addCnctTrmAsVldItmEntityCdbleCncptCdgCd(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getCode()));
		} else {
			c.addCnctTrmAsVldItmEntityCdbleCncptCdgCd("NULL");
		}

		if(contracttermasvalueditementitycodeableconceptcodingi == contracttermasvalueditementitycodeableconceptcodinglist.size()-1) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgCd("]]]]");}


		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcodingi == 0) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd("[[[[");}
		if(contracttermasvalueditementitycodeableconceptcoding.hasUserSelected()) {

			c.addCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getUserSelected()));
		} else {
			c.addCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd("NULL");
		}

		if(contracttermasvalueditementitycodeableconceptcodingi == contracttermasvalueditementitycodeableconceptcodinglist.size()-1) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd("]]]]");}


		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcodingi == 0) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgSys("[[[[");}
		if(contracttermasvalueditementitycodeableconceptcoding.hasSystem()) {

			c.addCnctTrmAsVldItmEntityCdbleCncptCdgSys(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getSystem()));
		} else {
			c.addCnctTrmAsVldItmEntityCdbleCncptCdgSys("NULL");
		}

		if(contracttermasvalueditementitycodeableconceptcodingi == contracttermasvalueditementitycodeableconceptcodinglist.size()-1) {c.addCnctTrmAsVldItmEntityCdbleCncptCdgSys("]]]]");}


		 };
		/******************** Cnct_Trm_As_VldItm_SecurityLblNmbr ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmSecurityLblNmbr("[[[");}
		if(contracttermasvalueditem.hasSecurityLabelNumber()) {

			String  array = "[";
			for(int incr=0; incr<contracttermasvalueditem.getSecurityLabelNumber().size(); incr++) {
				array = array + contracttermasvalueditem.getSecurityLabelNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmAsVldItmSecurityLblNmbr(array);

		} else {
			c.addCnctTrmAsVldItmSecurityLblNmbr("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmSecurityLblNmbr("]]]");}


		/******************** Cnct_Trm_As_VldItm_EntityRfrnc ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmEntityRfrnc("[[[");}
		if(contracttermasvalueditem.hasEntityReference()) {

			if(contracttermasvalueditem.getEntityReference().getReference() != null) {
			c.addCnctTrmAsVldItmEntityRfrnc(contracttermasvalueditem.getEntityReference().getReference());
			}
		} else {
			c.addCnctTrmAsVldItmEntityRfrnc("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmEntityRfrnc("]]]");}


		/******************** Cnct_Trm_As_VldItm_Factor ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmFactor("[[[");}
		if(contracttermasvalueditem.hasFactor()) {

			c.addCnctTrmAsVldItmFactor(String.valueOf(contracttermasvalueditem.getFactor()));
		} else {
			c.addCnctTrmAsVldItmFactor("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmFactor("]]]");}


		/******************** Cnct_Trm_As_VldItm_EfctiveTime ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmEfctiveTime("[[[");}
		if(contracttermasvalueditem.hasEffectiveTime()) {

			c.addCnctTrmAsVldItmEfctiveTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasvalueditem.getEffectiveTime())+"\"");
		} else {
			c.addCnctTrmAsVldItmEfctiveTime("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmEfctiveTime("]]]");}


		/******************** contracttermasvalueditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money contracttermasvalueditemnet = contracttermasvalueditem.getNet();

		/******************** Cnct_Trm_As_VldItm_Net_Vl ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmNetVl("[[[");}
		if(contracttermasvalueditemnet.hasValue()) {

			c.addCnctTrmAsVldItmNetVl(String.valueOf(contracttermasvalueditemnet.getValue()));
		} else {
			c.addCnctTrmAsVldItmNetVl("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmNetVl("]]]");}


		/******************** Cnct_Trm_As_VldItm_Net_Crncy ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmNetCrncy("[[[");}
		if(contracttermasvalueditemnet.hasCurrency()) {

			c.addCnctTrmAsVldItmNetCrncy(String.valueOf(contracttermasvalueditemnet.getCurrency()));
		} else {
			c.addCnctTrmAsVldItmNetCrncy("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmNetCrncy("]]]");}


		/******************** Cnct_Trm_As_VldItm_Points ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmPoints("[[[");}
		if(contracttermasvalueditem.hasPoints()) {

			c.addCnctTrmAsVldItmPoints(String.valueOf(contracttermasvalueditem.getPoints()));
		} else {
			c.addCnctTrmAsVldItmPoints("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmPoints("]]]");}


		/******************** Cnct_Trm_As_VldItm_Recipient ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmRecipient("[[[");}
		if(contracttermasvalueditem.hasRecipient()) {

			if(contracttermasvalueditem.getRecipient().getReference() != null) {
			c.addCnctTrmAsVldItmRecipient(contracttermasvalueditem.getRecipient().getReference());
			}
		} else {
			c.addCnctTrmAsVldItmRecipient("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmRecipient("]]]");}


		/******************** Cnct_Trm_As_VldItm_Pymnt ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmPymnt("[[[");}
		if(contracttermasvalueditem.hasPayment()) {

			c.addCnctTrmAsVldItmPymnt(String.valueOf(contracttermasvalueditem.getPayment()));
		} else {
			c.addCnctTrmAsVldItmPymnt("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmPymnt("]]]");}


		/******************** Cnct_Trm_As_VldItm_LinkId ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmLinkId("[[[");}
		if(contracttermasvalueditem.hasLinkId()) {

			String  array = "[";
			for(int incr=0; incr<contracttermasvalueditem.getLinkId().size(); incr++) {
				array = array + contracttermasvalueditem.getLinkId().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctTrmAsVldItmLinkId(array);

		} else {
			c.addCnctTrmAsVldItmLinkId("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmLinkId("]]]");}


		/******************** contracttermasvalueditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermasvalueditemquantity = contracttermasvalueditem.getQuantity();

		/******************** Cnct_Trm_As_VldItm_Qnty_Vl ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmQntyVl("[[[");}
		if(contracttermasvalueditemquantity.hasValue()) {

			c.addCnctTrmAsVldItmQntyVl(String.valueOf(contracttermasvalueditemquantity.getValue()));
		} else {
			c.addCnctTrmAsVldItmQntyVl("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmQntyVl("]]]");}


		/******************** contracttermasvalueditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermasvalueditemquantitycomparator = contracttermasvalueditemquantity.getComparator();
		if(contracttermasvalueditemquantitycomparator!=null) {
		if(contracttermasvalueditemi == 0) {

		c.addCnctTrmAsVldItmQntyCmprtr("[[[");		}
			c.addCnctTrmAsVldItmQntyCmprtr(contracttermasvalueditemquantitycomparator.toCode());
		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {

		c.addCnctTrmAsVldItmQntyCmprtr("]]]");		}

		} else {
			c.addCnctTrmAsVldItmQntyCmprtr("NULL");
		}

		/******************** Cnct_Trm_As_VldItm_Qnty_Cd ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmQntyCd("[[[");}
		if(contracttermasvalueditemquantity.hasCode()) {

			c.addCnctTrmAsVldItmQntyCd(String.valueOf(contracttermasvalueditemquantity.getCode()));
		} else {
			c.addCnctTrmAsVldItmQntyCd("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmQntyCd("]]]");}


		/******************** Cnct_Trm_As_VldItm_Qnty_Unt ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmQntyUnt("[[[");}
		if(contracttermasvalueditemquantity.hasUnit()) {

			c.addCnctTrmAsVldItmQntyUnt(String.valueOf(contracttermasvalueditemquantity.getUnit()));
		} else {
			c.addCnctTrmAsVldItmQntyUnt("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmQntyUnt("]]]");}


		/******************** Cnct_Trm_As_VldItm_Qnty_Sys ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmQntySys("[[[");}
		if(contracttermasvalueditemquantity.hasSystem()) {

			c.addCnctTrmAsVldItmQntySys(String.valueOf(contracttermasvalueditemquantity.getSystem()));
		} else {
			c.addCnctTrmAsVldItmQntySys("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmQntySys("]]]");}


		/******************** Cnct_Trm_As_VldItm_Responsible ********************************************************************************/
		if(contracttermasvalueditemi == 0) {c.addCnctTrmAsVldItmResponsible("[[[");}
		if(contracttermasvalueditem.hasResponsible()) {

			if(contracttermasvalueditem.getResponsible().getReference() != null) {
			c.addCnctTrmAsVldItmResponsible(contracttermasvalueditem.getResponsible().getReference());
			}
		} else {
			c.addCnctTrmAsVldItmResponsible("NULL");
		}

		if(contracttermasvalueditemi == contracttermasvalueditemlist.size()-1) {c.addCnctTrmAsVldItmResponsible("]]]");}


		 };
		/******************** contracttermasuseperiod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Period> contracttermasuseperiodlist = contracttermas.getUsePeriod();
		for(int contracttermasuseperiodi = 0; contracttermasuseperiodi<contracttermasuseperiodlist.size();contracttermasuseperiodi++ ) {
		org.hl7.fhir.r4.model.Period  contracttermasuseperiod = contracttermasuseperiodlist.get(contracttermasuseperiodi);

		/******************** Cnct_Trm_As_UsePrd_Strt ********************************************************************************/
		if(contracttermasuseperiodi == 0) {c.addCnctTrmAsUsePrdStrt("[[[");}
		if(contracttermasuseperiod.hasStart()) {

			c.addCnctTrmAsUsePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasuseperiod.getStart())+"\"");
		} else {
			c.addCnctTrmAsUsePrdStrt("NULL");
		}

		if(contracttermasuseperiodi == contracttermasuseperiodlist.size()-1) {c.addCnctTrmAsUsePrdStrt("]]]");}


		/******************** Cnct_Trm_As_UsePrd_End ********************************************************************************/
		if(contracttermasuseperiodi == 0) {c.addCnctTrmAsUsePrdEnd("[[[");}
		if(contracttermasuseperiod.hasEnd()) {

			c.addCnctTrmAsUsePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(contracttermasuseperiod.getEnd())+"\"");
		} else {
			c.addCnctTrmAsUsePrdEnd("NULL");
		}

		if(contracttermasuseperiodi == contracttermasuseperiodlist.size()-1) {c.addCnctTrmAsUsePrdEnd("]]]");}


		 };
		 };
		 };
		/******************** Cnct_RelevantHis ********************************************************************************/
		if(contract.hasRelevantHistory()) {

			String  array = "[";
			for(int incr=0; incr<contract.getRelevantHistory().size(); incr++) {
				array = array + contract.getRelevantHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnctRelevantHis(array);

		} else {
			c.addCnctRelevantHis("NULL");
		}


		/******************** contractlegal ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.LegalLanguageComponent> contractlegallist = contract.getLegal();
		for(int contractlegali = 0; contractlegali<contractlegallist.size();contractlegali++ ) {
		org.hl7.fhir.r4.model.Contract.LegalLanguageComponent  contractlegal = contractlegallist.get(contractlegali);

		/******************** Cnct_Legal_CntntRfrnc ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntRfrnc("[");}
		if(contractlegal.hasContentReference()) {

			if(contractlegal.getContentReference().getReference() != null) {
			c.addCnctLegalCntntRfrnc(contractlegal.getContentReference().getReference());
			}
		} else {
			c.addCnctLegalCntntRfrnc("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntRfrnc("]");}


		/******************** contractlegalcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractlegalcontentattachment = contractlegal.getContentAttachment();

		/******************** Cnct_Legal_CntntAttchmnt_Sz ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntSz("[");}
		if(contractlegalcontentattachment.hasSize()) {

			c.addCnctLegalCntntAttchmntSz(String.valueOf(contractlegalcontentattachment.getSize()));
		} else {
			c.addCnctLegalCntntAttchmntSz("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntSz("]");}


		/******************** Cnct_Legal_CntntAttchmnt_Lnguage ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntLnguage("[");}
		if(contractlegalcontentattachment.hasLanguage()) {

			c.addCnctLegalCntntAttchmntLnguage(String.valueOf(contractlegalcontentattachment.getLanguage()));
		} else {
			c.addCnctLegalCntntAttchmntLnguage("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntLnguage("]");}


		/******************** Cnct_Legal_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntCntntTyp("[");}
		if(contractlegalcontentattachment.hasContentType()) {

			c.addCnctLegalCntntAttchmntCntntTyp(String.valueOf(contractlegalcontentattachment.getContentType()));
		} else {
			c.addCnctLegalCntntAttchmntCntntTyp("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntCntntTyp("]");}


		/******************** Cnct_Legal_CntntAttchmnt_Hash ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntHash("[");}
		if(contractlegalcontentattachment.hasHash()) {

			c.addCnctLegalCntntAttchmntHash(new String(contractlegalcontentattachment.getHash()));
		} else {
			c.addCnctLegalCntntAttchmntHash("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntHash("]");}


		/******************** Cnct_Legal_CntntAttchmnt_Data ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntData("[");}
		if(contractlegalcontentattachment.hasData()) {

			c.addCnctLegalCntntAttchmntData(new String(contractlegalcontentattachment.getData()));
		} else {
			c.addCnctLegalCntntAttchmntData("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntData("]");}


		/******************** Cnct_Legal_CntntAttchmnt_Creation ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntCreation("[");}
		if(contractlegalcontentattachment.hasCreation()) {

			c.addCnctLegalCntntAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractlegalcontentattachment.getCreation())+"\"");
		} else {
			c.addCnctLegalCntntAttchmntCreation("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntCreation("]");}


		/******************** Cnct_Legal_CntntAttchmnt_Ttl ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntTtl("[");}
		if(contractlegalcontentattachment.hasTitle()) {

			c.addCnctLegalCntntAttchmntTtl(String.valueOf(contractlegalcontentattachment.getTitle()));
		} else {
			c.addCnctLegalCntntAttchmntTtl("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntTtl("]");}


		/******************** Cnct_Legal_CntntAttchmnt_Url ********************************************************************************/
		if(contractlegali == 0) {c.addCnctLegalCntntAttchmntUrl("[");}
		if(contractlegalcontentattachment.hasUrl()) {

			c.addCnctLegalCntntAttchmntUrl(String.valueOf(contractlegalcontentattachment.getUrl()));
		} else {
			c.addCnctLegalCntntAttchmntUrl("NULL");
		}

		if(contractlegali == contractlegallist.size()-1) {c.addCnctLegalCntntAttchmntUrl("]");}


		 };
		/******************** contractsigner ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.SignatoryComponent> contractsignerlist = contract.getSigner();
		for(int contractsigneri = 0; contractsigneri<contractsignerlist.size();contractsigneri++ ) {
		org.hl7.fhir.r4.model.Contract.SignatoryComponent  contractsigner = contractsignerlist.get(contractsigneri);

		/******************** contractsignertype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsignertype = contractsigner.getType();

		/******************** Cnct_Signer_Typ_Dsply ********************************************************************************/
		if(contractsigneri == 0) {c.addCnctSignerTypDsply("[");}
		if(contractsignertype.hasDisplay()) {

			c.addCnctSignerTypDsply(String.valueOf(contractsignertype.getDisplay()));
		} else {
			c.addCnctSignerTypDsply("NULL");
		}

		if(contractsigneri == contractsignerlist.size()-1) {c.addCnctSignerTypDsply("]");}


		/******************** Cnct_Signer_Typ_Vrsn ********************************************************************************/
		if(contractsigneri == 0) {c.addCnctSignerTypVrsn("[");}
		if(contractsignertype.hasVersion()) {

			c.addCnctSignerTypVrsn(String.valueOf(contractsignertype.getVersion()));
		} else {
			c.addCnctSignerTypVrsn("NULL");
		}

		if(contractsigneri == contractsignerlist.size()-1) {c.addCnctSignerTypVrsn("]");}


		/******************** Cnct_Signer_Typ_Cd ********************************************************************************/
		if(contractsigneri == 0) {c.addCnctSignerTypCd("[");}
		if(contractsignertype.hasCode()) {

			c.addCnctSignerTypCd(String.valueOf(contractsignertype.getCode()));
		} else {
			c.addCnctSignerTypCd("NULL");
		}

		if(contractsigneri == contractsignerlist.size()-1) {c.addCnctSignerTypCd("]");}


		/******************** Cnct_Signer_Typ_UsrSltd ********************************************************************************/
		if(contractsigneri == 0) {c.addCnctSignerTypUsrSltd("[");}
		if(contractsignertype.hasUserSelected()) {

			c.addCnctSignerTypUsrSltd(String.valueOf(contractsignertype.getUserSelected()));
		} else {
			c.addCnctSignerTypUsrSltd("NULL");
		}

		if(contractsigneri == contractsignerlist.size()-1) {c.addCnctSignerTypUsrSltd("]");}


		/******************** Cnct_Signer_Typ_Sys ********************************************************************************/
		if(contractsigneri == 0) {c.addCnctSignerTypSys("[");}
		if(contractsignertype.hasSystem()) {

			c.addCnctSignerTypSys(String.valueOf(contractsignertype.getSystem()));
		} else {
			c.addCnctSignerTypSys("NULL");
		}

		if(contractsigneri == contractsignerlist.size()-1) {c.addCnctSignerTypSys("]");}


		/******************** contractsignersignature ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Signature> contractsignersignaturelist = contractsigner.getSignature();
		for(int contractsignersignaturei = 0; contractsignersignaturei<contractsignersignaturelist.size();contractsignersignaturei++ ) {
		org.hl7.fhir.r4.model.Signature  contractsignersignature = contractsignersignaturelist.get(contractsignersignaturei);

		/******************** contractsignersignaturetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> contractsignersignaturetypelist = contractsignersignature.getType();
		for(int contractsignersignaturetypei = 0; contractsignersignaturetypei<contractsignersignaturetypelist.size();contractsignersignaturetypei++ ) {
		org.hl7.fhir.r4.model.Coding  contractsignersignaturetype = contractsignersignaturetypelist.get(contractsignersignaturetypei);

		/******************** Cnct_Signer_Signature_Typ_Dsply ********************************************************************************/
		if(contractsignersignaturetypei == 0) {c.addCnctSignerSignatureTypDsply("[[[");}
		if(contractsignersignaturetype.hasDisplay()) {

			c.addCnctSignerSignatureTypDsply(String.valueOf(contractsignersignaturetype.getDisplay()));
		} else {
			c.addCnctSignerSignatureTypDsply("NULL");
		}

		if(contractsignersignaturetypei == contractsignersignaturetypelist.size()-1) {c.addCnctSignerSignatureTypDsply("]]]");}


		/******************** Cnct_Signer_Signature_Typ_Vrsn ********************************************************************************/
		if(contractsignersignaturetypei == 0) {c.addCnctSignerSignatureTypVrsn("[[[");}
		if(contractsignersignaturetype.hasVersion()) {

			c.addCnctSignerSignatureTypVrsn(String.valueOf(contractsignersignaturetype.getVersion()));
		} else {
			c.addCnctSignerSignatureTypVrsn("NULL");
		}

		if(contractsignersignaturetypei == contractsignersignaturetypelist.size()-1) {c.addCnctSignerSignatureTypVrsn("]]]");}


		/******************** Cnct_Signer_Signature_Typ_Cd ********************************************************************************/
		if(contractsignersignaturetypei == 0) {c.addCnctSignerSignatureTypCd("[[[");}
		if(contractsignersignaturetype.hasCode()) {

			c.addCnctSignerSignatureTypCd(String.valueOf(contractsignersignaturetype.getCode()));
		} else {
			c.addCnctSignerSignatureTypCd("NULL");
		}

		if(contractsignersignaturetypei == contractsignersignaturetypelist.size()-1) {c.addCnctSignerSignatureTypCd("]]]");}


		/******************** Cnct_Signer_Signature_Typ_UsrSltd ********************************************************************************/
		if(contractsignersignaturetypei == 0) {c.addCnctSignerSignatureTypUsrSltd("[[[");}
		if(contractsignersignaturetype.hasUserSelected()) {

			c.addCnctSignerSignatureTypUsrSltd(String.valueOf(contractsignersignaturetype.getUserSelected()));
		} else {
			c.addCnctSignerSignatureTypUsrSltd("NULL");
		}

		if(contractsignersignaturetypei == contractsignersignaturetypelist.size()-1) {c.addCnctSignerSignatureTypUsrSltd("]]]");}


		/******************** Cnct_Signer_Signature_Typ_Sys ********************************************************************************/
		if(contractsignersignaturetypei == 0) {c.addCnctSignerSignatureTypSys("[[[");}
		if(contractsignersignaturetype.hasSystem()) {

			c.addCnctSignerSignatureTypSys(String.valueOf(contractsignersignaturetype.getSystem()));
		} else {
			c.addCnctSignerSignatureTypSys("NULL");
		}

		if(contractsignersignaturetypei == contractsignersignaturetypelist.size()-1) {c.addCnctSignerSignatureTypSys("]]]");}


		 };
		/******************** Cnct_Signer_Signature_When ********************************************************************************/
		if(contractsignersignature.hasWhen()) {

			c.addCnctSignerSignatureWhen("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractsignersignature.getWhen())+"\"");
		} else {
			c.addCnctSignerSignatureWhen("NULL");
		}


		/******************** Cnct_Signer_Signature_Data ********************************************************************************/
		if(contractsignersignature.hasData()) {

			c.addCnctSignerSignatureData(new String(contractsignersignature.getData()));
		} else {
			c.addCnctSignerSignatureData("NULL");
		}


		/******************** Cnct_Signer_Signature_Who ********************************************************************************/
		if(contractsignersignature.hasWho()) {

			if(contractsignersignature.getWho().getReference() != null) {
			c.addCnctSignerSignatureWho(contractsignersignature.getWho().getReference());
			}
		} else {
			c.addCnctSignerSignatureWho("NULL");
		}


		/******************** Cnct_Signer_Signature_OnBehalfOf ********************************************************************************/
		if(contractsignersignature.hasOnBehalfOf()) {

			if(contractsignersignature.getOnBehalfOf().getReference() != null) {
			c.addCnctSignerSignatureOnBehalfOf(contractsignersignature.getOnBehalfOf().getReference());
			}
		} else {
			c.addCnctSignerSignatureOnBehalfOf("NULL");
		}


		/******************** Cnct_Signer_Signature_SigFrmat ********************************************************************************/
		if(contractsignersignature.hasSigFormat()) {

			c.addCnctSignerSignatureSigFrmat(String.valueOf(contractsignersignature.getSigFormat()));
		} else {
			c.addCnctSignerSignatureSigFrmat("NULL");
		}


		/******************** Cnct_Signer_Signature_TarFrmat ********************************************************************************/
		if(contractsignersignature.hasTargetFormat()) {

			c.addCnctSignerSignatureTarFrmat(String.valueOf(contractsignersignature.getTargetFormat()));
		} else {
			c.addCnctSignerSignatureTarFrmat("NULL");
		}


		 };
		/******************** Cnct_Signer_Party ********************************************************************************/
		if(contractsigner.hasParty()) {

			if(contractsigner.getParty().getReference() != null) {
			c.addCnctSignerParty(contractsigner.getParty().getReference());
			}
		} else {
			c.addCnctSignerParty("NULL");
		}


		 };
		/******************** contractrule ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.ComputableLanguageComponent> contractrulelist = contract.getRule();
		for(int contractrulei = 0; contractrulei<contractrulelist.size();contractrulei++ ) {
		org.hl7.fhir.r4.model.Contract.ComputableLanguageComponent  contractrule = contractrulelist.get(contractrulei);

		/******************** Cnct_Rule_CntntRfrnc ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntRfrnc("[");}
		if(contractrule.hasContentReference()) {

			if(contractrule.getContentReference().getReference() != null) {
			c.addCnctRuleCntntRfrnc(contractrule.getContentReference().getReference());
			}
		} else {
			c.addCnctRuleCntntRfrnc("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntRfrnc("]");}


		/******************** contractrulecontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractrulecontentattachment = contractrule.getContentAttachment();

		/******************** Cnct_Rule_CntntAttchmnt_Sz ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntSz("[");}
		if(contractrulecontentattachment.hasSize()) {

			c.addCnctRuleCntntAttchmntSz(String.valueOf(contractrulecontentattachment.getSize()));
		} else {
			c.addCnctRuleCntntAttchmntSz("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntSz("]");}


		/******************** Cnct_Rule_CntntAttchmnt_Lnguage ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntLnguage("[");}
		if(contractrulecontentattachment.hasLanguage()) {

			c.addCnctRuleCntntAttchmntLnguage(String.valueOf(contractrulecontentattachment.getLanguage()));
		} else {
			c.addCnctRuleCntntAttchmntLnguage("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntLnguage("]");}


		/******************** Cnct_Rule_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntCntntTyp("[");}
		if(contractrulecontentattachment.hasContentType()) {

			c.addCnctRuleCntntAttchmntCntntTyp(String.valueOf(contractrulecontentattachment.getContentType()));
		} else {
			c.addCnctRuleCntntAttchmntCntntTyp("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntCntntTyp("]");}


		/******************** Cnct_Rule_CntntAttchmnt_Hash ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntHash("[");}
		if(contractrulecontentattachment.hasHash()) {

			c.addCnctRuleCntntAttchmntHash(new String(contractrulecontentattachment.getHash()));
		} else {
			c.addCnctRuleCntntAttchmntHash("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntHash("]");}


		/******************** Cnct_Rule_CntntAttchmnt_Data ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntData("[");}
		if(contractrulecontentattachment.hasData()) {

			c.addCnctRuleCntntAttchmntData(new String(contractrulecontentattachment.getData()));
		} else {
			c.addCnctRuleCntntAttchmntData("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntData("]");}


		/******************** Cnct_Rule_CntntAttchmnt_Creation ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntCreation("[");}
		if(contractrulecontentattachment.hasCreation()) {

			c.addCnctRuleCntntAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractrulecontentattachment.getCreation())+"\"");
		} else {
			c.addCnctRuleCntntAttchmntCreation("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntCreation("]");}


		/******************** Cnct_Rule_CntntAttchmnt_Ttl ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntTtl("[");}
		if(contractrulecontentattachment.hasTitle()) {

			c.addCnctRuleCntntAttchmntTtl(String.valueOf(contractrulecontentattachment.getTitle()));
		} else {
			c.addCnctRuleCntntAttchmntTtl("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntTtl("]");}


		/******************** Cnct_Rule_CntntAttchmnt_Url ********************************************************************************/
		if(contractrulei == 0) {c.addCnctRuleCntntAttchmntUrl("[");}
		if(contractrulecontentattachment.hasUrl()) {

			c.addCnctRuleCntntAttchmntUrl(String.valueOf(contractrulecontentattachment.getUrl()));
		} else {
			c.addCnctRuleCntntAttchmntUrl("NULL");
		}

		if(contractrulei == contractrulelist.size()-1) {c.addCnctRuleCntntAttchmntUrl("]");}


		 };
		/******************** contractfriendly ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Contract.FriendlyLanguageComponent> contractfriendlylist = contract.getFriendly();
		for(int contractfriendlyi = 0; contractfriendlyi<contractfriendlylist.size();contractfriendlyi++ ) {
		org.hl7.fhir.r4.model.Contract.FriendlyLanguageComponent  contractfriendly = contractfriendlylist.get(contractfriendlyi);

		/******************** Cnct_Friendly_CntntRfrnc ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntRfrnc("[");}
		if(contractfriendly.hasContentReference()) {

			if(contractfriendly.getContentReference().getReference() != null) {
			c.addCnctFriendlyCntntRfrnc(contractfriendly.getContentReference().getReference());
			}
		} else {
			c.addCnctFriendlyCntntRfrnc("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntRfrnc("]");}


		/******************** contractfriendlycontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractfriendlycontentattachment = contractfriendly.getContentAttachment();

		/******************** Cnct_Friendly_CntntAttchmnt_Sz ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntSz("[");}
		if(contractfriendlycontentattachment.hasSize()) {

			c.addCnctFriendlyCntntAttchmntSz(String.valueOf(contractfriendlycontentattachment.getSize()));
		} else {
			c.addCnctFriendlyCntntAttchmntSz("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntSz("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_Lnguage ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntLnguage("[");}
		if(contractfriendlycontentattachment.hasLanguage()) {

			c.addCnctFriendlyCntntAttchmntLnguage(String.valueOf(contractfriendlycontentattachment.getLanguage()));
		} else {
			c.addCnctFriendlyCntntAttchmntLnguage("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntLnguage("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntCntntTyp("[");}
		if(contractfriendlycontentattachment.hasContentType()) {

			c.addCnctFriendlyCntntAttchmntCntntTyp(String.valueOf(contractfriendlycontentattachment.getContentType()));
		} else {
			c.addCnctFriendlyCntntAttchmntCntntTyp("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntCntntTyp("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_Hash ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntHash("[");}
		if(contractfriendlycontentattachment.hasHash()) {

			c.addCnctFriendlyCntntAttchmntHash(new String(contractfriendlycontentattachment.getHash()));
		} else {
			c.addCnctFriendlyCntntAttchmntHash("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntHash("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_Data ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntData("[");}
		if(contractfriendlycontentattachment.hasData()) {

			c.addCnctFriendlyCntntAttchmntData(new String(contractfriendlycontentattachment.getData()));
		} else {
			c.addCnctFriendlyCntntAttchmntData("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntData("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_Creation ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntCreation("[");}
		if(contractfriendlycontentattachment.hasCreation()) {

			c.addCnctFriendlyCntntAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(contractfriendlycontentattachment.getCreation())+"\"");
		} else {
			c.addCnctFriendlyCntntAttchmntCreation("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntCreation("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_Ttl ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntTtl("[");}
		if(contractfriendlycontentattachment.hasTitle()) {

			c.addCnctFriendlyCntntAttchmntTtl(String.valueOf(contractfriendlycontentattachment.getTitle()));
		} else {
			c.addCnctFriendlyCntntAttchmntTtl("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntTtl("]");}


		/******************** Cnct_Friendly_CntntAttchmnt_Url ********************************************************************************/
		if(contractfriendlyi == 0) {c.addCnctFriendlyCntntAttchmntUrl("[");}
		if(contractfriendlycontentattachment.hasUrl()) {

			c.addCnctFriendlyCntntAttchmntUrl(String.valueOf(contractfriendlycontentattachment.getUrl()));
		} else {
			c.addCnctFriendlyCntntAttchmntUrl("NULL");
		}

		if(contractfriendlyi == contractfriendlylist.size()-1) {c.addCnctFriendlyCntntAttchmntUrl("]");}


		 };
		/******************** Cnct_InstantiatesCanonical ********************************************************************************/
		if(contract.hasInstantiatesCanonical()) {

			if(contract.getInstantiatesCanonical().getReference() != null) {
			c.addCnctInstantiatesCanonical(contract.getInstantiatesCanonical().getReference());
			}
		} else {
			c.addCnctInstantiatesCanonical("NULL");
		}


		/******************** Cnct_Athr ********************************************************************************/
		if(contract.hasAuthor()) {

			if(contract.getAuthor().getReference() != null) {
			c.addCnctAthr(contract.getAuthor().getReference());
			}
		} else {
			c.addCnctAthr("NULL");
		}


		return c;
	}
}
