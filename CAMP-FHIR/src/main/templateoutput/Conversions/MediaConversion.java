package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Media.
 * @see .Media
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MediaConversion 
{
	public Patient Medias(main.templateoutput.Model.Media media) 
	{
			Patient  Mediaobj = new Patient(); 

						Mediaobj.addIdentifier(HapiFHIRHelpers.createIdentifier(media.getMediaIdentifierIdentifierUse() /** { "tree" :"Media.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, media.getMdDntfrDntfrTpCcCSstm() /** { "tree" :"Media.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, media.getMdDntfrDntfrTpCcCVrsn() /** { "tree" :"Media.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, media.getMdDntfrDntfrTpCcCCde() /** { "tree" :"Media.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, media.getMdDntfrDntfrTpCcCDsplay() /** { "tree" :"Media.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, media.getMdDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Media.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, media.getMdDntfrDntfrTpCcTxt() /** { "tree" :"Media.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, media.getMdDntfrDntfrPrdPrdStrt() /** { "tree" :"Media.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, media.getMdDntfrDntfrPrdPrdNd() /** { "tree" :"Media.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, media.getMdDntfrDntfrSsgnr() /** { "tree" :"Media.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, media.getMediaIdentifierIdentifierValue() /** { "tree" :"Media.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, media.getMediaIdentifierIdentifierSystem() /** { "tree" :"Media.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Mediaobj.addBasedOn(HapiFHIRHelpers.createReference(media.getMediaBasedOnReference() /** { "tree" :"Media.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Mediaobj.addPartOf(HapiFHIRHelpers.createReference(media.getMediaPartOfReference() /** { "tree" :"Media.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Mediaobj.setStatus(HapiFHIRHelpers.createcode(media.getMediaStatusCode() /** { "tree" :"Media.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Mediaobj.setType(HapiFHIRHelpers.createCodeableConcept(media.getMediaTypeCcCodingCSystem() /** { "tree" :"Media.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, media.getMediaTypeCcCodingCVersion() /** { "tree" :"Media.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, media.getMediaTypeCcCodingCCode() /** { "tree" :"Media.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, media.getMediaTypeCcCodingCDisplay() /** { "tree" :"Media.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, media.getMdTpCcCdngCSrSlctd() /** { "tree" :"Media.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, media.getMediaTypeCcText() /** { "tree" :"Media.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Mediaobj.setModality(HapiFHIRHelpers.createCodeableConcept(media.getMediaModalityCcCodingCSystem() /** { "tree" :"Media.modality", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModality, addCoding, setSystem"} **/
						, media.getMediaModalityCcCodingCVersion() /** { "tree" :"Media.modality", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModality, addCoding, setVersion"} **/
						, media.getMediaModalityCcCodingCCode() /** { "tree" :"Media.modality", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModality, addCoding, setCode"} **/
						, media.getMediaModalityCcCodingCDisplay() /** { "tree" :"Media.modality", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModality, addCoding, setDisplay"} **/
						, media.getMdMdltCcCdngCSrSlctd() /** { "tree" :"Media.modality", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModality, addCoding, setUserSelected"} **/
						, media.getMediaModalityCcText() /** { "tree" :"Media.modality", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModality, setText"} **/
						));
Mediaobj.setView(HapiFHIRHelpers.createCodeableConcept(media.getMediaViewCcCodingCSystem() /** { "tree" :"Media.view", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setView, addCoding, setSystem"} **/
						, media.getMediaViewCcCodingCVersion() /** { "tree" :"Media.view", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setView, addCoding, setVersion"} **/
						, media.getMediaViewCcCodingCCode() /** { "tree" :"Media.view", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setView, addCoding, setCode"} **/
						, media.getMediaViewCcCodingCDisplay() /** { "tree" :"Media.view", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setView, addCoding, setDisplay"} **/
						, media.getMdVwCcCdngCSrSlctd() /** { "tree" :"Media.view", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setView, addCoding, setUserSelected"} **/
						, media.getMediaViewCcText() /** { "tree" :"Media.view", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setView, setText"} **/
						));
Mediaobj.setSubject(HapiFHIRHelpers.createReference(media.getMediaSubjectReference() /** { "tree" :"Media.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Mediaobj.setEncounter(HapiFHIRHelpers.createReference(media.getMediaEncounterReference() /** { "tree" :"Media.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Mediaobj.setCreated(HapiFHIRHelpers.createdateTimetype(media.getMediaCreatedDatetimeDateTime() /** { "tree" :"Media.createdDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreatedDatetime"} **/
						));
Mediaobj.setCreatedPeriod(HapiFHIRHelpers.createPeriod(media.getMediaCreatedPeriodPeriodStart() /** { "tree" :"Media.createdPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreatedPeriod, setStart"} **/
						, media.getMediaCreatedPeriodPeriodEnd() /** { "tree" :"Media.createdPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreatedPeriod, setEnd"} **/
						));
Mediaobj.setIssued(HapiFHIRHelpers.createinstant(media.getMediaIssuedInstant() /** { "tree" :"Media.issued", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIssued"} **/
						));
Mediaobj.setOperator(HapiFHIRHelpers.createReference(media.getMediaOperatorReference() /** { "tree" :"Media.operator", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperator"} **/
						));
Mediaobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(media.getMdRsnCdCcCdngCSstm() /** { "tree" :"Media.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, media.getMdRsnCdCcCdngCVrsn() /** { "tree" :"Media.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, media.getMediaReasonCodeCcCodingCCode() /** { "tree" :"Media.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, media.getMdRsnCdCcCdngCDsplay() /** { "tree" :"Media.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, media.getMdRsnCdCcCdngCSrSlctd() /** { "tree" :"Media.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, media.getMediaReasonCodeCcText() /** { "tree" :"Media.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Mediaobj.setBodySite(HapiFHIRHelpers.createCodeableConcept(media.getMediaBodySiteCcCodingCSystem() /** { "tree" :"Media.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setSystem"} **/
						, media.getMediaBodySiteCcCodingCVersion() /** { "tree" :"Media.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setVersion"} **/
						, media.getMediaBodySiteCcCodingCCode() /** { "tree" :"Media.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setCode"} **/
						, media.getMediaBodySiteCcCodingCDisplay() /** { "tree" :"Media.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setDisplay"} **/
						, media.getMdBdStCcCdngCSrSlctd() /** { "tree" :"Media.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setUserSelected"} **/
						, media.getMediaBodySiteCcText() /** { "tree" :"Media.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, setText"} **/
						));
Mediaobj.setDeviceName(HapiFHIRHelpers.createstring(media.getMediaDeviceNameString() /** { "tree" :"Media.deviceName", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeviceName"} **/
						));
Mediaobj.setDevice(HapiFHIRHelpers.createReference(media.getMediaDeviceReference() /** { "tree" :"Media.device", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDevice"} **/
						));
Mediaobj.setHeight(HapiFHIRHelpers.createpositiveInt(media.getMediaHeightPositiveInt() /** { "tree" :"Media.height", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setHeight"} **/
						));
Mediaobj.setWidth(HapiFHIRHelpers.createpositiveInt(media.getMediaWidthPositiveInt() /** { "tree" :"Media.width", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setWidth"} **/
						));
Mediaobj.setFrames(HapiFHIRHelpers.createpositiveInt(media.getMediaFramesPositiveInt() /** { "tree" :"Media.frames", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFrames"} **/
						));
Mediaobj.setDuration(HapiFHIRHelpers.createdecimal(media.getMediaDurationDecimal() /** { "tree" :"Media.duration", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDuration"} **/
						));
Mediaobj.setContent(HapiFHIRHelpers.createAttachment(media.getMediaContentAttachmentData() /** { "tree" :"Media.content", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setData"} **/
						, media.getMediaContentAttachmentHash() /** { "tree" :"Media.content", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setHash"} **/
						, media.getMdCntntTtchmntCntntTpe() /** { "tree" :"Media.content", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setContentType"} **/
						, media.getMediaContentAttachmentLanguage() /** { "tree" :"Media.content", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setLanguage"} **/
						, media.getMediaContentAttachmentCreation() /** { "tree" :"Media.content", "datatype" : "Attachment, dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setCreation"} **/
						, media.getMediaContentAttachmentTitle() /** { "tree" :"Media.content", "datatype" : "Attachment, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setTitle"} **/
						, media.getMediaContentAttachmentSize() /** { "tree" :"Media.content", "datatype" : "Attachment, unsignedInt", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setSize"} **/
						, media.getMediaContentAttachmentUrl() /** { "tree" :"Media.content", "datatype" : "Attachment, url", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent, setUrl"} **/
						));
Mediaobj.addNote(HapiFHIRHelpers.createAnnotation(media.getMediaNoteAnnotationTime() /** { "tree" :"Media.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, media.getMediaNoteAnnotationText() /** { "tree" :"Media.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, media.getMdNtNnttnThrRfrnce() /** { "tree" :"Media.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, media.getMediaNoteAnnotationAuthorString() /** { "tree" :"Media.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
