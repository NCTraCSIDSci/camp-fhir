package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Group;
public class GroupBidirectionalConversion 
{
	public Group Groups(org.hl7.fhir.r4.model.Group group) throws ParseException
	{
		 main.java.com.campfhir.model.Group g = new  main.java.com.campfhir.model.Group();

		/******************** id ********************************************************************************/
		g.setId(group.getIdElement().getIdPart());

		/******************** Grp_Nm ********************************************************************************/
		if(group.hasName()) {

			g.addGrpNm(String.valueOf(group.getName()));
		} else {
			g.addGrpNm("NULL");
		}


		/******************** grouptype ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupType grouptype = group.getType();
		if(grouptype!=null) {
			g.addGrpTyp(grouptype.toCode());
		} else {
			g.addGrpTyp("NULL");
		}

		/******************** groupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcode = group.getCode();

		/******************** Grp_Cd_Txt ********************************************************************************/
		if(groupcode.hasText()) {

			g.addGrpCdTxt(String.valueOf(groupcode.getText()));
		} else {
			g.addGrpCdTxt("NULL");
		}


		/******************** groupcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> groupcodecodinglist = groupcode.getCoding();
		for(int groupcodecodingi = 0; groupcodecodingi<groupcodecodinglist.size();groupcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  groupcodecoding = groupcodecodinglist.get(groupcodecodingi);

		/******************** Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(groupcodecodingi == 0) {g.addGrpCdCdgDsply("[");}
		if(groupcodecoding.hasDisplay()) {

			g.addGrpCdCdgDsply(String.valueOf(groupcodecoding.getDisplay()));
		} else {
			g.addGrpCdCdgDsply("NULL");
		}

		if(groupcodecodingi == groupcodecodinglist.size()-1) {g.addGrpCdCdgDsply("]");}


		/******************** Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(groupcodecodingi == 0) {g.addGrpCdCdgVrsn("[");}
		if(groupcodecoding.hasVersion()) {

			g.addGrpCdCdgVrsn(String.valueOf(groupcodecoding.getVersion()));
		} else {
			g.addGrpCdCdgVrsn("NULL");
		}

		if(groupcodecodingi == groupcodecodinglist.size()-1) {g.addGrpCdCdgVrsn("]");}


		/******************** Grp_Cd_Cdg_Cd ********************************************************************************/
		if(groupcodecodingi == 0) {g.addGrpCdCdgCd("[");}
		if(groupcodecoding.hasCode()) {

			g.addGrpCdCdgCd(String.valueOf(groupcodecoding.getCode()));
		} else {
			g.addGrpCdCdgCd("NULL");
		}

		if(groupcodecodingi == groupcodecodinglist.size()-1) {g.addGrpCdCdgCd("]");}


		/******************** Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(groupcodecodingi == 0) {g.addGrpCdCdgUsrSltd("[");}
		if(groupcodecoding.hasUserSelected()) {

			g.addGrpCdCdgUsrSltd(String.valueOf(groupcodecoding.getUserSelected()));
		} else {
			g.addGrpCdCdgUsrSltd("NULL");
		}

		if(groupcodecodingi == groupcodecodinglist.size()-1) {g.addGrpCdCdgUsrSltd("]");}


		/******************** Grp_Cd_Cdg_Sys ********************************************************************************/
		if(groupcodecodingi == 0) {g.addGrpCdCdgSys("[");}
		if(groupcodecoding.hasSystem()) {

			g.addGrpCdCdgSys(String.valueOf(groupcodecoding.getSystem()));
		} else {
			g.addGrpCdCdgSys("NULL");
		}

		if(groupcodecodingi == groupcodecodinglist.size()-1) {g.addGrpCdCdgSys("]");}


		 };
		/******************** groupidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> groupidentifierlist = group.getIdentifier();
		for(int groupidentifieri = 0; groupidentifieri<groupidentifierlist.size();groupidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  groupidentifier = groupidentifierlist.get(groupidentifieri);

		/******************** Grp_Id_Vl ********************************************************************************/
		if(groupidentifieri == 0) {g.addGrpIdVl("[");}
		if(groupidentifier.hasValue()) {

			g.addGrpIdVl(String.valueOf(groupidentifier.getValue()));
		} else {
			g.addGrpIdVl("NULL");
		}

