package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Claimresponse.
 * @see .Claimresponse
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ClaimresponseConversion 
{
	public Patient Claimresponses(main.templateoutput.Model.Claimresponse claimresponse) 
	{
			Patient  Claimresponseobj = new Patient(); 

						Claimresponseobj.addIdentifier(HapiFHIRHelpers.createIdentifier(claimresponse.getClmRspnsDntfrDntfrSe() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, claimresponse.getClmRspnsDntfrDntfrTpCcCSstm() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDntfrDntfrTpCcCVrsn() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDntfrDntfrTpCcCCde() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDntfrDntfrTpCcCDsplay() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDntfrDntfrTpCcTxt() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, claimresponse.getClmRspnsDntfrDntfrPrdPrdStrt() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, claimresponse.getClmRspnsDntfrDntfrPrdPrdNd() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, claimresponse.getClmRspnsDntfrDntfrSsgnr() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, claimresponse.getClmRspnsDntfrDntfrVlue() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, claimresponse.getClmRspnsDntfrDntfrSstm() /** { "tree" :"ClaimResponse.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Claimresponseobj.setStatus(HapiFHIRHelpers.createcode(claimresponse.getClaimResponseStatusCode() /** { "tree" :"ClaimResponse.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Claimresponseobj.setType(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsTpCcCdngCSstm() /** { "tree" :"ClaimResponse.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsTpCcCdngCVrsn() /** { "tree" :"ClaimResponse.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsTpCcCdngCCde() /** { "tree" :"ClaimResponse.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, claimresponse.getClmRspnsTpCcCdngCDsplay() /** { "tree" :"ClaimResponse.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsTpCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponseTypeCcText() /** { "tree" :"ClaimResponse.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Claimresponseobj.setSubType(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsSbTpCcCdngCSstm() /** { "tree" :"ClaimResponse.subType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsSbTpCcCdngCVrsn() /** { "tree" :"ClaimResponse.subType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsSbTpCcCdngCCde() /** { "tree" :"ClaimResponse.subType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setCode"} **/
						, claimresponse.getClmRspnsSbTpCcCdngCDsplay() /** { "tree" :"ClaimResponse.subType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsSbTpCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.subType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponseSubTypeCcText() /** { "tree" :"ClaimResponse.subType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, setText"} **/
						));
Claimresponseobj.setUse(HapiFHIRHelpers.createcode(claimresponse.getClaimResponseUseCode() /** { "tree" :"ClaimResponse.use", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUse"} **/
						));
Claimresponseobj.setPatient(HapiFHIRHelpers.createReference(claimresponse.getClaimResponsePntReference() /** { "tree" :"ClaimResponse.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Claimresponseobj.setCreated(HapiFHIRHelpers.createdateTime(claimresponse.getClaimResponseCreatedDateTime() /** { "tree" :"ClaimResponse.created", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Claimresponseobj.setInsurer(HapiFHIRHelpers.createReference(claimresponse.getClaimResponseInsurerReference() /** { "tree" :"ClaimResponse.insurer", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setInsurer"} **/
						));
Claimresponseobj.setRequestor(HapiFHIRHelpers.createReference(claimresponse.getClaimResponseRequestorReference() /** { "tree" :"ClaimResponse.requestor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestor"} **/
						));
Claimresponseobj.setRequest(HapiFHIRHelpers.createReference(claimresponse.getClaimResponseRequestReference() /** { "tree" :"ClaimResponse.request", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequest"} **/
						));
Claimresponseobj.setOutcome(HapiFHIRHelpers.createcode(claimresponse.getClaimResponseOutcomeCode() /** { "tree" :"ClaimResponse.outcome", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setOutcome"} **/
						));
Claimresponseobj.setDisposition(HapiFHIRHelpers.createstring(claimresponse.getClaimResponseDispositionString() /** { "tree" :"ClaimResponse.disposition", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisposition"} **/
						));
Claimresponseobj.setPreAuthRef(HapiFHIRHelpers.createstring(claimresponse.getClaimResponsePreAuthRefString() /** { "tree" :"ClaimResponse.preAuthRef", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPreAuthRef"} **/
						));
Claimresponseobj.setPreAuthPeriod(HapiFHIRHelpers.createPeriod(claimresponse.getClmRspnsPrthPrdPrdStrt() /** { "tree" :"ClaimResponse.preAuthPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPreAuthPeriod, setStart"} **/
						, claimresponse.getClmRspnsPrthPrdPrdNd() /** { "tree" :"ClaimResponse.preAuthPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPreAuthPeriod, setEnd"} **/
						));
Claimresponseobj.setPayeeType(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsPTpCcCdngCSstm() /** { "tree" :"ClaimResponse.payeeType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayeeType, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsPTpCcCdngCVrsn() /** { "tree" :"ClaimResponse.payeeType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayeeType, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsPTpCcCdngCCde() /** { "tree" :"ClaimResponse.payeeType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayeeType, addCoding, setCode"} **/
						, claimresponse.getClmRspnsPTpCcCdngCDsplay() /** { "tree" :"ClaimResponse.payeeType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayeeType, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsPTpCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.payeeType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayeeType, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponsePayeeTypeCcText() /** { "tree" :"ClaimResponse.payeeType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayeeType, setText"} **/
						));
Claimresponseobj.setItemSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsTmTmSqncPstvnt() /** { "tree" :"ClaimResponse.item.itemSequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setItemSequence"} **/
						));
