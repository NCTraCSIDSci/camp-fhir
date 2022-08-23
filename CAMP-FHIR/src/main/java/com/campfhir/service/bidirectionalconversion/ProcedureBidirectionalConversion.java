package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Procedure;
public class ProcedureBidirectionalConversion 
{
	public Procedure Procedures(org.hl7.fhir.r4.model.Procedure procedure) throws ParseException
	{
		 main.java.com.campfhir.model.Procedure p = new  main.java.com.campfhir.model.Procedure();

		/******************** id ********************************************************************************/
		p.setId(procedure.getIdElement().getIdPart());

		/******************** Prcdr_Lctn ********************************************************************************/
		if(procedure.hasLocation()) {

			if(procedure.getLocation().getReference() != null) {
			p.addPrcdrLctn(procedure.getLocation().getReference());
			}
		} else {
			p.addPrcdrLctn("NULL");
		}


		/******************** procedurecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecode = procedure.getCode();

		/******************** Prcdr_Cd_Txt ********************************************************************************/
		if(procedurecode.hasText()) {

			p.addPrcdrCdTxt(String.valueOf(procedurecode.getText()));
		} else {
			p.addPrcdrCdTxt("NULL");
		}


		/******************** procedurecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurecodecodinglist = procedurecode.getCoding();
		for(int procedurecodecodingi = 0; procedurecodecodingi<procedurecodecodinglist.size();procedurecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurecodecoding = procedurecodecodinglist.get(procedurecodecodingi);

		/******************** Prcdr_Cd_Cdg_Dsply ********************************************************************************/
		if(procedurecodecodingi == 0) {p.addPrcdrCdCdgDsply("[");}
		if(procedurecodecoding.hasDisplay()) {

			p.addPrcdrCdCdgDsply(String.valueOf(procedurecodecoding.getDisplay()));
		} else {
			p.addPrcdrCdCdgDsply("NULL");
		}

		if(procedurecodecodingi == procedurecodecodinglist.size()-1) {p.addPrcdrCdCdgDsply("]");}


		/******************** Prcdr_Cd_Cdg_Vrsn ********************************************************************************/
		if(procedurecodecodingi == 0) {p.addPrcdrCdCdgVrsn("[");}
		if(procedurecodecoding.hasVersion()) {

			p.addPrcdrCdCdgVrsn(String.valueOf(procedurecodecoding.getVersion()));
		} else {
			p.addPrcdrCdCdgVrsn("NULL");
		}

		if(procedurecodecodingi == procedurecodecodinglist.size()-1) {p.addPrcdrCdCdgVrsn("]");}


		/******************** Prcdr_Cd_Cdg_Cd ********************************************************************************/
		if(procedurecodecodingi == 0) {p.addPrcdrCdCdgCd("[");}
		if(procedurecodecoding.hasCode()) {

			p.addPrcdrCdCdgCd(String.valueOf(procedurecodecoding.getCode()));
		} else {
			p.addPrcdrCdCdgCd("NULL");
		}

		if(procedurecodecodingi == procedurecodecodinglist.size()-1) {p.addPrcdrCdCdgCd("]");}


		/******************** Prcdr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(procedurecodecodingi == 0) {p.addPrcdrCdCdgUsrSltd("[");}
		if(procedurecodecoding.hasUserSelected()) {

			p.addPrcdrCdCdgUsrSltd(String.valueOf(procedurecodecoding.getUserSelected()));
		} else {
			p.addPrcdrCdCdgUsrSltd("NULL");
		}

		if(procedurecodecodingi == procedurecodecodinglist.size()-1) {p.addPrcdrCdCdgUsrSltd("]");}


		/******************** Prcdr_Cd_Cdg_Sys ********************************************************************************/
		if(procedurecodecodingi == 0) {p.addPrcdrCdCdgSys("[");}
		if(procedurecodecoding.hasSystem()) {

			p.addPrcdrCdCdgSys(String.valueOf(procedurecodecoding.getSystem()));
		} else {
			p.addPrcdrCdCdgSys("NULL");
		}

		if(procedurecodecodingi == procedurecodecodinglist.size()-1) {p.addPrcdrCdCdgSys("]");}


		 };
		/******************** Prcdr_Sbjct ********************************************************************************/
		if(procedure.hasSubject()) {

			if(procedure.getSubject().getReference() != null) {
			p.addPrcdrSbjct(procedure.getSubject().getReference());
			}
		} else {
			p.addPrcdrSbjct("NULL");
		}


		/******************** procedurestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedureStatus procedurestatus = procedure.getStatus();
		if(procedurestatus!=null) {
			p.addPrcdrSts(procedurestatus.toCode());
		} else {
			p.addPrcdrSts("NULL");
		}

		/******************** Prcdr_Enc ********************************************************************************/
		if(procedure.hasEncounter()) {

			if(procedure.getEncounter().getReference() != null) {
			p.addPrcdrEnc(procedure.getEncounter().getReference());
			}
		} else {
			p.addPrcdrEnc("NULL");
		}


		/******************** Prcdr_BasedOn ********************************************************************************/
		if(procedure.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getBasedOn().size(); incr++) {
				array = array + procedure.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrBasedOn(array);

		} else {
			p.addPrcdrBasedOn("NULL");
		}


		/******************** procedurereasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> procedurereasoncodelist = procedure.getReasonCode();
		for(int procedurereasoncodei = 0; procedurereasoncodei<procedurereasoncodelist.size();procedurereasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  procedurereasoncode = procedurereasoncodelist.get(procedurereasoncodei);

		/******************** Prcdr_RsnCd_Txt ********************************************************************************/
		if(procedurereasoncodei == 0) {p.addPrcdrRsnCdTxt("[");}
		if(procedurereasoncode.hasText()) {

			p.addPrcdrRsnCdTxt(String.valueOf(procedurereasoncode.getText()));
		} else {
			p.addPrcdrRsnCdTxt("NULL");
		}

		if(procedurereasoncodei == procedurereasoncodelist.size()-1) {p.addPrcdrRsnCdTxt("]");}


		/******************** procedurereasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurereasoncodecodinglist = procedurereasoncode.getCoding();
		for(int procedurereasoncodecodingi = 0; procedurereasoncodecodingi<procedurereasoncodecodinglist.size();procedurereasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurereasoncodecoding = procedurereasoncodecodinglist.get(procedurereasoncodecodingi);

		/******************** Prcdr_RsnCd_Cdg_Dsply ********************************************************************************/
		if(procedurereasoncodecodingi == 0) {p.addPrcdrRsnCdCdgDsply("[[");}
		if(procedurereasoncodecoding.hasDisplay()) {

			p.addPrcdrRsnCdCdgDsply(String.valueOf(procedurereasoncodecoding.getDisplay()));
		} else {
			p.addPrcdrRsnCdCdgDsply("NULL");
		}

		if(procedurereasoncodecodingi == procedurereasoncodecodinglist.size()-1) {p.addPrcdrRsnCdCdgDsply("]]");}


		/******************** Prcdr_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(procedurereasoncodecodingi == 0) {p.addPrcdrRsnCdCdgVrsn("[[");}
		if(procedurereasoncodecoding.hasVersion()) {

			p.addPrcdrRsnCdCdgVrsn(String.valueOf(procedurereasoncodecoding.getVersion()));
		} else {
			p.addPrcdrRsnCdCdgVrsn("NULL");
		}

		if(procedurereasoncodecodingi == procedurereasoncodecodinglist.size()-1) {p.addPrcdrRsnCdCdgVrsn("]]");}


		/******************** Prcdr_RsnCd_Cdg_Cd ********************************************************************************/
		if(procedurereasoncodecodingi == 0) {p.addPrcdrRsnCdCdgCd("[[");}
		if(procedurereasoncodecoding.hasCode()) {

			p.addPrcdrRsnCdCdgCd(String.valueOf(procedurereasoncodecoding.getCode()));
		} else {
			p.addPrcdrRsnCdCdgCd("NULL");
		}

		if(procedurereasoncodecodingi == procedurereasoncodecodinglist.size()-1) {p.addPrcdrRsnCdCdgCd("]]");}


