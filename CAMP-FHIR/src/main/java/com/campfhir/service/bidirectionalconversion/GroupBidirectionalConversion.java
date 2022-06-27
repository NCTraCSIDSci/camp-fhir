package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Group;
public class GroupBidirectionalConversion 
{
	public Group Groups(org.hl7.fhir.r4.model.Group group) throws ParseException
	{
		 main.java.com.campfhir.model.Group g = new  main.java.com.campfhir.model.Group();

		/******************** id ********************************************************************************/
		group.setId(g.getId());

		/******************** Grp_Nm ********************************************************************************/
		if(group.hasName()) {
			g.setGrpNm(String.valueOf(group.getName()));
		}
		/******************** grouptype ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupType grouptype = group.getType();
		g.setGrpTyp(grouptype.toCode());

		/******************** groupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcode = group.getCode();

		/******************** Grp_Cd_Txt ********************************************************************************/
		if(groupcode.hasText()) {
			g.setGrpCdTxt(String.valueOf(groupcode.getText()));
		}
		/******************** groupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupcodecoding = groupcode.getCodingFirstRep();

		/******************** Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(groupcodecoding.hasVersion()) {
			g.setGrpCdCdgVrsn(String.valueOf(groupcodecoding.getVersion()));
		}
		/******************** Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(groupcodecoding.hasDisplay()) {
			g.setGrpCdCdgDsply(String.valueOf(groupcodecoding.getDisplay()));
		}
		/******************** Grp_Cd_Cdg_Cd ********************************************************************************/
		if(groupcodecoding.hasCode()) {
			g.setGrpCdCdgCd(String.valueOf(groupcodecoding.getCode()));
		}
		/******************** Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(groupcodecoding.hasUserSelected()) {
			g.setGrpCdCdgUsrSltd(String.valueOf(groupcodecoding.getUserSelected()));
		}
		/******************** Grp_Cd_Cdg_Sys ********************************************************************************/
		if(groupcodecoding.hasSystem()) {
			g.setGrpCdCdgSys(String.valueOf(groupcodecoding.getSystem()));
		}
		/******************** Grp_Qnty ********************************************************************************/
		if(group.hasQuantity()) {
			g.setGrpQnty(String.valueOf(group.getQuantity()));
		}
		/******************** Grp_Active ********************************************************************************/
		if(group.hasActive()) {
			g.setGrpActive(String.valueOf(group.getActive()));
		}
		/******************** groupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier groupidentifier = group.getIdentifierFirstRep();

		/******************** Grp_Id_Vl ********************************************************************************/
		if(groupidentifier.hasValue()) {
			g.setGrpIdVl(String.valueOf(groupidentifier.getValue()));
		}
		/******************** groupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupidentifiertype = groupidentifier.getType();

		/******************** Grp_Id_Typ_Txt ********************************************************************************/
		if(groupidentifiertype.hasText()) {
			g.setGrpIdTypTxt(String.valueOf(groupidentifiertype.getText()));
		}
		/******************** groupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupidentifiertypecoding = groupidentifiertype.getCodingFirstRep();

		/******************** Grp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(groupidentifiertypecoding.hasVersion()) {
			g.setGrpIdTypCdgVrsn(String.valueOf(groupidentifiertypecoding.getVersion()));
		}
		/******************** Grp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(groupidentifiertypecoding.hasDisplay()) {
			g.setGrpIdTypCdgDsply(String.valueOf(groupidentifiertypecoding.getDisplay()));
		}
		/******************** Grp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(groupidentifiertypecoding.hasCode()) {
			g.setGrpIdTypCdgCd(String.valueOf(groupidentifiertypecoding.getCode()));
		}
		/******************** Grp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(groupidentifiertypecoding.hasUserSelected()) {
			g.setGrpIdTypCdgUsrSltd(String.valueOf(groupidentifiertypecoding.getUserSelected()));
		}
		/******************** Grp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(groupidentifiertypecoding.hasSystem()) {
			g.setGrpIdTypCdgSys(String.valueOf(groupidentifiertypecoding.getSystem()));
		}
		/******************** groupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupidentifierperiod = groupidentifier.getPeriod();

		/******************** Grp_Id_Prd_Strt ********************************************************************************/
		if(groupidentifierperiod.hasStart()) {
			g.setGrpIdPrdStrt(String.valueOf(groupidentifierperiod.getStart()));
		}
		/******************** Grp_Id_Prd_End ********************************************************************************/
		if(groupidentifierperiod.hasEnd()) {
			g.setGrpIdPrdEnd(String.valueOf(groupidentifierperiod.getEnd()));
		}
		/******************** Grp_Id_Assigner ********************************************************************************/
		if(groupidentifier.hasAssigner()) {
			g.setGrpIdAssigner(String.valueOf(groupidentifier.getAssigner()));
		}
		/******************** Grp_Id_Sys ********************************************************************************/
		if(groupidentifier.hasSystem()) {
			g.setGrpIdSys(String.valueOf(groupidentifier.getSystem()));
		}
		/******************** groupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse groupidentifieruse = groupidentifier.getUse();
		g.setGrpIdUse(groupidentifieruse.toCode());

		/******************** Grp_Actual ********************************************************************************/
		if(group.hasActual()) {
			g.setGrpActual(String.valueOf(group.getActual()));
		}
		/******************** Grp_ManagingEntity ********************************************************************************/
		if(group.hasManagingEntity()) {
			g.setGrpManagingEntity(String.valueOf(group.getManagingEntity()));
		}
		/******************** groupmember ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupMemberComponent groupmember = group.getMemberFirstRep();

		/******************** Grp_Mmbr_Inactive ********************************************************************************/
		if(groupmember.hasInactive()) {
			g.setGrpMmbrInactive(String.valueOf(groupmember.getInactive()));
		}
		/******************** Grp_Mmbr_Entity ********************************************************************************/
		if(groupmember.hasEntity()) {
			g.setGrpMmbrEntity(String.valueOf(groupmember.getEntity()));
		}
		/******************** groupmemberperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupmemberperiod = groupmember.getPeriod();

		/******************** Grp_Mmbr_Prd_Strt ********************************************************************************/
		if(groupmemberperiod.hasStart()) {
			g.setGrpMmbrPrdStrt(String.valueOf(groupmemberperiod.getStart()));
		}
		/******************** Grp_Mmbr_Prd_End ********************************************************************************/
		if(groupmemberperiod.hasEnd()) {
			g.setGrpMmbrPrdEnd(String.valueOf(groupmemberperiod.getEnd()));
		}
		/******************** groupcharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupCharacteristicComponent groupcharacteristic = group.getCharacteristicFirstRep();

		/******************** groupcharacteristiccode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcharacteristiccode = groupcharacteristic.getCode();

		/******************** Grp_Crctrstc_Cd_Txt ********************************************************************************/
		if(groupcharacteristiccode.hasText()) {
			g.setGrpCrctrstcCdTxt(String.valueOf(groupcharacteristiccode.getText()));
		}
		/******************** groupcharacteristiccodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupcharacteristiccodecoding = groupcharacteristiccode.getCodingFirstRep();

		/******************** Grp_Crctrstc_Cd_Cdg_Vrsn ********************************************************************************/
		if(groupcharacteristiccodecoding.hasVersion()) {
			g.setGrpCrctrstcCdCdgVrsn(String.valueOf(groupcharacteristiccodecoding.getVersion()));
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Dsply ********************************************************************************/
		if(groupcharacteristiccodecoding.hasDisplay()) {
			g.setGrpCrctrstcCdCdgDsply(String.valueOf(groupcharacteristiccodecoding.getDisplay()));
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Cd ********************************************************************************/
		if(groupcharacteristiccodecoding.hasCode()) {
			g.setGrpCrctrstcCdCdgCd(String.valueOf(groupcharacteristiccodecoding.getCode()));
		}
		/******************** Grp_Crctrstc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(groupcharacteristiccodecoding.hasUserSelected()) {
			g.setGrpCrctrstcCdCdgUsrSltd(String.valueOf(groupcharacteristiccodecoding.getUserSelected()));
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Sys ********************************************************************************/
		if(groupcharacteristiccodecoding.hasSystem()) {
			g.setGrpCrctrstcCdCdgSys(String.valueOf(groupcharacteristiccodecoding.getSystem()));
		}
		/******************** Grp_Crctrstc_Exclude ********************************************************************************/
		if(groupcharacteristic.hasExclude()) {
			g.setGrpCrctrstcExclude(String.valueOf(groupcharacteristic.getExclude()));
		}
		/******************** Grp_Crctrstc_VlBooleanTyp ********************************************************************************/
		if(groupcharacteristic.hasValueBooleanType()) {
			g.setGrpCrctrstcVlBooleanTyp(String.valueOf(groupcharacteristic.getValueBooleanType()));
		}
		/******************** groupcharacteristicvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcharacteristicvaluecodeableconcept = groupcharacteristic.getValueCodeableConcept();

		/******************** Grp_Crctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(groupcharacteristicvaluecodeableconcept.hasText()) {
			g.setGrpCrctrstcVlCdbleCncptTxt(String.valueOf(groupcharacteristicvaluecodeableconcept.getText()));
		}
		/******************** groupcharacteristicvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupcharacteristicvaluecodeableconceptcoding = groupcharacteristicvaluecodeableconcept.getCodingFirstRep();

		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcoding.hasVersion()) {
			g.setGrpCrctrstcVlCdbleCncptCdgVrsn(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcoding.hasDisplay()) {
			g.setGrpCrctrstcVlCdbleCncptCdgDsply(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcoding.hasCode()) {
			g.setGrpCrctrstcVlCdbleCncptCdgCd(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getCode()));
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcoding.hasUserSelected()) {
			g.setGrpCrctrstcVlCdbleCncptCdgUsrSltd(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(groupcharacteristicvaluecodeableconceptcoding.hasSystem()) {
			g.setGrpCrctrstcVlCdbleCncptCdgSys(String.valueOf(groupcharacteristicvaluecodeableconceptcoding.getSystem()));
		}
		/******************** groupcharacteristicperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupcharacteristicperiod = groupcharacteristic.getPeriod();

		/******************** Grp_Crctrstc_Prd_Strt ********************************************************************************/
		if(groupcharacteristicperiod.hasStart()) {
			g.setGrpCrctrstcPrdStrt(String.valueOf(groupcharacteristicperiod.getStart()));
		}
		/******************** Grp_Crctrstc_Prd_End ********************************************************************************/
		if(groupcharacteristicperiod.hasEnd()) {
			g.setGrpCrctrstcPrdEnd(String.valueOf(groupcharacteristicperiod.getEnd()));
		}
		/******************** groupcharacteristicvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluequantity = groupcharacteristic.getValueQuantity();

		/******************** Grp_Crctrstc_VlQnty_Vl ********************************************************************************/
		if(groupcharacteristicvaluequantity.hasValue()) {
			g.setGrpCrctrstcVlQntyVl(String.valueOf(groupcharacteristicvaluequantity.getValue()));
		}
		/******************** groupcharacteristicvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator groupcharacteristicvaluequantitycomparator = groupcharacteristicvaluequantity.getComparator();
		g.setGrpCrctrstcVlQntyCmprtr(groupcharacteristicvaluequantitycomparator.toCode());

		/******************** Grp_Crctrstc_VlQnty_Cd ********************************************************************************/
		if(groupcharacteristicvaluequantity.hasCode()) {
			g.setGrpCrctrstcVlQntyCd(String.valueOf(groupcharacteristicvaluequantity.getCode()));
		}
		/******************** Grp_Crctrstc_VlQnty_Unt ********************************************************************************/
		if(groupcharacteristicvaluequantity.hasUnit()) {
			g.setGrpCrctrstcVlQntyUnt(String.valueOf(groupcharacteristicvaluequantity.getUnit()));
		}
		/******************** Grp_Crctrstc_VlQnty_Sys ********************************************************************************/
		if(groupcharacteristicvaluequantity.hasSystem()) {
			g.setGrpCrctrstcVlQntySys(String.valueOf(groupcharacteristicvaluequantity.getSystem()));
		}
		/******************** groupcharacteristicvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range groupcharacteristicvaluerange = groupcharacteristic.getValueRange();

		/******************** groupcharacteristicvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluerangelow = groupcharacteristicvaluerange.getLow();

		/******************** Grp_Crctrstc_VlRng_Lw_Vl ********************************************************************************/
		if(groupcharacteristicvaluerangelow.hasValue()) {
			g.setGrpCrctrstcVlRngLwVl(String.valueOf(groupcharacteristicvaluerangelow.getValue()));
		}
		/******************** groupcharacteristicvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator groupcharacteristicvaluerangelowcomparator = groupcharacteristicvaluerangelow.getComparator();
		g.setGrpCrctrstcVlRngLwCmprtr(groupcharacteristicvaluerangelowcomparator.toCode());

		/******************** Grp_Crctrstc_VlRng_Lw_Cd ********************************************************************************/
		if(groupcharacteristicvaluerangelow.hasCode()) {
			g.setGrpCrctrstcVlRngLwCd(String.valueOf(groupcharacteristicvaluerangelow.getCode()));
		}
		/******************** Grp_Crctrstc_VlRng_Lw_Unt ********************************************************************************/
		if(groupcharacteristicvaluerangelow.hasUnit()) {
			g.setGrpCrctrstcVlRngLwUnt(String.valueOf(groupcharacteristicvaluerangelow.getUnit()));
		}
		/******************** Grp_Crctrstc_VlRng_Lw_Sys ********************************************************************************/
		if(groupcharacteristicvaluerangelow.hasSystem()) {
			g.setGrpCrctrstcVlRngLwSys(String.valueOf(groupcharacteristicvaluerangelow.getSystem()));
		}
		/******************** groupcharacteristicvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluerangehigh = groupcharacteristicvaluerange.getHigh();

		/******************** Grp_Crctrstc_VlRng_Hi_Vl ********************************************************************************/
		if(groupcharacteristicvaluerangehigh.hasValue()) {
			g.setGrpCrctrstcVlRngHiVl(String.valueOf(groupcharacteristicvaluerangehigh.getValue()));
		}
		/******************** groupcharacteristicvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator groupcharacteristicvaluerangehighcomparator = groupcharacteristicvaluerangehigh.getComparator();
		g.setGrpCrctrstcVlRngHiCmprtr(groupcharacteristicvaluerangehighcomparator.toCode());

		/******************** Grp_Crctrstc_VlRng_Hi_Cd ********************************************************************************/
		if(groupcharacteristicvaluerangehigh.hasCode()) {
			g.setGrpCrctrstcVlRngHiCd(String.valueOf(groupcharacteristicvaluerangehigh.getCode()));
		}
		/******************** Grp_Crctrstc_VlRng_Hi_Unt ********************************************************************************/
		if(groupcharacteristicvaluerangehigh.hasUnit()) {
			g.setGrpCrctrstcVlRngHiUnt(String.valueOf(groupcharacteristicvaluerangehigh.getUnit()));
		}
		/******************** Grp_Crctrstc_VlRng_Hi_Sys ********************************************************************************/
		if(groupcharacteristicvaluerangehigh.hasSystem()) {
			g.setGrpCrctrstcVlRngHiSys(String.valueOf(groupcharacteristicvaluerangehigh.getSystem()));
		}
		/******************** Grp_Crctrstc_VlRfrnc ********************************************************************************/
		if(groupcharacteristic.hasValueReference()) {
			g.setGrpCrctrstcVlRfrnc(String.valueOf(groupcharacteristic.getValueReference()));
		}
		return g;
	}
}