Claimresponseobj.addNoteNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsTmNtNmbrPstvnt() /** { "tree" :"ClaimResponse.item.noteNumber", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addNoteNumber"} **/
						));
Claimresponseobj.setCategory(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsTmDjdctnCtgrCcCdngCSstm() /** { "tree" :"ClaimResponse.item.adjudication.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsTmDjdctnCtgrCcCdngCVrsn() /** { "tree" :"ClaimResponse.item.adjudication.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsTmDjdctnCtgrCcCdngCCde() /** { "tree" :"ClaimResponse.item.adjudication.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, claimresponse.getClmRspnsTmDjdctnCtgrCcCdngCDsplay() /** { "tree" :"ClaimResponse.item.adjudication.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsTmDjdctnCtgrCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.item.adjudication.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsTmDjdctnCtgrCcTxt() /** { "tree" :"ClaimResponse.item.adjudication.category", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setCategory, setText"} **/
						));
Claimresponseobj.setReason(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsTmDjdctnRsnCcCdngCSstm() /** { "tree" :"ClaimResponse.item.adjudication.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setReason, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsTmDjdctnRsnCcCdngCVrsn() /** { "tree" :"ClaimResponse.item.adjudication.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setReason, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsTmDjdctnRsnCcCdngCCde() /** { "tree" :"ClaimResponse.item.adjudication.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setReason, addCoding, setCode"} **/
						, claimresponse.getClmRspnsTmDjdctnRsnCcCdngCDsplay() /** { "tree" :"ClaimResponse.item.adjudication.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setReason, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsTmDjdctnRsnCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.item.adjudication.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setReason, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsTmDjdctnRsnCcTxt() /** { "tree" :"ClaimResponse.item.adjudication.reason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setReason, setText"} **/
						));
Claimresponseobj.setAmount(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsTmDjdctnMntMnCrrncy() /** { "tree" :"ClaimResponse.item.adjudication.amount", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setAmount, setCurrency"} **/
						, claimresponse.getClmRspnsTmDjdctnMntMnVlue() /** { "tree" :"ClaimResponse.item.adjudication.amount", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setAmount, setVal"} **/
						));
Claimresponseobj.setValue(HapiFHIRHelpers.createdecimal(claimresponse.getClmRspnsTmDjdctnVlDcml() /** { "tree" :"ClaimResponse.item.adjudication.value", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAdjudication"] , "methodName" : "setValue"} **/
						));
