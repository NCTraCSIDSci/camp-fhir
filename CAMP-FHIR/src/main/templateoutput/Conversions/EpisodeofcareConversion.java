package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Episodeofcare.
 * @see .Episodeofcare
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class EpisodeofcareConversion 
{
	public Patient Episodeofcares(main.templateoutput.Model.Episodeofcare episodeofcare) 
	{
			Patient  Episodeofcareobj = new Patient(); 

						Episodeofcareobj.addIdentifier(HapiFHIRHelpers.createIdentifier(episodeofcare.getEpsdfCrDntfrDntfrSe() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrTpCcCSstm() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrTpCcCVrsn() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrTpCcCCde() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrTpCcCDsplay() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrTpCcTxt() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrPrdPrdStrt() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrPrdPrdNd() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrSsgnr() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrVlue() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, episodeofcare.getEpsdfCrDntfrDntfrSstm() /** { "tree" :"EpisodeOfCare.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Episodeofcareobj.setStatus(HapiFHIRHelpers.createcode(episodeofcare.getEpisodeOfCareStatusCode() /** { "tree" :"EpisodeOfCare.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						, episodeofcare.getEpsdfCrSttsHstrSttsCde() /** { "tree" :"EpisodeOfCare.statusHistory.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addStatusHistory"] , "methodName" : "setStatus"} **/
						));
Episodeofcareobj.setPeriod(HapiFHIRHelpers.createPeriod(episodeofcare.getEpsdfCrSttsHstrPrdPrdStrt() /** { "tree" :"EpisodeOfCare.statusHistory.period", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : ["addStatusHistory"] , "methodName" : "setPeriod, setStart"} **/
						, episodeofcare.getEpsdfCrSttsHstrPrdPrdNd() /** { "tree" :"EpisodeOfCare.statusHistory.period", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : ["addStatusHistory"] , "methodName" : "setPeriod, setEnd"} **/
						));
Episodeofcareobj.addType(HapiFHIRHelpers.createCodeableConcept(episodeofcare.getEpsdfCrTpCcCdngCSstm() /** { "tree" :"EpisodeOfCare.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setSystem"} **/
						, episodeofcare.getEpsdfCrTpCcCdngCVrsn() /** { "tree" :"EpisodeOfCare.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setVersion"} **/
						, episodeofcare.getEpsdfCrTpCcCdngCCde() /** { "tree" :"EpisodeOfCare.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setCode"} **/
						, episodeofcare.getEpsdfCrTpCcCdngCDsplay() /** { "tree" :"EpisodeOfCare.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setDisplay"} **/
						, episodeofcare.getEpsdfCrTpCcCdngCSrSlctd() /** { "tree" :"EpisodeOfCare.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, episodeofcare.getEpisodeOfCareTypeCcText() /** { "tree" :"EpisodeOfCare.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, setText"} **/
						));
Episodeofcareobj.setCondition(HapiFHIRHelpers.createReference(episodeofcare.getEpsdfCrDgnssCndtnRfrnce() /** { "tree" :"EpisodeOfCare.diagnosis.condition", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setCondition"} **/
						));
Episodeofcareobj.setRole(HapiFHIRHelpers.createCodeableConcept(episodeofcare.getEpsdfCrDgnssRlCcCdngCSstm() /** { "tree" :"EpisodeOfCare.diagnosis.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRole, addCoding, setSystem"} **/
						, episodeofcare.getEpsdfCrDgnssRlCcCdngCVrsn() /** { "tree" :"EpisodeOfCare.diagnosis.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRole, addCoding, setVersion"} **/
						, episodeofcare.getEpsdfCrDgnssRlCcCdngCCde() /** { "tree" :"EpisodeOfCare.diagnosis.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRole, addCoding, setCode"} **/
						, episodeofcare.getEpsdfCrDgnssRlCcCdngCDsplay() /** { "tree" :"EpisodeOfCare.diagnosis.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRole, addCoding, setDisplay"} **/
						, episodeofcare.getEpsdfCrDgnssRlCcCdngCSrSlctd() /** { "tree" :"EpisodeOfCare.diagnosis.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRole, addCoding, setUserSelected"} **/
						, episodeofcare.getEpsdfCrDgnssRlCcTxt() /** { "tree" :"EpisodeOfCare.diagnosis.role", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRole, setText"} **/
						));
Episodeofcareobj.setRank(HapiFHIRHelpers.createpositiveInt(episodeofcare.getEpsdfCrDgnssRnkPstvnt() /** { "tree" :"EpisodeOfCare.diagnosis.rank", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRank"} **/
						));
Episodeofcareobj.setPatient(HapiFHIRHelpers.createReference(episodeofcare.getEpisodeOfCarePntReference() /** { "tree" :"EpisodeOfCare.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Episodeofcareobj.setManagingOrganization(HapiFHIRHelpers.createReference(episodeofcare.getEpsdfCrMngngrgnztnRfrnce() /** { "tree" :"EpisodeOfCare.managingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagingOrganization"} **/
						));
Episodeofcareobj.setPeriod(HapiFHIRHelpers.createPeriod(episodeofcare.getEpisodeOfCarePeriodPeriodStart() /** { "tree" :"EpisodeOfCare.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, episodeofcare.getEpisodeOfCarePeriodPeriodEnd() /** { "tree" :"EpisodeOfCare.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Episodeofcareobj.addReferralRequest(HapiFHIRHelpers.createReference(episodeofcare.getEpsdfCrRfrrlRqstRfrnce() /** { "tree" :"EpisodeOfCare.referralRequest", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralRequest"} **/
						));
Episodeofcareobj.setCareManager(HapiFHIRHelpers.createReference(episodeofcare.getEpsdfCrCrMngrRfrnce() /** { "tree" :"EpisodeOfCare.careManager", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCareManager"} **/
						));
Episodeofcareobj.addTeam(HapiFHIRHelpers.createReference(episodeofcare.getEpisodeOfCareTeamReference() /** { "tree" :"EpisodeOfCare.team", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTeam"} **/
						));
Episodeofcareobj.addAccount(HapiFHIRHelpers.createReference(episodeofcare.getEpisodeOfCareAccountReference() /** { "tree" :"EpisodeOfCare.account", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAccount"} **/
		));
	}
}
