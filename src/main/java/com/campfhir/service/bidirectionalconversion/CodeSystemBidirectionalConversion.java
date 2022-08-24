package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CodeSystem;
public class CodeSystemBidirectionalConversion 
{
	public CodeSystem CodeSystems(org.hl7.fhir.r4.model.CodeSystem codesystem) throws ParseException
	{
		 main.java.com.campfhir.model.CodeSystem c = new  main.java.com.campfhir.model.CodeSystem();

		/******************** id ********************************************************************************/
		c.setId(codesystem.getIdElement().getIdPart());

		/******************** CdSys_Nm ********************************************************************************/
		if(codesystem.hasName()) {

			c.addCdSysNm(String.valueOf(codesystem.getName()));
		} else {
			c.addCdSysNm("NULL");
		}


		/******************** codesystemproperty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeSystem.PropertyComponent> codesystempropertylist = codesystem.getProperty();
		for(int codesystempropertyi = 0; codesystempropertyi<codesystempropertylist.size();codesystempropertyi++ ) {
		org.hl7.fhir.r4.model.CodeSystem.PropertyComponent  codesystemproperty = codesystempropertylist.get(codesystempropertyi);

		/******************** codesystempropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.PropertyType codesystempropertytype = codesystemproperty.getType();
		if(codesystempropertytype!=null) {
		if(codesystempropertyi == 0) {

		c.addCdSysPrptyTyp("[");		}
			c.addCdSysPrptyTyp(codesystempropertytype.toCode());
		if(codesystempropertyi == codesystempropertylist.size()-1) {

		c.addCdSysPrptyTyp("]");		}

		} else {
			c.addCdSysPrptyTyp("NULL");
		}

		/******************** CdSys_Prpty_Cd ********************************************************************************/
		if(codesystempropertyi == 0) {c.addCdSysPrptyCd("[");}
		if(codesystemproperty.hasCode()) {

			c.addCdSysPrptyCd(String.valueOf(codesystemproperty.getCode()));
		} else {
			c.addCdSysPrptyCd("NULL");
		}

		if(codesystempropertyi == codesystempropertylist.size()-1) {c.addCdSysPrptyCd("]");}


		/******************** CdSys_Prpty_Dscrptn ********************************************************************************/
		if(codesystempropertyi == 0) {c.addCdSysPrptyDscrptn("[");}
		if(codesystemproperty.hasDescription()) {

			c.addCdSysPrptyDscrptn(String.valueOf(codesystemproperty.getDescription()));
		} else {
			c.addCdSysPrptyDscrptn("NULL");
		}

		if(codesystempropertyi == codesystempropertylist.size()-1) {c.addCdSysPrptyDscrptn("]");}


		/******************** CdSys_Prpty_Uri ********************************************************************************/
		if(codesystempropertyi == 0) {c.addCdSysPrptyUri("[");}
		if(codesystemproperty.hasUri()) {

			c.addCdSysPrptyUri(String.valueOf(codesystemproperty.getUri()));
		} else {
			c.addCdSysPrptyUri("NULL");
		}

		if(codesystempropertyi == codesystempropertylist.size()-1) {c.addCdSysPrptyUri("]");}


		 };
		/******************** codesystemcontent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentMode codesystemcontent = codesystem.getContent();
		if(codesystemcontent!=null) {
			c.addCdSysCntnt(codesystemcontent.toCode());
		} else {
			c.addCdSysCntnt("NULL");
		}

		/******************** CdSys_Cnt ********************************************************************************/
		if(codesystem.hasCount()) {

			c.addCdSysCnt(String.valueOf(codesystem.getCount()));
		} else {
			c.addCdSysCnt("NULL");
		}


		/******************** CdSys_Vrsn ********************************************************************************/
		if(codesystem.hasVersion()) {

			c.addCdSysVrsn(String.valueOf(codesystem.getVersion()));
		} else {
			c.addCdSysVrsn("NULL");
		}


