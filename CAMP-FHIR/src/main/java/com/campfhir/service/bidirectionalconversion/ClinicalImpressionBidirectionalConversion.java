package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClinicalImpression;
public class ClinicalImpressionBidirectionalConversion 
{
	public ClinicalImpression ClinicalImpressions(org.hl7.fhir.r4.model.ClinicalImpression clinicalimpression) throws ParseException
	{
		 main.java.com.campfhir.model.ClinicalImpression c = new  main.java.com.campfhir.model.ClinicalImpression();

		/******************** id ********************************************************************************/
		c.setId(clinicalimpression.getIdElement().getIdPart());

		/******************** ClnclImprssn_Protocol ********************************************************************************/
		if(clinicalimpression.hasProtocol()) {

			String  array = "[";
			for(int incr=0; incr<clinicalimpression.getProtocol().size(); incr++) {
				array = array + clinicalimpression.getProtocol().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClnclImprssnProtocol(array);

		} else {
			c.addClnclImprssnProtocol("NULL");
		}


		/******************** ClnclImprssn_Dt ********************************************************************************/
		if(clinicalimpression.hasDate()) {

			c.addClnclImprssnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(clinicalimpression.getDate())+"\"");
		} else {
			c.addClnclImprssnDt("NULL");
		}


		/******************** clinicalimpressioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressioncode = clinicalimpression.getCode();

		/******************** ClnclImprssn_Cd_Txt ********************************************************************************/
		if(clinicalimpressioncode.hasText()) {

			c.addClnclImprssnCdTxt(String.valueOf(clinicalimpressioncode.getText()));
		} else {
			c.addClnclImprssnCdTxt("NULL");
		}


		/******************** clinicalimpressioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> clinicalimpressioncodecodinglist = clinicalimpressioncode.getCoding();
		for(int clinicalimpressioncodecodingi = 0; clinicalimpressioncodecodingi<clinicalimpressioncodecodinglist.size();clinicalimpressioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  clinicalimpressioncodecoding = clinicalimpressioncodecodinglist.get(clinicalimpressioncodecodingi);

		/******************** ClnclImprssn_Cd_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressioncodecodingi == 0) {c.addClnclImprssnCdCdgDsply("[");}
		if(clinicalimpressioncodecoding.hasDisplay()) {

			c.addClnclImprssnCdCdgDsply(String.valueOf(clinicalimpressioncodecoding.getDisplay()));
		} else {
			c.addClnclImprssnCdCdgDsply("NULL");
		}

		if(clinicalimpressioncodecodingi == clinicalimpressioncodecodinglist.size()-1) {c.addClnclImprssnCdCdgDsply("]");}


		/******************** ClnclImprssn_Cd_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressioncodecodingi == 0) {c.addClnclImprssnCdCdgVrsn("[");}
		if(clinicalimpressioncodecoding.hasVersion()) {

			c.addClnclImprssnCdCdgVrsn(String.valueOf(clinicalimpressioncodecoding.getVersion()));
		} else {
			c.addClnclImprssnCdCdgVrsn("NULL");
		}

		if(clinicalimpressioncodecodingi == clinicalimpressioncodecodinglist.size()-1) {c.addClnclImprssnCdCdgVrsn("]");}


		/******************** ClnclImprssn_Cd_Cdg_Cd ********************************************************************************/
		if(clinicalimpressioncodecodingi == 0) {c.addClnclImprssnCdCdgCd("[");}
		if(clinicalimpressioncodecoding.hasCode()) {

			c.addClnclImprssnCdCdgCd(String.valueOf(clinicalimpressioncodecoding.getCode()));
		} else {
			c.addClnclImprssnCdCdgCd("NULL");
		}

		if(clinicalimpressioncodecodingi == clinicalimpressioncodecodinglist.size()-1) {c.addClnclImprssnCdCdgCd("]");}


		/******************** ClnclImprssn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressioncodecodingi == 0) {c.addClnclImprssnCdCdgUsrSltd("[");}
		if(clinicalimpressioncodecoding.hasUserSelected()) {

			c.addClnclImprssnCdCdgUsrSltd(String.valueOf(clinicalimpressioncodecoding.getUserSelected()));
		} else {
			c.addClnclImprssnCdCdgUsrSltd("NULL");
		}

		if(clinicalimpressioncodecodingi == clinicalimpressioncodecodinglist.size()-1) {c.addClnclImprssnCdCdgUsrSltd("]");}


		/******************** ClnclImprssn_Cd_Cdg_Sys ********************************************************************************/
		if(clinicalimpressioncodecodingi == 0) {c.addClnclImprssnCdCdgSys("[");}
		if(clinicalimpressioncodecoding.hasSystem()) {

			c.addClnclImprssnCdCdgSys(String.valueOf(clinicalimpressioncodecoding.getSystem()));
		} else {
			c.addClnclImprssnCdCdgSys("NULL");
		}

		if(clinicalimpressioncodecodingi == clinicalimpressioncodecodinglist.size()-1) {c.addClnclImprssnCdCdgSys("]");}


		 };
		/******************** ClnclImprssn_Sbjct ********************************************************************************/
		if(clinicalimpression.hasSubject()) {

			if(clinicalimpression.getSubject().getReference() != null) {
			c.addClnclImprssnSbjct(clinicalimpression.getSubject().getReference());
			}
		} else {
			c.addClnclImprssnSbjct("NULL");
		}


