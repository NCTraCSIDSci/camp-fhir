package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicinalproductundesirableeffect.
 * @see .Medicinalproductundesirableeffect
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicinalproductundesirableeffectConversion 
{
	public Patient Medicinalproductundesirableeffects(main.templateoutput.Model.Medicinalproductundesirableeffect medicinalproductundesirableeffect) 
	{
			Patient  Medicinalproductundesirableeffectobj = new Patient(); 

						Medicinalproductundesirableeffectobj.addSubject(HapiFHIRHelpers.createReference(medicinalproductundesirableeffect.getMpndsrblffctSbjctRfrnce() /** { "tree" :"MedicinalProductUndesirableEffect.subject", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubject"} **/
						));
Medicinalproductundesirableeffectobj.setSymptomConditionEffect(HapiFHIRHelpers.createCodeableConcept(medicinalproductundesirableeffect.getMpndsrblffctSmptmCndtnffctCcCdngCSstm() /** { "tree" :"MedicinalProductUndesirableEffect.symptomConditionEffect", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSymptomConditionEffect, addCoding, setSystem"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctSmptmCndtnffctCcCdngCVrsn() /** { "tree" :"MedicinalProductUndesirableEffect.symptomConditionEffect", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSymptomConditionEffect, addCoding, setVersion"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctSmptmCndtnffctCcCdngCCde() /** { "tree" :"MedicinalProductUndesirableEffect.symptomConditionEffect", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSymptomConditionEffect, addCoding, setCode"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctSmptmCndtnffctCcCdngCDsplay() /** { "tree" :"MedicinalProductUndesirableEffect.symptomConditionEffect", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSymptomConditionEffect, addCoding, setDisplay"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctSmptmCndtnffctCcCdngCSrSlctd() /** { "tree" :"MedicinalProductUndesirableEffect.symptomConditionEffect", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSymptomConditionEffect, addCoding, setUserSelected"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctSmptmCndtnffctCcTxt() /** { "tree" :"MedicinalProductUndesirableEffect.symptomConditionEffect", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSymptomConditionEffect, setText"} **/
						));
Medicinalproductundesirableeffectobj.setClassification(HapiFHIRHelpers.createCodeableConcept(medicinalproductundesirableeffect.getMpndsrblffctClssfctnCcCdngCSstm() /** { "tree" :"MedicinalProductUndesirableEffect.classification", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClassification, addCoding, setSystem"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctClssfctnCcCdngCVrsn() /** { "tree" :"MedicinalProductUndesirableEffect.classification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClassification, addCoding, setVersion"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctClssfctnCcCdngCCde() /** { "tree" :"MedicinalProductUndesirableEffect.classification", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClassification, addCoding, setCode"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctClssfctnCcCdngCDsplay() /** { "tree" :"MedicinalProductUndesirableEffect.classification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClassification, addCoding, setDisplay"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctClssfctnCcCdngCSrSlctd() /** { "tree" :"MedicinalProductUndesirableEffect.classification", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClassification, addCoding, setUserSelected"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctClssfctnCcTxt() /** { "tree" :"MedicinalProductUndesirableEffect.classification", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClassification, setText"} **/
						));
Medicinalproductundesirableeffectobj.setFrequencyOfOccurrence(HapiFHIRHelpers.createCodeableConcept(medicinalproductundesirableeffect.getMpndsrblffctFrqncfccrrncCcCdngCSstm() /** { "tree" :"MedicinalProductUndesirableEffect.frequencyOfOccurrence", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrequencyOfOccurrence, addCoding, setSystem"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctFrqncfccrrncCcCdngCVrsn() /** { "tree" :"MedicinalProductUndesirableEffect.frequencyOfOccurrence", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrequencyOfOccurrence, addCoding, setVersion"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctFrqncfccrrncCcCdngCCde() /** { "tree" :"MedicinalProductUndesirableEffect.frequencyOfOccurrence", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrequencyOfOccurrence, addCoding, setCode"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctFrqncfccrrncCcCdngCDsplay() /** { "tree" :"MedicinalProductUndesirableEffect.frequencyOfOccurrence", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrequencyOfOccurrence, addCoding, setDisplay"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctFrqncfccrrncCcCdngCSrSlctd() /** { "tree" :"MedicinalProductUndesirableEffect.frequencyOfOccurrence", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrequencyOfOccurrence, addCoding, setUserSelected"} **/
						, medicinalproductundesirableeffect.getMpndsrblffctFrqncfccrrncCcTxt() /** { "tree" :"MedicinalProductUndesirableEffect.frequencyOfOccurrence", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrequencyOfOccurrence, setText"} **/
						));
Medicinalproductundesirableeffectobj.addPopulation(HapiFHIRHelpers.createPopulation(medicinalproductundesirableeffect.getMpndsrblffctPpltnPpltn() /** { "tree" :"MedicinalProductUndesirableEffect.population", "datatype" : "Population", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPopulation"} **/
		));
	}
}
