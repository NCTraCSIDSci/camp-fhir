package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Encounter;
public class EncounterBidirectionalConversion 
{
	public Encounter Encounters(org.hl7.fhir.r4.model.Encounter encounter) throws ParseException
	{
		 main.java.com.campfhir.model.Encounter e = new  main.java.com.campfhir.model.Encounter();

		/******************** id ********************************************************************************/
		e.setId(encounter.getIdElement().getIdPart());

		/******************** encounterlength ********************************************************************************/
		org.hl7.fhir.r4.model.Duration encounterlength = encounter.getLength();

		/******************** Enc_Length_Vl ********************************************************************************/
		if(encounterlength.hasValue()) {

			e.addEncLengthVl(String.valueOf(encounterlength.getValue()));
		} else {
			e.addEncLengthVl("NULL");
		}


		/******************** encounterlengthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator encounterlengthcomparator = encounterlength.getComparator();
		if(encounterlengthcomparator!=null) {
			e.addEncLengthCmprtr(encounterlengthcomparator.toCode());
		} else {
			e.addEncLengthCmprtr("NULL");
		}

		/******************** Enc_Length_Cd ********************************************************************************/
		if(encounterlength.hasCode()) {

			e.addEncLengthCd(String.valueOf(encounterlength.getCode()));
		} else {
			e.addEncLengthCd("NULL");
		}


		/******************** Enc_Length_Unt ********************************************************************************/
		if(encounterlength.hasUnit()) {

			e.addEncLengthUnt(String.valueOf(encounterlength.getUnit()));
		} else {
			e.addEncLengthUnt("NULL");
		}


		/******************** Enc_Length_Sys ********************************************************************************/
		if(encounterlength.hasSystem()) {

			e.addEncLengthSys(String.valueOf(encounterlength.getSystem()));
		} else {
			e.addEncLengthSys("NULL");
		}


		/******************** encounterlocation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent> encounterlocationlist = encounter.getLocation();
		for(int encounterlocationi = 0; encounterlocationi<encounterlocationlist.size();encounterlocationi++ ) {
		org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent  encounterlocation = encounterlocationlist.get(encounterlocationi);

		/******************** encounterlocationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterLocationStatus encounterlocationstatus = encounterlocation.getStatus();
		if(encounterlocationstatus!=null) {
		if(encounterlocationi == 0) {

		e.addEncLctnSts("[");		}
			e.addEncLctnSts(encounterlocationstatus.toCode());
		if(encounterlocationi == encounterlocationlist.size()-1) {

		e.addEncLctnSts("]");		}

		} else {
			e.addEncLctnSts("NULL");
		}

		/******************** encounterlocationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterlocationperiod = encounterlocation.getPeriod();

		/******************** Enc_Lctn_Prd_Strt ********************************************************************************/
		if(encounterlocationi == 0) {e.addEncLctnPrdStrt("[");}
		if(encounterlocationperiod.hasStart()) {

			e.addEncLctnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterlocationperiod.getStart())+"\"");
		} else {
			e.addEncLctnPrdStrt("NULL");
		}

		if(encounterlocationi == encounterlocationlist.size()-1) {e.addEncLctnPrdStrt("]");}


		/******************** Enc_Lctn_Prd_End ********************************************************************************/
		if(encounterlocationi == 0) {e.addEncLctnPrdEnd("[");}
		if(encounterlocationperiod.hasEnd()) {

			e.addEncLctnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterlocationperiod.getEnd())+"\"");
		} else {
			e.addEncLctnPrdEnd("NULL");
		}

		if(encounterlocationi == encounterlocationlist.size()-1) {e.addEncLctnPrdEnd("]");}


		/******************** encounterlocationphysicaltype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterlocationphysicaltype = encounterlocation.getPhysicalType();

		/******************** Enc_Lctn_PhysclTyp_Txt ********************************************************************************/
		if(encounterlocationi == 0) {e.addEncLctnPhysclTypTxt("[");}
		if(encounterlocationphysicaltype.hasText()) {

			e.addEncLctnPhysclTypTxt(String.valueOf(encounterlocationphysicaltype.getText()));
		} else {
			e.addEncLctnPhysclTypTxt("NULL");
		}

		if(encounterlocationi == encounterlocationlist.size()-1) {e.addEncLctnPhysclTypTxt("]");}


		/******************** encounterlocationphysicaltypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterlocationphysicaltypecodinglist = encounterlocationphysicaltype.getCoding();
		for(int encounterlocationphysicaltypecodingi = 0; encounterlocationphysicaltypecodingi<encounterlocationphysicaltypecodinglist.size();encounterlocationphysicaltypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterlocationphysicaltypecoding = encounterlocationphysicaltypecodinglist.get(encounterlocationphysicaltypecodingi);

		/******************** Enc_Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(encounterlocationphysicaltypecodingi == 0) {e.addEncLctnPhysclTypCdgDsply("[[");}
		if(encounterlocationphysicaltypecoding.hasDisplay()) {

			e.addEncLctnPhysclTypCdgDsply(String.valueOf(encounterlocationphysicaltypecoding.getDisplay()));
		} else {
			e.addEncLctnPhysclTypCdgDsply("NULL");
		}

		if(encounterlocationphysicaltypecodingi == encounterlocationphysicaltypecodinglist.size()-1) {e.addEncLctnPhysclTypCdgDsply("]]");}


		/******************** Enc_Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(encounterlocationphysicaltypecodingi == 0) {e.addEncLctnPhysclTypCdgVrsn("[[");}
		if(encounterlocationphysicaltypecoding.hasVersion()) {

			e.addEncLctnPhysclTypCdgVrsn(String.valueOf(encounterlocationphysicaltypecoding.getVersion()));
		} else {
			e.addEncLctnPhysclTypCdgVrsn("NULL");
		}

		if(encounterlocationphysicaltypecodingi == encounterlocationphysicaltypecodinglist.size()-1) {e.addEncLctnPhysclTypCdgVrsn("]]");}


		/******************** Enc_Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(encounterlocationphysicaltypecodingi == 0) {e.addEncLctnPhysclTypCdgCd("[[");}
		if(encounterlocationphysicaltypecoding.hasCode()) {

			e.addEncLctnPhysclTypCdgCd(String.valueOf(encounterlocationphysicaltypecoding.getCode()));
		} else {
			e.addEncLctnPhysclTypCdgCd("NULL");
		}

		if(encounterlocationphysicaltypecodingi == encounterlocationphysicaltypecodinglist.size()-1) {e.addEncLctnPhysclTypCdgCd("]]");}


		/******************** Enc_Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(encounterlocationphysicaltypecodingi == 0) {e.addEncLctnPhysclTypCdgUsrSltd("[[");}
		if(encounterlocationphysicaltypecoding.hasUserSelected()) {

			e.addEncLctnPhysclTypCdgUsrSltd(String.valueOf(encounterlocationphysicaltypecoding.getUserSelected()));
		} else {
			e.addEncLctnPhysclTypCdgUsrSltd("NULL");
		}

		if(encounterlocationphysicaltypecodingi == encounterlocationphysicaltypecodinglist.size()-1) {e.addEncLctnPhysclTypCdgUsrSltd("]]");}


		/******************** Enc_Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(encounterlocationphysicaltypecodingi == 0) {e.addEncLctnPhysclTypCdgSys("[[");}
		if(encounterlocationphysicaltypecoding.hasSystem()) {

			e.addEncLctnPhysclTypCdgSys(String.valueOf(encounterlocationphysicaltypecoding.getSystem()));
		} else {
			e.addEncLctnPhysclTypCdgSys("NULL");
		}

		if(encounterlocationphysicaltypecodingi == encounterlocationphysicaltypecodinglist.size()-1) {e.addEncLctnPhysclTypCdgSys("]]");}


		 };
		 };
		/******************** encounterpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterpriority = encounter.getPriority();

		/******************** Enc_Priority_Txt ********************************************************************************/
		if(encounterpriority.hasText()) {

			e.addEncPriorityTxt(String.valueOf(encounterpriority.getText()));
		} else {
			e.addEncPriorityTxt("NULL");
		}


		/******************** encounterprioritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterprioritycodinglist = encounterpriority.getCoding();
		for(int encounterprioritycodingi = 0; encounterprioritycodingi<encounterprioritycodinglist.size();encounterprioritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterprioritycoding = encounterprioritycodinglist.get(encounterprioritycodingi);

		/******************** Enc_Priority_Cdg_Dsply ********************************************************************************/
		if(encounterprioritycodingi == 0) {e.addEncPriorityCdgDsply("[");}
		if(encounterprioritycoding.hasDisplay()) {

			e.addEncPriorityCdgDsply(String.valueOf(encounterprioritycoding.getDisplay()));
		} else {
			e.addEncPriorityCdgDsply("NULL");
		}

		if(encounterprioritycodingi == encounterprioritycodinglist.size()-1) {e.addEncPriorityCdgDsply("]");}


		/******************** Enc_Priority_Cdg_Vrsn ********************************************************************************/
		if(encounterprioritycodingi == 0) {e.addEncPriorityCdgVrsn("[");}
		if(encounterprioritycoding.hasVersion()) {

			e.addEncPriorityCdgVrsn(String.valueOf(encounterprioritycoding.getVersion()));
		} else {
			e.addEncPriorityCdgVrsn("NULL");
		}

		if(encounterprioritycodingi == encounterprioritycodinglist.size()-1) {e.addEncPriorityCdgVrsn("]");}


		/******************** Enc_Priority_Cdg_Cd ********************************************************************************/
		if(encounterprioritycodingi == 0) {e.addEncPriorityCdgCd("[");}
		if(encounterprioritycoding.hasCode()) {

			e.addEncPriorityCdgCd(String.valueOf(encounterprioritycoding.getCode()));
		} else {
			e.addEncPriorityCdgCd("NULL");
		}

		if(encounterprioritycodingi == encounterprioritycodinglist.size()-1) {e.addEncPriorityCdgCd("]");}


		/******************** Enc_Priority_Cdg_UsrSltd ********************************************************************************/
		if(encounterprioritycodingi == 0) {e.addEncPriorityCdgUsrSltd("[");}
		if(encounterprioritycoding.hasUserSelected()) {

			e.addEncPriorityCdgUsrSltd(String.valueOf(encounterprioritycoding.getUserSelected()));
		} else {
			e.addEncPriorityCdgUsrSltd("NULL");
		}

		if(encounterprioritycodingi == encounterprioritycodinglist.size()-1) {e.addEncPriorityCdgUsrSltd("]");}


		/******************** Enc_Priority_Cdg_Sys ********************************************************************************/
		if(encounterprioritycodingi == 0) {e.addEncPriorityCdgSys("[");}
		if(encounterprioritycoding.hasSystem()) {

			e.addEncPriorityCdgSys(String.valueOf(encounterprioritycoding.getSystem()));
		} else {
			e.addEncPriorityCdgSys("NULL");
		}

		if(encounterprioritycodingi == encounterprioritycodinglist.size()-1) {e.addEncPriorityCdgSys("]");}


		 };
		/******************** encountertype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> encountertypelist = encounter.getType();
		for(int encountertypei = 0; encountertypei<encountertypelist.size();encountertypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  encountertype = encountertypelist.get(encountertypei);

		/******************** Enc_Typ_Txt ********************************************************************************/
		if(encountertypei == 0) {e.addEncTypTxt("[");}
		if(encountertype.hasText()) {

			e.addEncTypTxt(String.valueOf(encountertype.getText()));
		} else {
			e.addEncTypTxt("NULL");
		}

		if(encountertypei == encountertypelist.size()-1) {e.addEncTypTxt("]");}


		/******************** encountertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encountertypecodinglist = encountertype.getCoding();
		for(int encountertypecodingi = 0; encountertypecodingi<encountertypecodinglist.size();encountertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encountertypecoding = encountertypecodinglist.get(encountertypecodingi);

		/******************** Enc_Typ_Cdg_Dsply ********************************************************************************/
		if(encountertypecodingi == 0) {e.addEncTypCdgDsply("[[");}
		if(encountertypecoding.hasDisplay()) {

			e.addEncTypCdgDsply(String.valueOf(encountertypecoding.getDisplay()));
		} else {
			e.addEncTypCdgDsply("NULL");
		}

		if(encountertypecodingi == encountertypecodinglist.size()-1) {e.addEncTypCdgDsply("]]");}


		/******************** Enc_Typ_Cdg_Vrsn ********************************************************************************/
		if(encountertypecodingi == 0) {e.addEncTypCdgVrsn("[[");}
		if(encountertypecoding.hasVersion()) {

			e.addEncTypCdgVrsn(String.valueOf(encountertypecoding.getVersion()));
		} else {
			e.addEncTypCdgVrsn("NULL");
		}

		if(encountertypecodingi == encountertypecodinglist.size()-1) {e.addEncTypCdgVrsn("]]");}


		/******************** Enc_Typ_Cdg_Cd ********************************************************************************/
		if(encountertypecodingi == 0) {e.addEncTypCdgCd("[[");}
		if(encountertypecoding.hasCode()) {

			e.addEncTypCdgCd(String.valueOf(encountertypecoding.getCode()));
		} else {
			e.addEncTypCdgCd("NULL");
		}

		if(encountertypecodingi == encountertypecodinglist.size()-1) {e.addEncTypCdgCd("]]");}


		/******************** Enc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encountertypecodingi == 0) {e.addEncTypCdgUsrSltd("[[");}
		if(encountertypecoding.hasUserSelected()) {

			e.addEncTypCdgUsrSltd(String.valueOf(encountertypecoding.getUserSelected()));
		} else {
			e.addEncTypCdgUsrSltd("NULL");
		}

		if(encountertypecodingi == encountertypecodinglist.size()-1) {e.addEncTypCdgUsrSltd("]]");}


		/******************** Enc_Typ_Cdg_Sys ********************************************************************************/
		if(encountertypecodingi == 0) {e.addEncTypCdgSys("[[");}
		if(encountertypecoding.hasSystem()) {

			e.addEncTypCdgSys(String.valueOf(encountertypecoding.getSystem()));
		} else {
			e.addEncTypCdgSys("NULL");
		}

		if(encountertypecodingi == encountertypecodinglist.size()-1) {e.addEncTypCdgSys("]]");}


		 };
		 };
		/******************** Enc_Sbjct ********************************************************************************/
		if(encounter.hasSubject()) {

			if(encounter.getSubject().getReference() != null) {
			e.addEncSbjct(encounter.getSubject().getReference());
			}
		} else {
			e.addEncSbjct("NULL");
		}


		/******************** encounterstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterStatus encounterstatus = encounter.getStatus();
		if(encounterstatus!=null) {
			e.addEncSts(encounterstatus.toCode());
		} else {
			e.addEncSts("NULL");
		}

		/******************** Enc_BasedOn ********************************************************************************/
		if(encounter.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<encounter.getBasedOn().size(); incr++) {
				array = array + encounter.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEncBasedOn(array);

		} else {
			e.addEncBasedOn("NULL");
		}


		/******************** encounterreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> encounterreasoncodelist = encounter.getReasonCode();
		for(int encounterreasoncodei = 0; encounterreasoncodei<encounterreasoncodelist.size();encounterreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  encounterreasoncode = encounterreasoncodelist.get(encounterreasoncodei);

		/******************** Enc_RsnCd_Txt ********************************************************************************/
		if(encounterreasoncodei == 0) {e.addEncRsnCdTxt("[");}
		if(encounterreasoncode.hasText()) {

			e.addEncRsnCdTxt(String.valueOf(encounterreasoncode.getText()));
		} else {
			e.addEncRsnCdTxt("NULL");
		}

		if(encounterreasoncodei == encounterreasoncodelist.size()-1) {e.addEncRsnCdTxt("]");}


		/******************** encounterreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterreasoncodecodinglist = encounterreasoncode.getCoding();
		for(int encounterreasoncodecodingi = 0; encounterreasoncodecodingi<encounterreasoncodecodinglist.size();encounterreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterreasoncodecoding = encounterreasoncodecodinglist.get(encounterreasoncodecodingi);

		/******************** Enc_RsnCd_Cdg_Dsply ********************************************************************************/
		if(encounterreasoncodecodingi == 0) {e.addEncRsnCdCdgDsply("[[");}
		if(encounterreasoncodecoding.hasDisplay()) {

			e.addEncRsnCdCdgDsply(String.valueOf(encounterreasoncodecoding.getDisplay()));
		} else {
			e.addEncRsnCdCdgDsply("NULL");
		}

		if(encounterreasoncodecodingi == encounterreasoncodecodinglist.size()-1) {e.addEncRsnCdCdgDsply("]]");}


		/******************** Enc_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(encounterreasoncodecodingi == 0) {e.addEncRsnCdCdgVrsn("[[");}
		if(encounterreasoncodecoding.hasVersion()) {

			e.addEncRsnCdCdgVrsn(String.valueOf(encounterreasoncodecoding.getVersion()));
		} else {
			e.addEncRsnCdCdgVrsn("NULL");
		}

		if(encounterreasoncodecodingi == encounterreasoncodecodinglist.size()-1) {e.addEncRsnCdCdgVrsn("]]");}


		/******************** Enc_RsnCd_Cdg_Cd ********************************************************************************/
		if(encounterreasoncodecodingi == 0) {e.addEncRsnCdCdgCd("[[");}
		if(encounterreasoncodecoding.hasCode()) {

			e.addEncRsnCdCdgCd(String.valueOf(encounterreasoncodecoding.getCode()));
		} else {
			e.addEncRsnCdCdgCd("NULL");
		}

		if(encounterreasoncodecodingi == encounterreasoncodecodinglist.size()-1) {e.addEncRsnCdCdgCd("]]");}


		/******************** Enc_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(encounterreasoncodecodingi == 0) {e.addEncRsnCdCdgUsrSltd("[[");}
		if(encounterreasoncodecoding.hasUserSelected()) {

			e.addEncRsnCdCdgUsrSltd(String.valueOf(encounterreasoncodecoding.getUserSelected()));
		} else {
			e.addEncRsnCdCdgUsrSltd("NULL");
		}

		if(encounterreasoncodecodingi == encounterreasoncodecodinglist.size()-1) {e.addEncRsnCdCdgUsrSltd("]]");}


		/******************** Enc_RsnCd_Cdg_Sys ********************************************************************************/
		if(encounterreasoncodecodingi == 0) {e.addEncRsnCdCdgSys("[[");}
		if(encounterreasoncodecoding.hasSystem()) {

			e.addEncRsnCdCdgSys(String.valueOf(encounterreasoncodecoding.getSystem()));
		} else {
			e.addEncRsnCdCdgSys("NULL");
		}

		if(encounterreasoncodecodingi == encounterreasoncodecodinglist.size()-1) {e.addEncRsnCdCdgSys("]]");}


		 };
		 };
		/******************** Enc_RsnRfrnc ********************************************************************************/
		if(encounter.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<encounter.getReasonReference().size(); incr++) {
				array = array + encounter.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEncRsnRfrnc(array);

		} else {
			e.addEncRsnRfrnc("NULL");
		}


		/******************** encounterperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterperiod = encounter.getPeriod();

		/******************** Enc_Prd_Strt ********************************************************************************/
		if(encounterperiod.hasStart()) {

			e.addEncPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterperiod.getStart())+"\"");
		} else {
			e.addEncPrdStrt("NULL");
		}


		/******************** Enc_Prd_End ********************************************************************************/
		if(encounterperiod.hasEnd()) {

			e.addEncPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterperiod.getEnd())+"\"");
		} else {
			e.addEncPrdEnd("NULL");
		}


		/******************** encounteridentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> encounteridentifierlist = encounter.getIdentifier();
		for(int encounteridentifieri = 0; encounteridentifieri<encounteridentifierlist.size();encounteridentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  encounteridentifier = encounteridentifierlist.get(encounteridentifieri);

		/******************** Enc_Id_Vl ********************************************************************************/
		if(encounteridentifieri == 0) {e.addEncIdVl("[");}
		if(encounteridentifier.hasValue()) {

			e.addEncIdVl(String.valueOf(encounteridentifier.getValue()));
		} else {
			e.addEncIdVl("NULL");
		}

		if(encounteridentifieri == encounteridentifierlist.size()-1) {e.addEncIdVl("]");}


		/******************** encounteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounteridentifiertype = encounteridentifier.getType();

		/******************** Enc_Id_Typ_Txt ********************************************************************************/
		if(encounteridentifieri == 0) {e.addEncIdTypTxt("[");}
		if(encounteridentifiertype.hasText()) {

			e.addEncIdTypTxt(String.valueOf(encounteridentifiertype.getText()));
		} else {
			e.addEncIdTypTxt("NULL");
		}

		if(encounteridentifieri == encounteridentifierlist.size()-1) {e.addEncIdTypTxt("]");}


		/******************** encounteridentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounteridentifiertypecodinglist = encounteridentifiertype.getCoding();
		for(int encounteridentifiertypecodingi = 0; encounteridentifiertypecodingi<encounteridentifiertypecodinglist.size();encounteridentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounteridentifiertypecoding = encounteridentifiertypecodinglist.get(encounteridentifiertypecodingi);

		/******************** Enc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(encounteridentifiertypecodingi == 0) {e.addEncIdTypCdgDsply("[[");}
		if(encounteridentifiertypecoding.hasDisplay()) {

			e.addEncIdTypCdgDsply(String.valueOf(encounteridentifiertypecoding.getDisplay()));
		} else {
			e.addEncIdTypCdgDsply("NULL");
		}

		if(encounteridentifiertypecodingi == encounteridentifiertypecodinglist.size()-1) {e.addEncIdTypCdgDsply("]]");}


		/******************** Enc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(encounteridentifiertypecodingi == 0) {e.addEncIdTypCdgVrsn("[[");}
		if(encounteridentifiertypecoding.hasVersion()) {

			e.addEncIdTypCdgVrsn(String.valueOf(encounteridentifiertypecoding.getVersion()));
		} else {
			e.addEncIdTypCdgVrsn("NULL");
		}

		if(encounteridentifiertypecodingi == encounteridentifiertypecodinglist.size()-1) {e.addEncIdTypCdgVrsn("]]");}


		/******************** Enc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(encounteridentifiertypecodingi == 0) {e.addEncIdTypCdgCd("[[");}
		if(encounteridentifiertypecoding.hasCode()) {

			e.addEncIdTypCdgCd(String.valueOf(encounteridentifiertypecoding.getCode()));
		} else {
			e.addEncIdTypCdgCd("NULL");
		}

		if(encounteridentifiertypecodingi == encounteridentifiertypecodinglist.size()-1) {e.addEncIdTypCdgCd("]]");}


		/******************** Enc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encounteridentifiertypecodingi == 0) {e.addEncIdTypCdgUsrSltd("[[");}
		if(encounteridentifiertypecoding.hasUserSelected()) {

			e.addEncIdTypCdgUsrSltd(String.valueOf(encounteridentifiertypecoding.getUserSelected()));
		} else {
			e.addEncIdTypCdgUsrSltd("NULL");
		}

		if(encounteridentifiertypecodingi == encounteridentifiertypecodinglist.size()-1) {e.addEncIdTypCdgUsrSltd("]]");}


		/******************** Enc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(encounteridentifiertypecodingi == 0) {e.addEncIdTypCdgSys("[[");}
		if(encounteridentifiertypecoding.hasSystem()) {

			e.addEncIdTypCdgSys(String.valueOf(encounteridentifiertypecoding.getSystem()));
		} else {
			e.addEncIdTypCdgSys("NULL");
		}

		if(encounteridentifiertypecodingi == encounteridentifiertypecodinglist.size()-1) {e.addEncIdTypCdgSys("]]");}


		 };
		/******************** encounteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounteridentifierperiod = encounteridentifier.getPeriod();

		/******************** Enc_Id_Prd_Strt ********************************************************************************/
		if(encounteridentifieri == 0) {e.addEncIdPrdStrt("[");}
		if(encounteridentifierperiod.hasStart()) {

			e.addEncIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounteridentifierperiod.getStart())+"\"");
		} else {
			e.addEncIdPrdStrt("NULL");
		}

		if(encounteridentifieri == encounteridentifierlist.size()-1) {e.addEncIdPrdStrt("]");}


		/******************** Enc_Id_Prd_End ********************************************************************************/
		if(encounteridentifieri == 0) {e.addEncIdPrdEnd("[");}
		if(encounteridentifierperiod.hasEnd()) {

			e.addEncIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounteridentifierperiod.getEnd())+"\"");
		} else {
			e.addEncIdPrdEnd("NULL");
		}

		if(encounteridentifieri == encounteridentifierlist.size()-1) {e.addEncIdPrdEnd("]");}


		/******************** encounteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse encounteridentifieruse = encounteridentifier.getUse();
		if(encounteridentifieruse!=null) {
		if(encounteridentifieri == 0) {

		e.addEncIdUse("[");		}
			e.addEncIdUse(encounteridentifieruse.toCode());
		if(encounteridentifieri == encounteridentifierlist.size()-1) {

		e.addEncIdUse("]");		}

		} else {
			e.addEncIdUse("NULL");
		}

		/******************** Enc_Id_Assigner ********************************************************************************/
		if(encounteridentifieri == 0) {e.addEncIdAssigner("[");}
		if(encounteridentifier.hasAssigner()) {

			if(encounteridentifier.getAssigner().getReference() != null) {
			e.addEncIdAssigner(encounteridentifier.getAssigner().getReference());
			}
		} else {
			e.addEncIdAssigner("NULL");
		}

		if(encounteridentifieri == encounteridentifierlist.size()-1) {e.addEncIdAssigner("]");}


		/******************** Enc_Id_Sys ********************************************************************************/
		if(encounteridentifieri == 0) {e.addEncIdSys("[");}
		if(encounteridentifier.hasSystem()) {

			e.addEncIdSys(String.valueOf(encounteridentifier.getSystem()));
		} else {
			e.addEncIdSys("NULL");
		}

		if(encounteridentifieri == encounteridentifierlist.size()-1) {e.addEncIdSys("]");}


		 };
		/******************** encounterstatushistory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent> encounterstatushistorylist = encounter.getStatusHistory();
		for(int encounterstatushistoryi = 0; encounterstatushistoryi<encounterstatushistorylist.size();encounterstatushistoryi++ ) {
		org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent  encounterstatushistory = encounterstatushistorylist.get(encounterstatushistoryi);

		/******************** encounterstatushistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterStatus encounterstatushistorystatus = encounterstatushistory.getStatus();
		if(encounterstatushistorystatus!=null) {
		if(encounterstatushistoryi == 0) {

		e.addEncStsHisSts("[");		}
			e.addEncStsHisSts(encounterstatushistorystatus.toCode());
		if(encounterstatushistoryi == encounterstatushistorylist.size()-1) {

		e.addEncStsHisSts("]");		}

		} else {
			e.addEncStsHisSts("NULL");
		}

		/******************** encounterstatushistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterstatushistoryperiod = encounterstatushistory.getPeriod();

		/******************** Enc_StsHis_Prd_Strt ********************************************************************************/
		if(encounterstatushistoryi == 0) {e.addEncStsHisPrdStrt("[");}
		if(encounterstatushistoryperiod.hasStart()) {

			e.addEncStsHisPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterstatushistoryperiod.getStart())+"\"");
		} else {
			e.addEncStsHisPrdStrt("NULL");
		}

		if(encounterstatushistoryi == encounterstatushistorylist.size()-1) {e.addEncStsHisPrdStrt("]");}


		/******************** Enc_StsHis_Prd_End ********************************************************************************/
		if(encounterstatushistoryi == 0) {e.addEncStsHisPrdEnd("[");}
		if(encounterstatushistoryperiod.hasEnd()) {

			e.addEncStsHisPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterstatushistoryperiod.getEnd())+"\"");
		} else {
			e.addEncStsHisPrdEnd("NULL");
		}

		if(encounterstatushistoryi == encounterstatushistorylist.size()-1) {e.addEncStsHisPrdEnd("]");}


		 };
		/******************** encounterclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterclass = encounter.getClass_();

		/******************** Enc_Cls__Dsply ********************************************************************************/
		if(encounterclass.hasDisplay()) {

			e.addEncClsDsply(String.valueOf(encounterclass.getDisplay()));
		} else {
			e.addEncClsDsply("NULL");
		}


		/******************** Enc_Cls__Vrsn ********************************************************************************/
		if(encounterclass.hasVersion()) {

			e.addEncClsVrsn(String.valueOf(encounterclass.getVersion()));
		} else {
			e.addEncClsVrsn("NULL");
		}


		/******************** Enc_Cls__Cd ********************************************************************************/
		if(encounterclass.hasCode()) {

			e.addEncClsCd(String.valueOf(encounterclass.getCode()));
		} else {
			e.addEncClsCd("NULL");
		}


		/******************** Enc_Cls__UsrSltd ********************************************************************************/
		if(encounterclass.hasUserSelected()) {

			e.addEncClsUsrSltd(String.valueOf(encounterclass.getUserSelected()));
		} else {
			e.addEncClsUsrSltd("NULL");
		}


		/******************** Enc_Cls__Sys ********************************************************************************/
		if(encounterclass.hasSystem()) {

			e.addEncClsSys(String.valueOf(encounterclass.getSystem()));
		} else {
			e.addEncClsSys("NULL");
		}


		/******************** encounterclasshistory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent> encounterclasshistorylist = encounter.getClassHistory();
		for(int encounterclasshistoryi = 0; encounterclasshistoryi<encounterclasshistorylist.size();encounterclasshistoryi++ ) {
		org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent  encounterclasshistory = encounterclasshistorylist.get(encounterclasshistoryi);

		/******************** encounterclasshistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterclasshistoryperiod = encounterclasshistory.getPeriod();

		/******************** Enc_ClsHis_Prd_Strt ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisPrdStrt("[");}
		if(encounterclasshistoryperiod.hasStart()) {

			e.addEncClsHisPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterclasshistoryperiod.getStart())+"\"");
		} else {
			e.addEncClsHisPrdStrt("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisPrdStrt("]");}


		/******************** Enc_ClsHis_Prd_End ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisPrdEnd("[");}
		if(encounterclasshistoryperiod.hasEnd()) {

			e.addEncClsHisPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterclasshistoryperiod.getEnd())+"\"");
		} else {
			e.addEncClsHisPrdEnd("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisPrdEnd("]");}


		/******************** encounterclasshistoryclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterclasshistoryclass = encounterclasshistory.getClass_();

		/******************** Enc_ClsHis_Cls__Dsply ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisClsDsply("[");}
		if(encounterclasshistoryclass.hasDisplay()) {

			e.addEncClsHisClsDsply(String.valueOf(encounterclasshistoryclass.getDisplay()));
		} else {
			e.addEncClsHisClsDsply("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisClsDsply("]");}


		/******************** Enc_ClsHis_Cls__Vrsn ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisClsVrsn("[");}
		if(encounterclasshistoryclass.hasVersion()) {

			e.addEncClsHisClsVrsn(String.valueOf(encounterclasshistoryclass.getVersion()));
		} else {
			e.addEncClsHisClsVrsn("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisClsVrsn("]");}


		/******************** Enc_ClsHis_Cls__Cd ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisClsCd("[");}
		if(encounterclasshistoryclass.hasCode()) {

			e.addEncClsHisClsCd(String.valueOf(encounterclasshistoryclass.getCode()));
		} else {
			e.addEncClsHisClsCd("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisClsCd("]");}


		/******************** Enc_ClsHis_Cls__UsrSltd ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisClsUsrSltd("[");}
		if(encounterclasshistoryclass.hasUserSelected()) {

			e.addEncClsHisClsUsrSltd(String.valueOf(encounterclasshistoryclass.getUserSelected()));
		} else {
			e.addEncClsHisClsUsrSltd("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisClsUsrSltd("]");}


		/******************** Enc_ClsHis_Cls__Sys ********************************************************************************/
		if(encounterclasshistoryi == 0) {e.addEncClsHisClsSys("[");}
		if(encounterclasshistoryclass.hasSystem()) {

			e.addEncClsHisClsSys(String.valueOf(encounterclasshistoryclass.getSystem()));
		} else {
			e.addEncClsHisClsSys("NULL");
		}

		if(encounterclasshistoryi == encounterclasshistorylist.size()-1) {e.addEncClsHisClsSys("]");}


		 };
		/******************** encounterservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterservicetype = encounter.getServiceType();

		/******************** Enc_SrvTyp_Txt ********************************************************************************/
		if(encounterservicetype.hasText()) {

			e.addEncSrvTypTxt(String.valueOf(encounterservicetype.getText()));
		} else {
			e.addEncSrvTypTxt("NULL");
		}


		/******************** encounterservicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterservicetypecodinglist = encounterservicetype.getCoding();
		for(int encounterservicetypecodingi = 0; encounterservicetypecodingi<encounterservicetypecodinglist.size();encounterservicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterservicetypecoding = encounterservicetypecodinglist.get(encounterservicetypecodingi);

		/******************** Enc_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(encounterservicetypecodingi == 0) {e.addEncSrvTypCdgDsply("[");}
		if(encounterservicetypecoding.hasDisplay()) {

			e.addEncSrvTypCdgDsply(String.valueOf(encounterservicetypecoding.getDisplay()));
		} else {
			e.addEncSrvTypCdgDsply("NULL");
		}

		if(encounterservicetypecodingi == encounterservicetypecodinglist.size()-1) {e.addEncSrvTypCdgDsply("]");}


		/******************** Enc_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(encounterservicetypecodingi == 0) {e.addEncSrvTypCdgVrsn("[");}
		if(encounterservicetypecoding.hasVersion()) {

			e.addEncSrvTypCdgVrsn(String.valueOf(encounterservicetypecoding.getVersion()));
		} else {
			e.addEncSrvTypCdgVrsn("NULL");
		}

		if(encounterservicetypecodingi == encounterservicetypecodinglist.size()-1) {e.addEncSrvTypCdgVrsn("]");}


		/******************** Enc_SrvTyp_Cdg_Cd ********************************************************************************/
		if(encounterservicetypecodingi == 0) {e.addEncSrvTypCdgCd("[");}
		if(encounterservicetypecoding.hasCode()) {

			e.addEncSrvTypCdgCd(String.valueOf(encounterservicetypecoding.getCode()));
		} else {
			e.addEncSrvTypCdgCd("NULL");
		}

		if(encounterservicetypecodingi == encounterservicetypecodinglist.size()-1) {e.addEncSrvTypCdgCd("]");}


		/******************** Enc_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(encounterservicetypecodingi == 0) {e.addEncSrvTypCdgUsrSltd("[");}
		if(encounterservicetypecoding.hasUserSelected()) {

			e.addEncSrvTypCdgUsrSltd(String.valueOf(encounterservicetypecoding.getUserSelected()));
		} else {
			e.addEncSrvTypCdgUsrSltd("NULL");
		}

		if(encounterservicetypecodingi == encounterservicetypecodinglist.size()-1) {e.addEncSrvTypCdgUsrSltd("]");}


		/******************** Enc_SrvTyp_Cdg_Sys ********************************************************************************/
		if(encounterservicetypecodingi == 0) {e.addEncSrvTypCdgSys("[");}
		if(encounterservicetypecoding.hasSystem()) {

			e.addEncSrvTypCdgSys(String.valueOf(encounterservicetypecoding.getSystem()));
		} else {
			e.addEncSrvTypCdgSys("NULL");
		}

		if(encounterservicetypecodingi == encounterservicetypecodinglist.size()-1) {e.addEncSrvTypCdgSys("]");}


		 };
		/******************** Enc_Appmnt ********************************************************************************/
		if(encounter.hasAppointment()) {

			String  array = "[";
			for(int incr=0; incr<encounter.getAppointment().size(); incr++) {
				array = array + encounter.getAppointment().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEncAppmnt(array);

		} else {
			e.addEncAppmnt("NULL");
		}


		/******************** encounterparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent> encounterparticipantlist = encounter.getParticipant();
		for(int encounterparticipanti = 0; encounterparticipanti<encounterparticipantlist.size();encounterparticipanti++ ) {
		org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent  encounterparticipant = encounterparticipantlist.get(encounterparticipanti);

		/******************** encounterparticipanttype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> encounterparticipanttypelist = encounterparticipant.getType();
		for(int encounterparticipanttypei = 0; encounterparticipanttypei<encounterparticipanttypelist.size();encounterparticipanttypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  encounterparticipanttype = encounterparticipanttypelist.get(encounterparticipanttypei);

		/******************** Enc_Prtcpnt_Typ_Txt ********************************************************************************/
		if(encounterparticipanttypei == 0) {e.addEncPrtcpntTypTxt("[[");}
		if(encounterparticipanttype.hasText()) {

			e.addEncPrtcpntTypTxt(String.valueOf(encounterparticipanttype.getText()));
		} else {
			e.addEncPrtcpntTypTxt("NULL");
		}

		if(encounterparticipanttypei == encounterparticipanttypelist.size()-1) {e.addEncPrtcpntTypTxt("]]");}


		/******************** encounterparticipanttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterparticipanttypecodinglist = encounterparticipanttype.getCoding();
		for(int encounterparticipanttypecodingi = 0; encounterparticipanttypecodingi<encounterparticipanttypecodinglist.size();encounterparticipanttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterparticipanttypecoding = encounterparticipanttypecodinglist.get(encounterparticipanttypecodingi);

		/******************** Enc_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(encounterparticipanttypecodingi == 0) {e.addEncPrtcpntTypCdgDsply("[[[");}
		if(encounterparticipanttypecoding.hasDisplay()) {

			e.addEncPrtcpntTypCdgDsply(String.valueOf(encounterparticipanttypecoding.getDisplay()));
		} else {
			e.addEncPrtcpntTypCdgDsply("NULL");
		}

		if(encounterparticipanttypecodingi == encounterparticipanttypecodinglist.size()-1) {e.addEncPrtcpntTypCdgDsply("]]]");}


		/******************** Enc_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(encounterparticipanttypecodingi == 0) {e.addEncPrtcpntTypCdgVrsn("[[[");}
		if(encounterparticipanttypecoding.hasVersion()) {

			e.addEncPrtcpntTypCdgVrsn(String.valueOf(encounterparticipanttypecoding.getVersion()));
		} else {
			e.addEncPrtcpntTypCdgVrsn("NULL");
		}

		if(encounterparticipanttypecodingi == encounterparticipanttypecodinglist.size()-1) {e.addEncPrtcpntTypCdgVrsn("]]]");}


		/******************** Enc_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(encounterparticipanttypecodingi == 0) {e.addEncPrtcpntTypCdgCd("[[[");}
		if(encounterparticipanttypecoding.hasCode()) {

			e.addEncPrtcpntTypCdgCd(String.valueOf(encounterparticipanttypecoding.getCode()));
		} else {
			e.addEncPrtcpntTypCdgCd("NULL");
		}

		if(encounterparticipanttypecodingi == encounterparticipanttypecodinglist.size()-1) {e.addEncPrtcpntTypCdgCd("]]]");}


		/******************** Enc_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encounterparticipanttypecodingi == 0) {e.addEncPrtcpntTypCdgUsrSltd("[[[");}
		if(encounterparticipanttypecoding.hasUserSelected()) {

			e.addEncPrtcpntTypCdgUsrSltd(String.valueOf(encounterparticipanttypecoding.getUserSelected()));
		} else {
			e.addEncPrtcpntTypCdgUsrSltd("NULL");
		}

		if(encounterparticipanttypecodingi == encounterparticipanttypecodinglist.size()-1) {e.addEncPrtcpntTypCdgUsrSltd("]]]");}


		/******************** Enc_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(encounterparticipanttypecodingi == 0) {e.addEncPrtcpntTypCdgSys("[[[");}
		if(encounterparticipanttypecoding.hasSystem()) {

			e.addEncPrtcpntTypCdgSys(String.valueOf(encounterparticipanttypecoding.getSystem()));
		} else {
			e.addEncPrtcpntTypCdgSys("NULL");
		}

		if(encounterparticipanttypecodingi == encounterparticipanttypecodinglist.size()-1) {e.addEncPrtcpntTypCdgSys("]]]");}


		 };
		 };
		/******************** encounterparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterparticipantperiod = encounterparticipant.getPeriod();

		/******************** Enc_Prtcpnt_Prd_Strt ********************************************************************************/
		if(encounterparticipantperiod.hasStart()) {

			e.addEncPrtcpntPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterparticipantperiod.getStart())+"\"");
		} else {
			e.addEncPrtcpntPrdStrt("NULL");
		}


		/******************** Enc_Prtcpnt_Prd_End ********************************************************************************/
		if(encounterparticipantperiod.hasEnd()) {

			e.addEncPrtcpntPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterparticipantperiod.getEnd())+"\"");
		} else {
			e.addEncPrtcpntPrdEnd("NULL");
		}


		/******************** Enc_Prtcpnt_Individual ********************************************************************************/
		if(encounterparticipant.hasIndividual()) {

			if(encounterparticipant.getIndividual().getReference() != null) {
			e.addEncPrtcpntIndividual(encounterparticipant.getIndividual().getReference());
			}
		} else {
			e.addEncPrtcpntIndividual("NULL");
		}


		 };
		/******************** Enc_EpisodeOfCare ********************************************************************************/
		if(encounter.hasEpisodeOfCare()) {

			String  array = "[";
			for(int incr=0; incr<encounter.getEpisodeOfCare().size(); incr++) {
				array = array + encounter.getEpisodeOfCare().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEncEpisodeOfCare(array);

		} else {
			e.addEncEpisodeOfCare("NULL");
		}


		/******************** Enc_Account ********************************************************************************/
		if(encounter.hasAccount()) {

			String  array = "[";
			for(int incr=0; incr<encounter.getAccount().size(); incr++) {
				array = array + encounter.getAccount().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEncAccount(array);

		} else {
			e.addEncAccount("NULL");
		}


		/******************** encounterdiagnosis ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Encounter.DiagnosisComponent> encounterdiagnosislist = encounter.getDiagnosis();
		for(int encounterdiagnosisi = 0; encounterdiagnosisi<encounterdiagnosislist.size();encounterdiagnosisi++ ) {
		org.hl7.fhir.r4.model.Encounter.DiagnosisComponent  encounterdiagnosis = encounterdiagnosislist.get(encounterdiagnosisi);

		/******************** encounterdiagnosisuse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterdiagnosisuse = encounterdiagnosis.getUse();

		/******************** Enc_Dgnsis_Use_Txt ********************************************************************************/
		if(encounterdiagnosisi == 0) {e.addEncDgnsisUseTxt("[");}
		if(encounterdiagnosisuse.hasText()) {

			e.addEncDgnsisUseTxt(String.valueOf(encounterdiagnosisuse.getText()));
		} else {
			e.addEncDgnsisUseTxt("NULL");
		}

		if(encounterdiagnosisi == encounterdiagnosislist.size()-1) {e.addEncDgnsisUseTxt("]");}


		/******************** encounterdiagnosisusecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterdiagnosisusecodinglist = encounterdiagnosisuse.getCoding();
		for(int encounterdiagnosisusecodingi = 0; encounterdiagnosisusecodingi<encounterdiagnosisusecodinglist.size();encounterdiagnosisusecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterdiagnosisusecoding = encounterdiagnosisusecodinglist.get(encounterdiagnosisusecodingi);

		/******************** Enc_Dgnsis_Use_Cdg_Dsply ********************************************************************************/
		if(encounterdiagnosisusecodingi == 0) {e.addEncDgnsisUseCdgDsply("[[");}
		if(encounterdiagnosisusecoding.hasDisplay()) {

			e.addEncDgnsisUseCdgDsply(String.valueOf(encounterdiagnosisusecoding.getDisplay()));
		} else {
			e.addEncDgnsisUseCdgDsply("NULL");
		}

		if(encounterdiagnosisusecodingi == encounterdiagnosisusecodinglist.size()-1) {e.addEncDgnsisUseCdgDsply("]]");}


		/******************** Enc_Dgnsis_Use_Cdg_Vrsn ********************************************************************************/
		if(encounterdiagnosisusecodingi == 0) {e.addEncDgnsisUseCdgVrsn("[[");}
		if(encounterdiagnosisusecoding.hasVersion()) {

			e.addEncDgnsisUseCdgVrsn(String.valueOf(encounterdiagnosisusecoding.getVersion()));
		} else {
			e.addEncDgnsisUseCdgVrsn("NULL");
		}

		if(encounterdiagnosisusecodingi == encounterdiagnosisusecodinglist.size()-1) {e.addEncDgnsisUseCdgVrsn("]]");}


		/******************** Enc_Dgnsis_Use_Cdg_Cd ********************************************************************************/
		if(encounterdiagnosisusecodingi == 0) {e.addEncDgnsisUseCdgCd("[[");}
		if(encounterdiagnosisusecoding.hasCode()) {

			e.addEncDgnsisUseCdgCd(String.valueOf(encounterdiagnosisusecoding.getCode()));
		} else {
			e.addEncDgnsisUseCdgCd("NULL");
		}

		if(encounterdiagnosisusecodingi == encounterdiagnosisusecodinglist.size()-1) {e.addEncDgnsisUseCdgCd("]]");}


		/******************** Enc_Dgnsis_Use_Cdg_UsrSltd ********************************************************************************/
		if(encounterdiagnosisusecodingi == 0) {e.addEncDgnsisUseCdgUsrSltd("[[");}
		if(encounterdiagnosisusecoding.hasUserSelected()) {

			e.addEncDgnsisUseCdgUsrSltd(String.valueOf(encounterdiagnosisusecoding.getUserSelected()));
		} else {
			e.addEncDgnsisUseCdgUsrSltd("NULL");
		}

		if(encounterdiagnosisusecodingi == encounterdiagnosisusecodinglist.size()-1) {e.addEncDgnsisUseCdgUsrSltd("]]");}


		/******************** Enc_Dgnsis_Use_Cdg_Sys ********************************************************************************/
		if(encounterdiagnosisusecodingi == 0) {e.addEncDgnsisUseCdgSys("[[");}
		if(encounterdiagnosisusecoding.hasSystem()) {

			e.addEncDgnsisUseCdgSys(String.valueOf(encounterdiagnosisusecoding.getSystem()));
		} else {
			e.addEncDgnsisUseCdgSys("NULL");
		}

		if(encounterdiagnosisusecodingi == encounterdiagnosisusecodinglist.size()-1) {e.addEncDgnsisUseCdgSys("]]");}


		 };
		/******************** Enc_Dgnsis_Cndtn ********************************************************************************/
		if(encounterdiagnosisi == 0) {e.addEncDgnsisCndtn("[");}
		if(encounterdiagnosis.hasCondition()) {

			if(encounterdiagnosis.getCondition().getReference() != null) {
			e.addEncDgnsisCndtn(encounterdiagnosis.getCondition().getReference());
			}
		} else {
			e.addEncDgnsisCndtn("NULL");
		}

		if(encounterdiagnosisi == encounterdiagnosislist.size()-1) {e.addEncDgnsisCndtn("]");}


		/******************** Enc_Dgnsis_Rnk ********************************************************************************/
		if(encounterdiagnosisi == 0) {e.addEncDgnsisRnk("[");}
		if(encounterdiagnosis.hasRank()) {

			e.addEncDgnsisRnk(String.valueOf(encounterdiagnosis.getRank()));
		} else {
			e.addEncDgnsisRnk("NULL");
		}

		if(encounterdiagnosisi == encounterdiagnosislist.size()-1) {e.addEncDgnsisRnk("]");}


		 };
		/******************** Enc_SrvProvider ********************************************************************************/
		if(encounter.hasServiceProvider()) {

			if(encounter.getServiceProvider().getReference() != null) {
			e.addEncSrvProvider(encounter.getServiceProvider().getReference());
			}
		} else {
			e.addEncSrvProvider("NULL");
		}


		/******************** encounterhospitalization ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent encounterhospitalization = encounter.getHospitalization();

		/******************** Enc_Hospitalization_Origin ********************************************************************************/
		if(encounterhospitalization.hasOrigin()) {

			if(encounterhospitalization.getOrigin().getReference() != null) {
			e.addEncHospitalizationOrigin(encounterhospitalization.getOrigin().getReference());
			}
		} else {
			e.addEncHospitalizationOrigin("NULL");
		}


		/******************** encounterhospitalizationadmitsource ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationadmitsource = encounterhospitalization.getAdmitSource();

		/******************** Enc_Hospitalization_AdmitSrc_Txt ********************************************************************************/
		if(encounterhospitalizationadmitsource.hasText()) {

			e.addEncHospitalizationAdmitSrcTxt(String.valueOf(encounterhospitalizationadmitsource.getText()));
		} else {
			e.addEncHospitalizationAdmitSrcTxt("NULL");
		}


		/******************** encounterhospitalizationadmitsourcecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationadmitsourcecodinglist = encounterhospitalizationadmitsource.getCoding();
		for(int encounterhospitalizationadmitsourcecodingi = 0; encounterhospitalizationadmitsourcecodingi<encounterhospitalizationadmitsourcecodinglist.size();encounterhospitalizationadmitsourcecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationadmitsourcecoding = encounterhospitalizationadmitsourcecodinglist.get(encounterhospitalizationadmitsourcecodingi);

		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationadmitsourcecodingi == 0) {e.addEncHospitalizationAdmitSrcCdgDsply("[");}
		if(encounterhospitalizationadmitsourcecoding.hasDisplay()) {

			e.addEncHospitalizationAdmitSrcCdgDsply(String.valueOf(encounterhospitalizationadmitsourcecoding.getDisplay()));
		} else {
			e.addEncHospitalizationAdmitSrcCdgDsply("NULL");
		}

		if(encounterhospitalizationadmitsourcecodingi == encounterhospitalizationadmitsourcecodinglist.size()-1) {e.addEncHospitalizationAdmitSrcCdgDsply("]");}


		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationadmitsourcecodingi == 0) {e.addEncHospitalizationAdmitSrcCdgVrsn("[");}
		if(encounterhospitalizationadmitsourcecoding.hasVersion()) {

			e.addEncHospitalizationAdmitSrcCdgVrsn(String.valueOf(encounterhospitalizationadmitsourcecoding.getVersion()));
		} else {
			e.addEncHospitalizationAdmitSrcCdgVrsn("NULL");
		}

		if(encounterhospitalizationadmitsourcecodingi == encounterhospitalizationadmitsourcecodinglist.size()-1) {e.addEncHospitalizationAdmitSrcCdgVrsn("]");}


		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationadmitsourcecodingi == 0) {e.addEncHospitalizationAdmitSrcCdgCd("[");}
		if(encounterhospitalizationadmitsourcecoding.hasCode()) {

			e.addEncHospitalizationAdmitSrcCdgCd(String.valueOf(encounterhospitalizationadmitsourcecoding.getCode()));
		} else {
			e.addEncHospitalizationAdmitSrcCdgCd("NULL");
		}

		if(encounterhospitalizationadmitsourcecodingi == encounterhospitalizationadmitsourcecodinglist.size()-1) {e.addEncHospitalizationAdmitSrcCdgCd("]");}


		/******************** Enc_Hospitalization_AdmitSrc_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationadmitsourcecodingi == 0) {e.addEncHospitalizationAdmitSrcCdgUsrSltd("[");}
		if(encounterhospitalizationadmitsourcecoding.hasUserSelected()) {

			e.addEncHospitalizationAdmitSrcCdgUsrSltd(String.valueOf(encounterhospitalizationadmitsourcecoding.getUserSelected()));
		} else {
			e.addEncHospitalizationAdmitSrcCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationadmitsourcecodingi == encounterhospitalizationadmitsourcecodinglist.size()-1) {e.addEncHospitalizationAdmitSrcCdgUsrSltd("]");}


		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationadmitsourcecodingi == 0) {e.addEncHospitalizationAdmitSrcCdgSys("[");}
		if(encounterhospitalizationadmitsourcecoding.hasSystem()) {

			e.addEncHospitalizationAdmitSrcCdgSys(String.valueOf(encounterhospitalizationadmitsourcecoding.getSystem()));
		} else {
			e.addEncHospitalizationAdmitSrcCdgSys("NULL");
		}

		if(encounterhospitalizationadmitsourcecodingi == encounterhospitalizationadmitsourcecodinglist.size()-1) {e.addEncHospitalizationAdmitSrcCdgSys("]");}


		 };
		/******************** encounterhospitalizationreadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationreadmission = encounterhospitalization.getReAdmission();

		/******************** Enc_Hospitalization_ReAdmission_Txt ********************************************************************************/
		if(encounterhospitalizationreadmission.hasText()) {

			e.addEncHospitalizationReAdmissionTxt(String.valueOf(encounterhospitalizationreadmission.getText()));
		} else {
			e.addEncHospitalizationReAdmissionTxt("NULL");
		}


		/******************** encounterhospitalizationreadmissioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationreadmissioncodinglist = encounterhospitalizationreadmission.getCoding();
		for(int encounterhospitalizationreadmissioncodingi = 0; encounterhospitalizationreadmissioncodingi<encounterhospitalizationreadmissioncodinglist.size();encounterhospitalizationreadmissioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationreadmissioncoding = encounterhospitalizationreadmissioncodinglist.get(encounterhospitalizationreadmissioncodingi);

		/******************** Enc_Hospitalization_ReAdmission_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationreadmissioncodingi == 0) {e.addEncHospitalizationReAdmissionCdgDsply("[");}
		if(encounterhospitalizationreadmissioncoding.hasDisplay()) {

			e.addEncHospitalizationReAdmissionCdgDsply(String.valueOf(encounterhospitalizationreadmissioncoding.getDisplay()));
		} else {
			e.addEncHospitalizationReAdmissionCdgDsply("NULL");
		}

		if(encounterhospitalizationreadmissioncodingi == encounterhospitalizationreadmissioncodinglist.size()-1) {e.addEncHospitalizationReAdmissionCdgDsply("]");}


		/******************** Enc_Hospitalization_ReAdmission_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationreadmissioncodingi == 0) {e.addEncHospitalizationReAdmissionCdgVrsn("[");}
		if(encounterhospitalizationreadmissioncoding.hasVersion()) {

			e.addEncHospitalizationReAdmissionCdgVrsn(String.valueOf(encounterhospitalizationreadmissioncoding.getVersion()));
		} else {
			e.addEncHospitalizationReAdmissionCdgVrsn("NULL");
		}

		if(encounterhospitalizationreadmissioncodingi == encounterhospitalizationreadmissioncodinglist.size()-1) {e.addEncHospitalizationReAdmissionCdgVrsn("]");}


		/******************** Enc_Hospitalization_ReAdmission_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationreadmissioncodingi == 0) {e.addEncHospitalizationReAdmissionCdgCd("[");}
		if(encounterhospitalizationreadmissioncoding.hasCode()) {

			e.addEncHospitalizationReAdmissionCdgCd(String.valueOf(encounterhospitalizationreadmissioncoding.getCode()));
		} else {
			e.addEncHospitalizationReAdmissionCdgCd("NULL");
		}

		if(encounterhospitalizationreadmissioncodingi == encounterhospitalizationreadmissioncodinglist.size()-1) {e.addEncHospitalizationReAdmissionCdgCd("]");}


		/******************** Enc_Hospitalization_ReAdmission_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationreadmissioncodingi == 0) {e.addEncHospitalizationReAdmissionCdgUsrSltd("[");}
		if(encounterhospitalizationreadmissioncoding.hasUserSelected()) {

			e.addEncHospitalizationReAdmissionCdgUsrSltd(String.valueOf(encounterhospitalizationreadmissioncoding.getUserSelected()));
		} else {
			e.addEncHospitalizationReAdmissionCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationreadmissioncodingi == encounterhospitalizationreadmissioncodinglist.size()-1) {e.addEncHospitalizationReAdmissionCdgUsrSltd("]");}


		/******************** Enc_Hospitalization_ReAdmission_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationreadmissioncodingi == 0) {e.addEncHospitalizationReAdmissionCdgSys("[");}
		if(encounterhospitalizationreadmissioncoding.hasSystem()) {

			e.addEncHospitalizationReAdmissionCdgSys(String.valueOf(encounterhospitalizationreadmissioncoding.getSystem()));
		} else {
			e.addEncHospitalizationReAdmissionCdgSys("NULL");
		}

		if(encounterhospitalizationreadmissioncodingi == encounterhospitalizationreadmissioncodinglist.size()-1) {e.addEncHospitalizationReAdmissionCdgSys("]");}


		 };
		/******************** encounterhospitalizationspecialcourtesy ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> encounterhospitalizationspecialcourtesylist = encounterhospitalization.getSpecialCourtesy();
		for(int encounterhospitalizationspecialcourtesyi = 0; encounterhospitalizationspecialcourtesyi<encounterhospitalizationspecialcourtesylist.size();encounterhospitalizationspecialcourtesyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  encounterhospitalizationspecialcourtesy = encounterhospitalizationspecialcourtesylist.get(encounterhospitalizationspecialcourtesyi);

		/******************** Enc_Hospitalization_SpclCourtesy_Txt ********************************************************************************/
		if(encounterhospitalizationspecialcourtesyi == 0) {e.addEncHospitalizationSpclCourtesyTxt("[");}
		if(encounterhospitalizationspecialcourtesy.hasText()) {

			e.addEncHospitalizationSpclCourtesyTxt(String.valueOf(encounterhospitalizationspecialcourtesy.getText()));
		} else {
			e.addEncHospitalizationSpclCourtesyTxt("NULL");
		}

		if(encounterhospitalizationspecialcourtesyi == encounterhospitalizationspecialcourtesylist.size()-1) {e.addEncHospitalizationSpclCourtesyTxt("]");}


		/******************** encounterhospitalizationspecialcourtesycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationspecialcourtesycodinglist = encounterhospitalizationspecialcourtesy.getCoding();
		for(int encounterhospitalizationspecialcourtesycodingi = 0; encounterhospitalizationspecialcourtesycodingi<encounterhospitalizationspecialcourtesycodinglist.size();encounterhospitalizationspecialcourtesycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationspecialcourtesycoding = encounterhospitalizationspecialcourtesycodinglist.get(encounterhospitalizationspecialcourtesycodingi);

		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycodingi == 0) {e.addEncHospitalizationSpclCourtesyCdgDsply("[[");}
		if(encounterhospitalizationspecialcourtesycoding.hasDisplay()) {

			e.addEncHospitalizationSpclCourtesyCdgDsply(String.valueOf(encounterhospitalizationspecialcourtesycoding.getDisplay()));
		} else {
			e.addEncHospitalizationSpclCourtesyCdgDsply("NULL");
		}

		if(encounterhospitalizationspecialcourtesycodingi == encounterhospitalizationspecialcourtesycodinglist.size()-1) {e.addEncHospitalizationSpclCourtesyCdgDsply("]]");}


		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycodingi == 0) {e.addEncHospitalizationSpclCourtesyCdgVrsn("[[");}
		if(encounterhospitalizationspecialcourtesycoding.hasVersion()) {

			e.addEncHospitalizationSpclCourtesyCdgVrsn(String.valueOf(encounterhospitalizationspecialcourtesycoding.getVersion()));
		} else {
			e.addEncHospitalizationSpclCourtesyCdgVrsn("NULL");
		}

		if(encounterhospitalizationspecialcourtesycodingi == encounterhospitalizationspecialcourtesycodinglist.size()-1) {e.addEncHospitalizationSpclCourtesyCdgVrsn("]]");}


		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycodingi == 0) {e.addEncHospitalizationSpclCourtesyCdgCd("[[");}
		if(encounterhospitalizationspecialcourtesycoding.hasCode()) {

			e.addEncHospitalizationSpclCourtesyCdgCd(String.valueOf(encounterhospitalizationspecialcourtesycoding.getCode()));
		} else {
			e.addEncHospitalizationSpclCourtesyCdgCd("NULL");
		}

		if(encounterhospitalizationspecialcourtesycodingi == encounterhospitalizationspecialcourtesycodinglist.size()-1) {e.addEncHospitalizationSpclCourtesyCdgCd("]]");}


		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycodingi == 0) {e.addEncHospitalizationSpclCourtesyCdgUsrSltd("[[");}
		if(encounterhospitalizationspecialcourtesycoding.hasUserSelected()) {

			e.addEncHospitalizationSpclCourtesyCdgUsrSltd(String.valueOf(encounterhospitalizationspecialcourtesycoding.getUserSelected()));
		} else {
			e.addEncHospitalizationSpclCourtesyCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationspecialcourtesycodingi == encounterhospitalizationspecialcourtesycodinglist.size()-1) {e.addEncHospitalizationSpclCourtesyCdgUsrSltd("]]");}


		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycodingi == 0) {e.addEncHospitalizationSpclCourtesyCdgSys("[[");}
		if(encounterhospitalizationspecialcourtesycoding.hasSystem()) {

			e.addEncHospitalizationSpclCourtesyCdgSys(String.valueOf(encounterhospitalizationspecialcourtesycoding.getSystem()));
		} else {
			e.addEncHospitalizationSpclCourtesyCdgSys("NULL");
		}

		if(encounterhospitalizationspecialcourtesycodingi == encounterhospitalizationspecialcourtesycodinglist.size()-1) {e.addEncHospitalizationSpclCourtesyCdgSys("]]");}


		 };
		 };
		/******************** encounterhospitalizationdietpreference ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> encounterhospitalizationdietpreferencelist = encounterhospitalization.getDietPreference();
		for(int encounterhospitalizationdietpreferencei = 0; encounterhospitalizationdietpreferencei<encounterhospitalizationdietpreferencelist.size();encounterhospitalizationdietpreferencei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  encounterhospitalizationdietpreference = encounterhospitalizationdietpreferencelist.get(encounterhospitalizationdietpreferencei);

		/******************** Enc_Hospitalization_DietPreference_Txt ********************************************************************************/
		if(encounterhospitalizationdietpreferencei == 0) {e.addEncHospitalizationDietPreferenceTxt("[");}
		if(encounterhospitalizationdietpreference.hasText()) {

			e.addEncHospitalizationDietPreferenceTxt(String.valueOf(encounterhospitalizationdietpreference.getText()));
		} else {
			e.addEncHospitalizationDietPreferenceTxt("NULL");
		}

		if(encounterhospitalizationdietpreferencei == encounterhospitalizationdietpreferencelist.size()-1) {e.addEncHospitalizationDietPreferenceTxt("]");}


		/******************** encounterhospitalizationdietpreferencecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationdietpreferencecodinglist = encounterhospitalizationdietpreference.getCoding();
		for(int encounterhospitalizationdietpreferencecodingi = 0; encounterhospitalizationdietpreferencecodingi<encounterhospitalizationdietpreferencecodinglist.size();encounterhospitalizationdietpreferencecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationdietpreferencecoding = encounterhospitalizationdietpreferencecodinglist.get(encounterhospitalizationdietpreferencecodingi);

		/******************** Enc_Hospitalization_DietPreference_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationdietpreferencecodingi == 0) {e.addEncHospitalizationDietPreferenceCdgDsply("[[");}
		if(encounterhospitalizationdietpreferencecoding.hasDisplay()) {

			e.addEncHospitalizationDietPreferenceCdgDsply(String.valueOf(encounterhospitalizationdietpreferencecoding.getDisplay()));
		} else {
			e.addEncHospitalizationDietPreferenceCdgDsply("NULL");
		}

		if(encounterhospitalizationdietpreferencecodingi == encounterhospitalizationdietpreferencecodinglist.size()-1) {e.addEncHospitalizationDietPreferenceCdgDsply("]]");}


		/******************** Enc_Hospitalization_DietPreference_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationdietpreferencecodingi == 0) {e.addEncHospitalizationDietPreferenceCdgVrsn("[[");}
		if(encounterhospitalizationdietpreferencecoding.hasVersion()) {

			e.addEncHospitalizationDietPreferenceCdgVrsn(String.valueOf(encounterhospitalizationdietpreferencecoding.getVersion()));
		} else {
			e.addEncHospitalizationDietPreferenceCdgVrsn("NULL");
		}

		if(encounterhospitalizationdietpreferencecodingi == encounterhospitalizationdietpreferencecodinglist.size()-1) {e.addEncHospitalizationDietPreferenceCdgVrsn("]]");}


		/******************** Enc_Hospitalization_DietPreference_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationdietpreferencecodingi == 0) {e.addEncHospitalizationDietPreferenceCdgCd("[[");}
		if(encounterhospitalizationdietpreferencecoding.hasCode()) {

			e.addEncHospitalizationDietPreferenceCdgCd(String.valueOf(encounterhospitalizationdietpreferencecoding.getCode()));
		} else {
			e.addEncHospitalizationDietPreferenceCdgCd("NULL");
		}

		if(encounterhospitalizationdietpreferencecodingi == encounterhospitalizationdietpreferencecodinglist.size()-1) {e.addEncHospitalizationDietPreferenceCdgCd("]]");}


		/******************** Enc_Hospitalization_DietPreference_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationdietpreferencecodingi == 0) {e.addEncHospitalizationDietPreferenceCdgUsrSltd("[[");}
		if(encounterhospitalizationdietpreferencecoding.hasUserSelected()) {

			e.addEncHospitalizationDietPreferenceCdgUsrSltd(String.valueOf(encounterhospitalizationdietpreferencecoding.getUserSelected()));
		} else {
			e.addEncHospitalizationDietPreferenceCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationdietpreferencecodingi == encounterhospitalizationdietpreferencecodinglist.size()-1) {e.addEncHospitalizationDietPreferenceCdgUsrSltd("]]");}


		/******************** Enc_Hospitalization_DietPreference_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationdietpreferencecodingi == 0) {e.addEncHospitalizationDietPreferenceCdgSys("[[");}
		if(encounterhospitalizationdietpreferencecoding.hasSystem()) {

			e.addEncHospitalizationDietPreferenceCdgSys(String.valueOf(encounterhospitalizationdietpreferencecoding.getSystem()));
		} else {
			e.addEncHospitalizationDietPreferenceCdgSys("NULL");
		}

		if(encounterhospitalizationdietpreferencecodingi == encounterhospitalizationdietpreferencecodinglist.size()-1) {e.addEncHospitalizationDietPreferenceCdgSys("]]");}


		 };
		 };
		/******************** Enc_Hospitalization_Destination ********************************************************************************/
		if(encounterhospitalization.hasDestination()) {

			if(encounterhospitalization.getDestination().getReference() != null) {
			e.addEncHospitalizationDestination(encounterhospitalization.getDestination().getReference());
			}
		} else {
			e.addEncHospitalizationDestination("NULL");
		}


		/******************** encounterhospitalizationspecialarrangement ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> encounterhospitalizationspecialarrangementlist = encounterhospitalization.getSpecialArrangement();
		for(int encounterhospitalizationspecialarrangementi = 0; encounterhospitalizationspecialarrangementi<encounterhospitalizationspecialarrangementlist.size();encounterhospitalizationspecialarrangementi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  encounterhospitalizationspecialarrangement = encounterhospitalizationspecialarrangementlist.get(encounterhospitalizationspecialarrangementi);

		/******************** Enc_Hospitalization_SpclArrangement_Txt ********************************************************************************/
		if(encounterhospitalizationspecialarrangementi == 0) {e.addEncHospitalizationSpclArrangementTxt("[");}
		if(encounterhospitalizationspecialarrangement.hasText()) {

			e.addEncHospitalizationSpclArrangementTxt(String.valueOf(encounterhospitalizationspecialarrangement.getText()));
		} else {
			e.addEncHospitalizationSpclArrangementTxt("NULL");
		}

		if(encounterhospitalizationspecialarrangementi == encounterhospitalizationspecialarrangementlist.size()-1) {e.addEncHospitalizationSpclArrangementTxt("]");}


		/******************** encounterhospitalizationspecialarrangementcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationspecialarrangementcodinglist = encounterhospitalizationspecialarrangement.getCoding();
		for(int encounterhospitalizationspecialarrangementcodingi = 0; encounterhospitalizationspecialarrangementcodingi<encounterhospitalizationspecialarrangementcodinglist.size();encounterhospitalizationspecialarrangementcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationspecialarrangementcoding = encounterhospitalizationspecialarrangementcodinglist.get(encounterhospitalizationspecialarrangementcodingi);

		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcodingi == 0) {e.addEncHospitalizationSpclArrangementCdgDsply("[[");}
		if(encounterhospitalizationspecialarrangementcoding.hasDisplay()) {

			e.addEncHospitalizationSpclArrangementCdgDsply(String.valueOf(encounterhospitalizationspecialarrangementcoding.getDisplay()));
		} else {
			e.addEncHospitalizationSpclArrangementCdgDsply("NULL");
		}

		if(encounterhospitalizationspecialarrangementcodingi == encounterhospitalizationspecialarrangementcodinglist.size()-1) {e.addEncHospitalizationSpclArrangementCdgDsply("]]");}


		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcodingi == 0) {e.addEncHospitalizationSpclArrangementCdgVrsn("[[");}
		if(encounterhospitalizationspecialarrangementcoding.hasVersion()) {

			e.addEncHospitalizationSpclArrangementCdgVrsn(String.valueOf(encounterhospitalizationspecialarrangementcoding.getVersion()));
		} else {
			e.addEncHospitalizationSpclArrangementCdgVrsn("NULL");
		}

		if(encounterhospitalizationspecialarrangementcodingi == encounterhospitalizationspecialarrangementcodinglist.size()-1) {e.addEncHospitalizationSpclArrangementCdgVrsn("]]");}


		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcodingi == 0) {e.addEncHospitalizationSpclArrangementCdgCd("[[");}
		if(encounterhospitalizationspecialarrangementcoding.hasCode()) {

			e.addEncHospitalizationSpclArrangementCdgCd(String.valueOf(encounterhospitalizationspecialarrangementcoding.getCode()));
		} else {
			e.addEncHospitalizationSpclArrangementCdgCd("NULL");
		}

		if(encounterhospitalizationspecialarrangementcodingi == encounterhospitalizationspecialarrangementcodinglist.size()-1) {e.addEncHospitalizationSpclArrangementCdgCd("]]");}


		/******************** Enc_Hospitalization_SpclArrangement_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcodingi == 0) {e.addEncHospitalizationSpclArrangementCdgUsrSltd("[[");}
		if(encounterhospitalizationspecialarrangementcoding.hasUserSelected()) {

			e.addEncHospitalizationSpclArrangementCdgUsrSltd(String.valueOf(encounterhospitalizationspecialarrangementcoding.getUserSelected()));
		} else {
			e.addEncHospitalizationSpclArrangementCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationspecialarrangementcodingi == encounterhospitalizationspecialarrangementcodinglist.size()-1) {e.addEncHospitalizationSpclArrangementCdgUsrSltd("]]");}


		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcodingi == 0) {e.addEncHospitalizationSpclArrangementCdgSys("[[");}
		if(encounterhospitalizationspecialarrangementcoding.hasSystem()) {

			e.addEncHospitalizationSpclArrangementCdgSys(String.valueOf(encounterhospitalizationspecialarrangementcoding.getSystem()));
		} else {
			e.addEncHospitalizationSpclArrangementCdgSys("NULL");
		}

		if(encounterhospitalizationspecialarrangementcodingi == encounterhospitalizationspecialarrangementcodinglist.size()-1) {e.addEncHospitalizationSpclArrangementCdgSys("]]");}


		 };
		 };
		/******************** encounterhospitalizationdischargedisposition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationdischargedisposition = encounterhospitalization.getDischargeDisposition();

		/******************** Enc_Hospitalization_DischargeDisposition_Txt ********************************************************************************/
		if(encounterhospitalizationdischargedisposition.hasText()) {

			e.addEncHospitalizationDischargeDispositionTxt(String.valueOf(encounterhospitalizationdischargedisposition.getText()));
		} else {
			e.addEncHospitalizationDischargeDispositionTxt("NULL");
		}


		/******************** encounterhospitalizationdischargedispositioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationdischargedispositioncodinglist = encounterhospitalizationdischargedisposition.getCoding();
		for(int encounterhospitalizationdischargedispositioncodingi = 0; encounterhospitalizationdischargedispositioncodingi<encounterhospitalizationdischargedispositioncodinglist.size();encounterhospitalizationdischargedispositioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationdischargedispositioncoding = encounterhospitalizationdischargedispositioncodinglist.get(encounterhospitalizationdischargedispositioncodingi);

		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncodingi == 0) {e.addEncHospitalizationDischargeDispositionCdgDsply("[");}
		if(encounterhospitalizationdischargedispositioncoding.hasDisplay()) {

			e.addEncHospitalizationDischargeDispositionCdgDsply(String.valueOf(encounterhospitalizationdischargedispositioncoding.getDisplay()));
		} else {
			e.addEncHospitalizationDischargeDispositionCdgDsply("NULL");
		}

		if(encounterhospitalizationdischargedispositioncodingi == encounterhospitalizationdischargedispositioncodinglist.size()-1) {e.addEncHospitalizationDischargeDispositionCdgDsply("]");}


		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncodingi == 0) {e.addEncHospitalizationDischargeDispositionCdgVrsn("[");}
		if(encounterhospitalizationdischargedispositioncoding.hasVersion()) {

			e.addEncHospitalizationDischargeDispositionCdgVrsn(String.valueOf(encounterhospitalizationdischargedispositioncoding.getVersion()));
		} else {
			e.addEncHospitalizationDischargeDispositionCdgVrsn("NULL");
		}

		if(encounterhospitalizationdischargedispositioncodingi == encounterhospitalizationdischargedispositioncodinglist.size()-1) {e.addEncHospitalizationDischargeDispositionCdgVrsn("]");}


		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncodingi == 0) {e.addEncHospitalizationDischargeDispositionCdgCd("[");}
		if(encounterhospitalizationdischargedispositioncoding.hasCode()) {

			e.addEncHospitalizationDischargeDispositionCdgCd(String.valueOf(encounterhospitalizationdischargedispositioncoding.getCode()));
		} else {
			e.addEncHospitalizationDischargeDispositionCdgCd("NULL");
		}

		if(encounterhospitalizationdischargedispositioncodingi == encounterhospitalizationdischargedispositioncodinglist.size()-1) {e.addEncHospitalizationDischargeDispositionCdgCd("]");}


		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncodingi == 0) {e.addEncHospitalizationDischargeDispositionCdgUsrSltd("[");}
		if(encounterhospitalizationdischargedispositioncoding.hasUserSelected()) {

			e.addEncHospitalizationDischargeDispositionCdgUsrSltd(String.valueOf(encounterhospitalizationdischargedispositioncoding.getUserSelected()));
		} else {
			e.addEncHospitalizationDischargeDispositionCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationdischargedispositioncodingi == encounterhospitalizationdischargedispositioncodinglist.size()-1) {e.addEncHospitalizationDischargeDispositionCdgUsrSltd("]");}


		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncodingi == 0) {e.addEncHospitalizationDischargeDispositionCdgSys("[");}
		if(encounterhospitalizationdischargedispositioncoding.hasSystem()) {

			e.addEncHospitalizationDischargeDispositionCdgSys(String.valueOf(encounterhospitalizationdischargedispositioncoding.getSystem()));
		} else {
			e.addEncHospitalizationDischargeDispositionCdgSys("NULL");
		}

		if(encounterhospitalizationdischargedispositioncodingi == encounterhospitalizationdischargedispositioncodinglist.size()-1) {e.addEncHospitalizationDischargeDispositionCdgSys("]");}


		 };
		/******************** encounterhospitalizationpreadmissionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier encounterhospitalizationpreadmissionidentifier = encounterhospitalization.getPreAdmissionIdentifier();

		/******************** Enc_Hospitalization_PreAdmissionId_Vl ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifier.hasValue()) {

			e.addEncHospitalizationPreAdmissionIdVl(String.valueOf(encounterhospitalizationpreadmissionidentifier.getValue()));
		} else {
			e.addEncHospitalizationPreAdmissionIdVl("NULL");
		}


		/******************** encounterhospitalizationpreadmissionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationpreadmissionidentifiertype = encounterhospitalizationpreadmissionidentifier.getType();

		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Txt ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertype.hasText()) {

			e.addEncHospitalizationPreAdmissionIdTypTxt(String.valueOf(encounterhospitalizationpreadmissionidentifiertype.getText()));
		} else {
			e.addEncHospitalizationPreAdmissionIdTypTxt("NULL");
		}


		/******************** encounterhospitalizationpreadmissionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> encounterhospitalizationpreadmissionidentifiertypecodinglist = encounterhospitalizationpreadmissionidentifiertype.getCoding();
		for(int encounterhospitalizationpreadmissionidentifiertypecodingi = 0; encounterhospitalizationpreadmissionidentifiertypecodingi<encounterhospitalizationpreadmissionidentifiertypecodinglist.size();encounterhospitalizationpreadmissionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  encounterhospitalizationpreadmissionidentifiertypecoding = encounterhospitalizationpreadmissionidentifiertypecodinglist.get(encounterhospitalizationpreadmissionidentifiertypecodingi);

		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecodingi == 0) {e.addEncHospitalizationPreAdmissionIdTypCdgDsply("[");}
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasDisplay()) {

			e.addEncHospitalizationPreAdmissionIdTypCdgDsply(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getDisplay()));
		} else {
			e.addEncHospitalizationPreAdmissionIdTypCdgDsply("NULL");
		}

		if(encounterhospitalizationpreadmissionidentifiertypecodingi == encounterhospitalizationpreadmissionidentifiertypecodinglist.size()-1) {e.addEncHospitalizationPreAdmissionIdTypCdgDsply("]");}


		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecodingi == 0) {e.addEncHospitalizationPreAdmissionIdTypCdgVrsn("[");}
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasVersion()) {

			e.addEncHospitalizationPreAdmissionIdTypCdgVrsn(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getVersion()));
		} else {
			e.addEncHospitalizationPreAdmissionIdTypCdgVrsn("NULL");
		}

		if(encounterhospitalizationpreadmissionidentifiertypecodingi == encounterhospitalizationpreadmissionidentifiertypecodinglist.size()-1) {e.addEncHospitalizationPreAdmissionIdTypCdgVrsn("]");}


		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecodingi == 0) {e.addEncHospitalizationPreAdmissionIdTypCdgCd("[");}
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasCode()) {

			e.addEncHospitalizationPreAdmissionIdTypCdgCd(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getCode()));
		} else {
			e.addEncHospitalizationPreAdmissionIdTypCdgCd("NULL");
		}

		if(encounterhospitalizationpreadmissionidentifiertypecodingi == encounterhospitalizationpreadmissionidentifiertypecodinglist.size()-1) {e.addEncHospitalizationPreAdmissionIdTypCdgCd("]");}


		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecodingi == 0) {e.addEncHospitalizationPreAdmissionIdTypCdgUsrSltd("[");}
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasUserSelected()) {

			e.addEncHospitalizationPreAdmissionIdTypCdgUsrSltd(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getUserSelected()));
		} else {
			e.addEncHospitalizationPreAdmissionIdTypCdgUsrSltd("NULL");
		}

		if(encounterhospitalizationpreadmissionidentifiertypecodingi == encounterhospitalizationpreadmissionidentifiertypecodinglist.size()-1) {e.addEncHospitalizationPreAdmissionIdTypCdgUsrSltd("]");}


		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecodingi == 0) {e.addEncHospitalizationPreAdmissionIdTypCdgSys("[");}
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasSystem()) {

			e.addEncHospitalizationPreAdmissionIdTypCdgSys(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getSystem()));
		} else {
			e.addEncHospitalizationPreAdmissionIdTypCdgSys("NULL");
		}

		if(encounterhospitalizationpreadmissionidentifiertypecodingi == encounterhospitalizationpreadmissionidentifiertypecodinglist.size()-1) {e.addEncHospitalizationPreAdmissionIdTypCdgSys("]");}


		 };
		/******************** encounterhospitalizationpreadmissionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterhospitalizationpreadmissionidentifierperiod = encounterhospitalizationpreadmissionidentifier.getPeriod();

		/******************** Enc_Hospitalization_PreAdmissionId_Prd_Strt ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifierperiod.hasStart()) {

			e.addEncHospitalizationPreAdmissionIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterhospitalizationpreadmissionidentifierperiod.getStart())+"\"");
		} else {
			e.addEncHospitalizationPreAdmissionIdPrdStrt("NULL");
		}


		/******************** Enc_Hospitalization_PreAdmissionId_Prd_End ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifierperiod.hasEnd()) {

			e.addEncHospitalizationPreAdmissionIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(encounterhospitalizationpreadmissionidentifierperiod.getEnd())+"\"");
		} else {
			e.addEncHospitalizationPreAdmissionIdPrdEnd("NULL");
		}


		/******************** encounterhospitalizationpreadmissionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse encounterhospitalizationpreadmissionidentifieruse = encounterhospitalizationpreadmissionidentifier.getUse();
		if(encounterhospitalizationpreadmissionidentifieruse!=null) {
			e.addEncHospitalizationPreAdmissionIdUse(encounterhospitalizationpreadmissionidentifieruse.toCode());
		} else {
			e.addEncHospitalizationPreAdmissionIdUse("NULL");
		}

		/******************** Enc_Hospitalization_PreAdmissionId_Assigner ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifier.hasAssigner()) {

			if(encounterhospitalizationpreadmissionidentifier.getAssigner().getReference() != null) {
			e.addEncHospitalizationPreAdmissionIdAssigner(encounterhospitalizationpreadmissionidentifier.getAssigner().getReference());
			}
		} else {
			e.addEncHospitalizationPreAdmissionIdAssigner("NULL");
		}


		/******************** Enc_Hospitalization_PreAdmissionId_Sys ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifier.hasSystem()) {

			e.addEncHospitalizationPreAdmissionIdSys(String.valueOf(encounterhospitalizationpreadmissionidentifier.getSystem()));
		} else {
			e.addEncHospitalizationPreAdmissionIdSys("NULL");
		}


		/******************** Enc_PartOf ********************************************************************************/
		if(encounter.hasPartOf()) {

			if(encounter.getPartOf().getReference() != null) {
			e.addEncPartOf(encounter.getPartOf().getReference());
			}
		} else {
			e.addEncPartOf("NULL");
		}


		return e;
	}
}