Claimresponseobj.setDetailSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsTmDtlDtlSqncPstvnt() /** { "tree" :"ClaimResponse.item.detail.detailSequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication", "addDetail"] , "methodName" : "setDetailSequence"} **/
						));
Claimresponseobj.addNoteNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsTmDtlNtNmbrPstvnt() /** { "tree" :"ClaimResponse.item.detail.noteNumber", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem", "addAdjudication", "addDetail"] , "methodName" : "addNoteNumber"} **/
						));
Claimresponseobj.addAdjudication(HapiFHIRHelpers.createadjudication(claimresponse.getClmRspnsTmDtlDjdctnDjdctn() /** { "tree" :"ClaimResponse.item.detail.adjudication", "datatype" : "adjudication", "cardinality" : "Many", "elementtree" : ["addItem", "addAdjudication", "addDetail"] , "methodName" : "addAdjudication"} **/
						));
Claimresponseobj.setSubDetailSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsTmDtlSbDtlSbDtlSqncPstvnt() /** { "tree" :"ClaimResponse.item.detail.subDetail.subDetailSequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addItem", "addAdjudication", "addDetail", "addSubDetail"] , "methodName" : "setSubDetailSequence"} **/
						));
Claimresponseobj.addNoteNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsTmDtlSbDtlNtNmbrPstvnt() /** { "tree" :"ClaimResponse.item.detail.subDetail.noteNumber", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem", "addAdjudication", "addDetail", "addSubDetail"] , "methodName" : "addNoteNumber"} **/
						));
Claimresponseobj.addAdjudication(HapiFHIRHelpers.createadjudication(claimresponse.getClmRspnsTmDtlSbDtlDjdctnDjdctn() /** { "tree" :"ClaimResponse.item.detail.subDetail.adjudication", "datatype" : "adjudication", "cardinality" : "Many", "elementtree" : ["addItem", "addAdjudication", "addDetail", "addSubDetail"] , "methodName" : "addAdjudication"} **/
						));
Claimresponseobj.addItemSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsDdtmTmSqncPstvnt() /** { "tree" :"ClaimResponse.addItem.itemSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addItemSequence"} **/
						));
Claimresponseobj.addDetailSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsDdtmDtlSqncPstvnt() /** { "tree" :"ClaimResponse.addItem.detailSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addDetailSequence"} **/
						));
Claimresponseobj.addSubdetailSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsDdtmSbdtlSqncPstvnt() /** { "tree" :"ClaimResponse.addItem.subdetailSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubdetailSequence"} **/
						));
Claimresponseobj.addProvider(HapiFHIRHelpers.createReference(claimresponse.getClmRspnsDdtmPrvdrRfrnce() /** { "tree" :"ClaimResponse.addItem.provider", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProvider"} **/
						));
Claimresponseobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmPrdctrSrvcCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addAddItem"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmPrdctrSrvcCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addAddItem"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmPrdctrSrvcCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addAddItem"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmPrdctrSrvcCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addAddItem"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addAddItem"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmPrdctrSrvcCcTxt() /** { "tree" :"ClaimResponse.addItem.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addAddItem"] , "methodName" : "setProductOrService, setText"} **/
						));
Claimresponseobj.addModifier(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmMdfrCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmMdfrCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmMdfrCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmMdfrCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmMdfrCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmMdfrCcTxt() /** { "tree" :"ClaimResponse.addItem.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addModifier, setText"} **/
						));
Claimresponseobj.addProgramCode(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmPrgrmCdCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.programCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProgramCode, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmPrgrmCdCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProgramCode, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmPrgrmCdCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.programCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProgramCode, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmPrgrmCdCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProgramCode, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmPrgrmCdCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.programCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProgramCode, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmPrgrmCdCcTxt() /** { "tree" :"ClaimResponse.addItem.programCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addProgramCode, setText"} **/
						));
Claimresponseobj.setServicedDate(HapiFHIRHelpers.createdate(claimresponse.getClmRspnsDdtmSrvcdDtDte() /** { "tree" :"ClaimResponse.addItem.servicedDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setServicedDate"} **/
						));