		if(groupidentifieri == groupidentifierlist.size()-1) {g.addGrpIdVl("]");}


		/******************** groupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupidentifiertype = groupidentifier.getType();

		/******************** Grp_Id_Typ_Txt ********************************************************************************/
		if(groupidentifieri == 0) {g.addGrpIdTypTxt("[");}
		if(groupidentifiertype.hasText()) {

			g.addGrpIdTypTxt(String.valueOf(groupidentifiertype.getText()));
		} else {
			g.addGrpIdTypTxt("NULL");
		}

		if(groupidentifieri == groupidentifierlist.size()-1) {g.addGrpIdTypTxt("]");}


		/******************** groupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> groupidentifiertypecodinglist = groupidentifiertype.getCoding();
		for(int groupidentifiertypecodingi = 0; groupidentifiertypecodingi<groupidentifiertypecodinglist.size();groupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  groupidentifiertypecoding = groupidentifiertypecodinglist.get(groupidentifiertypecodingi);

		/******************** Grp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(groupidentifiertypecodingi == 0) {g.addGrpIdTypCdgDsply("[[");}
		if(groupidentifiertypecoding.hasDisplay()) {

			g.addGrpIdTypCdgDsply(String.valueOf(groupidentifiertypecoding.getDisplay()));
		} else {
			g.addGrpIdTypCdgDsply("NULL");
		}

		if(groupidentifiertypecodingi == groupidentifiertypecodinglist.size()-1) {g.addGrpIdTypCdgDsply("]]");}


		/******************** Grp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(groupidentifiertypecodingi == 0) {g.addGrpIdTypCdgVrsn("[[");}
		if(groupidentifiertypecoding.hasVersion()) {

			g.addGrpIdTypCdgVrsn(String.valueOf(groupidentifiertypecoding.getVersion()));
		} else {
			g.addGrpIdTypCdgVrsn("NULL");
		}

		if(groupidentifiertypecodingi == groupidentifiertypecodinglist.size()-1) {g.addGrpIdTypCdgVrsn("]]");}


		/******************** Grp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(groupidentifiertypecodingi == 0) {g.addGrpIdTypCdgCd("[[");}
		if(groupidentifiertypecoding.hasCode()) {

			g.addGrpIdTypCdgCd(String.valueOf(groupidentifiertypecoding.getCode()));
		} else {
			g.addGrpIdTypCdgCd("NULL");
		}

		if(groupidentifiertypecodingi == groupidentifiertypecodinglist.size()-1) {g.addGrpIdTypCdgCd("]]");}


		/******************** Grp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(groupidentifiertypecodingi == 0) {g.addGrpIdTypCdgUsrSltd("[[");}
		if(groupidentifiertypecoding.hasUserSelected()) {

			g.addGrpIdTypCdgUsrSltd(String.valueOf(groupidentifiertypecoding.getUserSelected()));
		} else {
			g.addGrpIdTypCdgUsrSltd("NULL");
		}

		if(groupidentifiertypecodingi == groupidentifiertypecodinglist.size()-1) {g.addGrpIdTypCdgUsrSltd("]]");}


		/******************** Grp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(groupidentifiertypecodingi == 0) {g.addGrpIdTypCdgSys("[[");}
		if(groupidentifiertypecoding.hasSystem()) {

			g.addGrpIdTypCdgSys(String.valueOf(groupidentifiertypecoding.getSystem()));
		} else {
			g.addGrpIdTypCdgSys("NULL");
		}

		if(groupidentifiertypecodingi == groupidentifiertypecodinglist.size()-1) {g.addGrpIdTypCdgSys("]]");}


		 };
		/******************** groupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupidentifierperiod = groupidentifier.getPeriod();

		/******************** Grp_Id_Prd_Strt ********************************************************************************/
		if(groupidentifieri == 0) {g.addGrpIdPrdStrt("[");}
		if(groupidentifierperiod.hasStart()) {

			g.addGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(groupidentifierperiod.getStart())+"\"");
		} else {
			g.addGrpIdPrdStrt("NULL");
		}

		if(groupidentifieri == groupidentifierlist.size()-1) {g.addGrpIdPrdStrt("]");}


		/******************** Grp_Id_Prd_End ********************************************************************************/
		if(groupidentifieri == 0) {g.addGrpIdPrdEnd("[");}
		if(groupidentifierperiod.hasEnd()) {

			g.addGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(groupidentifierperiod.getEnd())+"\"");
		} else {
			g.addGrpIdPrdEnd("NULL");
		}

		if(groupidentifieri == groupidentifierlist.size()-1) {g.addGrpIdPrdEnd("]");}


		/******************** groupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse groupidentifieruse = groupidentifier.getUse();
		if(groupidentifieruse!=null) {
		if(groupidentifieri == 0) {

		g.addGrpIdUse("[");		}
			g.addGrpIdUse(groupidentifieruse.toCode());
		if(groupidentifieri == groupidentifierlist.size()-1) {

		g.addGrpIdUse("]");		}

		} else {
			g.addGrpIdUse("NULL");
		}

		/******************** Grp_Id_Assigner ********************************************************************************/
		if(groupidentifieri == 0) {g.addGrpIdAssigner("[");}
		if(groupidentifier.hasAssigner()) {

			if(groupidentifier.getAssigner().getReference() != null) {
			g.addGrpIdAssigner(groupidentifier.getAssigner().getReference());
			}
		} else {
			g.addGrpIdAssigner("NULL");
		}

		if(groupidentifieri == groupidentifierlist.size()-1) {g.addGrpIdAssigner("]");}


		/******************** Grp_Id_Sys ********************************************************************************/
		if(groupidentifieri == 0) {g.addGrpIdSys("[");}
		if(groupidentifier.hasSystem()) {

			g.addGrpIdSys(String.valueOf(groupidentifier.getSystem()));
		} else {
			g.addGrpIdSys("NULL");
		}

		if(groupidentifieri == groupidentifierlist.size()-1) {g.addGrpIdSys("]");}


		 };
		/******************** Grp_Active ********************************************************************************/
		if(group.hasActive()) {

			g.addGrpActive(String.valueOf(group.getActive()));
		} else {
			g.addGrpActive("NULL");
		}


		/******************** Grp_Qnty ********************************************************************************/
		if(group.hasQuantity()) {

			g.addGrpQnty(String.valueOf(group.getQuantity()));
		} else {
			g.addGrpQnty("NULL");
		}


		/******************** groupcharacteristic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Group.GroupCharacteristicComponent> groupcharacteristiclist = group.getCharacteristic();
		for(int groupcharacteristici = 0; groupcharacteristici<groupcharacteristiclist.size();groupcharacteristici++ ) {
		org.hl7.fhir.r4.model.Group.GroupCharacteristicComponent  groupcharacteristic = groupcharacteristiclist.get(groupcharacteristici);

		/******************** groupcharacteristiccode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcharacteristiccode = groupcharacteristic.getCode();

		/******************** Grp_Crctrstc_Cd_Txt ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcCdTxt("[");}
		if(groupcharacteristiccode.hasText()) {

			g.addGrpCrctrstcCdTxt(String.valueOf(groupcharacteristiccode.getText()));
		} else {
			g.addGrpCrctrstcCdTxt("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcCdTxt("]");}


		/******************** groupcharacteristiccodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> groupcharacteristiccodecodinglist = groupcharacteristiccode.getCoding();
		for(int groupcharacteristiccodecodingi = 0; groupcharacteristiccodecodingi<groupcharacteristiccodecodinglist.size();groupcharacteristiccodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  groupcharacteristiccodecoding = groupcharacteristiccodecodinglist.get(groupcharacteristiccodecodingi);

		/******************** Grp_Crctrstc_Cd_Cdg_Dsply ********************************************************************************/
		if(groupcharacteristiccodecodingi == 0) {g.addGrpCrctrstcCdCdgDsply("[[");}
		if(groupcharacteristiccodecoding.hasDisplay()) {

			g.addGrpCrctrstcCdCdgDsply(String.valueOf(groupcharacteristiccodecoding.getDisplay()));
		} else {
			g.addGrpCrctrstcCdCdgDsply("NULL");
		}

		if(groupcharacteristiccodecodingi == groupcharacteristiccodecodinglist.size()-1) {g.addGrpCrctrstcCdCdgDsply("]]");}


		/******************** Grp_Crctrstc_Cd_Cdg_Vrsn ********************************************************************************/
		if(groupcharacteristiccodecodingi == 0) {g.addGrpCrctrstcCdCdgVrsn("[[");}
		if(groupcharacteristiccodecoding.hasVersion()) {

			g.addGrpCrctrstcCdCdgVrsn(String.valueOf(groupcharacteristiccodecoding.getVersion()));
		} else {
			g.addGrpCrctrstcCdCdgVrsn("NULL");
		}

		if(groupcharacteristiccodecodingi == groupcharacteristiccodecodinglist.size()-1) {g.addGrpCrctrstcCdCdgVrsn("]]");}


		/******************** Grp_Crctrstc_Cd_Cdg_Cd ********************************************************************************/
		if(groupcharacteristiccodecodingi == 0) {g.addGrpCrctrstcCdCdgCd("[[");}
		if(groupcharacteristiccodecoding.hasCode()) {

			g.addGrpCrctrstcCdCdgCd(String.valueOf(groupcharacteristiccodecoding.getCode()));
		} else {
			g.addGrpCrctrstcCdCdgCd("NULL");
		}

		if(groupcharacteristiccodecodingi == groupcharacteristiccodecodinglist.size()-1) {g.addGrpCrctrstcCdCdgCd("]]");}


		/******************** Grp_Crctrstc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(groupcharacteristiccodecodingi == 0) {g.addGrpCrctrstcCdCdgUsrSltd("[[");}
		if(groupcharacteristiccodecoding.hasUserSelected()) {

			g.addGrpCrctrstcCdCdgUsrSltd(String.valueOf(groupcharacteristiccodecoding.getUserSelected()));
		} else {
			g.addGrpCrctrstcCdCdgUsrSltd("NULL");
		}

		if(groupcharacteristiccodecodingi == groupcharacteristiccodecodinglist.size()-1) {g.addGrpCrctrstcCdCdgUsrSltd("]]");}


		/******************** Grp_Crctrstc_Cd_Cdg_Sys ********************************************************************************/
		if(groupcharacteristiccodecodingi == 0) {g.addGrpCrctrstcCdCdgSys("[[");}
		if(groupcharacteristiccodecoding.hasSystem()) {

			g.addGrpCrctrstcCdCdgSys(String.valueOf(groupcharacteristiccodecoding.getSystem()));
		} else {
			g.addGrpCrctrstcCdCdgSys("NULL");
		}

		if(groupcharacteristiccodecodingi == groupcharacteristiccodecodinglist.size()-1) {g.addGrpCrctrstcCdCdgSys("]]");}


		 };
		/******************** groupcharacteristicperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupcharacteristicperiod = groupcharacteristic.getPeriod();

		/******************** Grp_Crctrstc_Prd_Strt ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcPrdStrt("[");}
		if(groupcharacteristicperiod.hasStart()) {

			g.addGrpCrctrstcPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(groupcharacteristicperiod.getStart())+"\"");
		} else {
			g.addGrpCrctrstcPrdStrt("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcPrdStrt("]");}


		/******************** Grp_Crctrstc_Prd_End ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcPrdEnd("[");}
		if(groupcharacteristicperiod.hasEnd()) {

			g.addGrpCrctrstcPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(groupcharacteristicperiod.getEnd())+"\"");
		} else {
			g.addGrpCrctrstcPrdEnd("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcPrdEnd("]");}


		/******************** Grp_Crctrstc_Exclude ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcExclude("[");}
		if(groupcharacteristic.hasExclude()) {

			g.addGrpCrctrstcExclude(String.valueOf(groupcharacteristic.getExclude()));
		} else {
			g.addGrpCrctrstcExclude("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcExclude("]");}


		/******************** Grp_Crctrstc_VlRfrnc ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRfrnc("[");}
		if(groupcharacteristic.hasValueReference()) {

			if(groupcharacteristic.getValueReference().getReference() != null) {
			g.addGrpCrctrstcVlRfrnc(groupcharacteristic.getValueReference().getReference());
			}
		} else {
			g.addGrpCrctrstcVlRfrnc("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRfrnc("]");}


		/******************** Grp_Crctrstc_VlBooleanTyp ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlBooleanTyp("[");}
		if(groupcharacteristic.hasValueBooleanType()) {

			g.addGrpCrctrstcVlBooleanTyp("\""+groupcharacteristic.getValueBooleanType().getValueAsString()+"\"");
		} else {
			g.addGrpCrctrstcVlBooleanTyp("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlBooleanTyp("]");}


		/******************** groupcharacteristicvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcharacteristicvaluecodeableconcept = groupcharacteristic.getValueCodeableConcept();

		/******************** Grp_Crctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlCdbleCncptTxt("[");}
		if(groupcharacteristicvaluecodeableconcept.hasText()) {

			g.addGrpCrctrstcVlCdbleCncptTxt(String.valueOf(groupcharacteristicvaluecodeableconcept.getText()));
		} else {
			g.addGrpCrctrstcVlCdbleCncptTxt("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlCdbleCncptTxt("]");}


		/******************** groupcharacteristicvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> groupcharacteristicvaluecodeableconceptcodinglist = groupcharacteristicvaluecodeableconcept.getCoding();
		for(int groupcharacteristicvaluecodeableconceptcodingi = 0; groupcharacteristicvaluecodeableconceptcodingi<groupcharacteristicvaluecodeableconceptcodinglist.size();groupcharacteristicvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  groupcharacteristicvaluecodeableconceptcoding = groupcharacteristicvaluecodeableconceptcodinglist.get(groupcharacteristicvaluecodeableconceptcodingi);

		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcodingi == 0) {g.addGrpCrctrstcVlCdbleCncptCdgDsply("[[");}
		if(groupcharacteristicvaluecodeableconceptcoding.hasDisplay()) {

			g.addGrpCrctrstcVlCdbleCncptCdgDsply(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getDisplay()));
		} else {
			g.addGrpCrctrstcVlCdbleCncptCdgDsply("NULL");
		}

		if(groupcharacteristicvaluecodeableconceptcodingi == groupcharacteristicvaluecodeableconceptcodinglist.size()-1) {g.addGrpCrctrstcVlCdbleCncptCdgDsply("]]");}


		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcodingi == 0) {g.addGrpCrctrstcVlCdbleCncptCdgVrsn("[[");}
		if(groupcharacteristicvaluecodeableconceptcoding.hasVersion()) {

			g.addGrpCrctrstcVlCdbleCncptCdgVrsn(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getVersion()));
		} else {
			g.addGrpCrctrstcVlCdbleCncptCdgVrsn("NULL");
		}

		if(groupcharacteristicvaluecodeableconceptcodingi == groupcharacteristicvaluecodeableconceptcodinglist.size()-1) {g.addGrpCrctrstcVlCdbleCncptCdgVrsn("]]");}


		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcodingi == 0) {g.addGrpCrctrstcVlCdbleCncptCdgCd("[[");}
		if(groupcharacteristicvaluecodeableconceptcoding.hasCode()) {

			g.addGrpCrctrstcVlCdbleCncptCdgCd(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getCode()));
		} else {
			g.addGrpCrctrstcVlCdbleCncptCdgCd("NULL");
		}

		if(groupcharacteristicvaluecodeableconceptcodingi == groupcharacteristicvaluecodeableconceptcodinglist.size()-1) {g.addGrpCrctrstcVlCdbleCncptCdgCd("]]");}


		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcodingi == 0) {g.addGrpCrctrstcVlCdbleCncptCdgUsrSltd("[[");}
		if(groupcharacteristicvaluecodeableconceptcoding.hasUserSelected()) {

			g.addGrpCrctrstcVlCdbleCncptCdgUsrSltd(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getUserSelected()));
		} else {
			g.addGrpCrctrstcVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(groupcharacteristicvaluecodeableconceptcodingi == groupcharacteristicvaluecodeableconceptcodinglist.size()-1) {g.addGrpCrctrstcVlCdbleCncptCdgUsrSltd("]]");}


		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcodingi == 0) {g.addGrpCrctrstcVlCdbleCncptCdgSys("[[");}
		if(groupcharacteristicvaluecodeableconceptcoding.hasSystem()) {

			g.addGrpCrctrstcVlCdbleCncptCdgSys(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getSystem()));
		} else {
			g.addGrpCrctrstcVlCdbleCncptCdgSys("NULL");
		}

		if(groupcharacteristicvaluecodeableconceptcodingi == groupcharacteristicvaluecodeableconceptcodinglist.size()-1) {g.addGrpCrctrstcVlCdbleCncptCdgSys("]]");}


		 };
		/******************** groupcharacteristicvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range groupcharacteristicvaluerange = groupcharacteristic.getValueRange();

		/******************** groupcharacteristicvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluerangelow = groupcharacteristicvaluerange.getLow();

		/******************** Grp_Crctrstc_VlRng_Lw_Vl ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngLwVl("[");}
		if(groupcharacteristicvaluerangelow.hasValue()) {

			g.addGrpCrctrstcVlRngLwVl(String.valueOf(groupcharacteristicvaluerangelow.getValue()));
		} else {
			g.addGrpCrctrstcVlRngLwVl("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngLwVl("]");}


		/******************** groupcharacteristicvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator groupcharacteristicvaluerangelowcomparator = groupcharacteristicvaluerangelow.getComparator();
		if(groupcharacteristicvaluerangelowcomparator!=null) {
		if(groupcharacteristici == 0) {

		g.addGrpCrctrstcVlRngLwCmprtr("[");		}
			g.addGrpCrctrstcVlRngLwCmprtr(groupcharacteristicvaluerangelowcomparator.toCode());
		if(groupcharacteristici == groupcharacteristiclist.size()-1) {

		g.addGrpCrctrstcVlRngLwCmprtr("]");		}

		} else {
			g.addGrpCrctrstcVlRngLwCmprtr("NULL");
		}

		/******************** Grp_Crctrstc_VlRng_Lw_Cd ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngLwCd("[");}
		if(groupcharacteristicvaluerangelow.hasCode()) {

			g.addGrpCrctrstcVlRngLwCd(String.valueOf(groupcharacteristicvaluerangelow.getCode()));
		} else {
			g.addGrpCrctrstcVlRngLwCd("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngLwCd("]");}


		/******************** Grp_Crctrstc_VlRng_Lw_Unt ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngLwUnt("[");}
		if(groupcharacteristicvaluerangelow.hasUnit()) {

			g.addGrpCrctrstcVlRngLwUnt(String.valueOf(groupcharacteristicvaluerangelow.getUnit()));
		} else {
			g.addGrpCrctrstcVlRngLwUnt("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngLwUnt("]");}


		/******************** Grp_Crctrstc_VlRng_Lw_Sys ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngLwSys("[");}
		if(groupcharacteristicvaluerangelow.hasSystem()) {

			g.addGrpCrctrstcVlRngLwSys(String.valueOf(groupcharacteristicvaluerangelow.getSystem()));
		} else {
			g.addGrpCrctrstcVlRngLwSys("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngLwSys("]");}


		/******************** groupcharacteristicvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluerangehigh = groupcharacteristicvaluerange.getHigh();

		/******************** Grp_Crctrstc_VlRng_Hi_Vl ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngHiVl("[");}
		if(groupcharacteristicvaluerangehigh.hasValue()) {

			g.addGrpCrctrstcVlRngHiVl(String.valueOf(groupcharacteristicvaluerangehigh.getValue()));
		} else {
			g.addGrpCrctrstcVlRngHiVl("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngHiVl("]");}


		/******************** groupcharacteristicvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator groupcharacteristicvaluerangehighcomparator = groupcharacteristicvaluerangehigh.getComparator();
		if(groupcharacteristicvaluerangehighcomparator!=null) {
		if(groupcharacteristici == 0) {

		g.addGrpCrctrstcVlRngHiCmprtr("[");		}
			g.addGrpCrctrstcVlRngHiCmprtr(groupcharacteristicvaluerangehighcomparator.toCode());
		if(groupcharacteristici == groupcharacteristiclist.size()-1) {

		g.addGrpCrctrstcVlRngHiCmprtr("]");		}

		} else {
			g.addGrpCrctrstcVlRngHiCmprtr("NULL");
		}

		/******************** Grp_Crctrstc_VlRng_Hi_Cd ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngHiCd("[");}
		if(groupcharacteristicvaluerangehigh.hasCode()) {

			g.addGrpCrctrstcVlRngHiCd(String.valueOf(groupcharacteristicvaluerangehigh.getCode()));
		} else {
			g.addGrpCrctrstcVlRngHiCd("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngHiCd("]");}


		/******************** Grp_Crctrstc_VlRng_Hi_Unt ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngHiUnt("[");}
		if(groupcharacteristicvaluerangehigh.hasUnit()) {

			g.addGrpCrctrstcVlRngHiUnt(String.valueOf(groupcharacteristicvaluerangehigh.getUnit()));
		} else {
			g.addGrpCrctrstcVlRngHiUnt("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngHiUnt("]");}


		/******************** Grp_Crctrstc_VlRng_Hi_Sys ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlRngHiSys("[");}
		if(groupcharacteristicvaluerangehigh.hasSystem()) {

			g.addGrpCrctrstcVlRngHiSys(String.valueOf(groupcharacteristicvaluerangehigh.getSystem()));
		} else {
			g.addGrpCrctrstcVlRngHiSys("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlRngHiSys("]");}


		/******************** groupcharacteristicvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluequantity = groupcharacteristic.getValueQuantity();

		/******************** Grp_Crctrstc_VlQnty_Vl ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlQntyVl("[");}
		if(groupcharacteristicvaluequantity.hasValue()) {

			g.addGrpCrctrstcVlQntyVl(String.valueOf(groupcharacteristicvaluequantity.getValue()));
		} else {
			g.addGrpCrctrstcVlQntyVl("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlQntyVl("]");}


		/******************** groupcharacteristicvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator groupcharacteristicvaluequantitycomparator = groupcharacteristicvaluequantity.getComparator();
		if(groupcharacteristicvaluequantitycomparator!=null) {
		if(groupcharacteristici == 0) {

		g.addGrpCrctrstcVlQntyCmprtr("[");		}
			g.addGrpCrctrstcVlQntyCmprtr(groupcharacteristicvaluequantitycomparator.toCode());
		if(groupcharacteristici == groupcharacteristiclist.size()-1) {

		g.addGrpCrctrstcVlQntyCmprtr("]");		}

		} else {
			g.addGrpCrctrstcVlQntyCmprtr("NULL");
		}

		/******************** Grp_Crctrstc_VlQnty_Cd ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlQntyCd("[");}
		if(groupcharacteristicvaluequantity.hasCode()) {

			g.addGrpCrctrstcVlQntyCd(String.valueOf(groupcharacteristicvaluequantity.getCode()));
		} else {
			g.addGrpCrctrstcVlQntyCd("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlQntyCd("]");}


		/******************** Grp_Crctrstc_VlQnty_Unt ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlQntyUnt("[");}
		if(groupcharacteristicvaluequantity.hasUnit()) {

			g.addGrpCrctrstcVlQntyUnt(String.valueOf(groupcharacteristicvaluequantity.getUnit()));
		} else {
			g.addGrpCrctrstcVlQntyUnt("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlQntyUnt("]");}


		/******************** Grp_Crctrstc_VlQnty_Sys ********************************************************************************/
		if(groupcharacteristici == 0) {g.addGrpCrctrstcVlQntySys("[");}
		if(groupcharacteristicvaluequantity.hasSystem()) {

			g.addGrpCrctrstcVlQntySys(String.valueOf(groupcharacteristicvaluequantity.getSystem()));
		} else {
			g.addGrpCrctrstcVlQntySys("NULL");
		}

		if(groupcharacteristici == groupcharacteristiclist.size()-1) {g.addGrpCrctrstcVlQntySys("]");}


		 };
		/******************** Grp_Actual ********************************************************************************/
		if(group.hasActual()) {

			g.addGrpActual(String.valueOf(group.getActual()));
		} else {
			g.addGrpActual("NULL");
		}


		/******************** Grp_ManagingEntity ********************************************************************************/
		if(group.hasManagingEntity()) {

			if(group.getManagingEntity().getReference() != null) {
			g.addGrpManagingEntity(group.getManagingEntity().getReference());
			}
		} else {
			g.addGrpManagingEntity("NULL");
		}


		/******************** groupmember ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Group.GroupMemberComponent> groupmemberlist = group.getMember();
		for(int groupmemberi = 0; groupmemberi<groupmemberlist.size();groupmemberi++ ) {
		org.hl7.fhir.r4.model.Group.GroupMemberComponent  groupmember = groupmemberlist.get(groupmemberi);

		/******************** groupmemberperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupmemberperiod = groupmember.getPeriod();

		/******************** Grp_Mmbr_Prd_Strt ********************************************************************************/
		if(groupmemberi == 0) {g.addGrpMmbrPrdStrt("[");}
		if(groupmemberperiod.hasStart()) {

			g.addGrpMmbrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(groupmemberperiod.getStart())+"\"");
		} else {
			g.addGrpMmbrPrdStrt("NULL");
		}

		if(groupmemberi == groupmemberlist.size()-1) {g.addGrpMmbrPrdStrt("]");}


		/******************** Grp_Mmbr_Prd_End ********************************************************************************/
		if(groupmemberi == 0) {g.addGrpMmbrPrdEnd("[");}
		if(groupmemberperiod.hasEnd()) {

			g.addGrpMmbrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(groupmemberperiod.getEnd())+"\"");
		} else {
			g.addGrpMmbrPrdEnd("NULL");
		}

		if(groupmemberi == groupmemberlist.size()-1) {g.addGrpMmbrPrdEnd("]");}


		/******************** Grp_Mmbr_Inactive ********************************************************************************/
		if(groupmemberi == 0) {g.addGrpMmbrInactive("[");}
		if(groupmember.hasInactive()) {

			g.addGrpMmbrInactive(String.valueOf(groupmember.getInactive()));
		} else {
			g.addGrpMmbrInactive("NULL");
		}

		if(groupmemberi == groupmemberlist.size()-1) {g.addGrpMmbrInactive("]");}


		/******************** Grp_Mmbr_Entity ********************************************************************************/
		if(groupmemberi == 0) {g.addGrpMmbrEntity("[");}
		if(groupmember.hasEntity()) {

			if(groupmember.getEntity().getReference() != null) {
			g.addGrpMmbrEntity(groupmember.getEntity().getReference());
			}
		} else {
			g.addGrpMmbrEntity("NULL");
		}

		if(groupmemberi == groupmemberlist.size()-1) {g.addGrpMmbrEntity("]");}


		 };
		return g;
	}
}
