package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceRequest;
public class DeviceRequestBidirectionalConversion 
{
	public DeviceRequest DeviceRequests(org.hl7.fhir.r4.model.DeviceRequest devicerequest) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceRequest d = new  main.java.com.campfhir.model.DeviceRequest();

		/******************** id ********************************************************************************/
		devicerequest.setId(d.getId());

		/******************** devicerequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.RequestPriority devicerequestpriority = devicerequest.getPriority();
		d.setDvcRqstPriority(devicerequestpriority.toCode());

		/******************** devicerequestcodecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestcodecodeableconcept = devicerequest.getCodeCodeableConcept();

		/******************** DvcRqst_CdCdbleCncpt_Txt ********************************************************************************/
		if(devicerequestcodecodeableconcept.hasText()) {
			d.setDvcRqstCdCdbleCncptTxt(String.valueOf(devicerequestcodecodeableconcept.getText()));
		}
		/******************** devicerequestcodecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestcodecodeableconceptcoding = devicerequestcodecodeableconcept.getCodingFirstRep();

		/******************** DvcRqst_CdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(devicerequestcodecodeableconceptcoding.hasVersion()) {
			d.setDvcRqstCdCdbleCncptCdgVrsn(String.valueOf(devicerequestcodecodeableconceptcoding.getVersion()));
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(devicerequestcodecodeableconceptcoding.hasDisplay()) {
			d.setDvcRqstCdCdbleCncptCdgDsply(String.valueOf(devicerequestcodecodeableconceptcoding.getDisplay()));
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(devicerequestcodecodeableconceptcoding.hasCode()) {
			d.setDvcRqstCdCdbleCncptCdgCd(String.valueOf(devicerequestcodecodeableconceptcoding.getCode()));
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestcodecodeableconceptcoding.hasUserSelected()) {
			d.setDvcRqstCdCdbleCncptCdgUsrSltd(String.valueOf(devicerequestcodecodeableconceptcoding.getUserSelected()));
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(devicerequestcodecodeableconceptcoding.hasSystem()) {
			d.setDvcRqstCdCdbleCncptCdgSys(String.valueOf(devicerequestcodecodeableconceptcoding.getSystem()));
		}
		/******************** DvcRqst_PriorRqst ********************************************************************************/
		if(devicerequest.hasPriorRequest()) {
			d.setDvcRqstPriorRqst(String.valueOf(devicerequest.getPriorRequestFirstRep()));
		}
		/******************** DvcRqst_Prfrmr ********************************************************************************/
		if(devicerequest.hasPerformer()) {
			d.setDvcRqstPrfrmr(String.valueOf(devicerequest.getPerformer()));
		}
		/******************** DvcRqst_Enc ********************************************************************************/
		if(devicerequest.hasEncounter()) {
			d.setDvcRqstEnc(String.valueOf(devicerequest.getEncounter()));
		}
		/******************** DvcRqst_Sbjct ********************************************************************************/
		if(devicerequest.hasSubject()) {
			d.setDvcRqstSbjct(String.valueOf(devicerequest.getSubject()));
		}
		/******************** devicerequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestStatus devicerequeststatus = devicerequest.getStatus();
		d.setDvcRqstSts(devicerequeststatus.toCode());

		/******************** DvcRqst_BasedOn ********************************************************************************/
		if(devicerequest.hasBasedOn()) {
			d.setDvcRqstBasedOn(String.valueOf(devicerequest.getBasedOnFirstRep()));
		}
		/******************** devicerequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation devicerequestnote = devicerequest.getNoteFirstRep();

		/******************** DvcRqst_Nt_Time ********************************************************************************/
		if(devicerequestnote.hasTime()) {
			d.setDvcRqstNtTime(String.valueOf(devicerequestnote.getTime()));
		}
		/******************** DvcRqst_Nt_Txt ********************************************************************************/
		if(devicerequestnote.hasText()) {
			d.setDvcRqstNtTxt(String.valueOf(devicerequestnote.getText()));
		}
		/******************** DvcRqst_Nt_AthrRfrnc ********************************************************************************/
		if(devicerequestnote.hasAuthorReference()) {
			d.setDvcRqstNtAthrRfrnc(String.valueOf(devicerequestnote.getAuthorReference()));
		}
		/******************** DvcRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(devicerequestnote.hasAuthorStringType()) {
			d.setDvcRqstNtAthrStrgTyp(String.valueOf(devicerequestnote.getAuthorStringType()));
		}
		/******************** devicerequestparameter ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent devicerequestparameter = devicerequest.getParameterFirstRep();

		/******************** devicerequestparametercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestparametercode = devicerequestparameter.getCode();

		/******************** DvcRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(devicerequestparametercode.hasText()) {
			d.setDvcRqstPrmtrCdTxt(String.valueOf(devicerequestparametercode.getText()));
		}
		/******************** devicerequestparametercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestparametercodecoding = devicerequestparametercode.getCodingFirstRep();

		/******************** DvcRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(devicerequestparametercodecoding.hasVersion()) {
			d.setDvcRqstPrmtrCdCdgVrsn(String.valueOf(devicerequestparametercodecoding.getVersion()));
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(devicerequestparametercodecoding.hasDisplay()) {
			d.setDvcRqstPrmtrCdCdgDsply(String.valueOf(devicerequestparametercodecoding.getDisplay()));
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(devicerequestparametercodecoding.hasCode()) {
			d.setDvcRqstPrmtrCdCdgCd(String.valueOf(devicerequestparametercodecoding.getCode()));
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestparametercodecoding.hasUserSelected()) {
			d.setDvcRqstPrmtrCdCdgUsrSltd(String.valueOf(devicerequestparametercodecoding.getUserSelected()));
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(devicerequestparametercodecoding.hasSystem()) {
			d.setDvcRqstPrmtrCdCdgSys(String.valueOf(devicerequestparametercodecoding.getSystem()));
		}
		/******************** DvcRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(devicerequestparameter.hasValueBooleanType()) {
			d.setDvcRqstPrmtrVlBooleanTyp(String.valueOf(devicerequestparameter.getValueBooleanType()));
		}
		/******************** devicerequestparametervaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestparametervaluecodeableconcept = devicerequestparameter.getValueCodeableConcept();

		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(devicerequestparametervaluecodeableconcept.hasText()) {
			d.setDvcRqstPrmtrVlCdbleCncptTxt(String.valueOf(devicerequestparametervaluecodeableconcept.getText()));
		}
		/******************** devicerequestparametervaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestparametervaluecodeableconceptcoding = devicerequestparametervaluecodeableconcept.getCodingFirstRep();

		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcoding.hasVersion()) {
			d.setDvcRqstPrmtrVlCdbleCncptCdgVrsn(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getVersion()));
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcoding.hasDisplay()) {
			d.setDvcRqstPrmtrVlCdbleCncptCdgDsply(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getDisplay()));
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcoding.hasCode()) {
			d.setDvcRqstPrmtrVlCdbleCncptCdgCd(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getCode()));
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcoding.hasUserSelected()) {
			d.setDvcRqstPrmtrVlCdbleCncptCdgUsrSltd(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcoding.hasSystem()) {
			d.setDvcRqstPrmtrVlCdbleCncptCdgSys(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getSystem()));
		}
		/******************** devicerequestparametervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluequantity = devicerequestparameter.getValueQuantity();

		/******************** DvcRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(devicerequestparametervaluequantity.hasValue()) {
			d.setDvcRqstPrmtrVlQntyVl(String.valueOf(devicerequestparametervaluequantity.getValue()));
		}
		/******************** devicerequestparametervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestparametervaluequantitycomparator = devicerequestparametervaluequantity.getComparator();
		d.setDvcRqstPrmtrVlQntyCmprtr(devicerequestparametervaluequantitycomparator.toCode());

		/******************** DvcRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(devicerequestparametervaluequantity.hasCode()) {
			d.setDvcRqstPrmtrVlQntyCd(String.valueOf(devicerequestparametervaluequantity.getCode()));
		}
		/******************** DvcRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(devicerequestparametervaluequantity.hasUnit()) {
			d.setDvcRqstPrmtrVlQntyUnt(String.valueOf(devicerequestparametervaluequantity.getUnit()));
		}
		/******************** DvcRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(devicerequestparametervaluequantity.hasSystem()) {
			d.setDvcRqstPrmtrVlQntySys(String.valueOf(devicerequestparametervaluequantity.getSystem()));
		}
		/******************** devicerequestparametervaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicerequestparametervaluerange = devicerequestparameter.getValueRange();

		/******************** devicerequestparametervaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluerangelow = devicerequestparametervaluerange.getLow();

		/******************** DvcRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(devicerequestparametervaluerangelow.hasValue()) {
			d.setDvcRqstPrmtrVlRngLwVl(String.valueOf(devicerequestparametervaluerangelow.getValue()));
		}
		/******************** devicerequestparametervaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestparametervaluerangelowcomparator = devicerequestparametervaluerangelow.getComparator();
		d.setDvcRqstPrmtrVlRngLwCmprtr(devicerequestparametervaluerangelowcomparator.toCode());

		/******************** DvcRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(devicerequestparametervaluerangelow.hasCode()) {
			d.setDvcRqstPrmtrVlRngLwCd(String.valueOf(devicerequestparametervaluerangelow.getCode()));
		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(devicerequestparametervaluerangelow.hasUnit()) {
			d.setDvcRqstPrmtrVlRngLwUnt(String.valueOf(devicerequestparametervaluerangelow.getUnit()));
		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(devicerequestparametervaluerangelow.hasSystem()) {
			d.setDvcRqstPrmtrVlRngLwSys(String.valueOf(devicerequestparametervaluerangelow.getSystem()));
		}
		/******************** devicerequestparametervaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluerangehigh = devicerequestparametervaluerange.getHigh();

		/******************** DvcRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(devicerequestparametervaluerangehigh.hasValue()) {
			d.setDvcRqstPrmtrVlRngHiVl(String.valueOf(devicerequestparametervaluerangehigh.getValue()));
		}
		/******************** devicerequestparametervaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestparametervaluerangehighcomparator = devicerequestparametervaluerangehigh.getComparator();
		d.setDvcRqstPrmtrVlRngHiCmprtr(devicerequestparametervaluerangehighcomparator.toCode());

		/******************** DvcRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(devicerequestparametervaluerangehigh.hasCode()) {
			d.setDvcRqstPrmtrVlRngHiCd(String.valueOf(devicerequestparametervaluerangehigh.getCode()));
		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(devicerequestparametervaluerangehigh.hasUnit()) {
			d.setDvcRqstPrmtrVlRngHiUnt(String.valueOf(devicerequestparametervaluerangehigh.getUnit()));
		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(devicerequestparametervaluerangehigh.hasSystem()) {
			d.setDvcRqstPrmtrVlRngHiSys(String.valueOf(devicerequestparametervaluerangehigh.getSystem()));
		}
		/******************** DvcRqst_AthredOn ********************************************************************************/
		if(devicerequest.hasAuthoredOn()) {
			d.setDvcRqstAthredOn(String.valueOf(devicerequest.getAuthoredOn()));
		}
		/******************** devicerequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.RequestIntent devicerequestintent = devicerequest.getIntent();
		d.setDvcRqstIntent(devicerequestintent.toCode());

		/******************** devicerequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicerequestgroupidentifier = devicerequest.getGroupIdentifier();

		/******************** DvcRqst_GrpId_Vl ********************************************************************************/
		if(devicerequestgroupidentifier.hasValue()) {
			d.setDvcRqstGrpIdVl(String.valueOf(devicerequestgroupidentifier.getValue()));
		}
		/******************** devicerequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestgroupidentifiertype = devicerequestgroupidentifier.getType();

		/******************** DvcRqst_GrpId_Typ_Txt ********************************************************************************/
		if(devicerequestgroupidentifiertype.hasText()) {
			d.setDvcRqstGrpIdTypTxt(String.valueOf(devicerequestgroupidentifiertype.getText()));
		}
		/******************** devicerequestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestgroupidentifiertypecoding = devicerequestgroupidentifiertype.getCodingFirstRep();

		/******************** DvcRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicerequestgroupidentifiertypecoding.hasVersion()) {
			d.setDvcRqstGrpIdTypCdgVrsn(String.valueOf(devicerequestgroupidentifiertypecoding.getVersion()));
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(devicerequestgroupidentifiertypecoding.hasDisplay()) {
			d.setDvcRqstGrpIdTypCdgDsply(String.valueOf(devicerequestgroupidentifiertypecoding.getDisplay()));
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(devicerequestgroupidentifiertypecoding.hasCode()) {
			d.setDvcRqstGrpIdTypCdgCd(String.valueOf(devicerequestgroupidentifiertypecoding.getCode()));
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestgroupidentifiertypecoding.hasUserSelected()) {
			d.setDvcRqstGrpIdTypCdgUsrSltd(String.valueOf(devicerequestgroupidentifiertypecoding.getUserSelected()));
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(devicerequestgroupidentifiertypecoding.hasSystem()) {
			d.setDvcRqstGrpIdTypCdgSys(String.valueOf(devicerequestgroupidentifiertypecoding.getSystem()));
		}
		/******************** devicerequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestgroupidentifierperiod = devicerequestgroupidentifier.getPeriod();

		/******************** DvcRqst_GrpId_Prd_Strt ********************************************************************************/
		if(devicerequestgroupidentifierperiod.hasStart()) {
			d.setDvcRqstGrpIdPrdStrt(String.valueOf(devicerequestgroupidentifierperiod.getStart()));
		}
		/******************** DvcRqst_GrpId_Prd_End ********************************************************************************/
		if(devicerequestgroupidentifierperiod.hasEnd()) {
			d.setDvcRqstGrpIdPrdEnd(String.valueOf(devicerequestgroupidentifierperiod.getEnd()));
		}
		/******************** DvcRqst_GrpId_Assigner ********************************************************************************/
		if(devicerequestgroupidentifier.hasAssigner()) {
			d.setDvcRqstGrpIdAssigner(String.valueOf(devicerequestgroupidentifier.getAssigner()));
		}
		/******************** DvcRqst_GrpId_Sys ********************************************************************************/
		if(devicerequestgroupidentifier.hasSystem()) {
			d.setDvcRqstGrpIdSys(String.valueOf(devicerequestgroupidentifier.getSystem()));
		}
		/******************** devicerequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicerequestgroupidentifieruse = devicerequestgroupidentifier.getUse();
		d.setDvcRqstGrpIdUse(devicerequestgroupidentifieruse.toCode());

		/******************** DvcRqst_SprtingInfo ********************************************************************************/
		if(devicerequest.hasSupportingInfo()) {
			d.setDvcRqstSprtingInfo(String.valueOf(devicerequest.getSupportingInfoFirstRep()));
		}
		/******************** DvcRqst_Insrnc ********************************************************************************/
		if(devicerequest.hasInsurance()) {
			d.setDvcRqstInsrnc(String.valueOf(devicerequest.getInsuranceFirstRep()));
		}
		/******************** devicerequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicerequestidentifier = devicerequest.getIdentifierFirstRep();

		/******************** DvcRqst_Id_Vl ********************************************************************************/
		if(devicerequestidentifier.hasValue()) {
			d.setDvcRqstIdVl(String.valueOf(devicerequestidentifier.getValue()));
		}
		/******************** devicerequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestidentifiertype = devicerequestidentifier.getType();

		/******************** DvcRqst_Id_Typ_Txt ********************************************************************************/
		if(devicerequestidentifiertype.hasText()) {
			d.setDvcRqstIdTypTxt(String.valueOf(devicerequestidentifiertype.getText()));
		}
		/******************** devicerequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestidentifiertypecoding = devicerequestidentifiertype.getCodingFirstRep();

		/******************** DvcRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicerequestidentifiertypecoding.hasVersion()) {
			d.setDvcRqstIdTypCdgVrsn(String.valueOf(devicerequestidentifiertypecoding.getVersion()));
		}
		/******************** DvcRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicerequestidentifiertypecoding.hasDisplay()) {
			d.setDvcRqstIdTypCdgDsply(String.valueOf(devicerequestidentifiertypecoding.getDisplay()));
		}
		/******************** DvcRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicerequestidentifiertypecoding.hasCode()) {
			d.setDvcRqstIdTypCdgCd(String.valueOf(devicerequestidentifiertypecoding.getCode()));
		}
		/******************** DvcRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestidentifiertypecoding.hasUserSelected()) {
			d.setDvcRqstIdTypCdgUsrSltd(String.valueOf(devicerequestidentifiertypecoding.getUserSelected()));
		}
		/******************** DvcRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicerequestidentifiertypecoding.hasSystem()) {
			d.setDvcRqstIdTypCdgSys(String.valueOf(devicerequestidentifiertypecoding.getSystem()));
		}
		/******************** devicerequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestidentifierperiod = devicerequestidentifier.getPeriod();

		/******************** DvcRqst_Id_Prd_Strt ********************************************************************************/
		if(devicerequestidentifierperiod.hasStart()) {
			d.setDvcRqstIdPrdStrt(String.valueOf(devicerequestidentifierperiod.getStart()));
		}
		/******************** DvcRqst_Id_Prd_End ********************************************************************************/
		if(devicerequestidentifierperiod.hasEnd()) {
			d.setDvcRqstIdPrdEnd(String.valueOf(devicerequestidentifierperiod.getEnd()));
		}
		/******************** DvcRqst_Id_Assigner ********************************************************************************/
		if(devicerequestidentifier.hasAssigner()) {
			d.setDvcRqstIdAssigner(String.valueOf(devicerequestidentifier.getAssigner()));
		}
		/******************** DvcRqst_Id_Sys ********************************************************************************/
		if(devicerequestidentifier.hasSystem()) {
			d.setDvcRqstIdSys(String.valueOf(devicerequestidentifier.getSystem()));
		}
		/******************** devicerequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicerequestidentifieruse = devicerequestidentifier.getUse();
		d.setDvcRqstIdUse(devicerequestidentifieruse.toCode());

		/******************** devicerequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestreasoncode = devicerequest.getReasonCodeFirstRep();

		/******************** DvcRqst_RsnCd_Txt ********************************************************************************/
		if(devicerequestreasoncode.hasText()) {
			d.setDvcRqstRsnCdTxt(String.valueOf(devicerequestreasoncode.getText()));
		}
		/******************** devicerequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestreasoncodecoding = devicerequestreasoncode.getCodingFirstRep();

		/******************** DvcRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(devicerequestreasoncodecoding.hasVersion()) {
			d.setDvcRqstRsnCdCdgVrsn(String.valueOf(devicerequestreasoncodecoding.getVersion()));
		}
		/******************** DvcRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(devicerequestreasoncodecoding.hasDisplay()) {
			d.setDvcRqstRsnCdCdgDsply(String.valueOf(devicerequestreasoncodecoding.getDisplay()));
		}
		/******************** DvcRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(devicerequestreasoncodecoding.hasCode()) {
			d.setDvcRqstRsnCdCdgCd(String.valueOf(devicerequestreasoncodecoding.getCode()));
		}
		/******************** DvcRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestreasoncodecoding.hasUserSelected()) {
			d.setDvcRqstRsnCdCdgUsrSltd(String.valueOf(devicerequestreasoncodecoding.getUserSelected()));
		}
		/******************** DvcRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(devicerequestreasoncodecoding.hasSystem()) {
			d.setDvcRqstRsnCdCdgSys(String.valueOf(devicerequestreasoncodecoding.getSystem()));
		}
		/******************** DvcRqst_RsnRfrnc ********************************************************************************/
		if(devicerequest.hasReasonReference()) {
			d.setDvcRqstRsnRfrnc(String.valueOf(devicerequest.getReasonReferenceFirstRep()));
		}
		/******************** devicerequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestperformertype = devicerequest.getPerformerType();

		/******************** DvcRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(devicerequestperformertype.hasText()) {
			d.setDvcRqstPrfrmrTypTxt(String.valueOf(devicerequestperformertype.getText()));
		}
		/******************** devicerequestperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestperformertypecoding = devicerequestperformertype.getCodingFirstRep();

		/******************** DvcRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(devicerequestperformertypecoding.hasVersion()) {
			d.setDvcRqstPrfrmrTypCdgVrsn(String.valueOf(devicerequestperformertypecoding.getVersion()));
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(devicerequestperformertypecoding.hasDisplay()) {
			d.setDvcRqstPrfrmrTypCdgDsply(String.valueOf(devicerequestperformertypecoding.getDisplay()));
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(devicerequestperformertypecoding.hasCode()) {
			d.setDvcRqstPrfrmrTypCdgCd(String.valueOf(devicerequestperformertypecoding.getCode()));
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestperformertypecoding.hasUserSelected()) {
			d.setDvcRqstPrfrmrTypCdgUsrSltd(String.valueOf(devicerequestperformertypecoding.getUserSelected()));
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(devicerequestperformertypecoding.hasSystem()) {
			d.setDvcRqstPrfrmrTypCdgSys(String.valueOf(devicerequestperformertypecoding.getSystem()));
		}
		/******************** DvcRqst_Rqster ********************************************************************************/
		if(devicerequest.hasRequester()) {
			d.setDvcRqstRqster(String.valueOf(devicerequest.getRequester()));
		}
		/******************** DvcRqst_CdRfrnc ********************************************************************************/
		if(devicerequest.hasCodeReference()) {
			d.setDvcRqstCdRfrnc(String.valueOf(devicerequest.getCodeReference()));
		}
		/******************** devicerequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestoccurrenceperiod = devicerequest.getOccurrencePeriod();

		/******************** DvcRqst_OccrncePrd_Strt ********************************************************************************/
		if(devicerequestoccurrenceperiod.hasStart()) {
			d.setDvcRqstOccrncePrdStrt(String.valueOf(devicerequestoccurrenceperiod.getStart()));
		}
		/******************** DvcRqst_OccrncePrd_End ********************************************************************************/
		if(devicerequestoccurrenceperiod.hasEnd()) {
			d.setDvcRqstOccrncePrdEnd(String.valueOf(devicerequestoccurrenceperiod.getEnd()));
		}
		/******************** DvcRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(devicerequest.hasOccurrenceDateTimeType()) {
			d.setDvcRqstOccrnceDtTimeTyp(String.valueOf(devicerequest.getOccurrenceDateTimeType()));
		}
		/******************** DvcRqst_RelevantHis ********************************************************************************/
		if(devicerequest.hasRelevantHistory()) {
			d.setDvcRqstRelevantHis(String.valueOf(devicerequest.getRelevantHistoryFirstRep()));
		}
		/******************** devicerequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing devicerequestoccurrencetiming = devicerequest.getOccurrenceTiming();

		/******************** devicerequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestoccurrencetimingcode = devicerequestoccurrencetiming.getCode();

		/******************** DvcRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(devicerequestoccurrencetimingcode.hasText()) {
			d.setDvcRqstOccrnceTmgCdTxt(String.valueOf(devicerequestoccurrencetimingcode.getText()));
		}
		/******************** devicerequestoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestoccurrencetimingcodecoding = devicerequestoccurrencetimingcode.getCodingFirstRep();

		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(devicerequestoccurrencetimingcodecoding.hasVersion()) {
			d.setDvcRqstOccrnceTmgCdCdgVrsn(String.valueOf(devicerequestoccurrencetimingcodecoding.getVersion()));
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(devicerequestoccurrencetimingcodecoding.hasDisplay()) {
			d.setDvcRqstOccrnceTmgCdCdgDsply(String.valueOf(devicerequestoccurrencetimingcodecoding.getDisplay()));
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingcodecoding.hasCode()) {
			d.setDvcRqstOccrnceTmgCdCdgCd(String.valueOf(devicerequestoccurrencetimingcodecoding.getCode()));
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestoccurrencetimingcodecoding.hasUserSelected()) {
			d.setDvcRqstOccrnceTmgCdCdgUsrSltd(String.valueOf(devicerequestoccurrencetimingcodecoding.getUserSelected()));
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingcodecoding.hasSystem()) {
			d.setDvcRqstOccrnceTmgCdCdgSys(String.valueOf(devicerequestoccurrencetimingcodecoding.getSystem()));
		}
		/******************** devicerequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent devicerequestoccurrencetimingrepeat = devicerequestoccurrencetiming.getRepeat();

		/******************** DvcRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasOffset()) {
			d.setDvcRqstOccrnceTmgRptOff(String.valueOf(devicerequestoccurrencetimingrepeat.getOffset()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasCount()) {
			d.setDvcRqstOccrnceTmgRptCnt(String.valueOf(devicerequestoccurrencetimingrepeat.getCount()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasFrequency()) {
			d.setDvcRqstOccrnceTmgRptFrqncy(String.valueOf(devicerequestoccurrencetimingrepeat.getFrequency()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasPeriod()) {
			d.setDvcRqstOccrnceTmgRptPrd(String.valueOf(devicerequestoccurrencetimingrepeat.getPeriod()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasDuration()) {
			d.setDvcRqstOccrnceTmgRptDuration(String.valueOf(devicerequestoccurrencetimingrepeat.getDuration()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration devicerequestoccurrencetimingrepeatboundsduration = devicerequestoccurrencetimingrepeat.getBoundsDuration();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasValue()) {
			d.setDvcRqstOccrnceTmgRptBndsDurationVl(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getValue()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestoccurrencetimingrepeatboundsdurationcomparator = devicerequestoccurrencetimingrepeatboundsduration.getComparator();
		d.setDvcRqstOccrnceTmgRptBndsDurationCmprtr(devicerequestoccurrencetimingrepeatboundsdurationcomparator.toCode());

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasCode()) {
			d.setDvcRqstOccrnceTmgRptBndsDurationCd(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getCode()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasUnit()) {
			d.setDvcRqstOccrnceTmgRptBndsDurationUnt(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getUnit()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasSystem()) {
			d.setDvcRqstOccrnceTmgRptBndsDurationSys(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getSystem()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicerequestoccurrencetimingrepeatboundsrange = devicerequestoccurrencetimingrepeat.getBoundsRange();

		/******************** devicerequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestoccurrencetimingrepeatboundsrangelow = devicerequestoccurrencetimingrepeatboundsrange.getLow();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasValue()) {
			d.setDvcRqstOccrnceTmgRptBndsRngLwVl(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getValue()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestoccurrencetimingrepeatboundsrangelowcomparator = devicerequestoccurrencetimingrepeatboundsrangelow.getComparator();
		d.setDvcRqstOccrnceTmgRptBndsRngLwCmprtr(devicerequestoccurrencetimingrepeatboundsrangelowcomparator.toCode());

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasCode()) {
			d.setDvcRqstOccrnceTmgRptBndsRngLwCd(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getCode()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasUnit()) {
			d.setDvcRqstOccrnceTmgRptBndsRngLwUnt(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasSystem()) {
			d.setDvcRqstOccrnceTmgRptBndsRngLwSys(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestoccurrencetimingrepeatboundsrangehigh = devicerequestoccurrencetimingrepeatboundsrange.getHigh();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasValue()) {
			d.setDvcRqstOccrnceTmgRptBndsRngHiVl(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestoccurrencetimingrepeatboundsrangehighcomparator = devicerequestoccurrencetimingrepeatboundsrangehigh.getComparator();
		d.setDvcRqstOccrnceTmgRptBndsRngHiCmprtr(devicerequestoccurrencetimingrepeatboundsrangehighcomparator.toCode());

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasCode()) {
			d.setDvcRqstOccrnceTmgRptBndsRngHiCd(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasUnit()) {
			d.setDvcRqstOccrnceTmgRptBndsRngHiUnt(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasSystem()) {
			d.setDvcRqstOccrnceTmgRptBndsRngHiSys(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestoccurrencetimingrepeatboundsperiod = devicerequestoccurrencetimingrepeat.getBoundsPeriod();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsperiod.hasStart()) {
			d.setDvcRqstOccrnceTmgRptBndsPrdStrt(String.valueOf(devicerequestoccurrencetimingrepeatboundsperiod.getStart()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsperiod.hasEnd()) {
			d.setDvcRqstOccrnceTmgRptBndsPrdEnd(String.valueOf(devicerequestoccurrencetimingrepeatboundsperiod.getEnd()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasPeriodMax()) {
			d.setDvcRqstOccrnceTmgRptPrdMx(String.valueOf(devicerequestoccurrencetimingrepeat.getPeriodMax()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasDurationMax()) {
			d.setDvcRqstOccrnceTmgRptDurationMx(String.valueOf(devicerequestoccurrencetimingrepeat.getDurationMax()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasCountMax()) {
			d.setDvcRqstOccrnceTmgRptCntMx(String.valueOf(devicerequestoccurrencetimingrepeat.getCountMax()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasFrequencyMax()) {
			d.setDvcRqstOccrnceTmgRptFrqncyMx(String.valueOf(devicerequestoccurrencetimingrepeat.getFrequencyMax()));
		}
		/******************** devicerequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicerequestoccurrencetimingrepeatdurationunit = devicerequestoccurrencetimingrepeat.getDurationUnit();
		d.setDvcRqstOccrnceTmgRptDurationUnt(devicerequestoccurrencetimingrepeatdurationunit.toCode());

		/******************** devicerequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicerequestoccurrencetimingrepeatperiodunit = devicerequestoccurrencetimingrepeat.getPeriodUnit();
		d.setDvcRqstOccrnceTmgRptPrdUnt(devicerequestoccurrencetimingrepeatperiodunit.toCode());

		return d;
	}
}