		/******************** clinicalimpressionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatus clinicalimpressionstatus = clinicalimpression.getStatus();
		if(clinicalimpressionstatus!=null) {
			c.addClnclImprssnSts(clinicalimpressionstatus.toCode());
		} else {
			c.addClnclImprssnSts("NULL");
		}

		/******************** ClnclImprssn_Enc ********************************************************************************/
		if(clinicalimpression.hasEncounter()) {

			if(clinicalimpression.getEncounter().getReference() != null) {
			c.addClnclImprssnEnc(clinicalimpression.getEncounter().getReference());
			}
		} else {
			c.addClnclImprssnEnc("NULL");
		}


		/******************** ClnclImprssn_Dscrptn ********************************************************************************/
		if(clinicalimpression.hasDescription()) {

			c.addClnclImprssnDscrptn(String.valueOf(clinicalimpression.getDescription()));
		} else {
			c.addClnclImprssnDscrptn("NULL");
		}


		/******************** clinicalimpressionnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> clinicalimpressionnotelist = clinicalimpression.getNote();
		for(int clinicalimpressionnotei = 0; clinicalimpressionnotei<clinicalimpressionnotelist.size();clinicalimpressionnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  clinicalimpressionnote = clinicalimpressionnotelist.get(clinicalimpressionnotei);

		/******************** ClnclImprssn_Nt_Time ********************************************************************************/
		if(clinicalimpressionnotei == 0) {c.addClnclImprssnNtTime("[");}
		if(clinicalimpressionnote.hasTime()) {

			c.addClnclImprssnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(clinicalimpressionnote.getTime())+"\"");
		} else {
			c.addClnclImprssnNtTime("NULL");
		}

		if(clinicalimpressionnotei == clinicalimpressionnotelist.size()-1) {c.addClnclImprssnNtTime("]");}


		/******************** ClnclImprssn_Nt_AthrRfrnc ********************************************************************************/
		if(clinicalimpressionnotei == 0) {c.addClnclImprssnNtAthrRfrnc("[");}
		if(clinicalimpressionnote.hasAuthorReference()) {

			if(clinicalimpressionnote.getAuthorReference().getReference() != null) {
			c.addClnclImprssnNtAthrRfrnc(clinicalimpressionnote.getAuthorReference().getReference());
			}
		} else {
			c.addClnclImprssnNtAthrRfrnc("NULL");
		}

		if(clinicalimpressionnotei == clinicalimpressionnotelist.size()-1) {c.addClnclImprssnNtAthrRfrnc("]");}


		/******************** ClnclImprssn_Nt_Txt ********************************************************************************/
		if(clinicalimpressionnotei == 0) {c.addClnclImprssnNtTxt("[");}
		if(clinicalimpressionnote.hasText()) {

			c.addClnclImprssnNtTxt(String.valueOf(clinicalimpressionnote.getText()));
		} else {
			c.addClnclImprssnNtTxt("NULL");
		}

		if(clinicalimpressionnotei == clinicalimpressionnotelist.size()-1) {c.addClnclImprssnNtTxt("]");}


		/******************** ClnclImprssn_Nt_AthrStrgTyp ********************************************************************************/
		if(clinicalimpressionnotei == 0) {c.addClnclImprssnNtAthrStrgTyp("[");}
		if(clinicalimpressionnote.hasAuthorStringType()) {

			c.addClnclImprssnNtAthrStrgTyp("\""+clinicalimpressionnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addClnclImprssnNtAthrStrgTyp("NULL");
		}

		if(clinicalimpressionnotei == clinicalimpressionnotelist.size()-1) {c.addClnclImprssnNtAthrStrgTyp("]");}


		 };
		/******************** clinicalimpressionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> clinicalimpressionidentifierlist = clinicalimpression.getIdentifier();
		for(int clinicalimpressionidentifieri = 0; clinicalimpressionidentifieri<clinicalimpressionidentifierlist.size();clinicalimpressionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  clinicalimpressionidentifier = clinicalimpressionidentifierlist.get(clinicalimpressionidentifieri);

		/******************** ClnclImprssn_Id_Vl ********************************************************************************/
		if(clinicalimpressionidentifieri == 0) {c.addClnclImprssnIdVl("[");}
		if(clinicalimpressionidentifier.hasValue()) {

			c.addClnclImprssnIdVl(String.valueOf(clinicalimpressionidentifier.getValue()));
		} else {
			c.addClnclImprssnIdVl("NULL");
		}

		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {c.addClnclImprssnIdVl("]");}


		/******************** clinicalimpressionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionidentifiertype = clinicalimpressionidentifier.getType();

		/******************** ClnclImprssn_Id_Typ_Txt ********************************************************************************/
		if(clinicalimpressionidentifieri == 0) {c.addClnclImprssnIdTypTxt("[");}
		if(clinicalimpressionidentifiertype.hasText()) {

			c.addClnclImprssnIdTypTxt(String.valueOf(clinicalimpressionidentifiertype.getText()));
		} else {
			c.addClnclImprssnIdTypTxt("NULL");
		}

		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {c.addClnclImprssnIdTypTxt("]");}


		/******************** clinicalimpressionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> clinicalimpressionidentifiertypecodinglist = clinicalimpressionidentifiertype.getCoding();
		for(int clinicalimpressionidentifiertypecodingi = 0; clinicalimpressionidentifiertypecodingi<clinicalimpressionidentifiertypecodinglist.size();clinicalimpressionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  clinicalimpressionidentifiertypecoding = clinicalimpressionidentifiertypecodinglist.get(clinicalimpressionidentifiertypecodingi);

		/******************** ClnclImprssn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionidentifiertypecodingi == 0) {c.addClnclImprssnIdTypCdgDsply("[[");}
		if(clinicalimpressionidentifiertypecoding.hasDisplay()) {

			c.addClnclImprssnIdTypCdgDsply(String.valueOf(clinicalimpressionidentifiertypecoding.getDisplay()));
		} else {
			c.addClnclImprssnIdTypCdgDsply("NULL");
		}

		if(clinicalimpressionidentifiertypecodingi == clinicalimpressionidentifiertypecodinglist.size()-1) {c.addClnclImprssnIdTypCdgDsply("]]");}


		/******************** ClnclImprssn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionidentifiertypecodingi == 0) {c.addClnclImprssnIdTypCdgVrsn("[[");}
		if(clinicalimpressionidentifiertypecoding.hasVersion()) {

			c.addClnclImprssnIdTypCdgVrsn(String.valueOf(clinicalimpressionidentifiertypecoding.getVersion()));
		} else {
			c.addClnclImprssnIdTypCdgVrsn("NULL");
		}

		if(clinicalimpressionidentifiertypecodingi == clinicalimpressionidentifiertypecodinglist.size()-1) {c.addClnclImprssnIdTypCdgVrsn("]]");}


		/******************** ClnclImprssn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionidentifiertypecodingi == 0) {c.addClnclImprssnIdTypCdgCd("[[");}
		if(clinicalimpressionidentifiertypecoding.hasCode()) {

			c.addClnclImprssnIdTypCdgCd(String.valueOf(clinicalimpressionidentifiertypecoding.getCode()));
		} else {
			c.addClnclImprssnIdTypCdgCd("NULL");
		}

		if(clinicalimpressionidentifiertypecodingi == clinicalimpressionidentifiertypecodinglist.size()-1) {c.addClnclImprssnIdTypCdgCd("]]");}


		/******************** ClnclImprssn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionidentifiertypecodingi == 0) {c.addClnclImprssnIdTypCdgUsrSltd("[[");}
		if(clinicalimpressionidentifiertypecoding.hasUserSelected()) {

			c.addClnclImprssnIdTypCdgUsrSltd(String.valueOf(clinicalimpressionidentifiertypecoding.getUserSelected()));
		} else {
			c.addClnclImprssnIdTypCdgUsrSltd("NULL");
		}

		if(clinicalimpressionidentifiertypecodingi == clinicalimpressionidentifiertypecodinglist.size()-1) {c.addClnclImprssnIdTypCdgUsrSltd("]]");}


		/******************** ClnclImprssn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionidentifiertypecodingi == 0) {c.addClnclImprssnIdTypCdgSys("[[");}
		if(clinicalimpressionidentifiertypecoding.hasSystem()) {

			c.addClnclImprssnIdTypCdgSys(String.valueOf(clinicalimpressionidentifiertypecoding.getSystem()));
		} else {
			c.addClnclImprssnIdTypCdgSys("NULL");
		}

		if(clinicalimpressionidentifiertypecodingi == clinicalimpressionidentifiertypecodinglist.size()-1) {c.addClnclImprssnIdTypCdgSys("]]");}


		 };
		/******************** clinicalimpressionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period clinicalimpressionidentifierperiod = clinicalimpressionidentifier.getPeriod();

		/******************** ClnclImprssn_Id_Prd_Strt ********************************************************************************/
		if(clinicalimpressionidentifieri == 0) {c.addClnclImprssnIdPrdStrt("[");}
		if(clinicalimpressionidentifierperiod.hasStart()) {

			c.addClnclImprssnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(clinicalimpressionidentifierperiod.getStart())+"\"");
		} else {
			c.addClnclImprssnIdPrdStrt("NULL");
		}

		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {c.addClnclImprssnIdPrdStrt("]");}


		/******************** ClnclImprssn_Id_Prd_End ********************************************************************************/
		if(clinicalimpressionidentifieri == 0) {c.addClnclImprssnIdPrdEnd("[");}
		if(clinicalimpressionidentifierperiod.hasEnd()) {

			c.addClnclImprssnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(clinicalimpressionidentifierperiod.getEnd())+"\"");
		} else {
			c.addClnclImprssnIdPrdEnd("NULL");
		}

		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {c.addClnclImprssnIdPrdEnd("]");}


		/******************** clinicalimpressionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse clinicalimpressionidentifieruse = clinicalimpressionidentifier.getUse();
		if(clinicalimpressionidentifieruse!=null) {
		if(clinicalimpressionidentifieri == 0) {

		c.addClnclImprssnIdUse("[");		}
			c.addClnclImprssnIdUse(clinicalimpressionidentifieruse.toCode());
		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {

		c.addClnclImprssnIdUse("]");		}

		} else {
			c.addClnclImprssnIdUse("NULL");
		}

		/******************** ClnclImprssn_Id_Assigner ********************************************************************************/
		if(clinicalimpressionidentifieri == 0) {c.addClnclImprssnIdAssigner("[");}
		if(clinicalimpressionidentifier.hasAssigner()) {

			if(clinicalimpressionidentifier.getAssigner().getReference() != null) {
			c.addClnclImprssnIdAssigner(clinicalimpressionidentifier.getAssigner().getReference());
			}
		} else {
			c.addClnclImprssnIdAssigner("NULL");
		}

		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {c.addClnclImprssnIdAssigner("]");}


		/******************** ClnclImprssn_Id_Sys ********************************************************************************/
		if(clinicalimpressionidentifieri == 0) {c.addClnclImprssnIdSys("[");}
		if(clinicalimpressionidentifier.hasSystem()) {

			c.addClnclImprssnIdSys(String.valueOf(clinicalimpressionidentifier.getSystem()));
		} else {
			c.addClnclImprssnIdSys("NULL");
		}

		if(clinicalimpressionidentifieri == clinicalimpressionidentifierlist.size()-1) {c.addClnclImprssnIdSys("]");}


		 };
		/******************** ClnclImprssn_EfctiveDtTimeTyp ********************************************************************************/
		if(clinicalimpression.hasEffectiveDateTimeType()) {

			c.addClnclImprssnEfctiveDtTimeTyp("\""+clinicalimpression.getEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			c.addClnclImprssnEfctiveDtTimeTyp("NULL");
		}


		/******************** clinicalimpressionprognosiscodeableconcept ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> clinicalimpressionprognosiscodeableconceptlist = clinicalimpression.getPrognosisCodeableConcept();
		for(int clinicalimpressionprognosiscodeableconcepti = 0; clinicalimpressionprognosiscodeableconcepti<clinicalimpressionprognosiscodeableconceptlist.size();clinicalimpressionprognosiscodeableconcepti++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  clinicalimpressionprognosiscodeableconcept = clinicalimpressionprognosiscodeableconceptlist.get(clinicalimpressionprognosiscodeableconcepti);

		/******************** ClnclImprssn_PrognosisCdbleCncpt_Txt ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconcepti == 0) {c.addClnclImprssnPrognosisCdbleCncptTxt("[");}
		if(clinicalimpressionprognosiscodeableconcept.hasText()) {

			c.addClnclImprssnPrognosisCdbleCncptTxt(String.valueOf(clinicalimpressionprognosiscodeableconcept.getText()));
		} else {
			c.addClnclImprssnPrognosisCdbleCncptTxt("NULL");
		}

		if(clinicalimpressionprognosiscodeableconcepti == clinicalimpressionprognosiscodeableconceptlist.size()-1) {c.addClnclImprssnPrognosisCdbleCncptTxt("]");}


		/******************** clinicalimpressionprognosiscodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> clinicalimpressionprognosiscodeableconceptcodinglist = clinicalimpressionprognosiscodeableconcept.getCoding();
		for(int clinicalimpressionprognosiscodeableconceptcodingi = 0; clinicalimpressionprognosiscodeableconceptcodingi<clinicalimpressionprognosiscodeableconceptcodinglist.size();clinicalimpressionprognosiscodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  clinicalimpressionprognosiscodeableconceptcoding = clinicalimpressionprognosiscodeableconceptcodinglist.get(clinicalimpressionprognosiscodeableconceptcodingi);

		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcodingi == 0) {c.addClnclImprssnPrognosisCdbleCncptCdgDsply("[[");}
		if(clinicalimpressionprognosiscodeableconceptcoding.hasDisplay()) {

			c.addClnclImprssnPrognosisCdbleCncptCdgDsply(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getDisplay()));
		} else {
			c.addClnclImprssnPrognosisCdbleCncptCdgDsply("NULL");
		}

		if(clinicalimpressionprognosiscodeableconceptcodingi == clinicalimpressionprognosiscodeableconceptcodinglist.size()-1) {c.addClnclImprssnPrognosisCdbleCncptCdgDsply("]]");}


		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcodingi == 0) {c.addClnclImprssnPrognosisCdbleCncptCdgVrsn("[[");}
		if(clinicalimpressionprognosiscodeableconceptcoding.hasVersion()) {

			c.addClnclImprssnPrognosisCdbleCncptCdgVrsn(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getVersion()));
		} else {
			c.addClnclImprssnPrognosisCdbleCncptCdgVrsn("NULL");
		}

		if(clinicalimpressionprognosiscodeableconceptcodingi == clinicalimpressionprognosiscodeableconceptcodinglist.size()-1) {c.addClnclImprssnPrognosisCdbleCncptCdgVrsn("]]");}


		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcodingi == 0) {c.addClnclImprssnPrognosisCdbleCncptCdgCd("[[");}
		if(clinicalimpressionprognosiscodeableconceptcoding.hasCode()) {

			c.addClnclImprssnPrognosisCdbleCncptCdgCd(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getCode()));
		} else {
			c.addClnclImprssnPrognosisCdbleCncptCdgCd("NULL");
		}

		if(clinicalimpressionprognosiscodeableconceptcodingi == clinicalimpressionprognosiscodeableconceptcodinglist.size()-1) {c.addClnclImprssnPrognosisCdbleCncptCdgCd("]]");}


		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcodingi == 0) {c.addClnclImprssnPrognosisCdbleCncptCdgUsrSltd("[[");}
		if(clinicalimpressionprognosiscodeableconceptcoding.hasUserSelected()) {

			c.addClnclImprssnPrognosisCdbleCncptCdgUsrSltd(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getUserSelected()));
		} else {
			c.addClnclImprssnPrognosisCdbleCncptCdgUsrSltd("NULL");
		}

		if(clinicalimpressionprognosiscodeableconceptcodingi == clinicalimpressionprognosiscodeableconceptcodinglist.size()-1) {c.addClnclImprssnPrognosisCdbleCncptCdgUsrSltd("]]");}


		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionprognosiscodeableconceptcodingi == 0) {c.addClnclImprssnPrognosisCdbleCncptCdgSys("[[");}
		if(clinicalimpressionprognosiscodeableconceptcoding.hasSystem()) {

			c.addClnclImprssnPrognosisCdbleCncptCdgSys(String.valueOf(clinicalimpressionprognosiscodeableconceptcoding.getSystem()));
		} else {
			c.addClnclImprssnPrognosisCdbleCncptCdgSys("NULL");
		}

		if(clinicalimpressionprognosiscodeableconceptcodingi == clinicalimpressionprognosiscodeableconceptcodinglist.size()-1) {c.addClnclImprssnPrognosisCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** ClnclImprssn_PrognosisRfrnc ********************************************************************************/
		if(clinicalimpression.hasPrognosisReference()) {

			String  array = "[";
			for(int incr=0; incr<clinicalimpression.getPrognosisReference().size(); incr++) {
				array = array + clinicalimpression.getPrognosisReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClnclImprssnPrognosisRfrnc(array);

		} else {
			c.addClnclImprssnPrognosisRfrnc("NULL");
		}


		/******************** ClnclImprssn_SprtingInfo ********************************************************************************/
		if(clinicalimpression.hasSupportingInfo()) {

			String  array = "[";
			for(int incr=0; incr<clinicalimpression.getSupportingInfo().size(); incr++) {
				array = array + clinicalimpression.getSupportingInfo().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClnclImprssnSprtingInfo(array);

		} else {
			c.addClnclImprssnSprtingInfo("NULL");
		}


		/******************** clinicalimpressioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period clinicalimpressioneffectiveperiod = clinicalimpression.getEffectivePeriod();

		/******************** ClnclImprssn_EfctivePrd_Strt ********************************************************************************/
		if(clinicalimpressioneffectiveperiod.hasStart()) {

			c.addClnclImprssnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(clinicalimpressioneffectiveperiod.getStart())+"\"");
		} else {
			c.addClnclImprssnEfctivePrdStrt("NULL");
		}


		/******************** ClnclImprssn_EfctivePrd_End ********************************************************************************/
		if(clinicalimpressioneffectiveperiod.hasEnd()) {

			c.addClnclImprssnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(clinicalimpressioneffectiveperiod.getEnd())+"\"");
		} else {
			c.addClnclImprssnEfctivePrdEnd("NULL");
		}


		/******************** ClnclImprssn_Assessor ********************************************************************************/
		if(clinicalimpression.hasAssessor()) {

			if(clinicalimpression.getAssessor().getReference() != null) {
			c.addClnclImprssnAssessor(clinicalimpression.getAssessor().getReference());
			}
		} else {
			c.addClnclImprssnAssessor("NULL");
		}


		/******************** ClnclImprssn_Problem ********************************************************************************/
		if(clinicalimpression.hasProblem()) {

			String  array = "[";
			for(int incr=0; incr<clinicalimpression.getProblem().size(); incr++) {
				array = array + clinicalimpression.getProblem().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClnclImprssnProblem(array);

		} else {
			c.addClnclImprssnProblem("NULL");
		}


		/******************** ClnclImprssn_Previous ********************************************************************************/
		if(clinicalimpression.hasPrevious()) {

			if(clinicalimpression.getPrevious().getReference() != null) {
			c.addClnclImprssnPrevious(clinicalimpression.getPrevious().getReference());
			}
		} else {
			c.addClnclImprssnPrevious("NULL");
		}


		/******************** clinicalimpressioninvestigation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent> clinicalimpressioninvestigationlist = clinicalimpression.getInvestigation();
		for(int clinicalimpressioninvestigationi = 0; clinicalimpressioninvestigationi<clinicalimpressioninvestigationlist.size();clinicalimpressioninvestigationi++ ) {
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent  clinicalimpressioninvestigation = clinicalimpressioninvestigationlist.get(clinicalimpressioninvestigationi);

		/******************** ClnclImprssn_Investigation_Itm ********************************************************************************/
		if(clinicalimpressioninvestigationi == 0) {c.addClnclImprssnInvestigationItm("[");}
		if(clinicalimpressioninvestigation.hasItem()) {

			String  array = "[";
			for(int incr=0; incr<clinicalimpressioninvestigation.getItem().size(); incr++) {
				array = array + clinicalimpressioninvestigation.getItem().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClnclImprssnInvestigationItm(array);

		} else {
			c.addClnclImprssnInvestigationItm("NULL");
		}

		if(clinicalimpressioninvestigationi == clinicalimpressioninvestigationlist.size()-1) {c.addClnclImprssnInvestigationItm("]");}


		/******************** clinicalimpressioninvestigationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressioninvestigationcode = clinicalimpressioninvestigation.getCode();

		/******************** ClnclImprssn_Investigation_Cd_Txt ********************************************************************************/
		if(clinicalimpressioninvestigationi == 0) {c.addClnclImprssnInvestigationCdTxt("[");}
		if(clinicalimpressioninvestigationcode.hasText()) {

			c.addClnclImprssnInvestigationCdTxt(String.valueOf(clinicalimpressioninvestigationcode.getText()));
		} else {
			c.addClnclImprssnInvestigationCdTxt("NULL");
		}

		if(clinicalimpressioninvestigationi == clinicalimpressioninvestigationlist.size()-1) {c.addClnclImprssnInvestigationCdTxt("]");}


		/******************** clinicalimpressioninvestigationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> clinicalimpressioninvestigationcodecodinglist = clinicalimpressioninvestigationcode.getCoding();
		for(int clinicalimpressioninvestigationcodecodingi = 0; clinicalimpressioninvestigationcodecodingi<clinicalimpressioninvestigationcodecodinglist.size();clinicalimpressioninvestigationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  clinicalimpressioninvestigationcodecoding = clinicalimpressioninvestigationcodecodinglist.get(clinicalimpressioninvestigationcodecodingi);

		/******************** ClnclImprssn_Investigation_Cd_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressioninvestigationcodecodingi == 0) {c.addClnclImprssnInvestigationCdCdgDsply("[[");}
		if(clinicalimpressioninvestigationcodecoding.hasDisplay()) {

			c.addClnclImprssnInvestigationCdCdgDsply(String.valueOf(clinicalimpressioninvestigationcodecoding.getDisplay()));
		} else {
			c.addClnclImprssnInvestigationCdCdgDsply("NULL");
		}

		if(clinicalimpressioninvestigationcodecodingi == clinicalimpressioninvestigationcodecodinglist.size()-1) {c.addClnclImprssnInvestigationCdCdgDsply("]]");}


		/******************** ClnclImprssn_Investigation_Cd_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressioninvestigationcodecodingi == 0) {c.addClnclImprssnInvestigationCdCdgVrsn("[[");}
		if(clinicalimpressioninvestigationcodecoding.hasVersion()) {

			c.addClnclImprssnInvestigationCdCdgVrsn(String.valueOf(clinicalimpressioninvestigationcodecoding.getVersion()));
		} else {
			c.addClnclImprssnInvestigationCdCdgVrsn("NULL");
		}

		if(clinicalimpressioninvestigationcodecodingi == clinicalimpressioninvestigationcodecodinglist.size()-1) {c.addClnclImprssnInvestigationCdCdgVrsn("]]");}


		/******************** ClnclImprssn_Investigation_Cd_Cdg_Cd ********************************************************************************/
		if(clinicalimpressioninvestigationcodecodingi == 0) {c.addClnclImprssnInvestigationCdCdgCd("[[");}
		if(clinicalimpressioninvestigationcodecoding.hasCode()) {

			c.addClnclImprssnInvestigationCdCdgCd(String.valueOf(clinicalimpressioninvestigationcodecoding.getCode()));
		} else {
			c.addClnclImprssnInvestigationCdCdgCd("NULL");
		}

		if(clinicalimpressioninvestigationcodecodingi == clinicalimpressioninvestigationcodecodinglist.size()-1) {c.addClnclImprssnInvestigationCdCdgCd("]]");}


		/******************** ClnclImprssn_Investigation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressioninvestigationcodecodingi == 0) {c.addClnclImprssnInvestigationCdCdgUsrSltd("[[");}
		if(clinicalimpressioninvestigationcodecoding.hasUserSelected()) {

			c.addClnclImprssnInvestigationCdCdgUsrSltd(String.valueOf(clinicalimpressioninvestigationcodecoding.getUserSelected()));
		} else {
			c.addClnclImprssnInvestigationCdCdgUsrSltd("NULL");
		}

		if(clinicalimpressioninvestigationcodecodingi == clinicalimpressioninvestigationcodecodinglist.size()-1) {c.addClnclImprssnInvestigationCdCdgUsrSltd("]]");}


		/******************** ClnclImprssn_Investigation_Cd_Cdg_Sys ********************************************************************************/
		if(clinicalimpressioninvestigationcodecodingi == 0) {c.addClnclImprssnInvestigationCdCdgSys("[[");}
		if(clinicalimpressioninvestigationcodecoding.hasSystem()) {

			c.addClnclImprssnInvestigationCdCdgSys(String.valueOf(clinicalimpressioninvestigationcodecoding.getSystem()));
		} else {
			c.addClnclImprssnInvestigationCdCdgSys("NULL");
		}

		if(clinicalimpressioninvestigationcodecodingi == clinicalimpressioninvestigationcodecodinglist.size()-1) {c.addClnclImprssnInvestigationCdCdgSys("]]");}


		 };
		 };
		/******************** ClnclImprssn_Summary ********************************************************************************/
		if(clinicalimpression.hasSummary()) {

			c.addClnclImprssnSummary(String.valueOf(clinicalimpression.getSummary()));
		} else {
			c.addClnclImprssnSummary("NULL");
		}


		/******************** clinicalimpressionfinding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent> clinicalimpressionfindinglist = clinicalimpression.getFinding();
		for(int clinicalimpressionfindingi = 0; clinicalimpressionfindingi<clinicalimpressionfindinglist.size();clinicalimpressionfindingi++ ) {
		org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent  clinicalimpressionfinding = clinicalimpressionfindinglist.get(clinicalimpressionfindingi);

		/******************** ClnclImprssn_Finding_ItmRfrnc ********************************************************************************/
		if(clinicalimpressionfindingi == 0) {c.addClnclImprssnFindingItmRfrnc("[");}
		if(clinicalimpressionfinding.hasItemReference()) {

			if(clinicalimpressionfinding.getItemReference().getReference() != null) {
			c.addClnclImprssnFindingItmRfrnc(clinicalimpressionfinding.getItemReference().getReference());
			}
		} else {
			c.addClnclImprssnFindingItmRfrnc("NULL");
		}

		if(clinicalimpressionfindingi == clinicalimpressionfindinglist.size()-1) {c.addClnclImprssnFindingItmRfrnc("]");}


		/******************** ClnclImprssn_Finding_Basis ********************************************************************************/
		if(clinicalimpressionfindingi == 0) {c.addClnclImprssnFindingBasis("[");}
		if(clinicalimpressionfinding.hasBasis()) {

			c.addClnclImprssnFindingBasis(String.valueOf(clinicalimpressionfinding.getBasis()));
		} else {
			c.addClnclImprssnFindingBasis("NULL");
		}

		if(clinicalimpressionfindingi == clinicalimpressionfindinglist.size()-1) {c.addClnclImprssnFindingBasis("]");}


		/******************** clinicalimpressionfindingitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionfindingitemcodeableconcept = clinicalimpressionfinding.getItemCodeableConcept();

		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Txt ********************************************************************************/
		if(clinicalimpressionfindingi == 0) {c.addClnclImprssnFindingItmCdbleCncptTxt("[");}
		if(clinicalimpressionfindingitemcodeableconcept.hasText()) {

			c.addClnclImprssnFindingItmCdbleCncptTxt(String.valueOf(clinicalimpressionfindingitemcodeableconcept.getText()));
		} else {
			c.addClnclImprssnFindingItmCdbleCncptTxt("NULL");
		}

		if(clinicalimpressionfindingi == clinicalimpressionfindinglist.size()-1) {c.addClnclImprssnFindingItmCdbleCncptTxt("]");}


		/******************** clinicalimpressionfindingitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> clinicalimpressionfindingitemcodeableconceptcodinglist = clinicalimpressionfindingitemcodeableconcept.getCoding();
		for(int clinicalimpressionfindingitemcodeableconceptcodingi = 0; clinicalimpressionfindingitemcodeableconceptcodingi<clinicalimpressionfindingitemcodeableconceptcodinglist.size();clinicalimpressionfindingitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  clinicalimpressionfindingitemcodeableconceptcoding = clinicalimpressionfindingitemcodeableconceptcodinglist.get(clinicalimpressionfindingitemcodeableconceptcodingi);

		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcodingi == 0) {c.addClnclImprssnFindingItmCdbleCncptCdgDsply("[[");}
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasDisplay()) {

			c.addClnclImprssnFindingItmCdbleCncptCdgDsply(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getDisplay()));
		} else {
			c.addClnclImprssnFindingItmCdbleCncptCdgDsply("NULL");
		}

		if(clinicalimpressionfindingitemcodeableconceptcodingi == clinicalimpressionfindingitemcodeableconceptcodinglist.size()-1) {c.addClnclImprssnFindingItmCdbleCncptCdgDsply("]]");}


		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcodingi == 0) {c.addClnclImprssnFindingItmCdbleCncptCdgVrsn("[[");}
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasVersion()) {

			c.addClnclImprssnFindingItmCdbleCncptCdgVrsn(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getVersion()));
		} else {
			c.addClnclImprssnFindingItmCdbleCncptCdgVrsn("NULL");
		}

		if(clinicalimpressionfindingitemcodeableconceptcodingi == clinicalimpressionfindingitemcodeableconceptcodinglist.size()-1) {c.addClnclImprssnFindingItmCdbleCncptCdgVrsn("]]");}


		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcodingi == 0) {c.addClnclImprssnFindingItmCdbleCncptCdgCd("[[");}
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasCode()) {

			c.addClnclImprssnFindingItmCdbleCncptCdgCd(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getCode()));
		} else {
			c.addClnclImprssnFindingItmCdbleCncptCdgCd("NULL");
		}

		if(clinicalimpressionfindingitemcodeableconceptcodingi == clinicalimpressionfindingitemcodeableconceptcodinglist.size()-1) {c.addClnclImprssnFindingItmCdbleCncptCdgCd("]]");}


		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcodingi == 0) {c.addClnclImprssnFindingItmCdbleCncptCdgUsrSltd("[[");}
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasUserSelected()) {

			c.addClnclImprssnFindingItmCdbleCncptCdgUsrSltd(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getUserSelected()));
		} else {
			c.addClnclImprssnFindingItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(clinicalimpressionfindingitemcodeableconceptcodingi == clinicalimpressionfindingitemcodeableconceptcodinglist.size()-1) {c.addClnclImprssnFindingItmCdbleCncptCdgUsrSltd("]]");}


		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionfindingitemcodeableconceptcodingi == 0) {c.addClnclImprssnFindingItmCdbleCncptCdgSys("[[");}
		if(clinicalimpressionfindingitemcodeableconceptcoding.hasSystem()) {

			c.addClnclImprssnFindingItmCdbleCncptCdgSys(String.valueOf(clinicalimpressionfindingitemcodeableconceptcoding.getSystem()));
		} else {
			c.addClnclImprssnFindingItmCdbleCncptCdgSys("NULL");
		}

		if(clinicalimpressionfindingitemcodeableconceptcodingi == clinicalimpressionfindingitemcodeableconceptcodinglist.size()-1) {c.addClnclImprssnFindingItmCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** clinicalimpressionstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept clinicalimpressionstatusreason = clinicalimpression.getStatusReason();

		/******************** ClnclImprssn_StsRsn_Txt ********************************************************************************/
		if(clinicalimpressionstatusreason.hasText()) {

			c.addClnclImprssnStsRsnTxt(String.valueOf(clinicalimpressionstatusreason.getText()));
		} else {
			c.addClnclImprssnStsRsnTxt("NULL");
		}


		/******************** clinicalimpressionstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> clinicalimpressionstatusreasoncodinglist = clinicalimpressionstatusreason.getCoding();
		for(int clinicalimpressionstatusreasoncodingi = 0; clinicalimpressionstatusreasoncodingi<clinicalimpressionstatusreasoncodinglist.size();clinicalimpressionstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  clinicalimpressionstatusreasoncoding = clinicalimpressionstatusreasoncodinglist.get(clinicalimpressionstatusreasoncodingi);

		/******************** ClnclImprssn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(clinicalimpressionstatusreasoncodingi == 0) {c.addClnclImprssnStsRsnCdgDsply("[");}
		if(clinicalimpressionstatusreasoncoding.hasDisplay()) {

			c.addClnclImprssnStsRsnCdgDsply(String.valueOf(clinicalimpressionstatusreasoncoding.getDisplay()));
		} else {
			c.addClnclImprssnStsRsnCdgDsply("NULL");
		}

		if(clinicalimpressionstatusreasoncodingi == clinicalimpressionstatusreasoncodinglist.size()-1) {c.addClnclImprssnStsRsnCdgDsply("]");}


		/******************** ClnclImprssn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(clinicalimpressionstatusreasoncodingi == 0) {c.addClnclImprssnStsRsnCdgVrsn("[");}
		if(clinicalimpressionstatusreasoncoding.hasVersion()) {

			c.addClnclImprssnStsRsnCdgVrsn(String.valueOf(clinicalimpressionstatusreasoncoding.getVersion()));
		} else {
			c.addClnclImprssnStsRsnCdgVrsn("NULL");
		}

		if(clinicalimpressionstatusreasoncodingi == clinicalimpressionstatusreasoncodinglist.size()-1) {c.addClnclImprssnStsRsnCdgVrsn("]");}


		/******************** ClnclImprssn_StsRsn_Cdg_Cd ********************************************************************************/
		if(clinicalimpressionstatusreasoncodingi == 0) {c.addClnclImprssnStsRsnCdgCd("[");}
		if(clinicalimpressionstatusreasoncoding.hasCode()) {

			c.addClnclImprssnStsRsnCdgCd(String.valueOf(clinicalimpressionstatusreasoncoding.getCode()));
		} else {
			c.addClnclImprssnStsRsnCdgCd("NULL");
		}

		if(clinicalimpressionstatusreasoncodingi == clinicalimpressionstatusreasoncodinglist.size()-1) {c.addClnclImprssnStsRsnCdgCd("]");}


		/******************** ClnclImprssn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(clinicalimpressionstatusreasoncodingi == 0) {c.addClnclImprssnStsRsnCdgUsrSltd("[");}
		if(clinicalimpressionstatusreasoncoding.hasUserSelected()) {

			c.addClnclImprssnStsRsnCdgUsrSltd(String.valueOf(clinicalimpressionstatusreasoncoding.getUserSelected()));
		} else {
			c.addClnclImprssnStsRsnCdgUsrSltd("NULL");
		}

		if(clinicalimpressionstatusreasoncodingi == clinicalimpressionstatusreasoncodinglist.size()-1) {c.addClnclImprssnStsRsnCdgUsrSltd("]");}


		/******************** ClnclImprssn_StsRsn_Cdg_Sys ********************************************************************************/
		if(clinicalimpressionstatusreasoncodingi == 0) {c.addClnclImprssnStsRsnCdgSys("[");}
		if(clinicalimpressionstatusreasoncoding.hasSystem()) {

			c.addClnclImprssnStsRsnCdgSys(String.valueOf(clinicalimpressionstatusreasoncoding.getSystem()));
		} else {
			c.addClnclImprssnStsRsnCdgSys("NULL");
		}

		if(clinicalimpressionstatusreasoncodingi == clinicalimpressionstatusreasoncodinglist.size()-1) {c.addClnclImprssnStsRsnCdgSys("]");}


		 };
		return c;
	}
}
