package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Group;
public class GroupConversion 
{
	public org.hl7.fhir.r4.model.Group Groups(Group g) throws ParseException
	{
		org.hl7.fhir.r4.model.Group group = new org.hl7.fhir.r4.model.Group();

		/******************** id ********************************************************************************/
		group.setId(g.getId());

		/******************** Grp_Active ********************************************************************************/
		if(g.getGrpActive() != null) {
			group.setActive(Boolean.parseBoolean(g.getGrpActive()));
		}
		/******************** Grp_Actual ********************************************************************************/
		if(g.getGrpActual() != null) {
			group.setActual(Boolean.parseBoolean(g.getGrpActual()));
		}
		/******************** groupcharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupCharacteristicComponent groupcharacteristic =  new org.hl7.fhir.r4.model.Group.GroupCharacteristicComponent();
		group.addCharacteristic(groupcharacteristic);

		/******************** groupcharacteristiccode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcharacteristiccode =  new org.hl7.fhir.r4.model.CodeableConcept();
		groupcharacteristic.setCode(groupcharacteristiccode);

		/******************** groupcharacteristiccodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupcharacteristiccodecoding =  new org.hl7.fhir.r4.model.Coding();
		groupcharacteristiccode.addCoding(groupcharacteristiccodecoding);

		/******************** Grp_Crctrstc_Cd_Cdg_Cd ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgCd() != null) {
			groupcharacteristiccodecoding.setCode(g.getGrpCrctrstcCdCdgCd());
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Dsply ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgDsply() != null) {
			groupcharacteristiccodecoding.setDisplay(g.getGrpCrctrstcCdCdgDsply());
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Sys ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgSys() != null) {
			groupcharacteristiccodecoding.setSystem(g.getGrpCrctrstcCdCdgSys());
		}
		/******************** Grp_Crctrstc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgUsrSltd() != null) {
			groupcharacteristiccodecoding.setUserSelected(Boolean.parseBoolean(g.getGrpCrctrstcCdCdgUsrSltd()));
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgVrsn() != null) {
			groupcharacteristiccodecoding.setVersion(g.getGrpCrctrstcCdCdgVrsn());
		}
		/******************** Grp_Crctrstc_Cd_Txt ********************************************************************************/
		if(g.getGrpCrctrstcCdTxt() != null) {
			groupcharacteristiccode.setText(g.getGrpCrctrstcCdTxt());
		}
		/******************** Grp_Crctrstc_Exclude ********************************************************************************/
		if(g.getGrpCrctrstcExclude() != null) {
			groupcharacteristic.setExclude(Boolean.parseBoolean(g.getGrpCrctrstcExclude()));
		}
		/******************** groupcharacteristicperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupcharacteristicperiod =  new org.hl7.fhir.r4.model.Period();
		groupcharacteristic.setPeriod(groupcharacteristicperiod);

		/******************** Grp_Crctrstc_Prd_End ********************************************************************************/
		if(g.getGrpCrctrstcPrdEnd() != null) {
			java.text.SimpleDateFormat Grp_Crctrstc_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Grp_Crctrstc_Prd_Enddate = Grp_Crctrstc_Prd_Endsdf.parse(g.getGrpCrctrstcPrdEnd());
			groupcharacteristicperiod.setEnd(Grp_Crctrstc_Prd_Enddate);
		}
		/******************** Grp_Crctrstc_Prd_Strt ********************************************************************************/
		if(g.getGrpCrctrstcPrdStrt() != null) {
			java.text.SimpleDateFormat Grp_Crctrstc_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Grp_Crctrstc_Prd_Strtdate = Grp_Crctrstc_Prd_Strtsdf.parse(g.getGrpCrctrstcPrdStrt());
			groupcharacteristicperiod.setStart(Grp_Crctrstc_Prd_Strtdate);
		}
		/******************** Grp_Crctrstc_VlBooleanTyp ********************************************************************************/
		if(g.getGrpCrctrstcVlBooleanTyp() != null) {
			groupcharacteristic.setValue( new org.hl7.fhir.r4.model.BooleanType(g.getGrpCrctrstcVlBooleanTyp()));
		}
		/******************** groupcharacteristicvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcharacteristicvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		groupcharacteristic.setValue(groupcharacteristicvaluecodeableconcept);

		/******************** groupcharacteristicvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupcharacteristicvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		groupcharacteristicvaluecodeableconcept.addCoding(groupcharacteristicvaluecodeableconceptcoding);

		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgCd() != null) {
			groupcharacteristicvaluecodeableconceptcoding.setCode(g.getGrpCrctrstcVlCdbleCncptCdgCd());
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgDsply() != null) {
			groupcharacteristicvaluecodeableconceptcoding.setDisplay(g.getGrpCrctrstcVlCdbleCncptCdgDsply());
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgSys() != null) {
			groupcharacteristicvaluecodeableconceptcoding.setSystem(g.getGrpCrctrstcVlCdbleCncptCdgSys());
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgUsrSltd() != null) {
			groupcharacteristicvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(g.getGrpCrctrstcVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgVrsn() != null) {
			groupcharacteristicvaluecodeableconceptcoding.setVersion(g.getGrpCrctrstcVlCdbleCncptCdgVrsn());
		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptTxt() != null) {
			groupcharacteristicvaluecodeableconcept.setText(g.getGrpCrctrstcVlCdbleCncptTxt());
		}
		/******************** groupcharacteristicvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		groupcharacteristic.setValue(groupcharacteristicvaluequantity);

		/******************** Grp_Crctrstc_VlQnty_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyCd() != null) {
			groupcharacteristicvaluequantity.setCode(g.getGrpCrctrstcVlQntyCd());
		}
		/******************** groupcharacteristicvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory groupcharacteristicvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		groupcharacteristicvaluequantity.setComparator(groupcharacteristicvaluequantitycomparator.fromCode(g.getGrpCrctrstcVlQntyCmprtr()));

		/******************** Grp_Crctrstc_VlQnty_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlQntySys() != null) {
			groupcharacteristicvaluequantity.setSystem(g.getGrpCrctrstcVlQntySys());
		}
		/******************** Grp_Crctrstc_VlQnty_Unt ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyUnt() != null) {
			groupcharacteristicvaluequantity.setUnit(g.getGrpCrctrstcVlQntyUnt());
		}
		/******************** Grp_Crctrstc_VlQnty_Vl ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyVl() != null) {
			groupcharacteristicvaluequantity.setValue(Double.parseDouble((g.getGrpCrctrstcVlQntyVl())));
		}
		/******************** groupcharacteristicvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range groupcharacteristicvaluerange =  new org.hl7.fhir.r4.model.Range();
		groupcharacteristic.setValue(groupcharacteristicvaluerange);

		/******************** groupcharacteristicvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		groupcharacteristicvaluerange.setHigh(groupcharacteristicvaluerangehigh);

		/******************** Grp_Crctrstc_VlRng_Hi_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiCd() != null) {
			groupcharacteristicvaluerangehigh.setCode(g.getGrpCrctrstcVlRngHiCd());
		}
		/******************** groupcharacteristicvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory groupcharacteristicvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		groupcharacteristicvaluerangehigh.setComparator(groupcharacteristicvaluerangehighcomparator.fromCode(g.getGrpCrctrstcVlRngHiCmprtr()));

		/******************** Grp_Crctrstc_VlRng_Hi_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiSys() != null) {
			groupcharacteristicvaluerangehigh.setSystem(g.getGrpCrctrstcVlRngHiSys());
		}
		/******************** Grp_Crctrstc_VlRng_Hi_Unt ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiUnt() != null) {
			groupcharacteristicvaluerangehigh.setUnit(g.getGrpCrctrstcVlRngHiUnt());
		}
		/******************** Grp_Crctrstc_VlRng_Hi_Vl ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiVl() != null) {
			groupcharacteristicvaluerangehigh.setValue(Double.parseDouble((g.getGrpCrctrstcVlRngHiVl())));
		}
		/******************** groupcharacteristicvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity groupcharacteristicvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		groupcharacteristicvaluerange.setLow(groupcharacteristicvaluerangelow);

		/******************** Grp_Crctrstc_VlRng_Lw_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwCd() != null) {
			groupcharacteristicvaluerangelow.setCode(g.getGrpCrctrstcVlRngLwCd());
		}
		/******************** groupcharacteristicvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory groupcharacteristicvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		groupcharacteristicvaluerangelow.setComparator(groupcharacteristicvaluerangelowcomparator.fromCode(g.getGrpCrctrstcVlRngLwCmprtr()));

		/******************** Grp_Crctrstc_VlRng_Lw_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwSys() != null) {
			groupcharacteristicvaluerangelow.setSystem(g.getGrpCrctrstcVlRngLwSys());
		}
		/******************** Grp_Crctrstc_VlRng_Lw_Unt ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwUnt() != null) {
			groupcharacteristicvaluerangelow.setUnit(g.getGrpCrctrstcVlRngLwUnt());
		}
		/******************** Grp_Crctrstc_VlRng_Lw_Vl ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwVl() != null) {
			groupcharacteristicvaluerangelow.setValue(Double.parseDouble((g.getGrpCrctrstcVlRngLwVl())));
		}
		/******************** Grp_Crctrstc_VlRfrnc ********************************************************************************/
		if(g.getGrpCrctrstcVlRfrnc() != null) {
			groupcharacteristic.setValue( new org.hl7.fhir.r4.model.Reference(g.getGrpCrctrstcVlRfrnc()));
		}
		/******************** groupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		group.setCode(groupcode);

		/******************** groupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupcodecoding =  new org.hl7.fhir.r4.model.Coding();
		groupcode.addCoding(groupcodecoding);

		/******************** Grp_Cd_Cdg_Cd ********************************************************************************/
		if(g.getGrpCdCdgCd() != null) {
			groupcodecoding.setCode(g.getGrpCdCdgCd());
		}
		/******************** Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(g.getGrpCdCdgDsply() != null) {
			groupcodecoding.setDisplay(g.getGrpCdCdgDsply());
		}
		/******************** Grp_Cd_Cdg_Sys ********************************************************************************/
		if(g.getGrpCdCdgSys() != null) {
			groupcodecoding.setSystem(g.getGrpCdCdgSys());
		}
		/******************** Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpCdCdgUsrSltd() != null) {
			groupcodecoding.setUserSelected(Boolean.parseBoolean(g.getGrpCdCdgUsrSltd()));
		}
		/******************** Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpCdCdgVrsn() != null) {
			groupcodecoding.setVersion(g.getGrpCdCdgVrsn());
		}
		/******************** Grp_Cd_Txt ********************************************************************************/
		if(g.getGrpCdTxt() != null) {
			groupcode.setText(g.getGrpCdTxt());
		}
		/******************** groupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier groupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		group.addIdentifier(groupidentifier);

		/******************** Grp_Id_Assigner ********************************************************************************/
		if(g.getGrpIdAssigner() != null) {
			groupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(g.getGrpIdAssigner()));
		}
		/******************** groupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		groupidentifier.setPeriod(groupidentifierperiod);

		/******************** Grp_Id_Prd_End ********************************************************************************/
		if(g.getGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat Grp_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Grp_Id_Prd_Enddate = Grp_Id_Prd_Endsdf.parse(g.getGrpIdPrdEnd());
			groupidentifierperiod.setEnd(Grp_Id_Prd_Enddate);
		}
		/******************** Grp_Id_Prd_Strt ********************************************************************************/
		if(g.getGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat Grp_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Grp_Id_Prd_Strtdate = Grp_Id_Prd_Strtsdf.parse(g.getGrpIdPrdStrt());
			groupidentifierperiod.setStart(Grp_Id_Prd_Strtdate);
		}
		/******************** Grp_Id_Sys ********************************************************************************/
		if(g.getGrpIdSys() != null) {
			groupidentifier.setSystem(g.getGrpIdSys());
		}
		/******************** groupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept groupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		groupidentifier.setType(groupidentifiertype);

		/******************** groupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding groupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		groupidentifiertype.addCoding(groupidentifiertypecoding);

		/******************** Grp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGrpIdTypCdgCd() != null) {
			groupidentifiertypecoding.setCode(g.getGrpIdTypCdgCd());
		}
		/******************** Grp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGrpIdTypCdgDsply() != null) {
			groupidentifiertypecoding.setDisplay(g.getGrpIdTypCdgDsply());
		}
		/******************** Grp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGrpIdTypCdgSys() != null) {
			groupidentifiertypecoding.setSystem(g.getGrpIdTypCdgSys());
		}
		/******************** Grp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpIdTypCdgUsrSltd() != null) {
			groupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(g.getGrpIdTypCdgUsrSltd()));
		}
		/******************** Grp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpIdTypCdgVrsn() != null) {
			groupidentifiertypecoding.setVersion(g.getGrpIdTypCdgVrsn());
		}
		/******************** Grp_Id_Typ_Txt ********************************************************************************/
		if(g.getGrpIdTypTxt() != null) {
			groupidentifiertype.setText(g.getGrpIdTypTxt());
		}
		/******************** groupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory groupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		groupidentifier.setUse(groupidentifieruse.fromCode(g.getGrpIdUse()));

		/******************** Grp_Id_Vl ********************************************************************************/
		if(g.getGrpIdVl() != null) {
			groupidentifier.setValue(g.getGrpIdVl());
		}
		/******************** Grp_ManagingEntity ********************************************************************************/
		if(g.getGrpManagingEntity() != null) {
			group.setManagingEntity( new org.hl7.fhir.r4.model.Reference(g.getGrpManagingEntity()));
		}
		/******************** groupmember ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupMemberComponent groupmember =  new org.hl7.fhir.r4.model.Group.GroupMemberComponent();
		group.addMember(groupmember);

		/******************** Grp_Mmbr_Entity ********************************************************************************/
		if(g.getGrpMmbrEntity() != null) {
			groupmember.setEntity( new org.hl7.fhir.r4.model.Reference(g.getGrpMmbrEntity()));
		}
		/******************** Grp_Mmbr_Inactive ********************************************************************************/
		if(g.getGrpMmbrInactive() != null) {
			groupmember.setInactive(Boolean.parseBoolean(g.getGrpMmbrInactive()));
		}
		/******************** groupmemberperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period groupmemberperiod =  new org.hl7.fhir.r4.model.Period();
		groupmember.setPeriod(groupmemberperiod);

		/******************** Grp_Mmbr_Prd_End ********************************************************************************/
		if(g.getGrpMmbrPrdEnd() != null) {
			java.text.SimpleDateFormat Grp_Mmbr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Grp_Mmbr_Prd_Enddate = Grp_Mmbr_Prd_Endsdf.parse(g.getGrpMmbrPrdEnd());
			groupmemberperiod.setEnd(Grp_Mmbr_Prd_Enddate);
		}
		/******************** Grp_Mmbr_Prd_Strt ********************************************************************************/
		if(g.getGrpMmbrPrdStrt() != null) {
			java.text.SimpleDateFormat Grp_Mmbr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Grp_Mmbr_Prd_Strtdate = Grp_Mmbr_Prd_Strtsdf.parse(g.getGrpMmbrPrdStrt());
			groupmemberperiod.setStart(Grp_Mmbr_Prd_Strtdate);
		}
		/******************** Grp_Nm ********************************************************************************/
		if(g.getGrpNm() != null) {
			group.setName(g.getGrpNm());
		}
		/******************** Grp_Qnty ********************************************************************************/
		if(g.getGrpQnty() != null) {
			group.setQuantity(Integer.parseInt(g.getGrpQnty()));
		}
		/******************** grouptype ********************************************************************************/
		org.hl7.fhir.r4.model.Group.GroupTypeEnumFactory grouptype =  new org.hl7.fhir.r4.model.Group.GroupTypeEnumFactory();
		group.setType(grouptype.fromCode(g.getGrpTyp()));

		return group;
	}
}
