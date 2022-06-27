package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ServiceRequest;
public class ServiceRequestBidirectionalConversion 
{
	public ServiceRequest ServiceRequests(org.hl7.fhir.r4.model.ServiceRequest servicerequest) throws ParseException
	{
		 main.java.com.campfhir.model.ServiceRequest s = new  main.java.com.campfhir.model.ServiceRequest();

		/******************** id ********************************************************************************/
		servicerequest.setId(s.getId());

		/******************** servicerequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestPriority servicerequestpriority = servicerequest.getPriority();
		s.setSrvRqstPriority(servicerequestpriority.toCode());

		/******************** servicerequestcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestcode = servicerequest.getCode();

		/******************** SrvRqst_Cd_Txt ********************************************************************************/
		if(servicerequestcode.hasText()) {
			s.setSrvRqstCdTxt(String.valueOf(servicerequestcode.getText()));
		}
		/******************** servicerequestcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestcodecoding = servicerequestcode.getCodingFirstRep();

		/******************** SrvRqst_Cd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestcodecoding.hasVersion()) {
			s.setSrvRqstCdCdgVrsn(String.valueOf(servicerequestcodecoding.getVersion()));
		}
		/******************** SrvRqst_Cd_Cdg_Dsply ********************************************************************************/
		if(servicerequestcodecoding.hasDisplay()) {
			s.setSrvRqstCdCdgDsply(String.valueOf(servicerequestcodecoding.getDisplay()));
		}
		/******************** SrvRqst_Cd_Cdg_Cd ********************************************************************************/
		if(servicerequestcodecoding.hasCode()) {
			s.setSrvRqstCdCdgCd(String.valueOf(servicerequestcodecoding.getCode()));
		}
		/******************** SrvRqst_Cd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestcodecoding.hasUserSelected()) {
			s.setSrvRqstCdCdgUsrSltd(String.valueOf(servicerequestcodecoding.getUserSelected()));
		}
		/******************** SrvRqst_Cd_Cdg_Sys ********************************************************************************/
		if(servicerequestcodecoding.hasSystem()) {
			s.setSrvRqstCdCdgSys(String.valueOf(servicerequestcodecoding.getSystem()));
		}
		/******************** servicerequestasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestasneededcodeableconcept = servicerequest.getAsNeededCodeableConcept();

		/******************** SrvRqst_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(servicerequestasneededcodeableconcept.hasText()) {
			s.setSrvRqstAsNdCdbleCncptTxt(String.valueOf(servicerequestasneededcodeableconcept.getText()));
		}
		/******************** servicerequestasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestasneededcodeableconceptcoding = servicerequestasneededcodeableconcept.getCodingFirstRep();

		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(servicerequestasneededcodeableconceptcoding.hasVersion()) {
			s.setSrvRqstAsNdCdbleCncptCdgVrsn(String.valueOf(servicerequestasneededcodeableconceptcoding.getVersion()));
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(servicerequestasneededcodeableconceptcoding.hasDisplay()) {
			s.setSrvRqstAsNdCdbleCncptCdgDsply(String.valueOf(servicerequestasneededcodeableconceptcoding.getDisplay()));
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(servicerequestasneededcodeableconceptcoding.hasCode()) {
			s.setSrvRqstAsNdCdbleCncptCdgCd(String.valueOf(servicerequestasneededcodeableconceptcoding.getCode()));
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestasneededcodeableconceptcoding.hasUserSelected()) {
			s.setSrvRqstAsNdCdbleCncptCdgUsrSltd(String.valueOf(servicerequestasneededcodeableconceptcoding.getUserSelected()));
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(servicerequestasneededcodeableconceptcoding.hasSystem()) {
			s.setSrvRqstAsNdCdbleCncptCdgSys(String.valueOf(servicerequestasneededcodeableconceptcoding.getSystem()));
		}
		/******************** servicerequestlocationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestlocationcode = servicerequest.getLocationCodeFirstRep();

		/******************** SrvRqst_LctnCd_Txt ********************************************************************************/
		if(servicerequestlocationcode.hasText()) {
			s.setSrvRqstLctnCdTxt(String.valueOf(servicerequestlocationcode.getText()));
		}
		/******************** servicerequestlocationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestlocationcodecoding = servicerequestlocationcode.getCodingFirstRep();

		/******************** SrvRqst_LctnCd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestlocationcodecoding.hasVersion()) {
			s.setSrvRqstLctnCdCdgVrsn(String.valueOf(servicerequestlocationcodecoding.getVersion()));
		}
		/******************** SrvRqst_LctnCd_Cdg_Dsply ********************************************************************************/
		if(servicerequestlocationcodecoding.hasDisplay()) {
			s.setSrvRqstLctnCdCdgDsply(String.valueOf(servicerequestlocationcodecoding.getDisplay()));
		}
		/******************** SrvRqst_LctnCd_Cdg_Cd ********************************************************************************/
		if(servicerequestlocationcodecoding.hasCode()) {
			s.setSrvRqstLctnCdCdgCd(String.valueOf(servicerequestlocationcodecoding.getCode()));
		}
		/******************** SrvRqst_LctnCd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestlocationcodecoding.hasUserSelected()) {
			s.setSrvRqstLctnCdCdgUsrSltd(String.valueOf(servicerequestlocationcodecoding.getUserSelected()));
		}
		/******************** SrvRqst_LctnCd_Cdg_Sys ********************************************************************************/
		if(servicerequestlocationcodecoding.hasSystem()) {
			s.setSrvRqstLctnCdCdgSys(String.valueOf(servicerequestlocationcodecoding.getSystem()));
		}
		/******************** SrvRqst_AsNdBooleanTyp ********************************************************************************/
		if(servicerequest.hasAsNeededBooleanType()) {
			s.setSrvRqstAsNdBooleanTyp(String.valueOf(servicerequest.getAsNeededBooleanType()));
		}
		/******************** SrvRqst_LctnRfrnc ********************************************************************************/
		if(servicerequest.hasLocationReference()) {
			s.setSrvRqstLctnRfrnc(String.valueOf(servicerequest.getLocationReferenceFirstRep()));
		}
		/******************** servicerequestorderdetail ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestorderdetail = servicerequest.getOrderDetailFirstRep();

		/******************** SrvRqst_OrdrDtl_Txt ********************************************************************************/
		if(servicerequestorderdetail.hasText()) {
			s.setSrvRqstOrdrDtlTxt(String.valueOf(servicerequestorderdetail.getText()));
		}
		/******************** servicerequestorderdetailcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestorderdetailcoding = servicerequestorderdetail.getCodingFirstRep();

		/******************** SrvRqst_OrdrDtl_Cdg_Vrsn ********************************************************************************/
		if(servicerequestorderdetailcoding.hasVersion()) {
			s.setSrvRqstOrdrDtlCdgVrsn(String.valueOf(servicerequestorderdetailcoding.getVersion()));
		}
		/******************** SrvRqst_OrdrDtl_Cdg_Dsply ********************************************************************************/
		if(servicerequestorderdetailcoding.hasDisplay()) {
			s.setSrvRqstOrdrDtlCdgDsply(String.valueOf(servicerequestorderdetailcoding.getDisplay()));
		}
		/******************** SrvRqst_OrdrDtl_Cdg_Cd ********************************************************************************/
		if(servicerequestorderdetailcoding.hasCode()) {
			s.setSrvRqstOrdrDtlCdgCd(String.valueOf(servicerequestorderdetailcoding.getCode()));
		}
		/******************** SrvRqst_OrdrDtl_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestorderdetailcoding.hasUserSelected()) {
			s.setSrvRqstOrdrDtlCdgUsrSltd(String.valueOf(servicerequestorderdetailcoding.getUserSelected()));
		}
		/******************** SrvRqst_OrdrDtl_Cdg_Sys ********************************************************************************/
		if(servicerequestorderdetailcoding.hasSystem()) {
			s.setSrvRqstOrdrDtlCdgSys(String.valueOf(servicerequestorderdetailcoding.getSystem()));
		}
		/******************** servicerequestquantityquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityquantity = servicerequest.getQuantityQuantity();

		/******************** SrvRqst_QntyQnty_Vl ********************************************************************************/
		if(servicerequestquantityquantity.hasValue()) {
			s.setSrvRqstQntyQntyVl(String.valueOf(servicerequestquantityquantity.getValue()));
		}
		/******************** servicerequestquantityquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityquantitycomparator = servicerequestquantityquantity.getComparator();
		s.setSrvRqstQntyQntyCmprtr(servicerequestquantityquantitycomparator.toCode());

		/******************** SrvRqst_QntyQnty_Cd ********************************************************************************/
		if(servicerequestquantityquantity.hasCode()) {
			s.setSrvRqstQntyQntyCd(String.valueOf(servicerequestquantityquantity.getCode()));
		}
		/******************** SrvRqst_QntyQnty_Unt ********************************************************************************/
		if(servicerequestquantityquantity.hasUnit()) {
			s.setSrvRqstQntyQntyUnt(String.valueOf(servicerequestquantityquantity.getUnit()));
		}
		/******************** SrvRqst_QntyQnty_Sys ********************************************************************************/
		if(servicerequestquantityquantity.hasSystem()) {
			s.setSrvRqstQntyQntySys(String.valueOf(servicerequestquantityquantity.getSystem()));
		}
		/******************** SrvRqst_Enc ********************************************************************************/
		if(servicerequest.hasEncounter()) {
			s.setSrvRqstEnc(String.valueOf(servicerequest.getEncounter()));
		}
		/******************** SrvRqst_Sbjct ********************************************************************************/
		if(servicerequest.hasSubject()) {
			s.setSrvRqstSbjct(String.valueOf(servicerequest.getSubject()));
		}
		/******************** servicerequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestStatus servicerequeststatus = servicerequest.getStatus();
		s.setSrvRqstSts(servicerequeststatus.toCode());

		/******************** SrvRqst_BasedOn ********************************************************************************/
		if(servicerequest.hasBasedOn()) {
			s.setSrvRqstBasedOn(String.valueOf(servicerequest.getBasedOnFirstRep()));
		}
		/******************** servicerequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation servicerequestnote = servicerequest.getNoteFirstRep();

		/******************** SrvRqst_Nt_Time ********************************************************************************/
		if(servicerequestnote.hasTime()) {
			s.setSrvRqstNtTime(String.valueOf(servicerequestnote.getTime()));
		}
		/******************** SrvRqst_Nt_Txt ********************************************************************************/
		if(servicerequestnote.hasText()) {
			s.setSrvRqstNtTxt(String.valueOf(servicerequestnote.getText()));
		}
		/******************** SrvRqst_Nt_AthrRfrnc ********************************************************************************/
		if(servicerequestnote.hasAuthorReference()) {
			s.setSrvRqstNtAthrRfrnc(String.valueOf(servicerequestnote.getAuthorReference()));
		}
		/******************** SrvRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(servicerequestnote.hasAuthorStringType()) {
			s.setSrvRqstNtAthrStrgTyp(String.valueOf(servicerequestnote.getAuthorStringType()));
		}
		/******************** servicerequestrequisition ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier servicerequestrequisition = servicerequest.getRequisition();

		/******************** SrvRqst_Requisition_Vl ********************************************************************************/
		if(servicerequestrequisition.hasValue()) {
			s.setSrvRqstRequisitionVl(String.valueOf(servicerequestrequisition.getValue()));
		}
		/******************** servicerequestrequisitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestrequisitiontype = servicerequestrequisition.getType();

		/******************** SrvRqst_Requisition_Typ_Txt ********************************************************************************/
		if(servicerequestrequisitiontype.hasText()) {
			s.setSrvRqstRequisitionTypTxt(String.valueOf(servicerequestrequisitiontype.getText()));
		}
		/******************** servicerequestrequisitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestrequisitiontypecoding = servicerequestrequisitiontype.getCodingFirstRep();

		/******************** SrvRqst_Requisition_Typ_Cdg_Vrsn ********************************************************************************/
		if(servicerequestrequisitiontypecoding.hasVersion()) {
			s.setSrvRqstRequisitionTypCdgVrsn(String.valueOf(servicerequestrequisitiontypecoding.getVersion()));
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Dsply ********************************************************************************/
		if(servicerequestrequisitiontypecoding.hasDisplay()) {
			s.setSrvRqstRequisitionTypCdgDsply(String.valueOf(servicerequestrequisitiontypecoding.getDisplay()));
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Cd ********************************************************************************/
		if(servicerequestrequisitiontypecoding.hasCode()) {
			s.setSrvRqstRequisitionTypCdgCd(String.valueOf(servicerequestrequisitiontypecoding.getCode()));
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestrequisitiontypecoding.hasUserSelected()) {
			s.setSrvRqstRequisitionTypCdgUsrSltd(String.valueOf(servicerequestrequisitiontypecoding.getUserSelected()));
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Sys ********************************************************************************/
		if(servicerequestrequisitiontypecoding.hasSystem()) {
			s.setSrvRqstRequisitionTypCdgSys(String.valueOf(servicerequestrequisitiontypecoding.getSystem()));
		}
		/******************** servicerequestrequisitionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestrequisitionperiod = servicerequestrequisition.getPeriod();

		/******************** SrvRqst_Requisition_Prd_Strt ********************************************************************************/
		if(servicerequestrequisitionperiod.hasStart()) {
			s.setSrvRqstRequisitionPrdStrt(String.valueOf(servicerequestrequisitionperiod.getStart()));
		}
		/******************** SrvRqst_Requisition_Prd_End ********************************************************************************/
		if(servicerequestrequisitionperiod.hasEnd()) {
			s.setSrvRqstRequisitionPrdEnd(String.valueOf(servicerequestrequisitionperiod.getEnd()));
		}
		/******************** SrvRqst_Requisition_Assigner ********************************************************************************/
		if(servicerequestrequisition.hasAssigner()) {
			s.setSrvRqstRequisitionAssigner(String.valueOf(servicerequestrequisition.getAssigner()));
		}
		/******************** SrvRqst_Requisition_Sys ********************************************************************************/
		if(servicerequestrequisition.hasSystem()) {
			s.setSrvRqstRequisitionSys(String.valueOf(servicerequestrequisition.getSystem()));
		}
		/******************** servicerequestrequisitionuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse servicerequestrequisitionuse = servicerequestrequisition.getUse();
		s.setSrvRqstRequisitionUse(servicerequestrequisitionuse.toCode());

		/******************** servicerequestquantityratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio servicerequestquantityratio = servicerequest.getQuantityRatio();

		/******************** servicerequestquantityratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityratiodenominator = servicerequestquantityratio.getDenominator();

		/******************** SrvRqst_QntyRtio_Dnmntr_Vl ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasValue()) {
			s.setSrvRqstQntyRtioDnmntrVl(String.valueOf(servicerequestquantityratiodenominator.getValue()));
		}
		/******************** servicerequestquantityratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityratiodenominatorcomparator = servicerequestquantityratiodenominator.getComparator();
		s.setSrvRqstQntyRtioDnmntrCmprtr(servicerequestquantityratiodenominatorcomparator.toCode());

		/******************** SrvRqst_QntyRtio_Dnmntr_Cd ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasCode()) {
			s.setSrvRqstQntyRtioDnmntrCd(String.valueOf(servicerequestquantityratiodenominator.getCode()));
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Unt ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasUnit()) {
			s.setSrvRqstQntyRtioDnmntrUnt(String.valueOf(servicerequestquantityratiodenominator.getUnit()));
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Sys ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasSystem()) {
			s.setSrvRqstQntyRtioDnmntrSys(String.valueOf(servicerequestquantityratiodenominator.getSystem()));
		}
		/******************** servicerequestquantityrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrationumerator = servicerequestquantityratio.getNumerator();

		/******************** SrvRqst_QntyRtio_Nmrtr_Vl ********************************************************************************/
		if(servicerequestquantityrationumerator.hasValue()) {
			s.setSrvRqstQntyRtioNmrtrVl(String.valueOf(servicerequestquantityrationumerator.getValue()));
		}
		/******************** servicerequestquantityrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityrationumeratorcomparator = servicerequestquantityrationumerator.getComparator();
		s.setSrvRqstQntyRtioNmrtrCmprtr(servicerequestquantityrationumeratorcomparator.toCode());

		/******************** SrvRqst_QntyRtio_Nmrtr_Cd ********************************************************************************/
		if(servicerequestquantityrationumerator.hasCode()) {
			s.setSrvRqstQntyRtioNmrtrCd(String.valueOf(servicerequestquantityrationumerator.getCode()));
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Unt ********************************************************************************/
		if(servicerequestquantityrationumerator.hasUnit()) {
			s.setSrvRqstQntyRtioNmrtrUnt(String.valueOf(servicerequestquantityrationumerator.getUnit()));
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Sys ********************************************************************************/
		if(servicerequestquantityrationumerator.hasSystem()) {
			s.setSrvRqstQntyRtioNmrtrSys(String.valueOf(servicerequestquantityrationumerator.getSystem()));
		}
		/******************** servicerequestquantityrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range servicerequestquantityrange = servicerequest.getQuantityRange();

		/******************** servicerequestquantityrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrangelow = servicerequestquantityrange.getLow();

		/******************** SrvRqst_QntyRng_Lw_Vl ********************************************************************************/
		if(servicerequestquantityrangelow.hasValue()) {
			s.setSrvRqstQntyRngLwVl(String.valueOf(servicerequestquantityrangelow.getValue()));
		}
		/******************** servicerequestquantityrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityrangelowcomparator = servicerequestquantityrangelow.getComparator();
		s.setSrvRqstQntyRngLwCmprtr(servicerequestquantityrangelowcomparator.toCode());

		/******************** SrvRqst_QntyRng_Lw_Cd ********************************************************************************/
		if(servicerequestquantityrangelow.hasCode()) {
			s.setSrvRqstQntyRngLwCd(String.valueOf(servicerequestquantityrangelow.getCode()));
		}
		/******************** SrvRqst_QntyRng_Lw_Unt ********************************************************************************/
		if(servicerequestquantityrangelow.hasUnit()) {
			s.setSrvRqstQntyRngLwUnt(String.valueOf(servicerequestquantityrangelow.getUnit()));
		}
		/******************** SrvRqst_QntyRng_Lw_Sys ********************************************************************************/
		if(servicerequestquantityrangelow.hasSystem()) {
			s.setSrvRqstQntyRngLwSys(String.valueOf(servicerequestquantityrangelow.getSystem()));
		}
		/******************** servicerequestquantityrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrangehigh = servicerequestquantityrange.getHigh();

		/******************** SrvRqst_QntyRng_Hi_Vl ********************************************************************************/
		if(servicerequestquantityrangehigh.hasValue()) {
			s.setSrvRqstQntyRngHiVl(String.valueOf(servicerequestquantityrangehigh.getValue()));
		}
		/******************** servicerequestquantityrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityrangehighcomparator = servicerequestquantityrangehigh.getComparator();
		s.setSrvRqstQntyRngHiCmprtr(servicerequestquantityrangehighcomparator.toCode());

		/******************** SrvRqst_QntyRng_Hi_Cd ********************************************************************************/
		if(servicerequestquantityrangehigh.hasCode()) {
			s.setSrvRqstQntyRngHiCd(String.valueOf(servicerequestquantityrangehigh.getCode()));
		}
		/******************** SrvRqst_QntyRng_Hi_Unt ********************************************************************************/
		if(servicerequestquantityrangehigh.hasUnit()) {
			s.setSrvRqstQntyRngHiUnt(String.valueOf(servicerequestquantityrangehigh.getUnit()));
		}
		/******************** SrvRqst_QntyRng_Hi_Sys ********************************************************************************/
		if(servicerequestquantityrangehigh.hasSystem()) {
			s.setSrvRqstQntyRngHiSys(String.valueOf(servicerequestquantityrangehigh.getSystem()));
		}
		/******************** SrvRqst_PntInstrctn ********************************************************************************/
		if(servicerequest.hasPatientInstruction()) {
			s.setSrvRqstPntInstrctn(String.valueOf(servicerequest.getPatientInstruction()));
		}
		/******************** SrvRqst_AthredOn ********************************************************************************/
		if(servicerequest.hasAuthoredOn()) {
			s.setSrvRqstAthredOn(String.valueOf(servicerequest.getAuthoredOn()));
		}
		/******************** servicerequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestIntent servicerequestintent = servicerequest.getIntent();
		s.setSrvRqstIntent(servicerequestintent.toCode());

		/******************** SrvRqst_SprtingInfo ********************************************************************************/
		if(servicerequest.hasSupportingInfo()) {
			s.setSrvRqstSprtingInfo(String.valueOf(servicerequest.getSupportingInfoFirstRep()));
		}
		/******************** SrvRqst_Insrnc ********************************************************************************/
		if(servicerequest.hasInsurance()) {
			s.setSrvRqstInsrnc(String.valueOf(servicerequest.getInsuranceFirstRep()));
		}
		/******************** SrvRqst_Replaces ********************************************************************************/
		if(servicerequest.hasReplaces()) {
			s.setSrvRqstReplaces(String.valueOf(servicerequest.getReplacesFirstRep()));
		}
		/******************** servicerequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier servicerequestidentifier = servicerequest.getIdentifierFirstRep();

		/******************** SrvRqst_Id_Vl ********************************************************************************/
		if(servicerequestidentifier.hasValue()) {
			s.setSrvRqstIdVl(String.valueOf(servicerequestidentifier.getValue()));
		}
		/******************** servicerequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestidentifiertype = servicerequestidentifier.getType();

		/******************** SrvRqst_Id_Typ_Txt ********************************************************************************/
		if(servicerequestidentifiertype.hasText()) {
			s.setSrvRqstIdTypTxt(String.valueOf(servicerequestidentifiertype.getText()));
		}
		/******************** servicerequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestidentifiertypecoding = servicerequestidentifiertype.getCodingFirstRep();

		/******************** SrvRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(servicerequestidentifiertypecoding.hasVersion()) {
			s.setSrvRqstIdTypCdgVrsn(String.valueOf(servicerequestidentifiertypecoding.getVersion()));
		}
		/******************** SrvRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(servicerequestidentifiertypecoding.hasDisplay()) {
			s.setSrvRqstIdTypCdgDsply(String.valueOf(servicerequestidentifiertypecoding.getDisplay()));
		}
		/******************** SrvRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(servicerequestidentifiertypecoding.hasCode()) {
			s.setSrvRqstIdTypCdgCd(String.valueOf(servicerequestidentifiertypecoding.getCode()));
		}
		/******************** SrvRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestidentifiertypecoding.hasUserSelected()) {
			s.setSrvRqstIdTypCdgUsrSltd(String.valueOf(servicerequestidentifiertypecoding.getUserSelected()));
		}
		/******************** SrvRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(servicerequestidentifiertypecoding.hasSystem()) {
			s.setSrvRqstIdTypCdgSys(String.valueOf(servicerequestidentifiertypecoding.getSystem()));
		}
		/******************** servicerequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestidentifierperiod = servicerequestidentifier.getPeriod();

		/******************** SrvRqst_Id_Prd_Strt ********************************************************************************/
		if(servicerequestidentifierperiod.hasStart()) {
			s.setSrvRqstIdPrdStrt(String.valueOf(servicerequestidentifierperiod.getStart()));
		}
		/******************** SrvRqst_Id_Prd_End ********************************************************************************/
		if(servicerequestidentifierperiod.hasEnd()) {
			s.setSrvRqstIdPrdEnd(String.valueOf(servicerequestidentifierperiod.getEnd()));
		}
		/******************** SrvRqst_Id_Assigner ********************************************************************************/
		if(servicerequestidentifier.hasAssigner()) {
			s.setSrvRqstIdAssigner(String.valueOf(servicerequestidentifier.getAssigner()));
		}
		/******************** SrvRqst_Id_Sys ********************************************************************************/
		if(servicerequestidentifier.hasSystem()) {
			s.setSrvRqstIdSys(String.valueOf(servicerequestidentifier.getSystem()));
		}
		/******************** servicerequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse servicerequestidentifieruse = servicerequestidentifier.getUse();
		s.setSrvRqstIdUse(servicerequestidentifieruse.toCode());

		/******************** servicerequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestreasoncode = servicerequest.getReasonCodeFirstRep();

		/******************** SrvRqst_RsnCd_Txt ********************************************************************************/
		if(servicerequestreasoncode.hasText()) {
			s.setSrvRqstRsnCdTxt(String.valueOf(servicerequestreasoncode.getText()));
		}
		/******************** servicerequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestreasoncodecoding = servicerequestreasoncode.getCodingFirstRep();

		/******************** SrvRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestreasoncodecoding.hasVersion()) {
			s.setSrvRqstRsnCdCdgVrsn(String.valueOf(servicerequestreasoncodecoding.getVersion()));
		}
		/******************** SrvRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(servicerequestreasoncodecoding.hasDisplay()) {
			s.setSrvRqstRsnCdCdgDsply(String.valueOf(servicerequestreasoncodecoding.getDisplay()));
		}
		/******************** SrvRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(servicerequestreasoncodecoding.hasCode()) {
			s.setSrvRqstRsnCdCdgCd(String.valueOf(servicerequestreasoncodecoding.getCode()));
		}
		/******************** SrvRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestreasoncodecoding.hasUserSelected()) {
			s.setSrvRqstRsnCdCdgUsrSltd(String.valueOf(servicerequestreasoncodecoding.getUserSelected()));
		}
		/******************** SrvRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(servicerequestreasoncodecoding.hasSystem()) {
			s.setSrvRqstRsnCdCdgSys(String.valueOf(servicerequestreasoncodecoding.getSystem()));
		}
		/******************** SrvRqst_RsnRfrnc ********************************************************************************/
		if(servicerequest.hasReasonReference()) {
			s.setSrvRqstRsnRfrnc(String.valueOf(servicerequest.getReasonReferenceFirstRep()));
		}
		/******************** servicerequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestcategory = servicerequest.getCategoryFirstRep();

		/******************** SrvRqst_Ctgry_Txt ********************************************************************************/
		if(servicerequestcategory.hasText()) {
			s.setSrvRqstCtgryTxt(String.valueOf(servicerequestcategory.getText()));
		}
		/******************** servicerequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestcategorycoding = servicerequestcategory.getCodingFirstRep();

		/******************** SrvRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(servicerequestcategorycoding.hasVersion()) {
			s.setSrvRqstCtgryCdgVrsn(String.valueOf(servicerequestcategorycoding.getVersion()));
		}
		/******************** SrvRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(servicerequestcategorycoding.hasDisplay()) {
			s.setSrvRqstCtgryCdgDsply(String.valueOf(servicerequestcategorycoding.getDisplay()));
		}
		/******************** SrvRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(servicerequestcategorycoding.hasCode()) {
			s.setSrvRqstCtgryCdgCd(String.valueOf(servicerequestcategorycoding.getCode()));
		}
		/******************** SrvRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestcategorycoding.hasUserSelected()) {
			s.setSrvRqstCtgryCdgUsrSltd(String.valueOf(servicerequestcategorycoding.getUserSelected()));
		}
		/******************** SrvRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(servicerequestcategorycoding.hasSystem()) {
			s.setSrvRqstCtgryCdgSys(String.valueOf(servicerequestcategorycoding.getSystem()));
		}
		/******************** servicerequestbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestbodysite = servicerequest.getBodySiteFirstRep();

		/******************** SrvRqst_BodySite_Txt ********************************************************************************/
		if(servicerequestbodysite.hasText()) {
			s.setSrvRqstBodySiteTxt(String.valueOf(servicerequestbodysite.getText()));
		}
		/******************** servicerequestbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestbodysitecoding = servicerequestbodysite.getCodingFirstRep();

		/******************** SrvRqst_BodySite_Cdg_Vrsn ********************************************************************************/
		if(servicerequestbodysitecoding.hasVersion()) {
			s.setSrvRqstBodySiteCdgVrsn(String.valueOf(servicerequestbodysitecoding.getVersion()));
		}
		/******************** SrvRqst_BodySite_Cdg_Dsply ********************************************************************************/
		if(servicerequestbodysitecoding.hasDisplay()) {
			s.setSrvRqstBodySiteCdgDsply(String.valueOf(servicerequestbodysitecoding.getDisplay()));
		}
		/******************** SrvRqst_BodySite_Cdg_Cd ********************************************************************************/
		if(servicerequestbodysitecoding.hasCode()) {
			s.setSrvRqstBodySiteCdgCd(String.valueOf(servicerequestbodysitecoding.getCode()));
		}
		/******************** SrvRqst_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestbodysitecoding.hasUserSelected()) {
			s.setSrvRqstBodySiteCdgUsrSltd(String.valueOf(servicerequestbodysitecoding.getUserSelected()));
		}
		/******************** SrvRqst_BodySite_Cdg_Sys ********************************************************************************/
		if(servicerequestbodysitecoding.hasSystem()) {
			s.setSrvRqstBodySiteCdgSys(String.valueOf(servicerequestbodysitecoding.getSystem()));
		}
		/******************** servicerequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestperformertype = servicerequest.getPerformerType();

		/******************** SrvRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(servicerequestperformertype.hasText()) {
			s.setSrvRqstPrfrmrTypTxt(String.valueOf(servicerequestperformertype.getText()));
		}
		/******************** servicerequestperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestperformertypecoding = servicerequestperformertype.getCodingFirstRep();

		/******************** SrvRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(servicerequestperformertypecoding.hasVersion()) {
			s.setSrvRqstPrfrmrTypCdgVrsn(String.valueOf(servicerequestperformertypecoding.getVersion()));
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(servicerequestperformertypecoding.hasDisplay()) {
			s.setSrvRqstPrfrmrTypCdgDsply(String.valueOf(servicerequestperformertypecoding.getDisplay()));
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(servicerequestperformertypecoding.hasCode()) {
			s.setSrvRqstPrfrmrTypCdgCd(String.valueOf(servicerequestperformertypecoding.getCode()));
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestperformertypecoding.hasUserSelected()) {
			s.setSrvRqstPrfrmrTypCdgUsrSltd(String.valueOf(servicerequestperformertypecoding.getUserSelected()));
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(servicerequestperformertypecoding.hasSystem()) {
			s.setSrvRqstPrfrmrTypCdgSys(String.valueOf(servicerequestperformertypecoding.getSystem()));
		}
		/******************** SrvRqst_Rqster ********************************************************************************/
		if(servicerequest.hasRequester()) {
			s.setSrvRqstRqster(String.valueOf(servicerequest.getRequester()));
		}
		/******************** SrvRqst_DoNotPerform ********************************************************************************/
		if(servicerequest.hasDoNotPerform()) {
			s.setSrvRqstDoNotPerform(String.valueOf(servicerequest.getDoNotPerform()));
		}
		/******************** servicerequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestoccurrenceperiod = servicerequest.getOccurrencePeriod();

		/******************** SrvRqst_OccrncePrd_Strt ********************************************************************************/
		if(servicerequestoccurrenceperiod.hasStart()) {
			s.setSrvRqstOccrncePrdStrt(String.valueOf(servicerequestoccurrenceperiod.getStart()));
		}
		/******************** SrvRqst_OccrncePrd_End ********************************************************************************/
		if(servicerequestoccurrenceperiod.hasEnd()) {
			s.setSrvRqstOccrncePrdEnd(String.valueOf(servicerequestoccurrenceperiod.getEnd()));
		}
		/******************** SrvRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(servicerequest.hasOccurrenceDateTimeType()) {
			s.setSrvRqstOccrnceDtTimeTyp(String.valueOf(servicerequest.getOccurrenceDateTimeType()));
		}
		/******************** SrvRqst_RelevantHis ********************************************************************************/
		if(servicerequest.hasRelevantHistory()) {
			s.setSrvRqstRelevantHis(String.valueOf(servicerequest.getRelevantHistoryFirstRep()));
		}
		/******************** SrvRqst_Spcmn ********************************************************************************/
		if(servicerequest.hasSpecimen()) {
			s.setSrvRqstSpcmn(String.valueOf(servicerequest.getSpecimenFirstRep()));
		}
		/******************** SrvRqst_Prfrmr ********************************************************************************/
		if(servicerequest.hasPerformer()) {
			s.setSrvRqstPrfrmr(String.valueOf(servicerequest.getPerformerFirstRep()));
		}
		/******************** servicerequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing servicerequestoccurrencetiming = servicerequest.getOccurrenceTiming();

		/******************** servicerequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestoccurrencetimingcode = servicerequestoccurrencetiming.getCode();

		/******************** SrvRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(servicerequestoccurrencetimingcode.hasText()) {
			s.setSrvRqstOccrnceTmgCdTxt(String.valueOf(servicerequestoccurrencetimingcode.getText()));
		}
		/******************** servicerequestoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestoccurrencetimingcodecoding = servicerequestoccurrencetimingcode.getCodingFirstRep();

		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestoccurrencetimingcodecoding.hasVersion()) {
			s.setSrvRqstOccrnceTmgCdCdgVrsn(String.valueOf(servicerequestoccurrencetimingcodecoding.getVersion()));
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(servicerequestoccurrencetimingcodecoding.hasDisplay()) {
			s.setSrvRqstOccrnceTmgCdCdgDsply(String.valueOf(servicerequestoccurrencetimingcodecoding.getDisplay()));
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingcodecoding.hasCode()) {
			s.setSrvRqstOccrnceTmgCdCdgCd(String.valueOf(servicerequestoccurrencetimingcodecoding.getCode()));
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestoccurrencetimingcodecoding.hasUserSelected()) {
			s.setSrvRqstOccrnceTmgCdCdgUsrSltd(String.valueOf(servicerequestoccurrencetimingcodecoding.getUserSelected()));
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingcodecoding.hasSystem()) {
			s.setSrvRqstOccrnceTmgCdCdgSys(String.valueOf(servicerequestoccurrencetimingcodecoding.getSystem()));
		}
		/******************** servicerequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent servicerequestoccurrencetimingrepeat = servicerequestoccurrencetiming.getRepeat();

		/******************** SrvRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasOffset()) {
			s.setSrvRqstOccrnceTmgRptOff(String.valueOf(servicerequestoccurrencetimingrepeat.getOffset()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasCount()) {
			s.setSrvRqstOccrnceTmgRptCnt(String.valueOf(servicerequestoccurrencetimingrepeat.getCount()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasFrequency()) {
			s.setSrvRqstOccrnceTmgRptFrqncy(String.valueOf(servicerequestoccurrencetimingrepeat.getFrequency()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasPeriod()) {
			s.setSrvRqstOccrnceTmgRptPrd(String.valueOf(servicerequestoccurrencetimingrepeat.getPeriod()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasDuration()) {
			s.setSrvRqstOccrnceTmgRptDuration(String.valueOf(servicerequestoccurrencetimingrepeat.getDuration()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration servicerequestoccurrencetimingrepeatboundsduration = servicerequestoccurrencetimingrepeat.getBoundsDuration();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasValue()) {
			s.setSrvRqstOccrnceTmgRptBndsDurationVl(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getValue()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestoccurrencetimingrepeatboundsdurationcomparator = servicerequestoccurrencetimingrepeatboundsduration.getComparator();
		s.setSrvRqstOccrnceTmgRptBndsDurationCmprtr(servicerequestoccurrencetimingrepeatboundsdurationcomparator.toCode());

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasCode()) {
			s.setSrvRqstOccrnceTmgRptBndsDurationCd(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getCode()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasUnit()) {
			s.setSrvRqstOccrnceTmgRptBndsDurationUnt(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getUnit()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasSystem()) {
			s.setSrvRqstOccrnceTmgRptBndsDurationSys(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getSystem()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range servicerequestoccurrencetimingrepeatboundsrange = servicerequestoccurrencetimingrepeat.getBoundsRange();

		/******************** servicerequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestoccurrencetimingrepeatboundsrangelow = servicerequestoccurrencetimingrepeatboundsrange.getLow();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasValue()) {
			s.setSrvRqstOccrnceTmgRptBndsRngLwVl(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getValue()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestoccurrencetimingrepeatboundsrangelowcomparator = servicerequestoccurrencetimingrepeatboundsrangelow.getComparator();
		s.setSrvRqstOccrnceTmgRptBndsRngLwCmprtr(servicerequestoccurrencetimingrepeatboundsrangelowcomparator.toCode());

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasCode()) {
			s.setSrvRqstOccrnceTmgRptBndsRngLwCd(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getCode()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasUnit()) {
			s.setSrvRqstOccrnceTmgRptBndsRngLwUnt(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasSystem()) {
			s.setSrvRqstOccrnceTmgRptBndsRngLwSys(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestoccurrencetimingrepeatboundsrangehigh = servicerequestoccurrencetimingrepeatboundsrange.getHigh();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasValue()) {
			s.setSrvRqstOccrnceTmgRptBndsRngHiVl(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestoccurrencetimingrepeatboundsrangehighcomparator = servicerequestoccurrencetimingrepeatboundsrangehigh.getComparator();
		s.setSrvRqstOccrnceTmgRptBndsRngHiCmprtr(servicerequestoccurrencetimingrepeatboundsrangehighcomparator.toCode());

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasCode()) {
			s.setSrvRqstOccrnceTmgRptBndsRngHiCd(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasUnit()) {
			s.setSrvRqstOccrnceTmgRptBndsRngHiUnt(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasSystem()) {
			s.setSrvRqstOccrnceTmgRptBndsRngHiSys(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestoccurrencetimingrepeatboundsperiod = servicerequestoccurrencetimingrepeat.getBoundsPeriod();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsperiod.hasStart()) {
			s.setSrvRqstOccrnceTmgRptBndsPrdStrt(String.valueOf(servicerequestoccurrencetimingrepeatboundsperiod.getStart()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsperiod.hasEnd()) {
			s.setSrvRqstOccrnceTmgRptBndsPrdEnd(String.valueOf(servicerequestoccurrencetimingrepeatboundsperiod.getEnd()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasPeriodMax()) {
			s.setSrvRqstOccrnceTmgRptPrdMx(String.valueOf(servicerequestoccurrencetimingrepeat.getPeriodMax()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasDurationMax()) {
			s.setSrvRqstOccrnceTmgRptDurationMx(String.valueOf(servicerequestoccurrencetimingrepeat.getDurationMax()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasCountMax()) {
			s.setSrvRqstOccrnceTmgRptCntMx(String.valueOf(servicerequestoccurrencetimingrepeat.getCountMax()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasFrequencyMax()) {
			s.setSrvRqstOccrnceTmgRptFrqncyMx(String.valueOf(servicerequestoccurrencetimingrepeat.getFrequencyMax()));
		}
		/******************** servicerequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime servicerequestoccurrencetimingrepeatdurationunit = servicerequestoccurrencetimingrepeat.getDurationUnit();
		s.setSrvRqstOccrnceTmgRptDurationUnt(servicerequestoccurrencetimingrepeatdurationunit.toCode());

		/******************** servicerequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime servicerequestoccurrencetimingrepeatperiodunit = servicerequestoccurrencetimingrepeat.getPeriodUnit();
		s.setSrvRqstOccrnceTmgRptPrdUnt(servicerequestoccurrencetimingrepeatperiodunit.toCode());

		return s;
	}
}