		/******************** codesystemconcept ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent> codesystemconceptlist = codesystem.getConcept();
		for(int codesystemconcepti = 0; codesystemconcepti<codesystemconceptlist.size();codesystemconcepti++ ) {
		org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent  codesystemconcept = codesystemconceptlist.get(codesystemconcepti);

		/******************** codesystemconceptproperty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent> codesystemconceptpropertylist = codesystemconcept.getProperty();
		for(int codesystemconceptpropertyi = 0; codesystemconceptpropertyi<codesystemconceptpropertylist.size();codesystemconceptpropertyi++ ) {
		org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent  codesystemconceptproperty = codesystemconceptpropertylist.get(codesystemconceptpropertyi);

		/******************** CdSys_Cncpt_Prpty_Cd ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyCd("[[");}
		if(codesystemconceptproperty.hasCode()) {

			c.addCdSysCncptPrptyCd(String.valueOf(codesystemconceptproperty.getCode()));
		} else {
			c.addCdSysCncptPrptyCd("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyCd("]]");}


		/******************** CdSys_Cncpt_Prpty_VlDecimalTyp ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlDecimalTyp("[[");}
		if(codesystemconceptproperty.hasValueDecimalType()) {

			c.addCdSysCncptPrptyVlDecimalTyp("\""+codesystemconceptproperty.getValueDecimalType().getValueAsString()+"\"");
		} else {
			c.addCdSysCncptPrptyVlDecimalTyp("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlDecimalTyp("]]");}


		/******************** codesystemconceptpropertyvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemconceptpropertyvaluecoding = codesystemconceptproperty.getValueCoding();

		/******************** CdSys_Cncpt_Prpty_VlCdg_Dsply ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlCdgDsply("[[");}
		if(codesystemconceptpropertyvaluecoding.hasDisplay()) {

			c.addCdSysCncptPrptyVlCdgDsply(String.valueOf(codesystemconceptpropertyvaluecoding.getDisplay()));
		} else {
			c.addCdSysCncptPrptyVlCdgDsply("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlCdgDsply("]]");}


		/******************** CdSys_Cncpt_Prpty_VlCdg_Vrsn ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlCdgVrsn("[[");}
		if(codesystemconceptpropertyvaluecoding.hasVersion()) {

			c.addCdSysCncptPrptyVlCdgVrsn(String.valueOf(codesystemconceptpropertyvaluecoding.getVersion()));
		} else {
			c.addCdSysCncptPrptyVlCdgVrsn("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlCdgVrsn("]]");}


		/******************** CdSys_Cncpt_Prpty_VlCdg_Cd ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlCdgCd("[[");}
		if(codesystemconceptpropertyvaluecoding.hasCode()) {

			c.addCdSysCncptPrptyVlCdgCd(String.valueOf(codesystemconceptpropertyvaluecoding.getCode()));
		} else {
			c.addCdSysCncptPrptyVlCdgCd("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlCdgCd("]]");}


		/******************** CdSys_Cncpt_Prpty_VlCdg_UsrSltd ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlCdgUsrSltd("[[");}
		if(codesystemconceptpropertyvaluecoding.hasUserSelected()) {

			c.addCdSysCncptPrptyVlCdgUsrSltd(String.valueOf(codesystemconceptpropertyvaluecoding.getUserSelected()));
		} else {
			c.addCdSysCncptPrptyVlCdgUsrSltd("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlCdgUsrSltd("]]");}


		/******************** CdSys_Cncpt_Prpty_VlCdg_Sys ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlCdgSys("[[");}
		if(codesystemconceptpropertyvaluecoding.hasSystem()) {

			c.addCdSysCncptPrptyVlCdgSys(String.valueOf(codesystemconceptpropertyvaluecoding.getSystem()));
		} else {
			c.addCdSysCncptPrptyVlCdgSys("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlCdgSys("]]");}


		/******************** CdSys_Cncpt_Prpty_VlCdTyp ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlCdTyp("[[");}
		if(codesystemconceptproperty.hasValueCodeType()) {

			c.addCdSysCncptPrptyVlCdTyp("\""+codesystemconceptproperty.getValueCodeType().getValueAsString()+"\"");
		} else {
			c.addCdSysCncptPrptyVlCdTyp("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlCdTyp("]]");}


		/******************** CdSys_Cncpt_Prpty_VlBooleanTyp ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlBooleanTyp("[[");}
		if(codesystemconceptproperty.hasValueBooleanType()) {

			c.addCdSysCncptPrptyVlBooleanTyp("\""+codesystemconceptproperty.getValueBooleanType().getValueAsString()+"\"");
		} else {
			c.addCdSysCncptPrptyVlBooleanTyp("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlBooleanTyp("]]");}


		/******************** CdSys_Cncpt_Prpty_VlDtTimeTyp ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlDtTimeTyp("[[");}
		if(codesystemconceptproperty.hasValueDateTimeType()) {

			c.addCdSysCncptPrptyVlDtTimeTyp("\""+codesystemconceptproperty.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCdSysCncptPrptyVlDtTimeTyp("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlDtTimeTyp("]]");}


		/******************** CdSys_Cncpt_Prpty_VlIntegerTyp ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlIntegerTyp("[[");}
		if(codesystemconceptproperty.hasValueIntegerType()) {

			c.addCdSysCncptPrptyVlIntegerTyp("\""+codesystemconceptproperty.getValueIntegerType().getValueAsString()+"\"");
		} else {
			c.addCdSysCncptPrptyVlIntegerTyp("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlIntegerTyp("]]");}


		/******************** CdSys_Cncpt_Prpty_VlStrgTyp ********************************************************************************/
		if(codesystemconceptpropertyi == 0) {c.addCdSysCncptPrptyVlStrgTyp("[[");}
		if(codesystemconceptproperty.hasValueStringType()) {

			c.addCdSysCncptPrptyVlStrgTyp("\""+codesystemconceptproperty.getValueStringType().getValueAsString()+"\"");
		} else {
			c.addCdSysCncptPrptyVlStrgTyp("NULL");
		}

