package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SpecimenDefinition;
public class SpecimenDefinitionBidirectionalConversion 
{
	public SpecimenDefinition SpecimenDefinitions(org.hl7.fhir.r4.model.SpecimenDefinition specimendefinition) throws ParseException
	{
		 main.java.com.campfhir.model.SpecimenDefinition s = new  main.java.com.campfhir.model.SpecimenDefinition();

		/******************** id ********************************************************************************/
		s.setId(specimendefinition.getIdElement().getIdPart());

		/******************** specimendefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimendefinitionidentifier = specimendefinition.getIdentifier();

		/******************** SpcmnDfn_Id_Vl ********************************************************************************/
		if(specimendefinitionidentifier.hasValue()) {

			s.addSpcmnDfnIdVl(String.valueOf(specimendefinitionidentifier.getValue()));
		} else {
			s.addSpcmnDfnIdVl("NULL");
		}


		/******************** specimendefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitionidentifiertype = specimendefinitionidentifier.getType();

		/******************** SpcmnDfn_Id_Typ_Txt ********************************************************************************/
		if(specimendefinitionidentifiertype.hasText()) {

			s.addSpcmnDfnIdTypTxt(String.valueOf(specimendefinitionidentifiertype.getText()));
		} else {
			s.addSpcmnDfnIdTypTxt("NULL");
		}


		/******************** specimendefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitionidentifiertypecodinglist = specimendefinitionidentifiertype.getCoding();
		for(int specimendefinitionidentifiertypecodingi = 0; specimendefinitionidentifiertypecodingi<specimendefinitionidentifiertypecodinglist.size();specimendefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitionidentifiertypecoding = specimendefinitionidentifiertypecodinglist.get(specimendefinitionidentifiertypecodingi);

		/******************** SpcmnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(specimendefinitionidentifiertypecodingi == 0) {s.addSpcmnDfnIdTypCdgDsply("[");}
		if(specimendefinitionidentifiertypecoding.hasDisplay()) {

			s.addSpcmnDfnIdTypCdgDsply(String.valueOf(specimendefinitionidentifiertypecoding.getDisplay()));
		} else {
			s.addSpcmnDfnIdTypCdgDsply("NULL");
		}

		if(specimendefinitionidentifiertypecodingi == specimendefinitionidentifiertypecodinglist.size()-1) {s.addSpcmnDfnIdTypCdgDsply("]");}


		/******************** SpcmnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitionidentifiertypecodingi == 0) {s.addSpcmnDfnIdTypCdgVrsn("[");}
		if(specimendefinitionidentifiertypecoding.hasVersion()) {

			s.addSpcmnDfnIdTypCdgVrsn(String.valueOf(specimendefinitionidentifiertypecoding.getVersion()));
		} else {
			s.addSpcmnDfnIdTypCdgVrsn("NULL");
		}

		if(specimendefinitionidentifiertypecodingi == specimendefinitionidentifiertypecodinglist.size()-1) {s.addSpcmnDfnIdTypCdgVrsn("]");}


		/******************** SpcmnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(specimendefinitionidentifiertypecodingi == 0) {s.addSpcmnDfnIdTypCdgCd("[");}
		if(specimendefinitionidentifiertypecoding.hasCode()) {

			s.addSpcmnDfnIdTypCdgCd(String.valueOf(specimendefinitionidentifiertypecoding.getCode()));
		} else {
			s.addSpcmnDfnIdTypCdgCd("NULL");
		}

		if(specimendefinitionidentifiertypecodingi == specimendefinitionidentifiertypecodinglist.size()-1) {s.addSpcmnDfnIdTypCdgCd("]");}


		/******************** SpcmnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitionidentifiertypecodingi == 0) {s.addSpcmnDfnIdTypCdgUsrSltd("[");}
		if(specimendefinitionidentifiertypecoding.hasUserSelected()) {

			s.addSpcmnDfnIdTypCdgUsrSltd(String.valueOf(specimendefinitionidentifiertypecoding.getUserSelected()));
		} else {
			s.addSpcmnDfnIdTypCdgUsrSltd("NULL");
		}

		if(specimendefinitionidentifiertypecodingi == specimendefinitionidentifiertypecodinglist.size()-1) {s.addSpcmnDfnIdTypCdgUsrSltd("]");}


		/******************** SpcmnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(specimendefinitionidentifiertypecodingi == 0) {s.addSpcmnDfnIdTypCdgSys("[");}
		if(specimendefinitionidentifiertypecoding.hasSystem()) {

			s.addSpcmnDfnIdTypCdgSys(String.valueOf(specimendefinitionidentifiertypecoding.getSystem()));
		} else {
			s.addSpcmnDfnIdTypCdgSys("NULL");
		}

		if(specimendefinitionidentifiertypecodingi == specimendefinitionidentifiertypecodinglist.size()-1) {s.addSpcmnDfnIdTypCdgSys("]");}


		 };
		/******************** specimendefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimendefinitionidentifierperiod = specimendefinitionidentifier.getPeriod();

		/******************** SpcmnDfn_Id_Prd_Strt ********************************************************************************/
		if(specimendefinitionidentifierperiod.hasStart()) {

			s.addSpcmnDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimendefinitionidentifierperiod.getStart())+"\"");
		} else {
			s.addSpcmnDfnIdPrdStrt("NULL");
		}


		/******************** SpcmnDfn_Id_Prd_End ********************************************************************************/
		if(specimendefinitionidentifierperiod.hasEnd()) {

			s.addSpcmnDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimendefinitionidentifierperiod.getEnd())+"\"");
		} else {
			s.addSpcmnDfnIdPrdEnd("NULL");
		}


		/******************** specimendefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimendefinitionidentifieruse = specimendefinitionidentifier.getUse();
		if(specimendefinitionidentifieruse!=null) {
			s.addSpcmnDfnIdUse(specimendefinitionidentifieruse.toCode());
		} else {
			s.addSpcmnDfnIdUse("NULL");
		}

		/******************** SpcmnDfn_Id_Assigner ********************************************************************************/
		if(specimendefinitionidentifier.hasAssigner()) {

			if(specimendefinitionidentifier.getAssigner().getReference() != null) {
			s.addSpcmnDfnIdAssigner(specimendefinitionidentifier.getAssigner().getReference());
			}
		} else {
			s.addSpcmnDfnIdAssigner("NULL");
		}


		/******************** SpcmnDfn_Id_Sys ********************************************************************************/
		if(specimendefinitionidentifier.hasSystem()) {

			s.addSpcmnDfnIdSys(String.valueOf(specimendefinitionidentifier.getSystem()));
		} else {
			s.addSpcmnDfnIdSys("NULL");
		}


		/******************** specimendefinitioncollection ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> specimendefinitioncollectionlist = specimendefinition.getCollection();
		for(int specimendefinitioncollectioni = 0; specimendefinitioncollectioni<specimendefinitioncollectionlist.size();specimendefinitioncollectioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  specimendefinitioncollection = specimendefinitioncollectionlist.get(specimendefinitioncollectioni);

		/******************** SpcmnDfn_Collection_Txt ********************************************************************************/
		if(specimendefinitioncollectioni == 0) {s.addSpcmnDfnCollectionTxt("[");}
		if(specimendefinitioncollection.hasText()) {

			s.addSpcmnDfnCollectionTxt(String.valueOf(specimendefinitioncollection.getText()));
		} else {
			s.addSpcmnDfnCollectionTxt("NULL");
		}

		if(specimendefinitioncollectioni == specimendefinitioncollectionlist.size()-1) {s.addSpcmnDfnCollectionTxt("]");}


		/******************** specimendefinitioncollectioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitioncollectioncodinglist = specimendefinitioncollection.getCoding();
		for(int specimendefinitioncollectioncodingi = 0; specimendefinitioncollectioncodingi<specimendefinitioncollectioncodinglist.size();specimendefinitioncollectioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitioncollectioncoding = specimendefinitioncollectioncodinglist.get(specimendefinitioncollectioncodingi);

		/******************** SpcmnDfn_Collection_Cdg_Dsply ********************************************************************************/
		if(specimendefinitioncollectioncodingi == 0) {s.addSpcmnDfnCollectionCdgDsply("[[");}
		if(specimendefinitioncollectioncoding.hasDisplay()) {

			s.addSpcmnDfnCollectionCdgDsply(String.valueOf(specimendefinitioncollectioncoding.getDisplay()));
		} else {
			s.addSpcmnDfnCollectionCdgDsply("NULL");
		}

		if(specimendefinitioncollectioncodingi == specimendefinitioncollectioncodinglist.size()-1) {s.addSpcmnDfnCollectionCdgDsply("]]");}


		/******************** SpcmnDfn_Collection_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitioncollectioncodingi == 0) {s.addSpcmnDfnCollectionCdgVrsn("[[");}
		if(specimendefinitioncollectioncoding.hasVersion()) {

			s.addSpcmnDfnCollectionCdgVrsn(String.valueOf(specimendefinitioncollectioncoding.getVersion()));
		} else {
			s.addSpcmnDfnCollectionCdgVrsn("NULL");
		}

		if(specimendefinitioncollectioncodingi == specimendefinitioncollectioncodinglist.size()-1) {s.addSpcmnDfnCollectionCdgVrsn("]]");}


		/******************** SpcmnDfn_Collection_Cdg_Cd ********************************************************************************/
		if(specimendefinitioncollectioncodingi == 0) {s.addSpcmnDfnCollectionCdgCd("[[");}
		if(specimendefinitioncollectioncoding.hasCode()) {

			s.addSpcmnDfnCollectionCdgCd(String.valueOf(specimendefinitioncollectioncoding.getCode()));
		} else {
			s.addSpcmnDfnCollectionCdgCd("NULL");
		}

		if(specimendefinitioncollectioncodingi == specimendefinitioncollectioncodinglist.size()-1) {s.addSpcmnDfnCollectionCdgCd("]]");}


		/******************** SpcmnDfn_Collection_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitioncollectioncodingi == 0) {s.addSpcmnDfnCollectionCdgUsrSltd("[[");}
		if(specimendefinitioncollectioncoding.hasUserSelected()) {

			s.addSpcmnDfnCollectionCdgUsrSltd(String.valueOf(specimendefinitioncollectioncoding.getUserSelected()));
		} else {
			s.addSpcmnDfnCollectionCdgUsrSltd("NULL");
		}

		if(specimendefinitioncollectioncodingi == specimendefinitioncollectioncodinglist.size()-1) {s.addSpcmnDfnCollectionCdgUsrSltd("]]");}


		/******************** SpcmnDfn_Collection_Cdg_Sys ********************************************************************************/
		if(specimendefinitioncollectioncodingi == 0) {s.addSpcmnDfnCollectionCdgSys("[[");}
		if(specimendefinitioncollectioncoding.hasSystem()) {

			s.addSpcmnDfnCollectionCdgSys(String.valueOf(specimendefinitioncollectioncoding.getSystem()));
		} else {
			s.addSpcmnDfnCollectionCdgSys("NULL");
		}

		if(specimendefinitioncollectioncodingi == specimendefinitioncollectioncodinglist.size()-1) {s.addSpcmnDfnCollectionCdgSys("]]");}


		 };
		 };
		/******************** specimendefinitionpatientpreparation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> specimendefinitionpatientpreparationlist = specimendefinition.getPatientPreparation();
		for(int specimendefinitionpatientpreparationi = 0; specimendefinitionpatientpreparationi<specimendefinitionpatientpreparationlist.size();specimendefinitionpatientpreparationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  specimendefinitionpatientpreparation = specimendefinitionpatientpreparationlist.get(specimendefinitionpatientpreparationi);

		/******************** SpcmnDfn_PntPreparation_Txt ********************************************************************************/
		if(specimendefinitionpatientpreparationi == 0) {s.addSpcmnDfnPntPreparationTxt("[");}
		if(specimendefinitionpatientpreparation.hasText()) {

			s.addSpcmnDfnPntPreparationTxt(String.valueOf(specimendefinitionpatientpreparation.getText()));
		} else {
			s.addSpcmnDfnPntPreparationTxt("NULL");
		}

		if(specimendefinitionpatientpreparationi == specimendefinitionpatientpreparationlist.size()-1) {s.addSpcmnDfnPntPreparationTxt("]");}


		/******************** specimendefinitionpatientpreparationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitionpatientpreparationcodinglist = specimendefinitionpatientpreparation.getCoding();
		for(int specimendefinitionpatientpreparationcodingi = 0; specimendefinitionpatientpreparationcodingi<specimendefinitionpatientpreparationcodinglist.size();specimendefinitionpatientpreparationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitionpatientpreparationcoding = specimendefinitionpatientpreparationcodinglist.get(specimendefinitionpatientpreparationcodingi);

		/******************** SpcmnDfn_PntPreparation_Cdg_Dsply ********************************************************************************/
		if(specimendefinitionpatientpreparationcodingi == 0) {s.addSpcmnDfnPntPreparationCdgDsply("[[");}
		if(specimendefinitionpatientpreparationcoding.hasDisplay()) {

			s.addSpcmnDfnPntPreparationCdgDsply(String.valueOf(specimendefinitionpatientpreparationcoding.getDisplay()));
		} else {
			s.addSpcmnDfnPntPreparationCdgDsply("NULL");
		}

		if(specimendefinitionpatientpreparationcodingi == specimendefinitionpatientpreparationcodinglist.size()-1) {s.addSpcmnDfnPntPreparationCdgDsply("]]");}


		/******************** SpcmnDfn_PntPreparation_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitionpatientpreparationcodingi == 0) {s.addSpcmnDfnPntPreparationCdgVrsn("[[");}
		if(specimendefinitionpatientpreparationcoding.hasVersion()) {

			s.addSpcmnDfnPntPreparationCdgVrsn(String.valueOf(specimendefinitionpatientpreparationcoding.getVersion()));
		} else {
			s.addSpcmnDfnPntPreparationCdgVrsn("NULL");
		}

		if(specimendefinitionpatientpreparationcodingi == specimendefinitionpatientpreparationcodinglist.size()-1) {s.addSpcmnDfnPntPreparationCdgVrsn("]]");}


		/******************** SpcmnDfn_PntPreparation_Cdg_Cd ********************************************************************************/
		if(specimendefinitionpatientpreparationcodingi == 0) {s.addSpcmnDfnPntPreparationCdgCd("[[");}
		if(specimendefinitionpatientpreparationcoding.hasCode()) {

			s.addSpcmnDfnPntPreparationCdgCd(String.valueOf(specimendefinitionpatientpreparationcoding.getCode()));
		} else {
			s.addSpcmnDfnPntPreparationCdgCd("NULL");
		}

		if(specimendefinitionpatientpreparationcodingi == specimendefinitionpatientpreparationcodinglist.size()-1) {s.addSpcmnDfnPntPreparationCdgCd("]]");}


		/******************** SpcmnDfn_PntPreparation_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitionpatientpreparationcodingi == 0) {s.addSpcmnDfnPntPreparationCdgUsrSltd("[[");}
		if(specimendefinitionpatientpreparationcoding.hasUserSelected()) {

			s.addSpcmnDfnPntPreparationCdgUsrSltd(String.valueOf(specimendefinitionpatientpreparationcoding.getUserSelected()));
		} else {
			s.addSpcmnDfnPntPreparationCdgUsrSltd("NULL");
		}

		if(specimendefinitionpatientpreparationcodingi == specimendefinitionpatientpreparationcodinglist.size()-1) {s.addSpcmnDfnPntPreparationCdgUsrSltd("]]");}


		/******************** SpcmnDfn_PntPreparation_Cdg_Sys ********************************************************************************/
		if(specimendefinitionpatientpreparationcodingi == 0) {s.addSpcmnDfnPntPreparationCdgSys("[[");}
		if(specimendefinitionpatientpreparationcoding.hasSystem()) {

			s.addSpcmnDfnPntPreparationCdgSys(String.valueOf(specimendefinitionpatientpreparationcoding.getSystem()));
		} else {
			s.addSpcmnDfnPntPreparationCdgSys("NULL");
		}

		if(specimendefinitionpatientpreparationcodingi == specimendefinitionpatientpreparationcodinglist.size()-1) {s.addSpcmnDfnPntPreparationCdgSys("]]");}


		 };
		 };
		/******************** SpcmnDfn_TimeAspect ********************************************************************************/
		if(specimendefinition.hasTimeAspect()) {

			s.addSpcmnDfnTimeAspect(String.valueOf(specimendefinition.getTimeAspect()));
		} else {
			s.addSpcmnDfnTimeAspect("NULL");
		}


		/******************** specimendefinitiontypetested ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedComponent> specimendefinitiontypetestedlist = specimendefinition.getTypeTested();
		for(int specimendefinitiontypetestedi = 0; specimendefinitiontypetestedi<specimendefinitiontypetestedlist.size();specimendefinitiontypetestedi++ ) {
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedComponent  specimendefinitiontypetested = specimendefinitiontypetestedlist.get(specimendefinitiontypetestedi);

		/******************** specimendefinitiontypetestedtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedtype = specimendefinitiontypetested.getType();

		/******************** SpcmnDfn_TypTsted_Typ_Txt ********************************************************************************/
		if(specimendefinitiontypetestedi == 0) {s.addSpcmnDfnTypTstedTypTxt("[");}
		if(specimendefinitiontypetestedtype.hasText()) {

			s.addSpcmnDfnTypTstedTypTxt(String.valueOf(specimendefinitiontypetestedtype.getText()));
		} else {
			s.addSpcmnDfnTypTstedTypTxt("NULL");
		}

		if(specimendefinitiontypetestedi == specimendefinitiontypetestedlist.size()-1) {s.addSpcmnDfnTypTstedTypTxt("]");}


		/******************** specimendefinitiontypetestedtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedtypecodinglist = specimendefinitiontypetestedtype.getCoding();
		for(int specimendefinitiontypetestedtypecodingi = 0; specimendefinitiontypetestedtypecodingi<specimendefinitiontypetestedtypecodinglist.size();specimendefinitiontypetestedtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedtypecoding = specimendefinitiontypetestedtypecodinglist.get(specimendefinitiontypetestedtypecodingi);

		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedtypecodingi == 0) {s.addSpcmnDfnTypTstedTypCdgDsply("[[");}
		if(specimendefinitiontypetestedtypecoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedTypCdgDsply(String.valueOf(specimendefinitiontypetestedtypecoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedTypCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedtypecodingi == specimendefinitiontypetestedtypecodinglist.size()-1) {s.addSpcmnDfnTypTstedTypCdgDsply("]]");}


		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedtypecodingi == 0) {s.addSpcmnDfnTypTstedTypCdgVrsn("[[");}
		if(specimendefinitiontypetestedtypecoding.hasVersion()) {

			s.addSpcmnDfnTypTstedTypCdgVrsn(String.valueOf(specimendefinitiontypetestedtypecoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedTypCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedtypecodingi == specimendefinitiontypetestedtypecodinglist.size()-1) {s.addSpcmnDfnTypTstedTypCdgVrsn("]]");}


		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedtypecodingi == 0) {s.addSpcmnDfnTypTstedTypCdgCd("[[");}
		if(specimendefinitiontypetestedtypecoding.hasCode()) {

			s.addSpcmnDfnTypTstedTypCdgCd(String.valueOf(specimendefinitiontypetestedtypecoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedTypCdgCd("NULL");
		}

		if(specimendefinitiontypetestedtypecodingi == specimendefinitiontypetestedtypecodinglist.size()-1) {s.addSpcmnDfnTypTstedTypCdgCd("]]");}


		/******************** SpcmnDfn_TypTsted_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedtypecodingi == 0) {s.addSpcmnDfnTypTstedTypCdgUsrSltd("[[");}
		if(specimendefinitiontypetestedtypecoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedTypCdgUsrSltd(String.valueOf(specimendefinitiontypetestedtypecoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedTypCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedtypecodingi == specimendefinitiontypetestedtypecodinglist.size()-1) {s.addSpcmnDfnTypTstedTypCdgUsrSltd("]]");}


		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedtypecodingi == 0) {s.addSpcmnDfnTypTstedTypCdgSys("[[");}
		if(specimendefinitiontypetestedtypecoding.hasSystem()) {

			s.addSpcmnDfnTypTstedTypCdgSys(String.valueOf(specimendefinitiontypetestedtypecoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedTypCdgSys("NULL");
		}

		if(specimendefinitiontypetestedtypecodingi == specimendefinitiontypetestedtypecodinglist.size()-1) {s.addSpcmnDfnTypTstedTypCdgSys("]]");}


		 };
		/******************** specimendefinitiontypetestedrejectioncriterion ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> specimendefinitiontypetestedrejectioncriterionlist = specimendefinitiontypetested.getRejectionCriterion();
		for(int specimendefinitiontypetestedrejectioncriterioni = 0; specimendefinitiontypetestedrejectioncriterioni<specimendefinitiontypetestedrejectioncriterionlist.size();specimendefinitiontypetestedrejectioncriterioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  specimendefinitiontypetestedrejectioncriterion = specimendefinitiontypetestedrejectioncriterionlist.get(specimendefinitiontypetestedrejectioncriterioni);

		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Txt ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioni == 0) {s.addSpcmnDfnTypTstedRejectionCriterionTxt("[[");}
		if(specimendefinitiontypetestedrejectioncriterion.hasText()) {

			s.addSpcmnDfnTypTstedRejectionCriterionTxt(String.valueOf(specimendefinitiontypetestedrejectioncriterion.getText()));
		} else {
			s.addSpcmnDfnTypTstedRejectionCriterionTxt("NULL");
		}

		if(specimendefinitiontypetestedrejectioncriterioni == specimendefinitiontypetestedrejectioncriterionlist.size()-1) {s.addSpcmnDfnTypTstedRejectionCriterionTxt("]]");}


		/******************** specimendefinitiontypetestedrejectioncriterioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedrejectioncriterioncodinglist = specimendefinitiontypetestedrejectioncriterion.getCoding();
		for(int specimendefinitiontypetestedrejectioncriterioncodingi = 0; specimendefinitiontypetestedrejectioncriterioncodingi<specimendefinitiontypetestedrejectioncriterioncodinglist.size();specimendefinitiontypetestedrejectioncriterioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedrejectioncriterioncoding = specimendefinitiontypetestedrejectioncriterioncodinglist.get(specimendefinitiontypetestedrejectioncriterioncodingi);

		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncodingi == 0) {s.addSpcmnDfnTypTstedRejectionCriterionCdgDsply("[[[");}
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedRejectionCriterionCdgDsply(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedRejectionCriterionCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedrejectioncriterioncodingi == specimendefinitiontypetestedrejectioncriterioncodinglist.size()-1) {s.addSpcmnDfnTypTstedRejectionCriterionCdgDsply("]]]");}


		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncodingi == 0) {s.addSpcmnDfnTypTstedRejectionCriterionCdgVrsn("[[[");}
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasVersion()) {

			s.addSpcmnDfnTypTstedRejectionCriterionCdgVrsn(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedRejectionCriterionCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedrejectioncriterioncodingi == specimendefinitiontypetestedrejectioncriterioncodinglist.size()-1) {s.addSpcmnDfnTypTstedRejectionCriterionCdgVrsn("]]]");}


		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncodingi == 0) {s.addSpcmnDfnTypTstedRejectionCriterionCdgCd("[[[");}
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasCode()) {

			s.addSpcmnDfnTypTstedRejectionCriterionCdgCd(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedRejectionCriterionCdgCd("NULL");
		}

		if(specimendefinitiontypetestedrejectioncriterioncodingi == specimendefinitiontypetestedrejectioncriterioncodinglist.size()-1) {s.addSpcmnDfnTypTstedRejectionCriterionCdgCd("]]]");}


		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncodingi == 0) {s.addSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd("[[[");}
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedrejectioncriterioncodingi == specimendefinitiontypetestedrejectioncriterioncodinglist.size()-1) {s.addSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd("]]]");}


		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncodingi == 0) {s.addSpcmnDfnTypTstedRejectionCriterionCdgSys("[[[");}
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasSystem()) {

			s.addSpcmnDfnTypTstedRejectionCriterionCdgSys(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedRejectionCriterionCdgSys("NULL");
		}

		if(specimendefinitiontypetestedrejectioncriterioncodingi == specimendefinitiontypetestedrejectioncriterioncodinglist.size()-1) {s.addSpcmnDfnTypTstedRejectionCriterionCdgSys("]]]");}


		 };
		 };
		/******************** specimendefinitiontypetestedcontainer ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerComponent specimendefinitiontypetestedcontainer = specimendefinitiontypetested.getContainer();

		/******************** specimendefinitiontypetestedcontainertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainertype = specimendefinitiontypetestedcontainer.getType();

		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontainertype.hasText()) {

			s.addSpcmnDfnTypTstedCntainerTypTxt(String.valueOf(specimendefinitiontypetestedcontainertype.getText()));
		} else {
			s.addSpcmnDfnTypTstedCntainerTypTxt("NULL");
		}


		/******************** specimendefinitiontypetestedcontainertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedcontainertypecodinglist = specimendefinitiontypetestedcontainertype.getCoding();
		for(int specimendefinitiontypetestedcontainertypecodingi = 0; specimendefinitiontypetestedcontainertypecodingi<specimendefinitiontypetestedcontainertypecodinglist.size();specimendefinitiontypetestedcontainertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedcontainertypecoding = specimendefinitiontypetestedcontainertypecodinglist.get(specimendefinitiontypetestedcontainertypecodingi);

		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecodingi == 0) {s.addSpcmnDfnTypTstedCntainerTypCdgDsply("[[");}
		if(specimendefinitiontypetestedcontainertypecoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedCntainerTypCdgDsply(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedCntainerTypCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedcontainertypecodingi == specimendefinitiontypetestedcontainertypecodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerTypCdgDsply("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecodingi == 0) {s.addSpcmnDfnTypTstedCntainerTypCdgVrsn("[[");}
		if(specimendefinitiontypetestedcontainertypecoding.hasVersion()) {

			s.addSpcmnDfnTypTstedCntainerTypCdgVrsn(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedCntainerTypCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedcontainertypecodingi == specimendefinitiontypetestedcontainertypecodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerTypCdgVrsn("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecodingi == 0) {s.addSpcmnDfnTypTstedCntainerTypCdgCd("[[");}
		if(specimendefinitiontypetestedcontainertypecoding.hasCode()) {

			s.addSpcmnDfnTypTstedCntainerTypCdgCd(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedCntainerTypCdgCd("NULL");
		}

		if(specimendefinitiontypetestedcontainertypecodingi == specimendefinitiontypetestedcontainertypecodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerTypCdgCd("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecodingi == 0) {s.addSpcmnDfnTypTstedCntainerTypCdgUsrSltd("[[");}
		if(specimendefinitiontypetestedcontainertypecoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedCntainerTypCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedCntainerTypCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedcontainertypecodingi == specimendefinitiontypetestedcontainertypecodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerTypCdgUsrSltd("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecodingi == 0) {s.addSpcmnDfnTypTstedCntainerTypCdgSys("[[");}
		if(specimendefinitiontypetestedcontainertypecoding.hasSystem()) {

			s.addSpcmnDfnTypTstedCntainerTypCdgSys(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedCntainerTypCdgSys("NULL");
		}

		if(specimendefinitiontypetestedcontainertypecodingi == specimendefinitiontypetestedcontainertypecodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerTypCdgSys("]]");}


		 };
		/******************** SpcmnDfn_TypTsted_Cntainer_Dscrptn ********************************************************************************/
		if(specimendefinitiontypetestedcontainer.hasDescription()) {

			s.addSpcmnDfnTypTstedCntainerDscrptn(String.valueOf(specimendefinitiontypetestedcontainer.getDescription()));
		} else {
			s.addSpcmnDfnTypTstedCntainerDscrptn("NULL");
		}


		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeStrgTyp ********************************************************************************/
		if(specimendefinitiontypetestedcontainer.hasMinimumVolumeStringType()) {

			s.addSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp("\""+specimendefinitiontypetestedcontainer.getMinimumVolumeStringType().getValueAsString()+"\"");
		} else {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp("NULL");
		}


		/******************** specimendefinitiontypetestedcontainerminimumvolumequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedcontainerminimumvolumequantity = specimendefinitiontypetestedcontainer.getMinimumVolumeQuantity();

		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Vl ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasValue()) {

			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getValue()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl("NULL");
		}


		/******************** specimendefinitiontypetestedcontainerminimumvolumequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedcontainerminimumvolumequantitycomparator = specimendefinitiontypetestedcontainerminimumvolumequantity.getComparator();
		if(specimendefinitiontypetestedcontainerminimumvolumequantitycomparator!=null) {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyCmprtr(specimendefinitiontypetestedcontainerminimumvolumequantitycomparator.toCode());
		} else {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyCmprtr("NULL");
		}

		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasCode()) {

			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getCode()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd("NULL");
		}


		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Unt ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasUnit()) {

			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getUnit()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt("NULL");
		}


		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasSystem()) {

			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntySys(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMinimumVolumeQntySys("NULL");
		}


		/******************** specimendefinitiontypetestedcontainermaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainermaterial = specimendefinitiontypetestedcontainer.getMaterial();

		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterial.hasText()) {

			s.addSpcmnDfnTypTstedCntainerMtrlTxt(String.valueOf(specimendefinitiontypetestedcontainermaterial.getText()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMtrlTxt("NULL");
		}


		/******************** specimendefinitiontypetestedcontainermaterialcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedcontainermaterialcodinglist = specimendefinitiontypetestedcontainermaterial.getCoding();
		for(int specimendefinitiontypetestedcontainermaterialcodingi = 0; specimendefinitiontypetestedcontainermaterialcodingi<specimendefinitiontypetestedcontainermaterialcodinglist.size();specimendefinitiontypetestedcontainermaterialcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedcontainermaterialcoding = specimendefinitiontypetestedcontainermaterialcodinglist.get(specimendefinitiontypetestedcontainermaterialcodingi);

		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcodingi == 0) {s.addSpcmnDfnTypTstedCntainerMtrlCdgDsply("[[");}
		if(specimendefinitiontypetestedcontainermaterialcoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedCntainerMtrlCdgDsply(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMtrlCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedcontainermaterialcodingi == specimendefinitiontypetestedcontainermaterialcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerMtrlCdgDsply("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcodingi == 0) {s.addSpcmnDfnTypTstedCntainerMtrlCdgVrsn("[[");}
		if(specimendefinitiontypetestedcontainermaterialcoding.hasVersion()) {

			s.addSpcmnDfnTypTstedCntainerMtrlCdgVrsn(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMtrlCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedcontainermaterialcodingi == specimendefinitiontypetestedcontainermaterialcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerMtrlCdgVrsn("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcodingi == 0) {s.addSpcmnDfnTypTstedCntainerMtrlCdgCd("[[");}
		if(specimendefinitiontypetestedcontainermaterialcoding.hasCode()) {

			s.addSpcmnDfnTypTstedCntainerMtrlCdgCd(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMtrlCdgCd("NULL");
		}

		if(specimendefinitiontypetestedcontainermaterialcodingi == specimendefinitiontypetestedcontainermaterialcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerMtrlCdgCd("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcodingi == 0) {s.addSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd("[[");}
		if(specimendefinitiontypetestedcontainermaterialcoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedcontainermaterialcodingi == specimendefinitiontypetestedcontainermaterialcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcodingi == 0) {s.addSpcmnDfnTypTstedCntainerMtrlCdgSys("[[");}
		if(specimendefinitiontypetestedcontainermaterialcoding.hasSystem()) {

			s.addSpcmnDfnTypTstedCntainerMtrlCdgSys(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedCntainerMtrlCdgSys("NULL");
		}

		if(specimendefinitiontypetestedcontainermaterialcodingi == specimendefinitiontypetestedcontainermaterialcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerMtrlCdgSys("]]");}


		 };
		/******************** specimendefinitiontypetestedcontainercapacity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedcontainercapacity = specimendefinitiontypetestedcontainer.getCapacity();

		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Vl ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasValue()) {

			s.addSpcmnDfnTypTstedCntainerCapacityVl(String.valueOf(specimendefinitiontypetestedcontainercapacity.getValue()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapacityVl("NULL");
		}


		/******************** specimendefinitiontypetestedcontainercapacitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedcontainercapacitycomparator = specimendefinitiontypetestedcontainercapacity.getComparator();
		if(specimendefinitiontypetestedcontainercapacitycomparator!=null) {
			s.addSpcmnDfnTypTstedCntainerCapacityCmprtr(specimendefinitiontypetestedcontainercapacitycomparator.toCode());
		} else {
			s.addSpcmnDfnTypTstedCntainerCapacityCmprtr("NULL");
		}

		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasCode()) {

			s.addSpcmnDfnTypTstedCntainerCapacityCd(String.valueOf(specimendefinitiontypetestedcontainercapacity.getCode()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapacityCd("NULL");
		}


		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Unt ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasUnit()) {

			s.addSpcmnDfnTypTstedCntainerCapacityUnt(String.valueOf(specimendefinitiontypetestedcontainercapacity.getUnit()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapacityUnt("NULL");
		}


		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasSystem()) {

			s.addSpcmnDfnTypTstedCntainerCapacitySys(String.valueOf(specimendefinitiontypetestedcontainercapacity.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapacitySys("NULL");
		}


		/******************** specimendefinitiontypetestedcontaineradditive ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerAdditiveComponent> specimendefinitiontypetestedcontaineradditivelist = specimendefinitiontypetestedcontainer.getAdditive();
		for(int specimendefinitiontypetestedcontaineradditivei = 0; specimendefinitiontypetestedcontaineradditivei<specimendefinitiontypetestedcontaineradditivelist.size();specimendefinitiontypetestedcontaineradditivei++ ) {
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerAdditiveComponent  specimendefinitiontypetestedcontaineradditive = specimendefinitiontypetestedcontaineradditivelist.get(specimendefinitiontypetestedcontaineradditivei);

		/******************** specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept = specimendefinitiontypetestedcontaineradditive.getAdditiveCodeableConcept();

		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditivei == 0) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt("[[");}
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.hasText()) {

			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.getText()));
		} else {
			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt("NULL");
		}

		if(specimendefinitiontypetestedcontaineradditivei == specimendefinitiontypetestedcontaineradditivelist.size()-1) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt("]]");}


		/******************** specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist = specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.getCoding();
		for(int specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi = 0; specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi<specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.size();specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding = specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.get(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi);

		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == 0) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply("[[[");}
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply("]]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == 0) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn("[[[");}
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasVersion()) {

			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn("]]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == 0) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd("[[[");}
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasCode()) {

			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd("NULL");
		}

		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd("]]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == 0) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd("[[[");}
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd("]]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == 0) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys("[[[");}
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasSystem()) {

			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys("NULL");
		}

		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodingi == specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys("]]]");}


		 };
		 };
		/******************** specimendefinitiontypetestedcontainercap ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainercap = specimendefinitiontypetestedcontainer.getCap();

		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontainercap.hasText()) {

			s.addSpcmnDfnTypTstedCntainerCapTxt(String.valueOf(specimendefinitiontypetestedcontainercap.getText()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapTxt("NULL");
		}


		/******************** specimendefinitiontypetestedcontainercapcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedcontainercapcodinglist = specimendefinitiontypetestedcontainercap.getCoding();
		for(int specimendefinitiontypetestedcontainercapcodingi = 0; specimendefinitiontypetestedcontainercapcodingi<specimendefinitiontypetestedcontainercapcodinglist.size();specimendefinitiontypetestedcontainercapcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedcontainercapcoding = specimendefinitiontypetestedcontainercapcodinglist.get(specimendefinitiontypetestedcontainercapcodingi);

		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcodingi == 0) {s.addSpcmnDfnTypTstedCntainerCapCdgDsply("[[");}
		if(specimendefinitiontypetestedcontainercapcoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedCntainerCapCdgDsply(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedcontainercapcodingi == specimendefinitiontypetestedcontainercapcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerCapCdgDsply("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcodingi == 0) {s.addSpcmnDfnTypTstedCntainerCapCdgVrsn("[[");}
		if(specimendefinitiontypetestedcontainercapcoding.hasVersion()) {

			s.addSpcmnDfnTypTstedCntainerCapCdgVrsn(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedcontainercapcodingi == specimendefinitiontypetestedcontainercapcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerCapCdgVrsn("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcodingi == 0) {s.addSpcmnDfnTypTstedCntainerCapCdgCd("[[");}
		if(specimendefinitiontypetestedcontainercapcoding.hasCode()) {

			s.addSpcmnDfnTypTstedCntainerCapCdgCd(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapCdgCd("NULL");
		}

		if(specimendefinitiontypetestedcontainercapcodingi == specimendefinitiontypetestedcontainercapcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerCapCdgCd("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcodingi == 0) {s.addSpcmnDfnTypTstedCntainerCapCdgUsrSltd("[[");}
		if(specimendefinitiontypetestedcontainercapcoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedCntainerCapCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedcontainercapcodingi == specimendefinitiontypetestedcontainercapcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerCapCdgUsrSltd("]]");}


		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcodingi == 0) {s.addSpcmnDfnTypTstedCntainerCapCdgSys("[[");}
		if(specimendefinitiontypetestedcontainercapcoding.hasSystem()) {

			s.addSpcmnDfnTypTstedCntainerCapCdgSys(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedCntainerCapCdgSys("NULL");
		}

		if(specimendefinitiontypetestedcontainercapcodingi == specimendefinitiontypetestedcontainercapcodinglist.size()-1) {s.addSpcmnDfnTypTstedCntainerCapCdgSys("]]");}


		 };
		/******************** SpcmnDfn_TypTsted_Cntainer_Preparation ********************************************************************************/
		if(specimendefinitiontypetestedcontainer.hasPreparation()) {

			s.addSpcmnDfnTypTstedCntainerPreparation(String.valueOf(specimendefinitiontypetestedcontainer.getPreparation()));
		} else {
			s.addSpcmnDfnTypTstedCntainerPreparation("NULL");
		}


		/******************** specimendefinitiontypetestedpreference ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenContainedPreference specimendefinitiontypetestedpreference = specimendefinitiontypetested.getPreference();
		if(specimendefinitiontypetestedpreference!=null) {
			s.addSpcmnDfnTypTstedPreference(specimendefinitiontypetestedpreference.toCode());
		} else {
			s.addSpcmnDfnTypTstedPreference("NULL");
		}

		/******************** specimendefinitiontypetestedretentiontime ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimendefinitiontypetestedretentiontime = specimendefinitiontypetested.getRetentionTime();

		/******************** SpcmnDfn_TypTsted_RetentionTime_Vl ********************************************************************************/
		if(specimendefinitiontypetestedretentiontime.hasValue()) {

			s.addSpcmnDfnTypTstedRetentionTimeVl(String.valueOf(specimendefinitiontypetestedretentiontime.getValue()));
		} else {
			s.addSpcmnDfnTypTstedRetentionTimeVl("NULL");
		}


		/******************** specimendefinitiontypetestedretentiontimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedretentiontimecomparator = specimendefinitiontypetestedretentiontime.getComparator();
		if(specimendefinitiontypetestedretentiontimecomparator!=null) {
			s.addSpcmnDfnTypTstedRetentionTimeCmprtr(specimendefinitiontypetestedretentiontimecomparator.toCode());
		} else {
			s.addSpcmnDfnTypTstedRetentionTimeCmprtr("NULL");
		}

		/******************** SpcmnDfn_TypTsted_RetentionTime_Cd ********************************************************************************/
		if(specimendefinitiontypetestedretentiontime.hasCode()) {

			s.addSpcmnDfnTypTstedRetentionTimeCd(String.valueOf(specimendefinitiontypetestedretentiontime.getCode()));
		} else {
			s.addSpcmnDfnTypTstedRetentionTimeCd("NULL");
		}


		/******************** SpcmnDfn_TypTsted_RetentionTime_Unt ********************************************************************************/
		if(specimendefinitiontypetestedretentiontime.hasUnit()) {

			s.addSpcmnDfnTypTstedRetentionTimeUnt(String.valueOf(specimendefinitiontypetestedretentiontime.getUnit()));
		} else {
			s.addSpcmnDfnTypTstedRetentionTimeUnt("NULL");
		}


		/******************** SpcmnDfn_TypTsted_RetentionTime_Sys ********************************************************************************/
		if(specimendefinitiontypetestedretentiontime.hasSystem()) {

			s.addSpcmnDfnTypTstedRetentionTimeSys(String.valueOf(specimendefinitiontypetestedretentiontime.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedRetentionTimeSys("NULL");
		}


		/******************** specimendefinitiontypetestedhandling ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedHandlingComponent> specimendefinitiontypetestedhandlinglist = specimendefinitiontypetested.getHandling();
		for(int specimendefinitiontypetestedhandlingi = 0; specimendefinitiontypetestedhandlingi<specimendefinitiontypetestedhandlinglist.size();specimendefinitiontypetestedhandlingi++ ) {
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedHandlingComponent  specimendefinitiontypetestedhandling = specimendefinitiontypetestedhandlinglist.get(specimendefinitiontypetestedhandlingi);

		/******************** specimendefinitiontypetestedhandlingtemperaturerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range specimendefinitiontypetestedhandlingtemperaturerange = specimendefinitiontypetestedhandling.getTemperatureRange();

		/******************** specimendefinitiontypetestedhandlingtemperaturerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedhandlingtemperaturerangelow = specimendefinitiontypetestedhandlingtemperaturerange.getLow();

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Vl ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwVl("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasValue()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwVl(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getValue()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwVl("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwVl("]]");}


		/******************** specimendefinitiontypetestedhandlingtemperaturerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedhandlingtemperaturerangelowcomparator = specimendefinitiontypetestedhandlingtemperaturerangelow.getComparator();
		if(specimendefinitiontypetestedhandlingtemperaturerangelowcomparator!=null) {
		if(specimendefinitiontypetestedhandlingi == 0) {

		s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr("[[");		}
			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr(specimendefinitiontypetestedhandlingtemperaturerangelowcomparator.toCode());
		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {

		s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr("]]");		}

		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr("NULL");
		}

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCd("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasCode()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getCode()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCd("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwCd("]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Unt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwUnt("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasUnit()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwUnt(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getUnit()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwUnt("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwUnt("]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwSys("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasSystem()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwSys(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngLwSys("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngLwSys("]]");}


		/******************** specimendefinitiontypetestedhandlingtemperaturerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedhandlingtemperaturerangehigh = specimendefinitiontypetestedhandlingtemperaturerange.getHigh();

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Vl ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiVl("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasValue()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiVl(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getValue()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiVl("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiVl("]]");}


		/******************** specimendefinitiontypetestedhandlingtemperaturerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedhandlingtemperaturerangehighcomparator = specimendefinitiontypetestedhandlingtemperaturerangehigh.getComparator();
		if(specimendefinitiontypetestedhandlingtemperaturerangehighcomparator!=null) {
		if(specimendefinitiontypetestedhandlingi == 0) {

		s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr("[[");		}
			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr(specimendefinitiontypetestedhandlingtemperaturerangehighcomparator.toCode());
		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {

		s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr("]]");		}

		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr("NULL");
		}

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCd("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasCode()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getCode()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCd("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiCd("]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Unt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiUnt("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasUnit()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiUnt(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getUnit()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiUnt("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiUnt("]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiSys("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasSystem()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiSys(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureRngHiSys("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureRngHiSys("]]");}


		/******************** specimendefinitiontypetestedhandlingtemperaturequalifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedhandlingtemperaturequalifier = specimendefinitiontypetestedhandling.getTemperatureQualifier();

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Txt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierTxt("[[");}
		if(specimendefinitiontypetestedhandlingtemperaturequalifier.hasText()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierTxt(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifier.getText()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierTxt("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierTxt("]]");}


		/******************** specimendefinitiontypetestedhandlingtemperaturequalifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist = specimendefinitiontypetestedhandlingtemperaturequalifier.getCoding();
		for(int specimendefinitiontypetestedhandlingtemperaturequalifiercodingi = 0; specimendefinitiontypetestedhandlingtemperaturequalifiercodingi<specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.size();specimendefinitiontypetestedhandlingtemperaturequalifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypetestedhandlingtemperaturequalifiercoding = specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.get(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi);

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply("[[[");}
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasDisplay()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply("NULL");
		}

		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply("]]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn("[[[");}
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasVersion()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getVersion()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn("NULL");
		}

		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn("]]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd("[[[");}
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasCode()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getCode()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd("NULL");
		}

		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd("]]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd("[[[");}
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasUserSelected()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd("]]]");}


		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == 0) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys("[[[");}
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasSystem()) {

			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys("NULL");
		}

		if(specimendefinitiontypetestedhandlingtemperaturequalifiercodingi == specimendefinitiontypetestedhandlingtemperaturequalifiercodinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys("]]]");}


		 };
		/******************** SpcmnDfn_TypTsted_Handling_Instrctn ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingInstrctn("[[");}
		if(specimendefinitiontypetestedhandling.hasInstruction()) {

			s.addSpcmnDfnTypTstedHandlingInstrctn(String.valueOf(specimendefinitiontypetestedhandling.getInstruction()));
		} else {
			s.addSpcmnDfnTypTstedHandlingInstrctn("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingInstrctn("]]");}


		/******************** specimendefinitiontypetestedhandlingmaxduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimendefinitiontypetestedhandlingmaxduration = specimendefinitiontypetestedhandling.getMaxDuration();

		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Vl ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingMxDurationVl("[[");}
		if(specimendefinitiontypetestedhandlingmaxduration.hasValue()) {

			s.addSpcmnDfnTypTstedHandlingMxDurationVl(String.valueOf(specimendefinitiontypetestedhandlingmaxduration.getValue()));
		} else {
			s.addSpcmnDfnTypTstedHandlingMxDurationVl("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingMxDurationVl("]]");}


		/******************** specimendefinitiontypetestedhandlingmaxdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedhandlingmaxdurationcomparator = specimendefinitiontypetestedhandlingmaxduration.getComparator();
		if(specimendefinitiontypetestedhandlingmaxdurationcomparator!=null) {
		if(specimendefinitiontypetestedhandlingi == 0) {

		s.addSpcmnDfnTypTstedHandlingMxDurationCmprtr("[[");		}
			s.addSpcmnDfnTypTstedHandlingMxDurationCmprtr(specimendefinitiontypetestedhandlingmaxdurationcomparator.toCode());
		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {

		s.addSpcmnDfnTypTstedHandlingMxDurationCmprtr("]]");		}

		} else {
			s.addSpcmnDfnTypTstedHandlingMxDurationCmprtr("NULL");
		}

		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingMxDurationCd("[[");}
		if(specimendefinitiontypetestedhandlingmaxduration.hasCode()) {

			s.addSpcmnDfnTypTstedHandlingMxDurationCd(String.valueOf(specimendefinitiontypetestedhandlingmaxduration.getCode()));
		} else {
			s.addSpcmnDfnTypTstedHandlingMxDurationCd("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingMxDurationCd("]]");}


		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Unt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingMxDurationUnt("[[");}
		if(specimendefinitiontypetestedhandlingmaxduration.hasUnit()) {

			s.addSpcmnDfnTypTstedHandlingMxDurationUnt(String.valueOf(specimendefinitiontypetestedhandlingmaxduration.getUnit()));
		} else {
			s.addSpcmnDfnTypTstedHandlingMxDurationUnt("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingMxDurationUnt("]]");}


		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingi == 0) {s.addSpcmnDfnTypTstedHandlingMxDurationSys("[[");}
		if(specimendefinitiontypetestedhandlingmaxduration.hasSystem()) {

			s.addSpcmnDfnTypTstedHandlingMxDurationSys(String.valueOf(specimendefinitiontypetestedhandlingmaxduration.getSystem()));
		} else {
			s.addSpcmnDfnTypTstedHandlingMxDurationSys("NULL");
		}

		if(specimendefinitiontypetestedhandlingi == specimendefinitiontypetestedhandlinglist.size()-1) {s.addSpcmnDfnTypTstedHandlingMxDurationSys("]]");}


		 };
		/******************** SpcmnDfn_TypTsted_Rqrment ********************************************************************************/
		if(specimendefinitiontypetested.hasRequirement()) {

			s.addSpcmnDfnTypTstedRqrment(String.valueOf(specimendefinitiontypetested.getRequirement()));
		} else {
			s.addSpcmnDfnTypTstedRqrment("NULL");
		}


		/******************** SpcmnDfn_TypTsted_IsDerived ********************************************************************************/
		if(specimendefinitiontypetested.hasIsDerived()) {

			s.addSpcmnDfnTypTstedIsDerived(String.valueOf(specimendefinitiontypetested.getIsDerived()));
		} else {
			s.addSpcmnDfnTypTstedIsDerived("NULL");
		}


		 };
		/******************** specimendefinitiontypecollected ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypecollected = specimendefinition.getTypeCollected();

		/******************** SpcmnDfn_TypCollected_Txt ********************************************************************************/
		if(specimendefinitiontypecollected.hasText()) {

			s.addSpcmnDfnTypCollectedTxt(String.valueOf(specimendefinitiontypecollected.getText()));
		} else {
			s.addSpcmnDfnTypCollectedTxt("NULL");
		}


		/******************** specimendefinitiontypecollectedcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimendefinitiontypecollectedcodinglist = specimendefinitiontypecollected.getCoding();
		for(int specimendefinitiontypecollectedcodingi = 0; specimendefinitiontypecollectedcodingi<specimendefinitiontypecollectedcodinglist.size();specimendefinitiontypecollectedcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimendefinitiontypecollectedcoding = specimendefinitiontypecollectedcodinglist.get(specimendefinitiontypecollectedcodingi);

		/******************** SpcmnDfn_TypCollected_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypecollectedcodingi == 0) {s.addSpcmnDfnTypCollectedCdgDsply("[");}
		if(specimendefinitiontypecollectedcoding.hasDisplay()) {

			s.addSpcmnDfnTypCollectedCdgDsply(String.valueOf(specimendefinitiontypecollectedcoding.getDisplay()));
		} else {
			s.addSpcmnDfnTypCollectedCdgDsply("NULL");
		}

		if(specimendefinitiontypecollectedcodingi == specimendefinitiontypecollectedcodinglist.size()-1) {s.addSpcmnDfnTypCollectedCdgDsply("]");}


		/******************** SpcmnDfn_TypCollected_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypecollectedcodingi == 0) {s.addSpcmnDfnTypCollectedCdgVrsn("[");}
		if(specimendefinitiontypecollectedcoding.hasVersion()) {

			s.addSpcmnDfnTypCollectedCdgVrsn(String.valueOf(specimendefinitiontypecollectedcoding.getVersion()));
		} else {
			s.addSpcmnDfnTypCollectedCdgVrsn("NULL");
		}

		if(specimendefinitiontypecollectedcodingi == specimendefinitiontypecollectedcodinglist.size()-1) {s.addSpcmnDfnTypCollectedCdgVrsn("]");}


		/******************** SpcmnDfn_TypCollected_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypecollectedcodingi == 0) {s.addSpcmnDfnTypCollectedCdgCd("[");}
		if(specimendefinitiontypecollectedcoding.hasCode()) {

			s.addSpcmnDfnTypCollectedCdgCd(String.valueOf(specimendefinitiontypecollectedcoding.getCode()));
		} else {
			s.addSpcmnDfnTypCollectedCdgCd("NULL");
		}

		if(specimendefinitiontypecollectedcodingi == specimendefinitiontypecollectedcodinglist.size()-1) {s.addSpcmnDfnTypCollectedCdgCd("]");}


		/******************** SpcmnDfn_TypCollected_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypecollectedcodingi == 0) {s.addSpcmnDfnTypCollectedCdgUsrSltd("[");}
		if(specimendefinitiontypecollectedcoding.hasUserSelected()) {

			s.addSpcmnDfnTypCollectedCdgUsrSltd(String.valueOf(specimendefinitiontypecollectedcoding.getUserSelected()));
		} else {
			s.addSpcmnDfnTypCollectedCdgUsrSltd("NULL");
		}

		if(specimendefinitiontypecollectedcodingi == specimendefinitiontypecollectedcodinglist.size()-1) {s.addSpcmnDfnTypCollectedCdgUsrSltd("]");}


		/******************** SpcmnDfn_TypCollected_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypecollectedcodingi == 0) {s.addSpcmnDfnTypCollectedCdgSys("[");}
		if(specimendefinitiontypecollectedcoding.hasSystem()) {

			s.addSpcmnDfnTypCollectedCdgSys(String.valueOf(specimendefinitiontypecollectedcoding.getSystem()));
		} else {
			s.addSpcmnDfnTypCollectedCdgSys("NULL");
		}

		if(specimendefinitiontypecollectedcodingi == specimendefinitiontypecollectedcodinglist.size()-1) {s.addSpcmnDfnTypCollectedCdgSys("]");}


		 };
		return s;
	}
}