		/******************** Prcdr_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(procedurereasoncodecodingi == 0) {p.addPrcdrRsnCdCdgUsrSltd("[[");}
		if(procedurereasoncodecoding.hasUserSelected()) {

			p.addPrcdrRsnCdCdgUsrSltd(String.valueOf(procedurereasoncodecoding.getUserSelected()));
		} else {
			p.addPrcdrRsnCdCdgUsrSltd("NULL");
		}

		if(procedurereasoncodecodingi == procedurereasoncodecodinglist.size()-1) {p.addPrcdrRsnCdCdgUsrSltd("]]");}


		/******************** Prcdr_RsnCd_Cdg_Sys ********************************************************************************/
		if(procedurereasoncodecodingi == 0) {p.addPrcdrRsnCdCdgSys("[[");}
		if(procedurereasoncodecoding.hasSystem()) {

			p.addPrcdrRsnCdCdgSys(String.valueOf(procedurereasoncodecoding.getSystem()));
		} else {
			p.addPrcdrRsnCdCdgSys("NULL");
		}

		if(procedurereasoncodecodingi == procedurereasoncodecodinglist.size()-1) {p.addPrcdrRsnCdCdgSys("]]");}


		 };
		 };
		/******************** procedurenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> procedurenotelist = procedure.getNote();
		for(int procedurenotei = 0; procedurenotei<procedurenotelist.size();procedurenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  procedurenote = procedurenotelist.get(procedurenotei);

		/******************** Prcdr_Nt_Time ********************************************************************************/
		if(procedurenotei == 0) {p.addPrcdrNtTime("[");}
		if(procedurenote.hasTime()) {

			p.addPrcdrNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(procedurenote.getTime())+"\"");
		} else {
			p.addPrcdrNtTime("NULL");
		}

		if(procedurenotei == procedurenotelist.size()-1) {p.addPrcdrNtTime("]");}


		/******************** Prcdr_Nt_AthrRfrnc ********************************************************************************/
		if(procedurenotei == 0) {p.addPrcdrNtAthrRfrnc("[");}
		if(procedurenote.hasAuthorReference()) {

			if(procedurenote.getAuthorReference().getReference() != null) {
			p.addPrcdrNtAthrRfrnc(procedurenote.getAuthorReference().getReference());
			}
		} else {
			p.addPrcdrNtAthrRfrnc("NULL");
		}

		if(procedurenotei == procedurenotelist.size()-1) {p.addPrcdrNtAthrRfrnc("]");}


		/******************** Prcdr_Nt_Txt ********************************************************************************/
		if(procedurenotei == 0) {p.addPrcdrNtTxt("[");}
		if(procedurenote.hasText()) {

			p.addPrcdrNtTxt(String.valueOf(procedurenote.getText()));
		} else {
			p.addPrcdrNtTxt("NULL");
		}

		if(procedurenotei == procedurenotelist.size()-1) {p.addPrcdrNtTxt("]");}


		/******************** Prcdr_Nt_AthrStrgTyp ********************************************************************************/
		if(procedurenotei == 0) {p.addPrcdrNtAthrStrgTyp("[");}
		if(procedurenote.hasAuthorStringType()) {

			p.addPrcdrNtAthrStrgTyp("\""+procedurenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			p.addPrcdrNtAthrStrgTyp("NULL");
		}

		if(procedurenotei == procedurenotelist.size()-1) {p.addPrcdrNtAthrStrgTyp("]");}


		 };
		/******************** Prcdr_RsnRfrnc ********************************************************************************/
		if(procedure.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getReasonReference().size(); incr++) {
				array = array + procedure.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrRsnRfrnc(array);

		} else {
			p.addPrcdrRsnRfrnc("NULL");
		}


		/******************** procedureidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> procedureidentifierlist = procedure.getIdentifier();
		for(int procedureidentifieri = 0; procedureidentifieri<procedureidentifierlist.size();procedureidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  procedureidentifier = procedureidentifierlist.get(procedureidentifieri);

		/******************** Prcdr_Id_Vl ********************************************************************************/
		if(procedureidentifieri == 0) {p.addPrcdrIdVl("[");}
		if(procedureidentifier.hasValue()) {

			p.addPrcdrIdVl(String.valueOf(procedureidentifier.getValue()));
		} else {
			p.addPrcdrIdVl("NULL");
		}

		if(procedureidentifieri == procedureidentifierlist.size()-1) {p.addPrcdrIdVl("]");}


		/******************** procedureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureidentifiertype = procedureidentifier.getType();

		/******************** Prcdr_Id_Typ_Txt ********************************************************************************/
		if(procedureidentifieri == 0) {p.addPrcdrIdTypTxt("[");}
		if(procedureidentifiertype.hasText()) {

			p.addPrcdrIdTypTxt(String.valueOf(procedureidentifiertype.getText()));
		} else {
			p.addPrcdrIdTypTxt("NULL");
		}

		if(procedureidentifieri == procedureidentifierlist.size()-1) {p.addPrcdrIdTypTxt("]");}


		/******************** procedureidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedureidentifiertypecodinglist = procedureidentifiertype.getCoding();
		for(int procedureidentifiertypecodingi = 0; procedureidentifiertypecodingi<procedureidentifiertypecodinglist.size();procedureidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedureidentifiertypecoding = procedureidentifiertypecodinglist.get(procedureidentifiertypecodingi);

		/******************** Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(procedureidentifiertypecodingi == 0) {p.addPrcdrIdTypCdgDsply("[[");}
		if(procedureidentifiertypecoding.hasDisplay()) {

			p.addPrcdrIdTypCdgDsply(String.valueOf(procedureidentifiertypecoding.getDisplay()));
		} else {
			p.addPrcdrIdTypCdgDsply("NULL");
		}

		if(procedureidentifiertypecodingi == procedureidentifiertypecodinglist.size()-1) {p.addPrcdrIdTypCdgDsply("]]");}


		/******************** Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(procedureidentifiertypecodingi == 0) {p.addPrcdrIdTypCdgVrsn("[[");}
		if(procedureidentifiertypecoding.hasVersion()) {

			p.addPrcdrIdTypCdgVrsn(String.valueOf(procedureidentifiertypecoding.getVersion()));
		} else {
			p.addPrcdrIdTypCdgVrsn("NULL");
		}

		if(procedureidentifiertypecodingi == procedureidentifiertypecodinglist.size()-1) {p.addPrcdrIdTypCdgVrsn("]]");}


		/******************** Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(procedureidentifiertypecodingi == 0) {p.addPrcdrIdTypCdgCd("[[");}
		if(procedureidentifiertypecoding.hasCode()) {

			p.addPrcdrIdTypCdgCd(String.valueOf(procedureidentifiertypecoding.getCode()));
		} else {
			p.addPrcdrIdTypCdgCd("NULL");
		}

		if(procedureidentifiertypecodingi == procedureidentifiertypecodinglist.size()-1) {p.addPrcdrIdTypCdgCd("]]");}


		/******************** Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(procedureidentifiertypecodingi == 0) {p.addPrcdrIdTypCdgUsrSltd("[[");}
		if(procedureidentifiertypecoding.hasUserSelected()) {

			p.addPrcdrIdTypCdgUsrSltd(String.valueOf(procedureidentifiertypecoding.getUserSelected()));
		} else {
			p.addPrcdrIdTypCdgUsrSltd("NULL");
		}

		if(procedureidentifiertypecodingi == procedureidentifiertypecodinglist.size()-1) {p.addPrcdrIdTypCdgUsrSltd("]]");}


		/******************** Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(procedureidentifiertypecodingi == 0) {p.addPrcdrIdTypCdgSys("[[");}
		if(procedureidentifiertypecoding.hasSystem()) {

			p.addPrcdrIdTypCdgSys(String.valueOf(procedureidentifiertypecoding.getSystem()));
		} else {
			p.addPrcdrIdTypCdgSys("NULL");
		}

		if(procedureidentifiertypecodingi == procedureidentifiertypecodinglist.size()-1) {p.addPrcdrIdTypCdgSys("]]");}


		 };
		/******************** procedureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period procedureidentifierperiod = procedureidentifier.getPeriod();

		/******************** Prcdr_Id_Prd_Strt ********************************************************************************/
		if(procedureidentifieri == 0) {p.addPrcdrIdPrdStrt("[");}
		if(procedureidentifierperiod.hasStart()) {

			p.addPrcdrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(procedureidentifierperiod.getStart())+"\"");
		} else {
			p.addPrcdrIdPrdStrt("NULL");
		}

		if(procedureidentifieri == procedureidentifierlist.size()-1) {p.addPrcdrIdPrdStrt("]");}


		/******************** Prcdr_Id_Prd_End ********************************************************************************/
		if(procedureidentifieri == 0) {p.addPrcdrIdPrdEnd("[");}
		if(procedureidentifierperiod.hasEnd()) {

			p.addPrcdrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(procedureidentifierperiod.getEnd())+"\"");
		} else {
			p.addPrcdrIdPrdEnd("NULL");
		}

		if(procedureidentifieri == procedureidentifierlist.size()-1) {p.addPrcdrIdPrdEnd("]");}


		/******************** procedureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse procedureidentifieruse = procedureidentifier.getUse();
		if(procedureidentifieruse!=null) {
		if(procedureidentifieri == 0) {

		p.addPrcdrIdUse("[");		}
			p.addPrcdrIdUse(procedureidentifieruse.toCode());
		if(procedureidentifieri == procedureidentifierlist.size()-1) {

		p.addPrcdrIdUse("]");		}

		} else {
			p.addPrcdrIdUse("NULL");
		}

		/******************** Prcdr_Id_Assigner ********************************************************************************/
		if(procedureidentifieri == 0) {p.addPrcdrIdAssigner("[");}
		if(procedureidentifier.hasAssigner()) {

			if(procedureidentifier.getAssigner().getReference() != null) {
			p.addPrcdrIdAssigner(procedureidentifier.getAssigner().getReference());
			}
		} else {
			p.addPrcdrIdAssigner("NULL");
		}

		if(procedureidentifieri == procedureidentifierlist.size()-1) {p.addPrcdrIdAssigner("]");}


		/******************** Prcdr_Id_Sys ********************************************************************************/
		if(procedureidentifieri == 0) {p.addPrcdrIdSys("[");}
		if(procedureidentifier.hasSystem()) {

			p.addPrcdrIdSys(String.valueOf(procedureidentifier.getSystem()));
		} else {
			p.addPrcdrIdSys("NULL");
		}

		if(procedureidentifieri == procedureidentifierlist.size()-1) {p.addPrcdrIdSys("]");}


		 };
		/******************** Prcdr_InstantiatesUri ********************************************************************************/
		if(procedure.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getInstantiatesUri().size(); incr++) {
				array = array + procedure.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrInstantiatesUri(array);

		} else {
			p.addPrcdrInstantiatesUri("NULL");
		}


		/******************** procedureoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureoutcome = procedure.getOutcome();

		/******************** Prcdr_Outcome_Txt ********************************************************************************/
		if(procedureoutcome.hasText()) {

			p.addPrcdrOutcomeTxt(String.valueOf(procedureoutcome.getText()));
		} else {
			p.addPrcdrOutcomeTxt("NULL");
		}


		/******************** procedureoutcomecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedureoutcomecodinglist = procedureoutcome.getCoding();
		for(int procedureoutcomecodingi = 0; procedureoutcomecodingi<procedureoutcomecodinglist.size();procedureoutcomecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedureoutcomecoding = procedureoutcomecodinglist.get(procedureoutcomecodingi);

		/******************** Prcdr_Outcome_Cdg_Dsply ********************************************************************************/
		if(procedureoutcomecodingi == 0) {p.addPrcdrOutcomeCdgDsply("[");}
		if(procedureoutcomecoding.hasDisplay()) {

			p.addPrcdrOutcomeCdgDsply(String.valueOf(procedureoutcomecoding.getDisplay()));
		} else {
			p.addPrcdrOutcomeCdgDsply("NULL");
		}

		if(procedureoutcomecodingi == procedureoutcomecodinglist.size()-1) {p.addPrcdrOutcomeCdgDsply("]");}


		/******************** Prcdr_Outcome_Cdg_Vrsn ********************************************************************************/
		if(procedureoutcomecodingi == 0) {p.addPrcdrOutcomeCdgVrsn("[");}
		if(procedureoutcomecoding.hasVersion()) {

			p.addPrcdrOutcomeCdgVrsn(String.valueOf(procedureoutcomecoding.getVersion()));
		} else {
			p.addPrcdrOutcomeCdgVrsn("NULL");
		}

		if(procedureoutcomecodingi == procedureoutcomecodinglist.size()-1) {p.addPrcdrOutcomeCdgVrsn("]");}


		/******************** Prcdr_Outcome_Cdg_Cd ********************************************************************************/
		if(procedureoutcomecodingi == 0) {p.addPrcdrOutcomeCdgCd("[");}
		if(procedureoutcomecoding.hasCode()) {

			p.addPrcdrOutcomeCdgCd(String.valueOf(procedureoutcomecoding.getCode()));
		} else {
			p.addPrcdrOutcomeCdgCd("NULL");
		}

		if(procedureoutcomecodingi == procedureoutcomecodinglist.size()-1) {p.addPrcdrOutcomeCdgCd("]");}


		/******************** Prcdr_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(procedureoutcomecodingi == 0) {p.addPrcdrOutcomeCdgUsrSltd("[");}
		if(procedureoutcomecoding.hasUserSelected()) {

			p.addPrcdrOutcomeCdgUsrSltd(String.valueOf(procedureoutcomecoding.getUserSelected()));
		} else {
			p.addPrcdrOutcomeCdgUsrSltd("NULL");
		}

		if(procedureoutcomecodingi == procedureoutcomecodinglist.size()-1) {p.addPrcdrOutcomeCdgUsrSltd("]");}


		/******************** Prcdr_Outcome_Cdg_Sys ********************************************************************************/
		if(procedureoutcomecodingi == 0) {p.addPrcdrOutcomeCdgSys("[");}
		if(procedureoutcomecoding.hasSystem()) {

			p.addPrcdrOutcomeCdgSys(String.valueOf(procedureoutcomecoding.getSystem()));
		} else {
			p.addPrcdrOutcomeCdgSys("NULL");
		}

		if(procedureoutcomecodingi == procedureoutcomecodinglist.size()-1) {p.addPrcdrOutcomeCdgSys("]");}


		 };
		/******************** procedurecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecategory = procedure.getCategory();

		/******************** Prcdr_Ctgry_Txt ********************************************************************************/
		if(procedurecategory.hasText()) {

			p.addPrcdrCtgryTxt(String.valueOf(procedurecategory.getText()));
		} else {
			p.addPrcdrCtgryTxt("NULL");
		}


		/******************** procedurecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurecategorycodinglist = procedurecategory.getCoding();
		for(int procedurecategorycodingi = 0; procedurecategorycodingi<procedurecategorycodinglist.size();procedurecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurecategorycoding = procedurecategorycodinglist.get(procedurecategorycodingi);

		/******************** Prcdr_Ctgry_Cdg_Dsply ********************************************************************************/
		if(procedurecategorycodingi == 0) {p.addPrcdrCtgryCdgDsply("[");}
		if(procedurecategorycoding.hasDisplay()) {

			p.addPrcdrCtgryCdgDsply(String.valueOf(procedurecategorycoding.getDisplay()));
		} else {
			p.addPrcdrCtgryCdgDsply("NULL");
		}

		if(procedurecategorycodingi == procedurecategorycodinglist.size()-1) {p.addPrcdrCtgryCdgDsply("]");}


		/******************** Prcdr_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(procedurecategorycodingi == 0) {p.addPrcdrCtgryCdgVrsn("[");}
		if(procedurecategorycoding.hasVersion()) {

			p.addPrcdrCtgryCdgVrsn(String.valueOf(procedurecategorycoding.getVersion()));
		} else {
			p.addPrcdrCtgryCdgVrsn("NULL");
		}

		if(procedurecategorycodingi == procedurecategorycodinglist.size()-1) {p.addPrcdrCtgryCdgVrsn("]");}


		/******************** Prcdr_Ctgry_Cdg_Cd ********************************************************************************/
		if(procedurecategorycodingi == 0) {p.addPrcdrCtgryCdgCd("[");}
		if(procedurecategorycoding.hasCode()) {

			p.addPrcdrCtgryCdgCd(String.valueOf(procedurecategorycoding.getCode()));
		} else {
			p.addPrcdrCtgryCdgCd("NULL");
		}

		if(procedurecategorycodingi == procedurecategorycodinglist.size()-1) {p.addPrcdrCtgryCdgCd("]");}


		/******************** Prcdr_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(procedurecategorycodingi == 0) {p.addPrcdrCtgryCdgUsrSltd("[");}
		if(procedurecategorycoding.hasUserSelected()) {

			p.addPrcdrCtgryCdgUsrSltd(String.valueOf(procedurecategorycoding.getUserSelected()));
		} else {
			p.addPrcdrCtgryCdgUsrSltd("NULL");
		}

		if(procedurecategorycodingi == procedurecategorycodinglist.size()-1) {p.addPrcdrCtgryCdgUsrSltd("]");}


		/******************** Prcdr_Ctgry_Cdg_Sys ********************************************************************************/
		if(procedurecategorycodingi == 0) {p.addPrcdrCtgryCdgSys("[");}
		if(procedurecategorycoding.hasSystem()) {

			p.addPrcdrCtgryCdgSys(String.valueOf(procedurecategorycoding.getSystem()));
		} else {
			p.addPrcdrCtgryCdgSys("NULL");
		}

		if(procedurecategorycodingi == procedurecategorycodinglist.size()-1) {p.addPrcdrCtgryCdgSys("]");}


		 };
		/******************** procedurebodysite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> procedurebodysitelist = procedure.getBodySite();
		for(int procedurebodysitei = 0; procedurebodysitei<procedurebodysitelist.size();procedurebodysitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  procedurebodysite = procedurebodysitelist.get(procedurebodysitei);

		/******************** Prcdr_BodySite_Txt ********************************************************************************/
		if(procedurebodysitei == 0) {p.addPrcdrBodySiteTxt("[");}
		if(procedurebodysite.hasText()) {

			p.addPrcdrBodySiteTxt(String.valueOf(procedurebodysite.getText()));
		} else {
			p.addPrcdrBodySiteTxt("NULL");
		}

		if(procedurebodysitei == procedurebodysitelist.size()-1) {p.addPrcdrBodySiteTxt("]");}


		/******************** procedurebodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurebodysitecodinglist = procedurebodysite.getCoding();
		for(int procedurebodysitecodingi = 0; procedurebodysitecodingi<procedurebodysitecodinglist.size();procedurebodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurebodysitecoding = procedurebodysitecodinglist.get(procedurebodysitecodingi);

		/******************** Prcdr_BodySite_Cdg_Dsply ********************************************************************************/
		if(procedurebodysitecodingi == 0) {p.addPrcdrBodySiteCdgDsply("[[");}
		if(procedurebodysitecoding.hasDisplay()) {

			p.addPrcdrBodySiteCdgDsply(String.valueOf(procedurebodysitecoding.getDisplay()));
		} else {
			p.addPrcdrBodySiteCdgDsply("NULL");
		}

		if(procedurebodysitecodingi == procedurebodysitecodinglist.size()-1) {p.addPrcdrBodySiteCdgDsply("]]");}


		/******************** Prcdr_BodySite_Cdg_Vrsn ********************************************************************************/
		if(procedurebodysitecodingi == 0) {p.addPrcdrBodySiteCdgVrsn("[[");}
		if(procedurebodysitecoding.hasVersion()) {

			p.addPrcdrBodySiteCdgVrsn(String.valueOf(procedurebodysitecoding.getVersion()));
		} else {
			p.addPrcdrBodySiteCdgVrsn("NULL");
		}

		if(procedurebodysitecodingi == procedurebodysitecodinglist.size()-1) {p.addPrcdrBodySiteCdgVrsn("]]");}


		/******************** Prcdr_BodySite_Cdg_Cd ********************************************************************************/
		if(procedurebodysitecodingi == 0) {p.addPrcdrBodySiteCdgCd("[[");}
		if(procedurebodysitecoding.hasCode()) {

			p.addPrcdrBodySiteCdgCd(String.valueOf(procedurebodysitecoding.getCode()));
		} else {
			p.addPrcdrBodySiteCdgCd("NULL");
		}

		if(procedurebodysitecodingi == procedurebodysitecodinglist.size()-1) {p.addPrcdrBodySiteCdgCd("]]");}


		/******************** Prcdr_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(procedurebodysitecodingi == 0) {p.addPrcdrBodySiteCdgUsrSltd("[[");}
		if(procedurebodysitecoding.hasUserSelected()) {

			p.addPrcdrBodySiteCdgUsrSltd(String.valueOf(procedurebodysitecoding.getUserSelected()));
		} else {
			p.addPrcdrBodySiteCdgUsrSltd("NULL");
		}

		if(procedurebodysitecodingi == procedurebodysitecodinglist.size()-1) {p.addPrcdrBodySiteCdgUsrSltd("]]");}


		/******************** Prcdr_BodySite_Cdg_Sys ********************************************************************************/
		if(procedurebodysitecodingi == 0) {p.addPrcdrBodySiteCdgSys("[[");}
		if(procedurebodysitecoding.hasSystem()) {

			p.addPrcdrBodySiteCdgSys(String.valueOf(procedurebodysitecoding.getSystem()));
		} else {
			p.addPrcdrBodySiteCdgSys("NULL");
		}

		if(procedurebodysitecodingi == procedurebodysitecodinglist.size()-1) {p.addPrcdrBodySiteCdgSys("]]");}


		 };
		 };
		/******************** Prcdr_Recorder ********************************************************************************/
		if(procedure.hasRecorder()) {

			if(procedure.getRecorder().getReference() != null) {
			p.addPrcdrRecorder(procedure.getRecorder().getReference());
			}
		} else {
			p.addPrcdrRecorder("NULL");
		}


		/******************** Prcdr_Asserter ********************************************************************************/
		if(procedure.hasAsserter()) {

			if(procedure.getAsserter().getReference() != null) {
			p.addPrcdrAsserter(procedure.getAsserter().getReference());
			}
		} else {
			p.addPrcdrAsserter("NULL");
		}


		/******************** procedureperformer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent> procedureperformerlist = procedure.getPerformer();
		for(int procedureperformeri = 0; procedureperformeri<procedureperformerlist.size();procedureperformeri++ ) {
		org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent  procedureperformer = procedureperformerlist.get(procedureperformeri);

		/******************** procedureperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureperformerfunction = procedureperformer.getFunction();

		/******************** Prcdr_Prfrmr_Function_Txt ********************************************************************************/
		if(procedureperformeri == 0) {p.addPrcdrPrfrmrFunctionTxt("[");}
		if(procedureperformerfunction.hasText()) {

			p.addPrcdrPrfrmrFunctionTxt(String.valueOf(procedureperformerfunction.getText()));
		} else {
			p.addPrcdrPrfrmrFunctionTxt("NULL");
		}

		if(procedureperformeri == procedureperformerlist.size()-1) {p.addPrcdrPrfrmrFunctionTxt("]");}


		/******************** procedureperformerfunctioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedureperformerfunctioncodinglist = procedureperformerfunction.getCoding();
		for(int procedureperformerfunctioncodingi = 0; procedureperformerfunctioncodingi<procedureperformerfunctioncodinglist.size();procedureperformerfunctioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedureperformerfunctioncoding = procedureperformerfunctioncodinglist.get(procedureperformerfunctioncodingi);

		/******************** Prcdr_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(procedureperformerfunctioncodingi == 0) {p.addPrcdrPrfrmrFunctionCdgDsply("[[");}
		if(procedureperformerfunctioncoding.hasDisplay()) {

			p.addPrcdrPrfrmrFunctionCdgDsply(String.valueOf(procedureperformerfunctioncoding.getDisplay()));
		} else {
			p.addPrcdrPrfrmrFunctionCdgDsply("NULL");
		}

		if(procedureperformerfunctioncodingi == procedureperformerfunctioncodinglist.size()-1) {p.addPrcdrPrfrmrFunctionCdgDsply("]]");}


		/******************** Prcdr_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(procedureperformerfunctioncodingi == 0) {p.addPrcdrPrfrmrFunctionCdgVrsn("[[");}
		if(procedureperformerfunctioncoding.hasVersion()) {

			p.addPrcdrPrfrmrFunctionCdgVrsn(String.valueOf(procedureperformerfunctioncoding.getVersion()));
		} else {
			p.addPrcdrPrfrmrFunctionCdgVrsn("NULL");
		}

		if(procedureperformerfunctioncodingi == procedureperformerfunctioncodinglist.size()-1) {p.addPrcdrPrfrmrFunctionCdgVrsn("]]");}


		/******************** Prcdr_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(procedureperformerfunctioncodingi == 0) {p.addPrcdrPrfrmrFunctionCdgCd("[[");}
		if(procedureperformerfunctioncoding.hasCode()) {

			p.addPrcdrPrfrmrFunctionCdgCd(String.valueOf(procedureperformerfunctioncoding.getCode()));
		} else {
			p.addPrcdrPrfrmrFunctionCdgCd("NULL");
		}

		if(procedureperformerfunctioncodingi == procedureperformerfunctioncodinglist.size()-1) {p.addPrcdrPrfrmrFunctionCdgCd("]]");}


		/******************** Prcdr_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(procedureperformerfunctioncodingi == 0) {p.addPrcdrPrfrmrFunctionCdgUsrSltd("[[");}
		if(procedureperformerfunctioncoding.hasUserSelected()) {

			p.addPrcdrPrfrmrFunctionCdgUsrSltd(String.valueOf(procedureperformerfunctioncoding.getUserSelected()));
		} else {
			p.addPrcdrPrfrmrFunctionCdgUsrSltd("NULL");
		}

		if(procedureperformerfunctioncodingi == procedureperformerfunctioncodinglist.size()-1) {p.addPrcdrPrfrmrFunctionCdgUsrSltd("]]");}


		/******************** Prcdr_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(procedureperformerfunctioncodingi == 0) {p.addPrcdrPrfrmrFunctionCdgSys("[[");}
		if(procedureperformerfunctioncoding.hasSystem()) {

			p.addPrcdrPrfrmrFunctionCdgSys(String.valueOf(procedureperformerfunctioncoding.getSystem()));
		} else {
			p.addPrcdrPrfrmrFunctionCdgSys("NULL");
		}

		if(procedureperformerfunctioncodingi == procedureperformerfunctioncodinglist.size()-1) {p.addPrcdrPrfrmrFunctionCdgSys("]]");}


		 };
		/******************** Prcdr_Prfrmr_Actor ********************************************************************************/
		if(procedureperformeri == 0) {p.addPrcdrPrfrmrActor("[");}
		if(procedureperformer.hasActor()) {

			if(procedureperformer.getActor().getReference() != null) {
			p.addPrcdrPrfrmrActor(procedureperformer.getActor().getReference());
			}
		} else {
			p.addPrcdrPrfrmrActor("NULL");
		}

		if(procedureperformeri == procedureperformerlist.size()-1) {p.addPrcdrPrfrmrActor("]");}


		/******************** Prcdr_Prfrmr_OnBehalfOf ********************************************************************************/
		if(procedureperformeri == 0) {p.addPrcdrPrfrmrOnBehalfOf("[");}
		if(procedureperformer.hasOnBehalfOf()) {

			if(procedureperformer.getOnBehalfOf().getReference() != null) {
			p.addPrcdrPrfrmrOnBehalfOf(procedureperformer.getOnBehalfOf().getReference());
			}
		} else {
			p.addPrcdrPrfrmrOnBehalfOf("NULL");
		}

		if(procedureperformeri == procedureperformerlist.size()-1) {p.addPrcdrPrfrmrOnBehalfOf("]");}


		 };
		/******************** Prcdr_InstantiatesCanonical ********************************************************************************/
		if(procedure.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getInstantiatesCanonical().size(); incr++) {
				array = array + procedure.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrInstantiatesCanonical(array);

		} else {
			p.addPrcdrInstantiatesCanonical("NULL");
		}


		/******************** Prcdr_PerformedDtTimeTyp ********************************************************************************/
		if(procedure.hasPerformedDateTimeType()) {

			p.addPrcdrPerformedDtTimeTyp("\""+procedure.getPerformedDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPrcdrPerformedDtTimeTyp("NULL");
		}


		/******************** Prcdr_PerformedStrgTyp ********************************************************************************/
		if(procedure.hasPerformedStringType()) {

			p.addPrcdrPerformedStrgTyp("\""+procedure.getPerformedStringType().getValueAsString()+"\"");
		} else {
			p.addPrcdrPerformedStrgTyp("NULL");
		}


		/******************** Prcdr_ComplicationDtl ********************************************************************************/
		if(procedure.hasComplicationDetail()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getComplicationDetail().size(); incr++) {
				array = array + procedure.getComplicationDetail().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrComplicationDtl(array);

		} else {
			p.addPrcdrComplicationDtl("NULL");
		}


		/******************** Prcdr_PartOf ********************************************************************************/
		if(procedure.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getPartOf().size(); incr++) {
				array = array + procedure.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrPartOf(array);

		} else {
			p.addPrcdrPartOf("NULL");
		}


		/******************** procedurestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurestatusreason = procedure.getStatusReason();

		/******************** Prcdr_StsRsn_Txt ********************************************************************************/
		if(procedurestatusreason.hasText()) {

			p.addPrcdrStsRsnTxt(String.valueOf(procedurestatusreason.getText()));
		} else {
			p.addPrcdrStsRsnTxt("NULL");
		}


		/******************** procedurestatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurestatusreasoncodinglist = procedurestatusreason.getCoding();
		for(int procedurestatusreasoncodingi = 0; procedurestatusreasoncodingi<procedurestatusreasoncodinglist.size();procedurestatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurestatusreasoncoding = procedurestatusreasoncodinglist.get(procedurestatusreasoncodingi);

		/******************** Prcdr_StsRsn_Cdg_Dsply ********************************************************************************/
		if(procedurestatusreasoncodingi == 0) {p.addPrcdrStsRsnCdgDsply("[");}
		if(procedurestatusreasoncoding.hasDisplay()) {

			p.addPrcdrStsRsnCdgDsply(String.valueOf(procedurestatusreasoncoding.getDisplay()));
		} else {
			p.addPrcdrStsRsnCdgDsply("NULL");
		}

		if(procedurestatusreasoncodingi == procedurestatusreasoncodinglist.size()-1) {p.addPrcdrStsRsnCdgDsply("]");}


		/******************** Prcdr_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(procedurestatusreasoncodingi == 0) {p.addPrcdrStsRsnCdgVrsn("[");}
		if(procedurestatusreasoncoding.hasVersion()) {

			p.addPrcdrStsRsnCdgVrsn(String.valueOf(procedurestatusreasoncoding.getVersion()));
		} else {
			p.addPrcdrStsRsnCdgVrsn("NULL");
		}

		if(procedurestatusreasoncodingi == procedurestatusreasoncodinglist.size()-1) {p.addPrcdrStsRsnCdgVrsn("]");}


		/******************** Prcdr_StsRsn_Cdg_Cd ********************************************************************************/
		if(procedurestatusreasoncodingi == 0) {p.addPrcdrStsRsnCdgCd("[");}
		if(procedurestatusreasoncoding.hasCode()) {

			p.addPrcdrStsRsnCdgCd(String.valueOf(procedurestatusreasoncoding.getCode()));
		} else {
			p.addPrcdrStsRsnCdgCd("NULL");
		}

		if(procedurestatusreasoncodingi == procedurestatusreasoncodinglist.size()-1) {p.addPrcdrStsRsnCdgCd("]");}


		/******************** Prcdr_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(procedurestatusreasoncodingi == 0) {p.addPrcdrStsRsnCdgUsrSltd("[");}
		if(procedurestatusreasoncoding.hasUserSelected()) {

			p.addPrcdrStsRsnCdgUsrSltd(String.valueOf(procedurestatusreasoncoding.getUserSelected()));
		} else {
			p.addPrcdrStsRsnCdgUsrSltd("NULL");
		}

		if(procedurestatusreasoncodingi == procedurestatusreasoncodinglist.size()-1) {p.addPrcdrStsRsnCdgUsrSltd("]");}


		/******************** Prcdr_StsRsn_Cdg_Sys ********************************************************************************/
		if(procedurestatusreasoncodingi == 0) {p.addPrcdrStsRsnCdgSys("[");}
		if(procedurestatusreasoncoding.hasSystem()) {

			p.addPrcdrStsRsnCdgSys(String.valueOf(procedurestatusreasoncoding.getSystem()));
		} else {
			p.addPrcdrStsRsnCdgSys("NULL");
		}

		if(procedurestatusreasoncodingi == procedurestatusreasoncodinglist.size()-1) {p.addPrcdrStsRsnCdgSys("]");}


		 };
		/******************** procedureperformedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period procedureperformedperiod = procedure.getPerformedPeriod();

		/******************** Prcdr_PerformedPrd_Strt ********************************************************************************/
		if(procedureperformedperiod.hasStart()) {

			p.addPrcdrPerformedPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(procedureperformedperiod.getStart())+"\"");
		} else {
			p.addPrcdrPerformedPrdStrt("NULL");
		}


		/******************** Prcdr_PerformedPrd_End ********************************************************************************/
		if(procedureperformedperiod.hasEnd()) {

			p.addPrcdrPerformedPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(procedureperformedperiod.getEnd())+"\"");
		} else {
			p.addPrcdrPerformedPrdEnd("NULL");
		}


		/******************** procedureperformedage ********************************************************************************/
		org.hl7.fhir.r4.model.Age procedureperformedage = procedure.getPerformedAge();

		/******************** Prcdr_PerformedAge_Vl ********************************************************************************/
		if(procedureperformedage.hasValue()) {

			p.addPrcdrPerformedAgeVl(String.valueOf(procedureperformedage.getValue()));
		} else {
			p.addPrcdrPerformedAgeVl("NULL");
		}


		/******************** procedureperformedagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator procedureperformedagecomparator = procedureperformedage.getComparator();
		if(procedureperformedagecomparator!=null) {
			p.addPrcdrPerformedAgeCmprtr(procedureperformedagecomparator.toCode());
		} else {
			p.addPrcdrPerformedAgeCmprtr("NULL");
		}

		/******************** Prcdr_PerformedAge_Cd ********************************************************************************/
		if(procedureperformedage.hasCode()) {

			p.addPrcdrPerformedAgeCd(String.valueOf(procedureperformedage.getCode()));
		} else {
			p.addPrcdrPerformedAgeCd("NULL");
		}


		/******************** Prcdr_PerformedAge_Unt ********************************************************************************/
		if(procedureperformedage.hasUnit()) {

			p.addPrcdrPerformedAgeUnt(String.valueOf(procedureperformedage.getUnit()));
		} else {
			p.addPrcdrPerformedAgeUnt("NULL");
		}


		/******************** Prcdr_PerformedAge_Sys ********************************************************************************/
		if(procedureperformedage.hasSystem()) {

			p.addPrcdrPerformedAgeSys(String.valueOf(procedureperformedage.getSystem()));
		} else {
			p.addPrcdrPerformedAgeSys("NULL");
		}


		/******************** procedureperformedrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range procedureperformedrange = procedure.getPerformedRange();

		/******************** procedureperformedrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity procedureperformedrangelow = procedureperformedrange.getLow();

		/******************** Prcdr_PerformedRng_Lw_Vl ********************************************************************************/
		if(procedureperformedrangelow.hasValue()) {

			p.addPrcdrPerformedRngLwVl(String.valueOf(procedureperformedrangelow.getValue()));
		} else {
			p.addPrcdrPerformedRngLwVl("NULL");
		}


		/******************** procedureperformedrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator procedureperformedrangelowcomparator = procedureperformedrangelow.getComparator();
		if(procedureperformedrangelowcomparator!=null) {
			p.addPrcdrPerformedRngLwCmprtr(procedureperformedrangelowcomparator.toCode());
		} else {
			p.addPrcdrPerformedRngLwCmprtr("NULL");
		}

		/******************** Prcdr_PerformedRng_Lw_Cd ********************************************************************************/
		if(procedureperformedrangelow.hasCode()) {

			p.addPrcdrPerformedRngLwCd(String.valueOf(procedureperformedrangelow.getCode()));
		} else {
			p.addPrcdrPerformedRngLwCd("NULL");
		}


		/******************** Prcdr_PerformedRng_Lw_Unt ********************************************************************************/
		if(procedureperformedrangelow.hasUnit()) {

			p.addPrcdrPerformedRngLwUnt(String.valueOf(procedureperformedrangelow.getUnit()));
		} else {
			p.addPrcdrPerformedRngLwUnt("NULL");
		}


		/******************** Prcdr_PerformedRng_Lw_Sys ********************************************************************************/
		if(procedureperformedrangelow.hasSystem()) {

			p.addPrcdrPerformedRngLwSys(String.valueOf(procedureperformedrangelow.getSystem()));
		} else {
			p.addPrcdrPerformedRngLwSys("NULL");
		}


		/******************** procedureperformedrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity procedureperformedrangehigh = procedureperformedrange.getHigh();

		/******************** Prcdr_PerformedRng_Hi_Vl ********************************************************************************/
		if(procedureperformedrangehigh.hasValue()) {

			p.addPrcdrPerformedRngHiVl(String.valueOf(procedureperformedrangehigh.getValue()));
		} else {
			p.addPrcdrPerformedRngHiVl("NULL");
		}


		/******************** procedureperformedrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator procedureperformedrangehighcomparator = procedureperformedrangehigh.getComparator();
		if(procedureperformedrangehighcomparator!=null) {
			p.addPrcdrPerformedRngHiCmprtr(procedureperformedrangehighcomparator.toCode());
		} else {
			p.addPrcdrPerformedRngHiCmprtr("NULL");
		}

		/******************** Prcdr_PerformedRng_Hi_Cd ********************************************************************************/
		if(procedureperformedrangehigh.hasCode()) {

			p.addPrcdrPerformedRngHiCd(String.valueOf(procedureperformedrangehigh.getCode()));
		} else {
			p.addPrcdrPerformedRngHiCd("NULL");
		}


		/******************** Prcdr_PerformedRng_Hi_Unt ********************************************************************************/
		if(procedureperformedrangehigh.hasUnit()) {

			p.addPrcdrPerformedRngHiUnt(String.valueOf(procedureperformedrangehigh.getUnit()));
		} else {
			p.addPrcdrPerformedRngHiUnt("NULL");
		}


		/******************** Prcdr_PerformedRng_Hi_Sys ********************************************************************************/
		if(procedureperformedrangehigh.hasSystem()) {

			p.addPrcdrPerformedRngHiSys(String.valueOf(procedureperformedrangehigh.getSystem()));
		} else {
			p.addPrcdrPerformedRngHiSys("NULL");
		}


		/******************** Prcdr_UsedRfrnc ********************************************************************************/
		if(procedure.hasUsedReference()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getUsedReference().size(); incr++) {
				array = array + procedure.getUsedReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrUsedRfrnc(array);

		} else {
			p.addPrcdrUsedRfrnc("NULL");
		}


		/******************** procedurefollowup ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> procedurefollowuplist = procedure.getFollowUp();
		for(int procedurefollowupi = 0; procedurefollowupi<procedurefollowuplist.size();procedurefollowupi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  procedurefollowup = procedurefollowuplist.get(procedurefollowupi);

		/******************** Prcdr_FollowUp_Txt ********************************************************************************/
		if(procedurefollowupi == 0) {p.addPrcdrFollowUpTxt("[");}
		if(procedurefollowup.hasText()) {

			p.addPrcdrFollowUpTxt(String.valueOf(procedurefollowup.getText()));
		} else {
			p.addPrcdrFollowUpTxt("NULL");
		}

		if(procedurefollowupi == procedurefollowuplist.size()-1) {p.addPrcdrFollowUpTxt("]");}


		/******************** procedurefollowupcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurefollowupcodinglist = procedurefollowup.getCoding();
		for(int procedurefollowupcodingi = 0; procedurefollowupcodingi<procedurefollowupcodinglist.size();procedurefollowupcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurefollowupcoding = procedurefollowupcodinglist.get(procedurefollowupcodingi);

		/******************** Prcdr_FollowUp_Cdg_Dsply ********************************************************************************/
		if(procedurefollowupcodingi == 0) {p.addPrcdrFollowUpCdgDsply("[[");}
		if(procedurefollowupcoding.hasDisplay()) {

			p.addPrcdrFollowUpCdgDsply(String.valueOf(procedurefollowupcoding.getDisplay()));
		} else {
			p.addPrcdrFollowUpCdgDsply("NULL");
		}

		if(procedurefollowupcodingi == procedurefollowupcodinglist.size()-1) {p.addPrcdrFollowUpCdgDsply("]]");}


		/******************** Prcdr_FollowUp_Cdg_Vrsn ********************************************************************************/
		if(procedurefollowupcodingi == 0) {p.addPrcdrFollowUpCdgVrsn("[[");}
		if(procedurefollowupcoding.hasVersion()) {

			p.addPrcdrFollowUpCdgVrsn(String.valueOf(procedurefollowupcoding.getVersion()));
		} else {
			p.addPrcdrFollowUpCdgVrsn("NULL");
		}

		if(procedurefollowupcodingi == procedurefollowupcodinglist.size()-1) {p.addPrcdrFollowUpCdgVrsn("]]");}


		/******************** Prcdr_FollowUp_Cdg_Cd ********************************************************************************/
		if(procedurefollowupcodingi == 0) {p.addPrcdrFollowUpCdgCd("[[");}
		if(procedurefollowupcoding.hasCode()) {

			p.addPrcdrFollowUpCdgCd(String.valueOf(procedurefollowupcoding.getCode()));
		} else {
			p.addPrcdrFollowUpCdgCd("NULL");
		}

		if(procedurefollowupcodingi == procedurefollowupcodinglist.size()-1) {p.addPrcdrFollowUpCdgCd("]]");}


		/******************** Prcdr_FollowUp_Cdg_UsrSltd ********************************************************************************/
		if(procedurefollowupcodingi == 0) {p.addPrcdrFollowUpCdgUsrSltd("[[");}
		if(procedurefollowupcoding.hasUserSelected()) {

			p.addPrcdrFollowUpCdgUsrSltd(String.valueOf(procedurefollowupcoding.getUserSelected()));
		} else {
			p.addPrcdrFollowUpCdgUsrSltd("NULL");
		}

		if(procedurefollowupcodingi == procedurefollowupcodinglist.size()-1) {p.addPrcdrFollowUpCdgUsrSltd("]]");}


		/******************** Prcdr_FollowUp_Cdg_Sys ********************************************************************************/
		if(procedurefollowupcodingi == 0) {p.addPrcdrFollowUpCdgSys("[[");}
		if(procedurefollowupcoding.hasSystem()) {

			p.addPrcdrFollowUpCdgSys(String.valueOf(procedurefollowupcoding.getSystem()));
		} else {
			p.addPrcdrFollowUpCdgSys("NULL");
		}

		if(procedurefollowupcodingi == procedurefollowupcodinglist.size()-1) {p.addPrcdrFollowUpCdgSys("]]");}


		 };
		 };
		/******************** Prcdr_Rpt ********************************************************************************/
		if(procedure.hasReport()) {

			String  array = "[";
			for(int incr=0; incr<procedure.getReport().size(); incr++) {
				array = array + procedure.getReport().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrcdrRpt(array);

		} else {
			p.addPrcdrRpt("NULL");
		}


		/******************** procedurefocaldevice ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent> procedurefocaldevicelist = procedure.getFocalDevice();
		for(int procedurefocaldevicei = 0; procedurefocaldevicei<procedurefocaldevicelist.size();procedurefocaldevicei++ ) {
		org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent  procedurefocaldevice = procedurefocaldevicelist.get(procedurefocaldevicei);

		/******************** procedurefocaldeviceaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurefocaldeviceaction = procedurefocaldevice.getAction();

		/******************** Prcdr_FocalDvc_Actn_Txt ********************************************************************************/
		if(procedurefocaldevicei == 0) {p.addPrcdrFocalDvcActnTxt("[");}
		if(procedurefocaldeviceaction.hasText()) {

			p.addPrcdrFocalDvcActnTxt(String.valueOf(procedurefocaldeviceaction.getText()));
		} else {
			p.addPrcdrFocalDvcActnTxt("NULL");
		}

		if(procedurefocaldevicei == procedurefocaldevicelist.size()-1) {p.addPrcdrFocalDvcActnTxt("]");}


		/******************** procedurefocaldeviceactioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurefocaldeviceactioncodinglist = procedurefocaldeviceaction.getCoding();
		for(int procedurefocaldeviceactioncodingi = 0; procedurefocaldeviceactioncodingi<procedurefocaldeviceactioncodinglist.size();procedurefocaldeviceactioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurefocaldeviceactioncoding = procedurefocaldeviceactioncodinglist.get(procedurefocaldeviceactioncodingi);

		/******************** Prcdr_FocalDvc_Actn_Cdg_Dsply ********************************************************************************/
		if(procedurefocaldeviceactioncodingi == 0) {p.addPrcdrFocalDvcActnCdgDsply("[[");}
		if(procedurefocaldeviceactioncoding.hasDisplay()) {

			p.addPrcdrFocalDvcActnCdgDsply(String.valueOf(procedurefocaldeviceactioncoding.getDisplay()));
		} else {
			p.addPrcdrFocalDvcActnCdgDsply("NULL");
		}

		if(procedurefocaldeviceactioncodingi == procedurefocaldeviceactioncodinglist.size()-1) {p.addPrcdrFocalDvcActnCdgDsply("]]");}


		/******************** Prcdr_FocalDvc_Actn_Cdg_Vrsn ********************************************************************************/
		if(procedurefocaldeviceactioncodingi == 0) {p.addPrcdrFocalDvcActnCdgVrsn("[[");}
		if(procedurefocaldeviceactioncoding.hasVersion()) {

			p.addPrcdrFocalDvcActnCdgVrsn(String.valueOf(procedurefocaldeviceactioncoding.getVersion()));
		} else {
			p.addPrcdrFocalDvcActnCdgVrsn("NULL");
		}

		if(procedurefocaldeviceactioncodingi == procedurefocaldeviceactioncodinglist.size()-1) {p.addPrcdrFocalDvcActnCdgVrsn("]]");}


		/******************** Prcdr_FocalDvc_Actn_Cdg_Cd ********************************************************************************/
		if(procedurefocaldeviceactioncodingi == 0) {p.addPrcdrFocalDvcActnCdgCd("[[");}
		if(procedurefocaldeviceactioncoding.hasCode()) {

			p.addPrcdrFocalDvcActnCdgCd(String.valueOf(procedurefocaldeviceactioncoding.getCode()));
		} else {
			p.addPrcdrFocalDvcActnCdgCd("NULL");
		}

		if(procedurefocaldeviceactioncodingi == procedurefocaldeviceactioncodinglist.size()-1) {p.addPrcdrFocalDvcActnCdgCd("]]");}


		/******************** Prcdr_FocalDvc_Actn_Cdg_UsrSltd ********************************************************************************/
		if(procedurefocaldeviceactioncodingi == 0) {p.addPrcdrFocalDvcActnCdgUsrSltd("[[");}
		if(procedurefocaldeviceactioncoding.hasUserSelected()) {

			p.addPrcdrFocalDvcActnCdgUsrSltd(String.valueOf(procedurefocaldeviceactioncoding.getUserSelected()));
		} else {
			p.addPrcdrFocalDvcActnCdgUsrSltd("NULL");
		}

		if(procedurefocaldeviceactioncodingi == procedurefocaldeviceactioncodinglist.size()-1) {p.addPrcdrFocalDvcActnCdgUsrSltd("]]");}


		/******************** Prcdr_FocalDvc_Actn_Cdg_Sys ********************************************************************************/
		if(procedurefocaldeviceactioncodingi == 0) {p.addPrcdrFocalDvcActnCdgSys("[[");}
		if(procedurefocaldeviceactioncoding.hasSystem()) {

			p.addPrcdrFocalDvcActnCdgSys(String.valueOf(procedurefocaldeviceactioncoding.getSystem()));
		} else {
			p.addPrcdrFocalDvcActnCdgSys("NULL");
		}

		if(procedurefocaldeviceactioncodingi == procedurefocaldeviceactioncodinglist.size()-1) {p.addPrcdrFocalDvcActnCdgSys("]]");}


		 };
		/******************** Prcdr_FocalDvc_Manipulated ********************************************************************************/
		if(procedurefocaldevicei == 0) {p.addPrcdrFocalDvcManipulated("[");}
		if(procedurefocaldevice.hasManipulated()) {

			if(procedurefocaldevice.getManipulated().getReference() != null) {
			p.addPrcdrFocalDvcManipulated(procedurefocaldevice.getManipulated().getReference());
			}
		} else {
			p.addPrcdrFocalDvcManipulated("NULL");
		}

		if(procedurefocaldevicei == procedurefocaldevicelist.size()-1) {p.addPrcdrFocalDvcManipulated("]");}


		 };
		/******************** procedurecomplication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> procedurecomplicationlist = procedure.getComplication();
		for(int procedurecomplicationi = 0; procedurecomplicationi<procedurecomplicationlist.size();procedurecomplicationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  procedurecomplication = procedurecomplicationlist.get(procedurecomplicationi);

		/******************** Prcdr_Complication_Txt ********************************************************************************/
		if(procedurecomplicationi == 0) {p.addPrcdrComplicationTxt("[");}
		if(procedurecomplication.hasText()) {

			p.addPrcdrComplicationTxt(String.valueOf(procedurecomplication.getText()));
		} else {
			p.addPrcdrComplicationTxt("NULL");
		}

		if(procedurecomplicationi == procedurecomplicationlist.size()-1) {p.addPrcdrComplicationTxt("]");}


		/******************** procedurecomplicationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedurecomplicationcodinglist = procedurecomplication.getCoding();
		for(int procedurecomplicationcodingi = 0; procedurecomplicationcodingi<procedurecomplicationcodinglist.size();procedurecomplicationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedurecomplicationcoding = procedurecomplicationcodinglist.get(procedurecomplicationcodingi);

		/******************** Prcdr_Complication_Cdg_Dsply ********************************************************************************/
		if(procedurecomplicationcodingi == 0) {p.addPrcdrComplicationCdgDsply("[[");}
		if(procedurecomplicationcoding.hasDisplay()) {

			p.addPrcdrComplicationCdgDsply(String.valueOf(procedurecomplicationcoding.getDisplay()));
		} else {
			p.addPrcdrComplicationCdgDsply("NULL");
		}

		if(procedurecomplicationcodingi == procedurecomplicationcodinglist.size()-1) {p.addPrcdrComplicationCdgDsply("]]");}


		/******************** Prcdr_Complication_Cdg_Vrsn ********************************************************************************/
		if(procedurecomplicationcodingi == 0) {p.addPrcdrComplicationCdgVrsn("[[");}
		if(procedurecomplicationcoding.hasVersion()) {

			p.addPrcdrComplicationCdgVrsn(String.valueOf(procedurecomplicationcoding.getVersion()));
		} else {
			p.addPrcdrComplicationCdgVrsn("NULL");
		}

		if(procedurecomplicationcodingi == procedurecomplicationcodinglist.size()-1) {p.addPrcdrComplicationCdgVrsn("]]");}


		/******************** Prcdr_Complication_Cdg_Cd ********************************************************************************/
		if(procedurecomplicationcodingi == 0) {p.addPrcdrComplicationCdgCd("[[");}
		if(procedurecomplicationcoding.hasCode()) {

			p.addPrcdrComplicationCdgCd(String.valueOf(procedurecomplicationcoding.getCode()));
		} else {
			p.addPrcdrComplicationCdgCd("NULL");
		}

		if(procedurecomplicationcodingi == procedurecomplicationcodinglist.size()-1) {p.addPrcdrComplicationCdgCd("]]");}


		/******************** Prcdr_Complication_Cdg_UsrSltd ********************************************************************************/
		if(procedurecomplicationcodingi == 0) {p.addPrcdrComplicationCdgUsrSltd("[[");}
		if(procedurecomplicationcoding.hasUserSelected()) {

			p.addPrcdrComplicationCdgUsrSltd(String.valueOf(procedurecomplicationcoding.getUserSelected()));
		} else {
			p.addPrcdrComplicationCdgUsrSltd("NULL");
		}

		if(procedurecomplicationcodingi == procedurecomplicationcodinglist.size()-1) {p.addPrcdrComplicationCdgUsrSltd("]]");}


		/******************** Prcdr_Complication_Cdg_Sys ********************************************************************************/
		if(procedurecomplicationcodingi == 0) {p.addPrcdrComplicationCdgSys("[[");}
		if(procedurecomplicationcoding.hasSystem()) {

			p.addPrcdrComplicationCdgSys(String.valueOf(procedurecomplicationcoding.getSystem()));
		} else {
			p.addPrcdrComplicationCdgSys("NULL");
		}

		if(procedurecomplicationcodingi == procedurecomplicationcodinglist.size()-1) {p.addPrcdrComplicationCdgSys("]]");}


		 };
		 };
		/******************** procedureusedcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> procedureusedcodelist = procedure.getUsedCode();
		for(int procedureusedcodei = 0; procedureusedcodei<procedureusedcodelist.size();procedureusedcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  procedureusedcode = procedureusedcodelist.get(procedureusedcodei);

		/******************** Prcdr_UsedCd_Txt ********************************************************************************/
		if(procedureusedcodei == 0) {p.addPrcdrUsedCdTxt("[");}
		if(procedureusedcode.hasText()) {

			p.addPrcdrUsedCdTxt(String.valueOf(procedureusedcode.getText()));
		} else {
			p.addPrcdrUsedCdTxt("NULL");
		}

		if(procedureusedcodei == procedureusedcodelist.size()-1) {p.addPrcdrUsedCdTxt("]");}


		/******************** procedureusedcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> procedureusedcodecodinglist = procedureusedcode.getCoding();
		for(int procedureusedcodecodingi = 0; procedureusedcodecodingi<procedureusedcodecodinglist.size();procedureusedcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  procedureusedcodecoding = procedureusedcodecodinglist.get(procedureusedcodecodingi);

		/******************** Prcdr_UsedCd_Cdg_Dsply ********************************************************************************/
		if(procedureusedcodecodingi == 0) {p.addPrcdrUsedCdCdgDsply("[[");}
		if(procedureusedcodecoding.hasDisplay()) {

			p.addPrcdrUsedCdCdgDsply(String.valueOf(procedureusedcodecoding.getDisplay()));
		} else {
			p.addPrcdrUsedCdCdgDsply("NULL");
		}

		if(procedureusedcodecodingi == procedureusedcodecodinglist.size()-1) {p.addPrcdrUsedCdCdgDsply("]]");}


		/******************** Prcdr_UsedCd_Cdg_Vrsn ********************************************************************************/
		if(procedureusedcodecodingi == 0) {p.addPrcdrUsedCdCdgVrsn("[[");}
		if(procedureusedcodecoding.hasVersion()) {

			p.addPrcdrUsedCdCdgVrsn(String.valueOf(procedureusedcodecoding.getVersion()));
		} else {
			p.addPrcdrUsedCdCdgVrsn("NULL");
		}

		if(procedureusedcodecodingi == procedureusedcodecodinglist.size()-1) {p.addPrcdrUsedCdCdgVrsn("]]");}


		/******************** Prcdr_UsedCd_Cdg_Cd ********************************************************************************/
		if(procedureusedcodecodingi == 0) {p.addPrcdrUsedCdCdgCd("[[");}
		if(procedureusedcodecoding.hasCode()) {

			p.addPrcdrUsedCdCdgCd(String.valueOf(procedureusedcodecoding.getCode()));
		} else {
			p.addPrcdrUsedCdCdgCd("NULL");
		}

		if(procedureusedcodecodingi == procedureusedcodecodinglist.size()-1) {p.addPrcdrUsedCdCdgCd("]]");}


		/******************** Prcdr_UsedCd_Cdg_UsrSltd ********************************************************************************/
		if(procedureusedcodecodingi == 0) {p.addPrcdrUsedCdCdgUsrSltd("[[");}
		if(procedureusedcodecoding.hasUserSelected()) {

			p.addPrcdrUsedCdCdgUsrSltd(String.valueOf(procedureusedcodecoding.getUserSelected()));
		} else {
			p.addPrcdrUsedCdCdgUsrSltd("NULL");
		}

		if(procedureusedcodecodingi == procedureusedcodecodinglist.size()-1) {p.addPrcdrUsedCdCdgUsrSltd("]]");}


		/******************** Prcdr_UsedCd_Cdg_Sys ********************************************************************************/
		if(procedureusedcodecodingi == 0) {p.addPrcdrUsedCdCdgSys("[[");}
		if(procedureusedcodecoding.hasSystem()) {

			p.addPrcdrUsedCdCdgSys(String.valueOf(procedureusedcodecoding.getSystem()));
		} else {
			p.addPrcdrUsedCdCdgSys("NULL");
		}

		if(procedureusedcodecodingi == procedureusedcodecodinglist.size()-1) {p.addPrcdrUsedCdCdgSys("]]");}


		 };
		 };
		return p;
	}
}