Claimresponseobj.setServicedPeriod(HapiFHIRHelpers.createPeriod(claimresponse.getClmRspnsDdtmSrvcdPrdPrdStrt() /** { "tree" :"ClaimResponse.addItem.servicedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setServicedPeriod, setStart"} **/
						, claimresponse.getClmRspnsDdtmSrvcdPrdPrdNd() /** { "tree" :"ClaimResponse.addItem.servicedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setServicedPeriod, setEnd"} **/
						));
Claimresponseobj.setLocationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmLctnCdblcncptCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmLctnCdblcncptCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmLctnCdblcncptCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmLctnCdblcncptCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmLctnCdblcncptCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmLctnCdblcncptCcTxt() /** { "tree" :"ClaimResponse.addItem.locationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationCodeableconcept, setText"} **/
						));
Claimresponseobj.setLocationAddress(HapiFHIRHelpers.createAddress(claimresponse.getClmRspnsDdtmLctnddrssDdrssSe() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setUse"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssTpe() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setType"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssPrdPrdStrt() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setPeriod, setStart"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssPrdPrdNd() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setPeriod, setEnd"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssTxt() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setText"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssLne() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, addLine"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssCty() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setCity"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssDstrct() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setDistrict"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssStte() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setState"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssPstlCde() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setPostalCode"} **/
						, claimresponse.getClmRspnsDdtmLctnddrssDdrssCntry() /** { "tree" :"ClaimResponse.addItem.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationAddress, setCounty"} **/
						));
Claimresponseobj.setLocationReference(location)(HapiFHIRHelpers.createReference(claimresponse.getClmRspnsDdtmLctnRfrncRfrnce() /** { "tree" :"ClaimResponse.addItem.locationReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setLocationReference(location)"} **/
						));
Claimresponseobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(claimresponse.getClmRspnsDdtmQnttSmplQntty() /** { "tree" :"ClaimResponse.addItem.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setQuantity"} **/
						));
Claimresponseobj.setUnitPrice(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsDdtmNtPrcMnCrrncy() /** { "tree" :"ClaimResponse.addItem.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, claimresponse.getClmRspnsDdtmNtPrcMnVlue() /** { "tree" :"ClaimResponse.addItem.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Claimresponseobj.setFactor(HapiFHIRHelpers.createdecimal(claimresponse.getClmRspnsDdtmFctrDcml() /** { "tree" :"ClaimResponse.addItem.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setFactor"} **/
						));
Claimresponseobj.setNet(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsDdtmNtMnCrrncy() /** { "tree" :"ClaimResponse.addItem.net", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setNet, setCurrency"} **/
						, claimresponse.getClmRspnsDdtmNtMnVlue() /** { "tree" :"ClaimResponse.addItem.net", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setNet, setVal"} **/
						));
Claimresponseobj.setBodySite(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmBdStCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setBodySite, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmBdStCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setBodySite, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmBdStCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setBodySite, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmBdStCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setBodySite, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmBdStCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setBodySite, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmBdStCcTxt() /** { "tree" :"ClaimResponse.addItem.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem"] , "methodName" : "setBodySite, setText"} **/
						));
Claimresponseobj.addSubSite(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmSbStCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.subSite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubSite, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmSbStCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.subSite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubSite, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmSbStCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.subSite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubSite, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmSbStCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.subSite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubSite, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmSbStCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.subSite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubSite, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmSbStCcTxt() /** { "tree" :"ClaimResponse.addItem.subSite", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addSubSite, setText"} **/
						));
Claimresponseobj.addNoteNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsDdtmNtNmbrPstvnt() /** { "tree" :"ClaimResponse.addItem.noteNumber", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addNoteNumber"} **/
						));
Claimresponseobj.addAdjudication(HapiFHIRHelpers.createadjudication(claimresponse.getClmRspnsDdtmDjdctnDjdctn() /** { "tree" :"ClaimResponse.addItem.adjudication", "datatype" : "adjudication", "cardinality" : "Many", "elementtree" : ["addAddItem"] , "methodName" : "addAdjudication"} **/
						));
Claimresponseobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmDtlPrdctrSrvcCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.detail.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmDtlPrdctrSrvcCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.detail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmDtlPrdctrSrvcCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.detail.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmDtlPrdctrSrvcCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.detail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmDtlPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.detail.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmDtlPrdctrSrvcCcTxt() /** { "tree" :"ClaimResponse.addItem.detail.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setProductOrService, setText"} **/
						));
Claimresponseobj.addModifier(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmDtlMdfrCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.detail.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmDtlMdfrCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.detail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmDtlMdfrCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.detail.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmDtlMdfrCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.detail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmDtlMdfrCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.detail.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmDtlMdfrCcTxt() /** { "tree" :"ClaimResponse.addItem.detail.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addModifier, setText"} **/
						));
Claimresponseobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(claimresponse.getClmRspnsDdtmDtlQnttSmplQntty() /** { "tree" :"ClaimResponse.addItem.detail.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setQuantity"} **/
						));
Claimresponseobj.setUnitPrice(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsDdtmDtlNtPrcMnCrrncy() /** { "tree" :"ClaimResponse.addItem.detail.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, claimresponse.getClmRspnsDdtmDtlNtPrcMnVlue() /** { "tree" :"ClaimResponse.addItem.detail.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Claimresponseobj.setFactor(HapiFHIRHelpers.createdecimal(claimresponse.getClmRspnsDdtmDtlFctrDcml() /** { "tree" :"ClaimResponse.addItem.detail.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setFactor"} **/
						));
Claimresponseobj.setNet(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsDdtmDtlNtMnCrrncy() /** { "tree" :"ClaimResponse.addItem.detail.net", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setNet, setCurrency"} **/
						, claimresponse.getClmRspnsDdtmDtlNtMnVlue() /** { "tree" :"ClaimResponse.addItem.detail.net", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "setNet, setVal"} **/
						));
Claimresponseobj.addNoteNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsDdtmDtlNtNmbrPstvnt() /** { "tree" :"ClaimResponse.addItem.detail.noteNumber", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addNoteNumber"} **/
						));
Claimresponseobj.addAdjudication(HapiFHIRHelpers.createadjudication(claimresponse.getClmRspnsDdtmDtlDjdctnDjdctn() /** { "tree" :"ClaimResponse.addItem.detail.adjudication", "datatype" : "adjudication", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail"] , "methodName" : "addAdjudication"} **/
						));
Claimresponseobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmDtlSbDtlPrdctrSrvcCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlPrdctrSrvcCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlPrdctrSrvcCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlPrdctrSrvcCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlPrdctrSrvcCcTxt() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, setText"} **/
						));
Claimresponseobj.addModifier(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsDdtmDtlSbDtlMdfrCcCdngCSstm() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlMdfrCcCdngCVrsn() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlMdfrCcCdngCCde() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlMdfrCcCdngCDsplay() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlMdfrCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlMdfrCcTxt() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, setText"} **/
						));
Claimresponseobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(claimresponse.getClmRspnsDdtmDtlSbDtlQnttSmplQntty() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setQuantity"} **/
						));
Claimresponseobj.setUnitPrice(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsDdtmDtlSbDtlNtPrcMnCrrncy() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlNtPrcMnVlue() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Claimresponseobj.setFactor(HapiFHIRHelpers.createdecimal(claimresponse.getClmRspnsDdtmDtlSbDtlFctrDcml() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setFactor"} **/
						));
Claimresponseobj.setNet(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsDdtmDtlSbDtlNtMnCrrncy() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.net", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setNet, setCurrency"} **/
						, claimresponse.getClmRspnsDdtmDtlSbDtlNtMnVlue() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.net", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "setNet, setVal"} **/
						));
Claimresponseobj.addNoteNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsDdtmDtlSbDtlNtNmbrPstvnt() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.noteNumber", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addNoteNumber"} **/
						));
