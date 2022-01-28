package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Chargeitem.
 * @see .Chargeitem
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ChargeitemConversion 
{
	public Patient Chargeitems(main.templateoutput.Model.Chargeitem chargeitem) 
	{
			Patient  Chargeitemobj = new Patient(); 

						Chargeitemobj.addIdentifier(HapiFHIRHelpers.createIdentifier(chargeitem.getChrgtmDntfrDntfrSe() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, chargeitem.getChrgtmDntfrDntfrTpCcCSstm() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, chargeitem.getChrgtmDntfrDntfrTpCcCVrsn() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, chargeitem.getChrgtmDntfrDntfrTpCcCCde() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, chargeitem.getChrgtmDntfrDntfrTpCcCDsplay() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, chargeitem.getChrgtmDntfrDntfrTpCcTxt() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, chargeitem.getChrgtmDntfrDntfrPrdPrdStrt() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, chargeitem.getChrgtmDntfrDntfrPrdPrdNd() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, chargeitem.getChrgtmDntfrDntfrSsgnr() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, chargeitem.getChrgtmDntfrDntfrVlue() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, chargeitem.getChrgtmDntfrDntfrSstm() /** { "tree" :"ChargeItem.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Chargeitemobj.addDefinitionUri(HapiFHIRHelpers.createuri(chargeitem.getChargeItemDefinitionUriUri() /** { "tree" :"ChargeItem.definitionUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDefinitionUri"} **/
						));
Chargeitemobj.addDefinitionCanonical(HapiFHIRHelpers.createcanonical(chargeitem.getChrgtmDfntnCnnclCnncl() /** { "tree" :"ChargeItem.definitionCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDefinitionCanonical"} **/
						));
Chargeitemobj.setStatus(HapiFHIRHelpers.createcode(chargeitem.getChargeItemStatusCode() /** { "tree" :"ChargeItem.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Chargeitemobj.addPartOf(HapiFHIRHelpers.createReference(chargeitem.getChargeItemPartOfReference() /** { "tree" :"ChargeItem.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Chargeitemobj.setCode(HapiFHIRHelpers.createCodeableConcept(chargeitem.getChargeItemCodeCcCodingCSystem() /** { "tree" :"ChargeItem.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, chargeitem.getChrgtmCdCcCdngCVrsn() /** { "tree" :"ChargeItem.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, chargeitem.getChargeItemCodeCcCodingCCode() /** { "tree" :"ChargeItem.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, chargeitem.getChrgtmCdCcCdngCDsplay() /** { "tree" :"ChargeItem.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmCdCcCdngCSrSlctd() /** { "tree" :"ChargeItem.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, chargeitem.getChargeItemCodeCcText() /** { "tree" :"ChargeItem.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Chargeitemobj.setSubject(HapiFHIRHelpers.createReference(chargeitem.getChargeItemSubjectReference() /** { "tree" :"ChargeItem.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Chargeitemobj.setContext(HapiFHIRHelpers.createReference(chargeitem.getChargeItemContextReference() /** { "tree" :"ChargeItem.context", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setContext"} **/
						));
Chargeitemobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(chargeitem.getChrgtmCcrrncDttmDtTme() /** { "tree" :"ChargeItem.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Chargeitemobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(chargeitem.getChrgtmCcrrncPrdPrdStrt() /** { "tree" :"ChargeItem.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, chargeitem.getChrgtmCcrrncPrdPrdNd() /** { "tree" :"ChargeItem.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Chargeitemobj.setOccurrenceTiming(HapiFHIRHelpers.createTiming(chargeitem.getChrgtmCcrrncTmngTmngCdCcCSstm() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setSystem"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngCdCcCVrsn() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setVersion"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngCdCcCCde() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setCode"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngCdCcCDsplay() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngCdCcCSrSlctd() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setUserSelected"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngCdCcTxt() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, setText"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngVnt() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, addEvent"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptDrtnnt() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationUnit"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptPrdnt() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodUnit"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptDfWk() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addDayOfWeek"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptWhn() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addWhen"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptDrtn() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDuration"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptDrtnMx() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationMax"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptPrd() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriod"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptPrdMx() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodMax"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptBndsDrtn() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsDuration"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptBndsPrd() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsPeriod"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptCnt() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCount"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptCntMx() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCountMax"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptFrqncy() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequency"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptFrqncMx() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequencyMax"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptBndsRnge() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsRange"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptTmfDay() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addTimeOfDay"} **/
						, chargeitem.getChrgtmCcrrncTmngTmngRptFfst() /** { "tree" :"ChargeItem.occurrenceTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setOffset"} **/
						));
Chargeitemobj.setFunction(HapiFHIRHelpers.createCodeableConcept(chargeitem.getChrgtmPrfrmrFnctnCcCdngCSstm() /** { "tree" :"ChargeItem.performer.function", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setSystem"} **/
						, chargeitem.getChrgtmPrfrmrFnctnCcCdngCVrsn() /** { "tree" :"ChargeItem.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setVersion"} **/
						, chargeitem.getChrgtmPrfrmrFnctnCcCdngCCde() /** { "tree" :"ChargeItem.performer.function", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setCode"} **/
						, chargeitem.getChrgtmPrfrmrFnctnCcCdngCDsplay() /** { "tree" :"ChargeItem.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmPrfrmrFnctnCcCdngCSrSlctd() /** { "tree" :"ChargeItem.performer.function", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setUserSelected"} **/
						, chargeitem.getChrgtmPrfrmrFnctnCcTxt() /** { "tree" :"ChargeItem.performer.function", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, setText"} **/
						));
Chargeitemobj.setActor(HapiFHIRHelpers.createReference(chargeitem.getChrgtmPrfrmrCtrRfrnce() /** { "tree" :"ChargeItem.performer.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPerformer"] , "methodName" : "setActor"} **/
						));
Chargeitemobj.setPerformingOrganization(HapiFHIRHelpers.createReference(chargeitem.getChrgtmPrfrmngrgnztnRfrnce() /** { "tree" :"ChargeItem.performingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformingOrganization"} **/
						));
Chargeitemobj.setRequestingOrganization(HapiFHIRHelpers.createReference(chargeitem.getChrgtmRqstngrgnztnRfrnce() /** { "tree" :"ChargeItem.requestingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestingOrganization"} **/
						));
Chargeitemobj.setCostCenter(HapiFHIRHelpers.createReference(chargeitem.getChargeItemCostCenterReference() /** { "tree" :"ChargeItem.costCenter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCostCenter"} **/
						));
Chargeitemobj.setQuantity(HapiFHIRHelpers.createQuantity(chargeitem.getChrgtmQnttQnttCmprtr() /** { "tree" :"ChargeItem.quantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setComparator"} **/
						, chargeitem.getChargeItemQuantityQuantityCode() /** { "tree" :"ChargeItem.quantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setCode"} **/
						, chargeitem.getChargeItemQuantityQuantityValue() /** { "tree" :"ChargeItem.quantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setValue"} **/
						, chargeitem.getChargeItemQuantityQuantityUnit() /** { "tree" :"ChargeItem.quantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setUnit"} **/
						, chargeitem.getChrgtmQnttQnttSstm() /** { "tree" :"ChargeItem.quantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setSystem"} **/
						));
Chargeitemobj.addBodysite(HapiFHIRHelpers.createCodeableConcept(chargeitem.getChrgtmBdstCcCdngCSstm() /** { "tree" :"ChargeItem.bodysite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodysite, addCoding, setSystem"} **/
						, chargeitem.getChrgtmBdstCcCdngCVrsn() /** { "tree" :"ChargeItem.bodysite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodysite, addCoding, setVersion"} **/
						, chargeitem.getChrgtmBdstCcCdngCCde() /** { "tree" :"ChargeItem.bodysite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodysite, addCoding, setCode"} **/
						, chargeitem.getChrgtmBdstCcCdngCDsplay() /** { "tree" :"ChargeItem.bodysite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodysite, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmBdstCcCdngCSrSlctd() /** { "tree" :"ChargeItem.bodysite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodysite, addCoding, setUserSelected"} **/
						, chargeitem.getChargeItemBodysiteCcText() /** { "tree" :"ChargeItem.bodysite", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodysite, setText"} **/
						));
Chargeitemobj.setFactorOverride(HapiFHIRHelpers.createdecimal(chargeitem.getChargeItemFactorOverrideDecimal() /** { "tree" :"ChargeItem.factorOverride", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFactorOverride"} **/
						));
Chargeitemobj.setPriceOverride(HapiFHIRHelpers.createMoney(chargeitem.getChrgtmPrcvrrdMnCrrncy() /** { "tree" :"ChargeItem.priceOverride", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriceOverride, setCurrency"} **/
						, chargeitem.getChrgtmPrcvrrdMnVlue() /** { "tree" :"ChargeItem.priceOverride", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriceOverride, setVal"} **/
						));
Chargeitemobj.setOverrideReason(HapiFHIRHelpers.createstring(chargeitem.getChargeItemOverrideReasonString() /** { "tree" :"ChargeItem.overrideReason", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOverrideReason"} **/
						));
Chargeitemobj.setEnterer(HapiFHIRHelpers.createReference(chargeitem.getChargeItemEntererReference() /** { "tree" :"ChargeItem.enterer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnterer"} **/
						));
Chargeitemobj.setEnteredDate(HapiFHIRHelpers.createdateTime(chargeitem.getChargeItemEnteredDateDateTime() /** { "tree" :"ChargeItem.enteredDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnteredDate"} **/
						));
Chargeitemobj.addReason(HapiFHIRHelpers.createCodeableConcept(chargeitem.getChrgtmRsnCcCdngCSstm() /** { "tree" :"ChargeItem.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setSystem"} **/
						, chargeitem.getChrgtmRsnCcCdngCVrsn() /** { "tree" :"ChargeItem.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setVersion"} **/
						, chargeitem.getChargeItemReasonCcCodingCCode() /** { "tree" :"ChargeItem.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setCode"} **/
						, chargeitem.getChrgtmRsnCcCdngCDsplay() /** { "tree" :"ChargeItem.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmRsnCcCdngCSrSlctd() /** { "tree" :"ChargeItem.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setUserSelected"} **/
						, chargeitem.getChargeItemReasonCcText() /** { "tree" :"ChargeItem.reason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, setText"} **/
						));
Chargeitemobj.addService(HapiFHIRHelpers.createReference(chargeitem.getChargeItemServiceReference() /** { "tree" :"ChargeItem.service", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addService"} **/
						));
Chargeitemobj.setProductReference(device | medication | substance)(HapiFHIRHelpers.createReference(chargeitem.getChrgtmPrdctRfrncRfrnce() /** { "tree" :"ChargeItem.productReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductReference(device | medication | substance)"} **/
						));
Chargeitemobj.setProductCodeableconcept(HapiFHIRHelpers.createCodeableConcept(chargeitem.getChrgtmPrdctCdblcncptCcCdngCSstm() /** { "tree" :"ChargeItem.productCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCodeableconcept, addCoding, setSystem"} **/
						, chargeitem.getChrgtmPrdctCdblcncptCcCdngCVrsn() /** { "tree" :"ChargeItem.productCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCodeableconcept, addCoding, setVersion"} **/
						, chargeitem.getChrgtmPrdctCdblcncptCcCdngCCde() /** { "tree" :"ChargeItem.productCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCodeableconcept, addCoding, setCode"} **/
						, chargeitem.getChrgtmPrdctCdblcncptCcCdngCDsplay() /** { "tree" :"ChargeItem.productCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCodeableconcept, addCoding, setDisplay"} **/
						, chargeitem.getChrgtmPrdctCdblcncptCcCdngCSrSlctd() /** { "tree" :"ChargeItem.productCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCodeableconcept, addCoding, setUserSelected"} **/
						, chargeitem.getChrgtmPrdctCdblcncptCcTxt() /** { "tree" :"ChargeItem.productCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProductCodeableconcept, setText"} **/
						));
Chargeitemobj.addAccount(HapiFHIRHelpers.createReference(chargeitem.getChargeItemAccountReference() /** { "tree" :"ChargeItem.account", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAccount"} **/
						));
Chargeitemobj.addNote(HapiFHIRHelpers.createAnnotation(chargeitem.getChargeItemNoteAnnotationTime() /** { "tree" :"ChargeItem.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, chargeitem.getChargeItemNoteAnnotationText() /** { "tree" :"ChargeItem.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, chargeitem.getChrgtmNtNnttnThrRfrnce() /** { "tree" :"ChargeItem.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, chargeitem.getChrgtmNtNnttnThrStrng() /** { "tree" :"ChargeItem.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Chargeitemobj.addSupportingInformation(HapiFHIRHelpers.createReference(chargeitem.getChrgtmSpprtngnfrmtnRfrnce() /** { "tree" :"ChargeItem.supportingInformation", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInformation"} **/
		));
	}
}