		if(codesystemconceptpropertyi == codesystemconceptpropertylist.size()-1) {c.addCdSysCncptPrptyVlStrgTyp("]]");}


		 };
		/******************** CdSys_Cncpt_Dfn ********************************************************************************/
		if(codesystemconcept.hasDefinition()) {

			c.addCdSysCncptDfn(String.valueOf(codesystemconcept.getDefinition()));
		} else {
			c.addCdSysCncptDfn("NULL");
		}


		/******************** CdSys_Cncpt_Cd ********************************************************************************/
		if(codesystemconcept.hasCode()) {

			c.addCdSysCncptCd(String.valueOf(codesystemconcept.getCode()));
		} else {
			c.addCdSysCncptCd("NULL");
		}


		/******************** codesystemconceptdesignation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent> codesystemconceptdesignationlist = codesystemconcept.getDesignation();
		for(int codesystemconceptdesignationi = 0; codesystemconceptdesignationi<codesystemconceptdesignationlist.size();codesystemconceptdesignationi++ ) {
		org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent  codesystemconceptdesignation = codesystemconceptdesignationlist.get(codesystemconceptdesignationi);

		/******************** CdSys_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(codesystemconceptdesignationi == 0) {c.addCdSysCncptDsgnationVl("[[");}
		if(codesystemconceptdesignation.hasValue()) {

			c.addCdSysCncptDsgnationVl(String.valueOf(codesystemconceptdesignation.getValue()));
		} else {
			c.addCdSysCncptDsgnationVl("NULL");
		}

		if(codesystemconceptdesignationi == codesystemconceptdesignationlist.size()-1) {c.addCdSysCncptDsgnationVl("]]");}


		/******************** CdSys_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(codesystemconceptdesignationi == 0) {c.addCdSysCncptDsgnationLnguage("[[");}
		if(codesystemconceptdesignation.hasLanguage()) {

			c.addCdSysCncptDsgnationLnguage(String.valueOf(codesystemconceptdesignation.getLanguage()));
		} else {
			c.addCdSysCncptDsgnationLnguage("NULL");
		}

		if(codesystemconceptdesignationi == codesystemconceptdesignationlist.size()-1) {c.addCdSysCncptDsgnationLnguage("]]");}


		/******************** codesystemconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemconceptdesignationuse = codesystemconceptdesignation.getUse();

		/******************** CdSys_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(codesystemconceptdesignationi == 0) {c.addCdSysCncptDsgnationUseDsply("[[");}
		if(codesystemconceptdesignationuse.hasDisplay()) {

			c.addCdSysCncptDsgnationUseDsply(String.valueOf(codesystemconceptdesignationuse.getDisplay()));
		} else {
			c.addCdSysCncptDsgnationUseDsply("NULL");
		}

		if(codesystemconceptdesignationi == codesystemconceptdesignationlist.size()-1) {c.addCdSysCncptDsgnationUseDsply("]]");}


		/******************** CdSys_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(codesystemconceptdesignationi == 0) {c.addCdSysCncptDsgnationUseVrsn("[[");}
		if(codesystemconceptdesignationuse.hasVersion()) {

			c.addCdSysCncptDsgnationUseVrsn(String.valueOf(codesystemconceptdesignationuse.getVersion()));
		} else {
			c.addCdSysCncptDsgnationUseVrsn("NULL");
		}

		if(codesystemconceptdesignationi == codesystemconceptdesignationlist.size()-1) {c.addCdSysCncptDsgnationUseVrsn("]]");}


		/******************** CdSys_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(codesystemconceptdesignationi == 0) {c.addCdSysCncptDsgnationUseCd("[[");}
		if(codesystemconceptdesignationuse.hasCode()) {

			c.addCdSysCncptDsgnationUseCd(String.valueOf(codesystemconceptdesignationuse.getCode()));
		} else {
			c.addCdSysCncptDsgnationUseCd("NULL");
		}

		if(codesystemconceptdesignationi == codesystemconceptdesignationlist.size()-1) {c.addCdSysCncptDsgnationUseCd("]]");}


		/******************** CdSys_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(codesystemconceptdesignationi == 0) {c.addCdSysCncptDsgnationUseSys("[[");}
		if(codesystemconceptdesignationuse.hasSystem()) {

			c.addCdSysCncptDsgnationUseSys(String.valueOf(codesystemconceptdesignationuse.getSystem()));
		} else {
			c.addCdSysCncptDsgnationUseSys("NULL");
		}

		if(codesystemconceptdesignationi == codesystemconceptdesignationlist.size()-1) {c.addCdSysCncptDsgnationUseSys("]]");}


		 };
		 };
		/******************** codesystemfilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent> codesystemfilterlist = codesystem.getFilter();
		for(int codesystemfilteri = 0; codesystemfilteri<codesystemfilterlist.size();codesystemfilteri++ ) {
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent  codesystemfilter = codesystemfilterlist.get(codesystemfilteri);

		/******************** CdSys_Fltr_Vl ********************************************************************************/
		if(codesystemfilteri == 0) {c.addCdSysFltrVl("[");}
		if(codesystemfilter.hasValue()) {

			c.addCdSysFltrVl(String.valueOf(codesystemfilter.getValue()));
		} else {
			c.addCdSysFltrVl("NULL");
		}

		if(codesystemfilteri == codesystemfilterlist.size()-1) {c.addCdSysFltrVl("]");}


		/******************** CdSys_Fltr_Cd ********************************************************************************/
		if(codesystemfilteri == 0) {c.addCdSysFltrCd("[");}
		if(codesystemfilter.hasCode()) {

			c.addCdSysFltrCd(String.valueOf(codesystemfilter.getCode()));
		} else {
			c.addCdSysFltrCd("NULL");
		}

		if(codesystemfilteri == codesystemfilterlist.size()-1) {c.addCdSysFltrCd("]");}


		/******************** CdSys_Fltr_Dscrptn ********************************************************************************/
		if(codesystemfilteri == 0) {c.addCdSysFltrDscrptn("[");}
		if(codesystemfilter.hasDescription()) {

			c.addCdSysFltrDscrptn(String.valueOf(codesystemfilter.getDescription()));
		} else {
			c.addCdSysFltrDscrptn("NULL");
		}

		if(codesystemfilteri == codesystemfilterlist.size()-1) {c.addCdSysFltrDscrptn("]");}


		/******************** codesystemfilteroperator ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CodeSystem.FilterOperator>> codesystemfilteroperatorlist = codesystemfilter.getOperator();
		for(int codesystemfilteroperatori = 0; codesystemfilteroperatori<codesystemfilteroperatorlist.size();codesystemfilteroperatori++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CodeSystem.FilterOperator>  codesystemfilteroperator = codesystemfilteroperatorlist.get(codesystemfilteroperatori);
		if(codesystemfilteroperator!=null) {
			c.addCdSysFltrOperator(codesystemfilteroperator.getCode());
		} else {
			c.addCdSysFltrOperator("NULL");
		}
		 };

		 };
		/******************** CdSys_Dt ********************************************************************************/
		if(codesystem.hasDate()) {

			c.addCdSysDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(codesystem.getDate())+"\"");
		} else {
			c.addCdSysDt("NULL");
		}


		/******************** codesystemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus codesystemstatus = codesystem.getStatus();
		if(codesystemstatus!=null) {
			c.addCdSysSts(codesystemstatus.toCode());
		} else {
			c.addCdSysSts("NULL");
		}

		/******************** CdSys_Dscrptn ********************************************************************************/
		if(codesystem.hasDescription()) {

			c.addCdSysDscrptn(String.valueOf(codesystem.getDescription()));
		} else {
			c.addCdSysDscrptn("NULL");
		}


		/******************** codesystemidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> codesystemidentifierlist = codesystem.getIdentifier();
		for(int codesystemidentifieri = 0; codesystemidentifieri<codesystemidentifierlist.size();codesystemidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  codesystemidentifier = codesystemidentifierlist.get(codesystemidentifieri);

		/******************** CdSys_Id_Vl ********************************************************************************/
		if(codesystemidentifieri == 0) {c.addCdSysIdVl("[");}
		if(codesystemidentifier.hasValue()) {

			c.addCdSysIdVl(String.valueOf(codesystemidentifier.getValue()));
		} else {
			c.addCdSysIdVl("NULL");
		}

		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {c.addCdSysIdVl("]");}


		/******************** codesystemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemidentifiertype = codesystemidentifier.getType();

		/******************** CdSys_Id_Typ_Txt ********************************************************************************/
		if(codesystemidentifieri == 0) {c.addCdSysIdTypTxt("[");}
		if(codesystemidentifiertype.hasText()) {

			c.addCdSysIdTypTxt(String.valueOf(codesystemidentifiertype.getText()));
		} else {
			c.addCdSysIdTypTxt("NULL");
		}

		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {c.addCdSysIdTypTxt("]");}


		/******************** codesystemidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> codesystemidentifiertypecodinglist = codesystemidentifiertype.getCoding();
		for(int codesystemidentifiertypecodingi = 0; codesystemidentifiertypecodingi<codesystemidentifiertypecodinglist.size();codesystemidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  codesystemidentifiertypecoding = codesystemidentifiertypecodinglist.get(codesystemidentifiertypecodingi);

		/******************** CdSys_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(codesystemidentifiertypecodingi == 0) {c.addCdSysIdTypCdgDsply("[[");}
		if(codesystemidentifiertypecoding.hasDisplay()) {

			c.addCdSysIdTypCdgDsply(String.valueOf(codesystemidentifiertypecoding.getDisplay()));
		} else {
			c.addCdSysIdTypCdgDsply("NULL");
		}

		if(codesystemidentifiertypecodingi == codesystemidentifiertypecodinglist.size()-1) {c.addCdSysIdTypCdgDsply("]]");}


		/******************** CdSys_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(codesystemidentifiertypecodingi == 0) {c.addCdSysIdTypCdgVrsn("[[");}
		if(codesystemidentifiertypecoding.hasVersion()) {

			c.addCdSysIdTypCdgVrsn(String.valueOf(codesystemidentifiertypecoding.getVersion()));
		} else {
			c.addCdSysIdTypCdgVrsn("NULL");
		}

		if(codesystemidentifiertypecodingi == codesystemidentifiertypecodinglist.size()-1) {c.addCdSysIdTypCdgVrsn("]]");}


		/******************** CdSys_Id_Typ_Cdg_Cd ********************************************************************************/
		if(codesystemidentifiertypecodingi == 0) {c.addCdSysIdTypCdgCd("[[");}
		if(codesystemidentifiertypecoding.hasCode()) {

			c.addCdSysIdTypCdgCd(String.valueOf(codesystemidentifiertypecoding.getCode()));
		} else {
			c.addCdSysIdTypCdgCd("NULL");
		}

		if(codesystemidentifiertypecodingi == codesystemidentifiertypecodinglist.size()-1) {c.addCdSysIdTypCdgCd("]]");}


		/******************** CdSys_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(codesystemidentifiertypecodingi == 0) {c.addCdSysIdTypCdgUsrSltd("[[");}
		if(codesystemidentifiertypecoding.hasUserSelected()) {

			c.addCdSysIdTypCdgUsrSltd(String.valueOf(codesystemidentifiertypecoding.getUserSelected()));
		} else {
			c.addCdSysIdTypCdgUsrSltd("NULL");
		}

		if(codesystemidentifiertypecodingi == codesystemidentifiertypecodinglist.size()-1) {c.addCdSysIdTypCdgUsrSltd("]]");}


		/******************** CdSys_Id_Typ_Cdg_Sys ********************************************************************************/
		if(codesystemidentifiertypecodingi == 0) {c.addCdSysIdTypCdgSys("[[");}
		if(codesystemidentifiertypecoding.hasSystem()) {

			c.addCdSysIdTypCdgSys(String.valueOf(codesystemidentifiertypecoding.getSystem()));
		} else {
			c.addCdSysIdTypCdgSys("NULL");
		}

		if(codesystemidentifiertypecodingi == codesystemidentifiertypecodinglist.size()-1) {c.addCdSysIdTypCdgSys("]]");}


		 };
		/******************** codesystemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period codesystemidentifierperiod = codesystemidentifier.getPeriod();

		/******************** CdSys_Id_Prd_Strt ********************************************************************************/
		if(codesystemidentifieri == 0) {c.addCdSysIdPrdStrt("[");}
		if(codesystemidentifierperiod.hasStart()) {

			c.addCdSysIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(codesystemidentifierperiod.getStart())+"\"");
		} else {
			c.addCdSysIdPrdStrt("NULL");
		}

		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {c.addCdSysIdPrdStrt("]");}


		/******************** CdSys_Id_Prd_End ********************************************************************************/
		if(codesystemidentifieri == 0) {c.addCdSysIdPrdEnd("[");}
		if(codesystemidentifierperiod.hasEnd()) {

			c.addCdSysIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(codesystemidentifierperiod.getEnd())+"\"");
		} else {
			c.addCdSysIdPrdEnd("NULL");
		}

		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {c.addCdSysIdPrdEnd("]");}


		/******************** codesystemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse codesystemidentifieruse = codesystemidentifier.getUse();
		if(codesystemidentifieruse!=null) {
		if(codesystemidentifieri == 0) {

		c.addCdSysIdUse("[");		}
			c.addCdSysIdUse(codesystemidentifieruse.toCode());
		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {

		c.addCdSysIdUse("]");		}

		} else {
			c.addCdSysIdUse("NULL");
		}

		/******************** CdSys_Id_Assigner ********************************************************************************/
		if(codesystemidentifieri == 0) {c.addCdSysIdAssigner("[");}
		if(codesystemidentifier.hasAssigner()) {

			if(codesystemidentifier.getAssigner().getReference() != null) {
			c.addCdSysIdAssigner(codesystemidentifier.getAssigner().getReference());
			}
		} else {
			c.addCdSysIdAssigner("NULL");
		}

		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {c.addCdSysIdAssigner("]");}


		/******************** CdSys_Id_Sys ********************************************************************************/
		if(codesystemidentifieri == 0) {c.addCdSysIdSys("[");}
		if(codesystemidentifier.hasSystem()) {

			c.addCdSysIdSys(String.valueOf(codesystemidentifier.getSystem()));
		} else {
			c.addCdSysIdSys("NULL");
		}

		if(codesystemidentifieri == codesystemidentifierlist.size()-1) {c.addCdSysIdSys("]");}


		 };
		/******************** codesystemcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> codesystemcontactlist = codesystem.getContact();
		for(int codesystemcontacti = 0; codesystemcontacti<codesystemcontactlist.size();codesystemcontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  codesystemcontact = codesystemcontactlist.get(codesystemcontacti);

		/******************** CdSys_Cntct_Nm ********************************************************************************/
		if(codesystemcontacti == 0) {c.addCdSysCntctNm("[");}
		if(codesystemcontact.hasName()) {

			c.addCdSysCntctNm(String.valueOf(codesystemcontact.getName()));
		} else {
			c.addCdSysCntctNm("NULL");
		}

		if(codesystemcontacti == codesystemcontactlist.size()-1) {c.addCdSysCntctNm("]");}


		/******************** codesystemcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> codesystemcontacttelecomlist = codesystemcontact.getTelecom();
		for(int codesystemcontacttelecomi = 0; codesystemcontacttelecomi<codesystemcontacttelecomlist.size();codesystemcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  codesystemcontacttelecom = codesystemcontacttelecomlist.get(codesystemcontacttelecomi);

		/******************** CdSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(codesystemcontacttelecomi == 0) {c.addCdSysCntctTlcmVl("[[");}
		if(codesystemcontacttelecom.hasValue()) {

			c.addCdSysCntctTlcmVl(String.valueOf(codesystemcontacttelecom.getValue()));
		} else {
			c.addCdSysCntctTlcmVl("NULL");
		}

		if(codesystemcontacttelecomi == codesystemcontacttelecomlist.size()-1) {c.addCdSysCntctTlcmVl("]]");}


		/******************** codesystemcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period codesystemcontacttelecomperiod = codesystemcontacttelecom.getPeriod();

		/******************** CdSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(codesystemcontacttelecomi == 0) {c.addCdSysCntctTlcmPrdStrt("[[");}
		if(codesystemcontacttelecomperiod.hasStart()) {

			c.addCdSysCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(codesystemcontacttelecomperiod.getStart())+"\"");
		} else {
			c.addCdSysCntctTlcmPrdStrt("NULL");
		}

		if(codesystemcontacttelecomi == codesystemcontacttelecomlist.size()-1) {c.addCdSysCntctTlcmPrdStrt("]]");}


		/******************** CdSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(codesystemcontacttelecomi == 0) {c.addCdSysCntctTlcmPrdEnd("[[");}
		if(codesystemcontacttelecomperiod.hasEnd()) {

			c.addCdSysCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(codesystemcontacttelecomperiod.getEnd())+"\"");
		} else {
			c.addCdSysCntctTlcmPrdEnd("NULL");
		}

		if(codesystemcontacttelecomi == codesystemcontacttelecomlist.size()-1) {c.addCdSysCntctTlcmPrdEnd("]]");}


		/******************** codesystemcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse codesystemcontacttelecomuse = codesystemcontacttelecom.getUse();
		if(codesystemcontacttelecomuse!=null) {
		if(codesystemcontacttelecomi == 0) {

		c.addCdSysCntctTlcmUse("[[");		}
			c.addCdSysCntctTlcmUse(codesystemcontacttelecomuse.toCode());
		if(codesystemcontacttelecomi == codesystemcontacttelecomlist.size()-1) {

		c.addCdSysCntctTlcmUse("]]");		}

		} else {
			c.addCdSysCntctTlcmUse("NULL");
		}

		/******************** codesystemcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem codesystemcontacttelecomsystem = codesystemcontacttelecom.getSystem();
		if(codesystemcontacttelecomsystem!=null) {
		if(codesystemcontacttelecomi == 0) {

		c.addCdSysCntctTlcmSys("[[");		}
			c.addCdSysCntctTlcmSys(codesystemcontacttelecomsystem.toCode());
		if(codesystemcontacttelecomi == codesystemcontacttelecomlist.size()-1) {

		c.addCdSysCntctTlcmSys("]]");		}

		} else {
			c.addCdSysCntctTlcmSys("NULL");
		}

		/******************** CdSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(codesystemcontacttelecomi == 0) {c.addCdSysCntctTlcmRnk("[[");}
		if(codesystemcontacttelecom.hasRank()) {

			c.addCdSysCntctTlcmRnk(String.valueOf(codesystemcontacttelecom.getRank()));
		} else {
			c.addCdSysCntctTlcmRnk("NULL");
		}

		if(codesystemcontacttelecomi == codesystemcontacttelecomlist.size()-1) {c.addCdSysCntctTlcmRnk("]]");}


		 };
		 };
		/******************** CdSys_Copyright ********************************************************************************/
		if(codesystem.hasCopyright()) {

			c.addCdSysCopyright(String.valueOf(codesystem.getCopyright()));
		} else {
			c.addCdSysCopyright("NULL");
		}


		/******************** codesystemhierarchymeaning ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaning codesystemhierarchymeaning = codesystem.getHierarchyMeaning();
		if(codesystemhierarchymeaning!=null) {
			c.addCdSysHierarchyMeaning(codesystemhierarchymeaning.toCode());
		} else {
			c.addCdSysHierarchyMeaning("NULL");
		}

		/******************** CdSys_Ttl ********************************************************************************/
		if(codesystem.hasTitle()) {

			c.addCdSysTtl(String.valueOf(codesystem.getTitle()));
		} else {
			c.addCdSysTtl("NULL");
		}


		/******************** CdSys_Prpse ********************************************************************************/
		if(codesystem.hasPurpose()) {

			c.addCdSysPrpse(String.valueOf(codesystem.getPurpose()));
		} else {
			c.addCdSysPrpse("NULL");
		}


		/******************** CdSys_Url ********************************************************************************/
		if(codesystem.hasUrl()) {

			c.addCdSysUrl(String.valueOf(codesystem.getUrl()));
		} else {
			c.addCdSysUrl("NULL");
		}


		/******************** codesystemjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> codesystemjurisdictionlist = codesystem.getJurisdiction();
		for(int codesystemjurisdictioni = 0; codesystemjurisdictioni<codesystemjurisdictionlist.size();codesystemjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  codesystemjurisdiction = codesystemjurisdictionlist.get(codesystemjurisdictioni);

		/******************** CdSys_Jrsdctn_Txt ********************************************************************************/
		if(codesystemjurisdictioni == 0) {c.addCdSysJrsdctnTxt("[");}
		if(codesystemjurisdiction.hasText()) {

			c.addCdSysJrsdctnTxt(String.valueOf(codesystemjurisdiction.getText()));
		} else {
			c.addCdSysJrsdctnTxt("NULL");
		}

		if(codesystemjurisdictioni == codesystemjurisdictionlist.size()-1) {c.addCdSysJrsdctnTxt("]");}


		/******************** codesystemjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> codesystemjurisdictioncodinglist = codesystemjurisdiction.getCoding();
		for(int codesystemjurisdictioncodingi = 0; codesystemjurisdictioncodingi<codesystemjurisdictioncodinglist.size();codesystemjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  codesystemjurisdictioncoding = codesystemjurisdictioncodinglist.get(codesystemjurisdictioncodingi);

		/******************** CdSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(codesystemjurisdictioncodingi == 0) {c.addCdSysJrsdctnCdgDsply("[[");}
		if(codesystemjurisdictioncoding.hasDisplay()) {

			c.addCdSysJrsdctnCdgDsply(String.valueOf(codesystemjurisdictioncoding.getDisplay()));
		} else {
			c.addCdSysJrsdctnCdgDsply("NULL");
		}

		if(codesystemjurisdictioncodingi == codesystemjurisdictioncodinglist.size()-1) {c.addCdSysJrsdctnCdgDsply("]]");}


		/******************** CdSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(codesystemjurisdictioncodingi == 0) {c.addCdSysJrsdctnCdgVrsn("[[");}
		if(codesystemjurisdictioncoding.hasVersion()) {

			c.addCdSysJrsdctnCdgVrsn(String.valueOf(codesystemjurisdictioncoding.getVersion()));
		} else {
			c.addCdSysJrsdctnCdgVrsn("NULL");
		}

		if(codesystemjurisdictioncodingi == codesystemjurisdictioncodinglist.size()-1) {c.addCdSysJrsdctnCdgVrsn("]]");}


		/******************** CdSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(codesystemjurisdictioncodingi == 0) {c.addCdSysJrsdctnCdgCd("[[");}
		if(codesystemjurisdictioncoding.hasCode()) {

			c.addCdSysJrsdctnCdgCd(String.valueOf(codesystemjurisdictioncoding.getCode()));
		} else {
			c.addCdSysJrsdctnCdgCd("NULL");
		}

		if(codesystemjurisdictioncodingi == codesystemjurisdictioncodinglist.size()-1) {c.addCdSysJrsdctnCdgCd("]]");}


		/******************** CdSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(codesystemjurisdictioncodingi == 0) {c.addCdSysJrsdctnCdgUsrSltd("[[");}
		if(codesystemjurisdictioncoding.hasUserSelected()) {

			c.addCdSysJrsdctnCdgUsrSltd(String.valueOf(codesystemjurisdictioncoding.getUserSelected()));
		} else {
			c.addCdSysJrsdctnCdgUsrSltd("NULL");
		}

		if(codesystemjurisdictioncodingi == codesystemjurisdictioncodinglist.size()-1) {c.addCdSysJrsdctnCdgUsrSltd("]]");}


		/******************** CdSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(codesystemjurisdictioncodingi == 0) {c.addCdSysJrsdctnCdgSys("[[");}
		if(codesystemjurisdictioncoding.hasSystem()) {

			c.addCdSysJrsdctnCdgSys(String.valueOf(codesystemjurisdictioncoding.getSystem()));
		} else {
			c.addCdSysJrsdctnCdgSys("NULL");
		}

		if(codesystemjurisdictioncodingi == codesystemjurisdictioncodinglist.size()-1) {c.addCdSysJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** codesystemusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> codesystemusecontextlist = codesystem.getUseContext();
		for(int codesystemusecontexti = 0; codesystemusecontexti<codesystemusecontextlist.size();codesystemusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  codesystemusecontext = codesystemusecontextlist.get(codesystemusecontexti);

		/******************** codesystemusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemusecontextcode = codesystemusecontext.getCode();

		/******************** CdSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtCdDsply("[");}
		if(codesystemusecontextcode.hasDisplay()) {

			c.addCdSysUseCntxtCdDsply(String.valueOf(codesystemusecontextcode.getDisplay()));
		} else {
			c.addCdSysUseCntxtCdDsply("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtCdDsply("]");}


		/******************** CdSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtCdVrsn("[");}
		if(codesystemusecontextcode.hasVersion()) {

			c.addCdSysUseCntxtCdVrsn(String.valueOf(codesystemusecontextcode.getVersion()));
		} else {
			c.addCdSysUseCntxtCdVrsn("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtCdVrsn("]");}


		/******************** CdSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtCdUsrSltd("[");}
		if(codesystemusecontextcode.hasUserSelected()) {

			c.addCdSysUseCntxtCdUsrSltd(String.valueOf(codesystemusecontextcode.getUserSelected()));
		} else {
			c.addCdSysUseCntxtCdUsrSltd("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtCdUsrSltd("]");}


		/******************** CdSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtCdSys("[");}
		if(codesystemusecontextcode.hasSystem()) {

			c.addCdSysUseCntxtCdSys(String.valueOf(codesystemusecontextcode.getSystem()));
		} else {
			c.addCdSysUseCntxtCdSys("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtCdSys("]");}


		/******************** CdSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRfrnc("[");}
		if(codesystemusecontext.hasValueReference()) {

			if(codesystemusecontext.getValueReference().getReference() != null) {
			c.addCdSysUseCntxtVlRfrnc(codesystemusecontext.getValueReference().getReference());
			}
		} else {
			c.addCdSysUseCntxtVlRfrnc("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRfrnc("]");}


		/******************** codesystemusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemusecontextvaluecodeableconcept = codesystemusecontext.getValueCodeableConcept();

		/******************** CdSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlCdbleCncptTxt("[");}
		if(codesystemusecontextvaluecodeableconcept.hasText()) {

			c.addCdSysUseCntxtVlCdbleCncptTxt(String.valueOf(codesystemusecontextvaluecodeableconcept.getText()));
		} else {
			c.addCdSysUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlCdbleCncptTxt("]");}


		/******************** codesystemusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> codesystemusecontextvaluecodeableconceptcodinglist = codesystemusecontextvaluecodeableconcept.getCoding();
		for(int codesystemusecontextvaluecodeableconceptcodingi = 0; codesystemusecontextvaluecodeableconceptcodingi<codesystemusecontextvaluecodeableconceptcodinglist.size();codesystemusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  codesystemusecontextvaluecodeableconceptcoding = codesystemusecontextvaluecodeableconceptcodinglist.get(codesystemusecontextvaluecodeableconceptcodingi);

		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcodingi == 0) {c.addCdSysUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(codesystemusecontextvaluecodeableconceptcoding.hasDisplay()) {

			c.addCdSysUseCntxtVlCdbleCncptCdgDsply(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			c.addCdSysUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(codesystemusecontextvaluecodeableconceptcodingi == codesystemusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCdSysUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcodingi == 0) {c.addCdSysUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(codesystemusecontextvaluecodeableconceptcoding.hasVersion()) {

			c.addCdSysUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			c.addCdSysUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(codesystemusecontextvaluecodeableconceptcodingi == codesystemusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCdSysUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcodingi == 0) {c.addCdSysUseCntxtVlCdbleCncptCdgCd("[[");}
		if(codesystemusecontextvaluecodeableconceptcoding.hasCode()) {

			c.addCdSysUseCntxtVlCdbleCncptCdgCd(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			c.addCdSysUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(codesystemusecontextvaluecodeableconceptcodingi == codesystemusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCdSysUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcodingi == 0) {c.addCdSysUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(codesystemusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			c.addCdSysUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			c.addCdSysUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(codesystemusecontextvaluecodeableconceptcodingi == codesystemusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCdSysUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcodingi == 0) {c.addCdSysUseCntxtVlCdbleCncptCdgSys("[[");}
		if(codesystemusecontextvaluecodeableconceptcoding.hasSystem()) {

			c.addCdSysUseCntxtVlCdbleCncptCdgSys(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			c.addCdSysUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(codesystemusecontextvaluecodeableconceptcodingi == codesystemusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCdSysUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** codesystemusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range codesystemusecontextvaluerange = codesystemusecontext.getValueRange();

		/******************** codesystemusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluerangelow = codesystemusecontextvaluerange.getLow();

		/******************** CdSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngLwVl("[");}
		if(codesystemusecontextvaluerangelow.hasValue()) {

			c.addCdSysUseCntxtVlRngLwVl(String.valueOf(codesystemusecontextvaluerangelow.getValue()));
		} else {
			c.addCdSysUseCntxtVlRngLwVl("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngLwVl("]");}


		/******************** codesystemusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator codesystemusecontextvaluerangelowcomparator = codesystemusecontextvaluerangelow.getComparator();
		if(codesystemusecontextvaluerangelowcomparator!=null) {
		if(codesystemusecontexti == 0) {

		c.addCdSysUseCntxtVlRngLwCmprtr("[");		}
			c.addCdSysUseCntxtVlRngLwCmprtr(codesystemusecontextvaluerangelowcomparator.toCode());
		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {

		c.addCdSysUseCntxtVlRngLwCmprtr("]");		}

		} else {
			c.addCdSysUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** CdSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngLwCd("[");}
		if(codesystemusecontextvaluerangelow.hasCode()) {

			c.addCdSysUseCntxtVlRngLwCd(String.valueOf(codesystemusecontextvaluerangelow.getCode()));
		} else {
			c.addCdSysUseCntxtVlRngLwCd("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngLwCd("]");}


		/******************** CdSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngLwUnt("[");}
		if(codesystemusecontextvaluerangelow.hasUnit()) {

			c.addCdSysUseCntxtVlRngLwUnt(String.valueOf(codesystemusecontextvaluerangelow.getUnit()));
		} else {
			c.addCdSysUseCntxtVlRngLwUnt("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngLwUnt("]");}


		/******************** CdSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngLwSys("[");}
		if(codesystemusecontextvaluerangelow.hasSystem()) {

			c.addCdSysUseCntxtVlRngLwSys(String.valueOf(codesystemusecontextvaluerangelow.getSystem()));
		} else {
			c.addCdSysUseCntxtVlRngLwSys("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngLwSys("]");}


		/******************** codesystemusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluerangehigh = codesystemusecontextvaluerange.getHigh();

		/******************** CdSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngHiVl("[");}
		if(codesystemusecontextvaluerangehigh.hasValue()) {

			c.addCdSysUseCntxtVlRngHiVl(String.valueOf(codesystemusecontextvaluerangehigh.getValue()));
		} else {
			c.addCdSysUseCntxtVlRngHiVl("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngHiVl("]");}


		/******************** codesystemusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator codesystemusecontextvaluerangehighcomparator = codesystemusecontextvaluerangehigh.getComparator();
		if(codesystemusecontextvaluerangehighcomparator!=null) {
		if(codesystemusecontexti == 0) {

		c.addCdSysUseCntxtVlRngHiCmprtr("[");		}
			c.addCdSysUseCntxtVlRngHiCmprtr(codesystemusecontextvaluerangehighcomparator.toCode());
		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {

		c.addCdSysUseCntxtVlRngHiCmprtr("]");		}

		} else {
			c.addCdSysUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** CdSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngHiCd("[");}
		if(codesystemusecontextvaluerangehigh.hasCode()) {

			c.addCdSysUseCntxtVlRngHiCd(String.valueOf(codesystemusecontextvaluerangehigh.getCode()));
		} else {
			c.addCdSysUseCntxtVlRngHiCd("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngHiCd("]");}


		/******************** CdSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngHiUnt("[");}
		if(codesystemusecontextvaluerangehigh.hasUnit()) {

			c.addCdSysUseCntxtVlRngHiUnt(String.valueOf(codesystemusecontextvaluerangehigh.getUnit()));
		} else {
			c.addCdSysUseCntxtVlRngHiUnt("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngHiUnt("]");}


		/******************** CdSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlRngHiSys("[");}
		if(codesystemusecontextvaluerangehigh.hasSystem()) {

			c.addCdSysUseCntxtVlRngHiSys(String.valueOf(codesystemusecontextvaluerangehigh.getSystem()));
		} else {
			c.addCdSysUseCntxtVlRngHiSys("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlRngHiSys("]");}


		/******************** codesystemusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluequantity = codesystemusecontext.getValueQuantity();

		/******************** CdSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlQntyVl("[");}
		if(codesystemusecontextvaluequantity.hasValue()) {

			c.addCdSysUseCntxtVlQntyVl(String.valueOf(codesystemusecontextvaluequantity.getValue()));
		} else {
			c.addCdSysUseCntxtVlQntyVl("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlQntyVl("]");}


		/******************** codesystemusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator codesystemusecontextvaluequantitycomparator = codesystemusecontextvaluequantity.getComparator();
		if(codesystemusecontextvaluequantitycomparator!=null) {
		if(codesystemusecontexti == 0) {

		c.addCdSysUseCntxtVlQntyCmprtr("[");		}
			c.addCdSysUseCntxtVlQntyCmprtr(codesystemusecontextvaluequantitycomparator.toCode());
		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {

		c.addCdSysUseCntxtVlQntyCmprtr("]");		}

		} else {
			c.addCdSysUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** CdSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlQntyCd("[");}
		if(codesystemusecontextvaluequantity.hasCode()) {

			c.addCdSysUseCntxtVlQntyCd(String.valueOf(codesystemusecontextvaluequantity.getCode()));
		} else {
			c.addCdSysUseCntxtVlQntyCd("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlQntyCd("]");}


		/******************** CdSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlQntyUnt("[");}
		if(codesystemusecontextvaluequantity.hasUnit()) {

			c.addCdSysUseCntxtVlQntyUnt(String.valueOf(codesystemusecontextvaluequantity.getUnit()));
		} else {
			c.addCdSysUseCntxtVlQntyUnt("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlQntyUnt("]");}


		/******************** CdSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(codesystemusecontexti == 0) {c.addCdSysUseCntxtVlQntySys("[");}
		if(codesystemusecontextvaluequantity.hasSystem()) {

			c.addCdSysUseCntxtVlQntySys(String.valueOf(codesystemusecontextvaluequantity.getSystem()));
		} else {
			c.addCdSysUseCntxtVlQntySys("NULL");
		}

		if(codesystemusecontexti == codesystemusecontextlist.size()-1) {c.addCdSysUseCntxtVlQntySys("]");}


		 };
		/******************** CdSys_Exprmtl ********************************************************************************/
		if(codesystem.hasExperimental()) {

			c.addCdSysExprmtl(String.valueOf(codesystem.getExperimental()));
		} else {
			c.addCdSysExprmtl("NULL");
		}


		/******************** CdSys_Pblshr ********************************************************************************/
		if(codesystem.hasPublisher()) {

			c.addCdSysPblshr(String.valueOf(codesystem.getPublisher()));
		} else {
			c.addCdSysPblshr("NULL");
		}


		/******************** CdSys_VlSt ********************************************************************************/
		if(codesystem.hasValueSet()) {

			c.addCdSysVlSt(String.valueOf(codesystem.getValueSet()));
		} else {
			c.addCdSysVlSt("NULL");
		}


		/******************** CdSys_CaseSensitive ********************************************************************************/
		if(codesystem.hasCaseSensitive()) {

			c.addCdSysCaseSensitive(String.valueOf(codesystem.getCaseSensitive()));
		} else {
			c.addCdSysCaseSensitive("NULL");
		}


		/******************** CdSys_VrsnNeeded ********************************************************************************/
		if(codesystem.hasVersionNeeded()) {

			c.addCdSysVrsnNeeded(String.valueOf(codesystem.getVersionNeeded()));
		} else {
			c.addCdSysVrsnNeeded("NULL");
		}


		/******************** CdSys_Supplements ********************************************************************************/
		if(codesystem.hasSupplements()) {

			c.addCdSysSupplements(String.valueOf(codesystem.getSupplements()));
		} else {
			c.addCdSysSupplements("NULL");
		}


		/******************** CdSys_Cmpsitional ********************************************************************************/
		if(codesystem.hasCompositional()) {

			c.addCdSysCmpsitional(String.valueOf(codesystem.getCompositional()));
		} else {
			c.addCdSysCmpsitional("NULL");
		}


		return c;
	}
}