Claimresponseobj.addAdjudication(HapiFHIRHelpers.createadjudication(claimresponse.getClmRspnsDdtmDtlSbDtlDjdctnDjdctn() /** { "tree" :"ClaimResponse.addItem.detail.subDetail.adjudication", "datatype" : "adjudication", "cardinality" : "Many", "elementtree" : ["addAddItem", "addDetail", "addSubDetail"] , "methodName" : "addAdjudication"} **/
						, claimresponse.getClmRspnsDjdctnDjdctn() /** { "tree" :"ClaimResponse.adjudication", "datatype" : "adjudication", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAdjudication"} **/
						));
Claimresponseobj.setCategory(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsTtlCtgrCcCdngCSstm() /** { "tree" :"ClaimResponse.total.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsTtlCtgrCcCdngCVrsn() /** { "tree" :"ClaimResponse.total.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsTtlCtgrCcCdngCCde() /** { "tree" :"ClaimResponse.total.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, claimresponse.getClmRspnsTtlCtgrCcCdngCDsplay() /** { "tree" :"ClaimResponse.total.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsTtlCtgrCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.total.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsTtlCtgrCcTxt() /** { "tree" :"ClaimResponse.total.category", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setCategory, setText"} **/
						));
Claimresponseobj.setAmount(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsTtlMntMnCrrncy() /** { "tree" :"ClaimResponse.total.amount", "datatype" : "Money, code", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setAmount, setCurrency"} **/
						, claimresponse.getClmRspnsTtlMntMnVlue() /** { "tree" :"ClaimResponse.total.amount", "datatype" : "Money, decimal", "cardinality" : "Required", "elementtree" : ["addTotal"] , "methodName" : "setAmount, setVal"} **/
						));
Claimresponseobj.setType(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsPmntTpCcCdngCSstm() /** { "tree" :"ClaimResponse.payment.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setType, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsPmntTpCcCdngCVrsn() /** { "tree" :"ClaimResponse.payment.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setType, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsPmntTpCcCdngCCde() /** { "tree" :"ClaimResponse.payment.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setType, addCoding, setCode"} **/
						, claimresponse.getClmRspnsPmntTpCcCdngCDsplay() /** { "tree" :"ClaimResponse.payment.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsPmntTpCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.payment.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponsePaymentTypeCcText() /** { "tree" :"ClaimResponse.payment.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setType, setText"} **/
						));
Claimresponseobj.setAdjustment(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsPmntDjstmntMnCrrncy() /** { "tree" :"ClaimResponse.payment.adjustment", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustment, setCurrency"} **/
						, claimresponse.getClmRspnsPmntDjstmntMnVlue() /** { "tree" :"ClaimResponse.payment.adjustment", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustment, setVal"} **/
						));
Claimresponseobj.setAdjustmentReason(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsPmntDjstmntRsnCcCdngCSstm() /** { "tree" :"ClaimResponse.payment.adjustmentReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustmentReason, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsPmntDjstmntRsnCcCdngCVrsn() /** { "tree" :"ClaimResponse.payment.adjustmentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustmentReason, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsPmntDjstmntRsnCcCdngCCde() /** { "tree" :"ClaimResponse.payment.adjustmentReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustmentReason, addCoding, setCode"} **/
						, claimresponse.getClmRspnsPmntDjstmntRsnCcCdngCDsplay() /** { "tree" :"ClaimResponse.payment.adjustmentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustmentReason, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsPmntDjstmntRsnCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.payment.adjustmentReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustmentReason, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsPmntDjstmntRsnCcTxt() /** { "tree" :"ClaimResponse.payment.adjustmentReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setAdjustmentReason, setText"} **/
						));
Claimresponseobj.setDate(HapiFHIRHelpers.createdate(claimresponse.getClaimResponsePaymentDateDate() /** { "tree" :"ClaimResponse.payment.date", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setDate"} **/
						));
Claimresponseobj.setAmount(HapiFHIRHelpers.createMoney(claimresponse.getClmRspnsPmntMntMnCrrncy() /** { "tree" :"ClaimResponse.payment.amount", "datatype" : "Money, code", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setAmount, setCurrency"} **/
						, claimresponse.getClmRspnsPmntMntMnVlue() /** { "tree" :"ClaimResponse.payment.amount", "datatype" : "Money, decimal", "cardinality" : "Required", "elementtree" : ["setPayment"] , "methodName" : "setAmount, setVal"} **/
						));
Claimresponseobj.setIdentifier(HapiFHIRHelpers.createIdentifier(claimresponse.getClmRspnsPmntDntfrDntfrSe() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setUse"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrTpCcCSstm() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrTpCcCVrsn() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrTpCcCCde() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrTpCcCDsplay() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrTpCcTxt() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setType, setText"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrPrdPrdStrt() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrPrdPrdNd() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrSsgnr() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setAssigner"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrVlue() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setValue"} **/
						, claimresponse.getClmRspnsPmntDntfrDntfrSstm() /** { "tree" :"ClaimResponse.payment.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["setPayment"] , "methodName" : "setIdentifier, setSystem"} **/
						));
Claimresponseobj.setFundsReserve(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsFndsRsrvCcCdngCSstm() /** { "tree" :"ClaimResponse.fundsReserve", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsFndsRsrvCcCdngCVrsn() /** { "tree" :"ClaimResponse.fundsReserve", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsFndsRsrvCcCdngCCde() /** { "tree" :"ClaimResponse.fundsReserve", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setCode"} **/
						, claimresponse.getClmRspnsFndsRsrvCcCdngCDsplay() /** { "tree" :"ClaimResponse.fundsReserve", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsFndsRsrvCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.fundsReserve", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponseFundsReserveCcText() /** { "tree" :"ClaimResponse.fundsReserve", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, setText"} **/
						));
Claimresponseobj.setFormCode(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsFrmCdCcCdngCSstm() /** { "tree" :"ClaimResponse.formCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsFrmCdCcCdngCVrsn() /** { "tree" :"ClaimResponse.formCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsFrmCdCcCdngCCde() /** { "tree" :"ClaimResponse.formCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setCode"} **/
						, claimresponse.getClmRspnsFrmCdCcCdngCDsplay() /** { "tree" :"ClaimResponse.formCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsFrmCdCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.formCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponseFormCodeCcText() /** { "tree" :"ClaimResponse.formCode", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, setText"} **/
						));
Claimresponseobj.setForm(HapiFHIRHelpers.createAttachment(claimresponse.getClaimResponseFormAttachmentData() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setData"} **/
						, claimresponse.getClaimResponseFormAttachmentHash() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setHash"} **/
						, claimresponse.getClmRspnsFrmTtchmntCntntTpe() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setContentType"} **/
						, claimresponse.getClmRspnsFrmTtchmntLngge() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setLanguage"} **/
						, claimresponse.getClmRspnsFrmTtchmntCrtn() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setCreation"} **/
						, claimresponse.getClmRspnsFrmTtchmntTtle() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setTitle"} **/
						, claimresponse.getClaimResponseFormAttachmentSize() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setSize"} **/
						, claimresponse.getClaimResponseFormAttachmentUrl() /** { "tree" :"ClaimResponse.form", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setUrl"} **/
						));
Claimresponseobj.setNumber(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsPrcssNtNmbrPstvnt() /** { "tree" :"ClaimResponse.processNote.number", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setNumber"} **/
						));
Claimresponseobj.setType(HapiFHIRHelpers.createcode(claimresponse.getClmRspnsPrcssNtTpCde() /** { "tree" :"ClaimResponse.processNote.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setType"} **/
						));
Claimresponseobj.setText(HapiFHIRHelpers.createstring(claimresponse.getClmRspnsPrcssNtTxtStrng() /** { "tree" :"ClaimResponse.processNote.text", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addProcessNote"] , "methodName" : "setText"} **/
						));
Claimresponseobj.setLanguage(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsPrcssNtLnggCcCdngCSstm() /** { "tree" :"ClaimResponse.processNote.language", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setLanguage, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsPrcssNtLnggCcCdngCVrsn() /** { "tree" :"ClaimResponse.processNote.language", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setLanguage, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsPrcssNtLnggCcCdngCCde() /** { "tree" :"ClaimResponse.processNote.language", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setLanguage, addCoding, setCode"} **/
						, claimresponse.getClmRspnsPrcssNtLnggCcCdngCDsplay() /** { "tree" :"ClaimResponse.processNote.language", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setLanguage, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsPrcssNtLnggCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.processNote.language", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setLanguage, addCoding, setUserSelected"} **/
						, claimresponse.getClmRspnsPrcssNtLnggCcTxt() /** { "tree" :"ClaimResponse.processNote.language", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setLanguage, setText"} **/
						));
Claimresponseobj.addCommunicationRequest(HapiFHIRHelpers.createReference(claimresponse.getClmRspnsCmmnctnRqstRfrnce() /** { "tree" :"ClaimResponse.communicationRequest", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunicationRequest"} **/
						));
Claimresponseobj.setSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsNsrncSqncPstvnt() /** { "tree" :"ClaimResponse.insurance.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setSequence"} **/
						));
Claimresponseobj.setFocal(HapiFHIRHelpers.createboolean(claimresponse.getClmRspnsNsrncFclBln() /** { "tree" :"ClaimResponse.insurance.focal", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setFocal"} **/
						));
Claimresponseobj.setCoverage(HapiFHIRHelpers.createReference(claimresponse.getClmRspnsNsrncCvrgRfrnce() /** { "tree" :"ClaimResponse.insurance.coverage", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setCoverage"} **/
						));
Claimresponseobj.setBusinessArrangement(HapiFHIRHelpers.createstring(claimresponse.getClmRspnsNsrncBsnssrrngmntStrng() /** { "tree" :"ClaimResponse.insurance.businessArrangement", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setBusinessArrangement"} **/
						));
Claimresponseobj.setClaimResponse(HapiFHIRHelpers.createReference(claimresponse.getClmRspnsNsrncClmRspnsRfrnce() /** { "tree" :"ClaimResponse.insurance.claimResponse", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setClaimResponse"} **/
						));
Claimresponseobj.setItemSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsRrrTmSqncPstvnt() /** { "tree" :"ClaimResponse.error.itemSequence", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addError"] , "methodName" : "setItemSequence"} **/
						));
Claimresponseobj.setDetailSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsRrrDtlSqncPstvnt() /** { "tree" :"ClaimResponse.error.detailSequence", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addError"] , "methodName" : "setDetailSequence"} **/
						));
Claimresponseobj.setSubDetailSequence(HapiFHIRHelpers.createpositiveInt(claimresponse.getClmRspnsRrrSbDtlSqncPstvnt() /** { "tree" :"ClaimResponse.error.subDetailSequence", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addError"] , "methodName" : "setSubDetailSequence"} **/
						));
Claimresponseobj.setCode(HapiFHIRHelpers.createCodeableConcept(claimresponse.getClmRspnsRrrCdCcCdngCSstm() /** { "tree" :"ClaimResponse.error.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addError"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, claimresponse.getClmRspnsRrrCdCcCdngCVrsn() /** { "tree" :"ClaimResponse.error.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addError"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, claimresponse.getClmRspnsRrrCdCcCdngCCde() /** { "tree" :"ClaimResponse.error.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addError"] , "methodName" : "setCode, addCoding, setCode"} **/
						, claimresponse.getClmRspnsRrrCdCcCdngCDsplay() /** { "tree" :"ClaimResponse.error.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addError"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, claimresponse.getClmRspnsRrrCdCcCdngCSrSlctd() /** { "tree" :"ClaimResponse.error.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addError"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, claimresponse.getClaimResponseErrorCodeCcText() /** { "tree" :"ClaimResponse.error.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addError"] , "methodName" : "setCode, setText"} **/
		));
	}
}
