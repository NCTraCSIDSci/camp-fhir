package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Specimen;
public class SpecimenBidirectionalConversion 
{
	public Specimen Specimens(org.hl7.fhir.r4.model.Specimen specimen) throws ParseException
	{
		 main.java.com.campfhir.model.Specimen s = new  main.java.com.campfhir.model.Specimen();

		/******************** id ********************************************************************************/
		specimen.setId(s.getId());

		/******************** specimentype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimentype = specimen.getType();

		/******************** specimentypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimentypecoding = specimentype.getCodingFirstRep();

		/******************** Spcmn_Typ_Cdg_Dsply ********************************************************************************/
		if(specimentypecoding.hasDisplay()) {
			s.setSpcmnTypCdgDsply(String.valueOf(specimentypecoding.getDisplay()));
		}
		/******************** Spcmn_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimentypecoding.hasVersion()) {
			s.setSpcmnTypCdgVrsn(String.valueOf(specimentypecoding.getVersion()));
		}
		/******************** Spcmn_Typ_Cdg_Cd ********************************************************************************/
		if(specimentypecoding.hasCode()) {
			s.setSpcmnTypCdgCd(String.valueOf(specimentypecoding.getCode()));
		}
		/******************** Spcmn_Typ_Cdg_Sys ********************************************************************************/
		if(specimentypecoding.hasSystem()) {
			s.setSpcmnTypCdgSys(String.valueOf(specimentypecoding.getSystem()));
		}
		/******************** Spcmn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimentypecoding.hasUserSelected()) {
			s.setSpcmnTypCdgUsrSltd(String.valueOf(specimentypecoding.getUserSelected()));
		}
		/******************** Spcmn_Typ_Txt ********************************************************************************/
		if(specimentype.hasText()) {
			s.setSpcmnTypTxt(String.valueOf(specimentype.getText()));
		}
		/******************** specimenprocessing ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent specimenprocessing = specimen.getProcessingFirstRep();

		/******************** Spcmn_Processing_Dscrptn ********************************************************************************/
		if(specimenprocessing.hasDescription()) {
			s.setSpcmnProcessingDscrptn(String.valueOf(specimenprocessing.getDescription()));
		}
		/******************** Spcmn_Processing_TimeDtTimeTyp ********************************************************************************/
		if(specimenprocessing.hasTimeDateTimeType()) {
			s.setSpcmnProcessingTimeDtTimeTyp(String.valueOf(specimenprocessing.getTimeDateTimeType()));
		}
		/******************** specimenprocessingtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenprocessingtimeperiod = specimenprocessing.getTimePeriod();

		/******************** Spcmn_Processing_TimePrd_End ********************************************************************************/
		if(specimenprocessingtimeperiod.hasEnd()) {
			s.setSpcmnProcessingTimePrdEnd(String.valueOf(specimenprocessingtimeperiod.getEnd()));
		}
		/******************** Spcmn_Processing_TimePrd_Strt ********************************************************************************/
		if(specimenprocessingtimeperiod.hasStart()) {
			s.setSpcmnProcessingTimePrdStrt(String.valueOf(specimenprocessingtimeperiod.getStart()));
		}
		/******************** specimenprocessingprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenprocessingprocedure = specimenprocessing.getProcedure();

		/******************** specimenprocessingprocedurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenprocessingprocedurecoding = specimenprocessingprocedure.getCodingFirstRep();

		/******************** Spcmn_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(specimenprocessingprocedurecoding.hasDisplay()) {
			s.setSpcmnProcessingPrcdrCdgDsply(String.valueOf(specimenprocessingprocedurecoding.getDisplay()));
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(specimenprocessingprocedurecoding.hasVersion()) {
			s.setSpcmnProcessingPrcdrCdgVrsn(String.valueOf(specimenprocessingprocedurecoding.getVersion()));
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(specimenprocessingprocedurecoding.hasCode()) {
			s.setSpcmnProcessingPrcdrCdgCd(String.valueOf(specimenprocessingprocedurecoding.getCode()));
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(specimenprocessingprocedurecoding.hasSystem()) {
			s.setSpcmnProcessingPrcdrCdgSys(String.valueOf(specimenprocessingprocedurecoding.getSystem()));
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(specimenprocessingprocedurecoding.hasUserSelected()) {
			s.setSpcmnProcessingPrcdrCdgUsrSltd(String.valueOf(specimenprocessingprocedurecoding.getUserSelected()));
		}
		/******************** Spcmn_Processing_Prcdr_Txt ********************************************************************************/
		if(specimenprocessingprocedure.hasText()) {
			s.setSpcmnProcessingPrcdrTxt(String.valueOf(specimenprocessingprocedure.getText()));
		}
		/******************** Spcmn_Processing_Addtv ********************************************************************************/
		if(specimenprocessing.hasAdditive()) {
			s.setSpcmnProcessingAddtv(String.valueOf(specimenprocessing.getAdditiveFirstRep()));
		}
		/******************** Spcmn_Sbjct ********************************************************************************/
		if(specimen.hasSubject()) {
			s.setSpcmnSbjct(String.valueOf(specimen.getSubject()));
		}
		/******************** specimenstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenStatus specimenstatus = specimen.getStatus();
		s.setSpcmnSts(specimenstatus.toCode());

		/******************** specimennote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation specimennote = specimen.getNoteFirstRep();

		/******************** Spcmn_Nt_Time ********************************************************************************/
		if(specimennote.hasTime()) {
			s.setSpcmnNtTime(String.valueOf(specimennote.getTime()));
		}
		/******************** Spcmn_Nt_AthrRfrnc ********************************************************************************/
		if(specimennote.hasAuthorReference()) {
			s.setSpcmnNtAthrRfrnc(String.valueOf(specimennote.getAuthorReference()));
		}
		/******************** Spcmn_Nt_Txt ********************************************************************************/
		if(specimennote.hasText()) {
			s.setSpcmnNtTxt(String.valueOf(specimennote.getText()));
		}
		/******************** Spcmn_Nt_AthrStrgTyp ********************************************************************************/
		if(specimennote.hasAuthorStringType()) {
			s.setSpcmnNtAthrStrgTyp(String.valueOf(specimennote.getAuthorStringType()));
		}
		/******************** specimenaccessionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimenaccessionidentifier = specimen.getAccessionIdentifier();

		/******************** Spcmn_AccessionId_Vl ********************************************************************************/
		if(specimenaccessionidentifier.hasValue()) {
			s.setSpcmnAccessionIdVl(String.valueOf(specimenaccessionidentifier.getValue()));
		}
		/******************** specimenaccessionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenaccessionidentifiertype = specimenaccessionidentifier.getType();

		/******************** specimenaccessionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenaccessionidentifiertypecoding = specimenaccessionidentifiertype.getCodingFirstRep();

		/******************** Spcmn_AccessionId_Typ_Cdg_Dsply ********************************************************************************/
		if(specimenaccessionidentifiertypecoding.hasDisplay()) {
			s.setSpcmnAccessionIdTypCdgDsply(String.valueOf(specimenaccessionidentifiertypecoding.getDisplay()));
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimenaccessionidentifiertypecoding.hasVersion()) {
			s.setSpcmnAccessionIdTypCdgVrsn(String.valueOf(specimenaccessionidentifiertypecoding.getVersion()));
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Cd ********************************************************************************/
		if(specimenaccessionidentifiertypecoding.hasCode()) {
			s.setSpcmnAccessionIdTypCdgCd(String.valueOf(specimenaccessionidentifiertypecoding.getCode()));
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Sys ********************************************************************************/
		if(specimenaccessionidentifiertypecoding.hasSystem()) {
			s.setSpcmnAccessionIdTypCdgSys(String.valueOf(specimenaccessionidentifiertypecoding.getSystem()));
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimenaccessionidentifiertypecoding.hasUserSelected()) {
			s.setSpcmnAccessionIdTypCdgUsrSltd(String.valueOf(specimenaccessionidentifiertypecoding.getUserSelected()));
		}
		/******************** Spcmn_AccessionId_Typ_Txt ********************************************************************************/
		if(specimenaccessionidentifiertype.hasText()) {
			s.setSpcmnAccessionIdTypTxt(String.valueOf(specimenaccessionidentifiertype.getText()));
		}
		/******************** Spcmn_AccessionId_Sys ********************************************************************************/
		if(specimenaccessionidentifier.hasSystem()) {
			s.setSpcmnAccessionIdSys(String.valueOf(specimenaccessionidentifier.getSystem()));
		}
		/******************** Spcmn_AccessionId_Assigner ********************************************************************************/
		if(specimenaccessionidentifier.hasAssigner()) {
			s.setSpcmnAccessionIdAssigner(String.valueOf(specimenaccessionidentifier.getAssigner()));
		}
		/******************** specimenaccessionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenaccessionidentifierperiod = specimenaccessionidentifier.getPeriod();

		/******************** Spcmn_AccessionId_Prd_End ********************************************************************************/
		if(specimenaccessionidentifierperiod.hasEnd()) {
			s.setSpcmnAccessionIdPrdEnd(String.valueOf(specimenaccessionidentifierperiod.getEnd()));
		}
		/******************** Spcmn_AccessionId_Prd_Strt ********************************************************************************/
		if(specimenaccessionidentifierperiod.hasStart()) {
			s.setSpcmnAccessionIdPrdStrt(String.valueOf(specimenaccessionidentifierperiod.getStart()));
		}
		/******************** specimenaccessionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimenaccessionidentifieruse = specimenaccessionidentifier.getUse();
		s.setSpcmnAccessionIdUse(specimenaccessionidentifieruse.toCode());

		/******************** specimencontainer ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent specimencontainer = specimen.getContainerFirstRep();

		/******************** specimencontainertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontainertype = specimencontainer.getType();

		/******************** specimencontainertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencontainertypecoding = specimencontainertype.getCodingFirstRep();

		/******************** Spcmn_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(specimencontainertypecoding.hasDisplay()) {
			s.setSpcmnCntainerTypCdgDsply(String.valueOf(specimencontainertypecoding.getDisplay()));
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimencontainertypecoding.hasVersion()) {
			s.setSpcmnCntainerTypCdgVrsn(String.valueOf(specimencontainertypecoding.getVersion()));
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(specimencontainertypecoding.hasCode()) {
			s.setSpcmnCntainerTypCdgCd(String.valueOf(specimencontainertypecoding.getCode()));
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(specimencontainertypecoding.hasSystem()) {
			s.setSpcmnCntainerTypCdgSys(String.valueOf(specimencontainertypecoding.getSystem()));
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimencontainertypecoding.hasUserSelected()) {
			s.setSpcmnCntainerTypCdgUsrSltd(String.valueOf(specimencontainertypecoding.getUserSelected()));
		}
		/******************** Spcmn_Cntainer_Typ_Txt ********************************************************************************/
		if(specimencontainertype.hasText()) {
			s.setSpcmnCntainerTypTxt(String.valueOf(specimencontainertype.getText()));
		}
		/******************** Spcmn_Cntainer_Dscrptn ********************************************************************************/
		if(specimencontainer.hasDescription()) {
			s.setSpcmnCntainerDscrptn(String.valueOf(specimencontainer.getDescription()));
		}
		/******************** specimencontaineridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimencontaineridentifier = specimencontainer.getIdentifierFirstRep();

		/******************** Spcmn_Cntainer_Id_Vl ********************************************************************************/
		if(specimencontaineridentifier.hasValue()) {
			s.setSpcmnCntainerIdVl(String.valueOf(specimencontaineridentifier.getValue()));
		}
		/******************** specimencontaineridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontaineridentifiertype = specimencontaineridentifier.getType();

		/******************** specimencontaineridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencontaineridentifiertypecoding = specimencontaineridentifiertype.getCodingFirstRep();

		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(specimencontaineridentifiertypecoding.hasDisplay()) {
			s.setSpcmnCntainerIdTypCdgDsply(String.valueOf(specimencontaineridentifiertypecoding.getDisplay()));
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimencontaineridentifiertypecoding.hasVersion()) {
			s.setSpcmnCntainerIdTypCdgVrsn(String.valueOf(specimencontaineridentifiertypecoding.getVersion()));
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Cd ********************************************************************************/
		if(specimencontaineridentifiertypecoding.hasCode()) {
			s.setSpcmnCntainerIdTypCdgCd(String.valueOf(specimencontaineridentifiertypecoding.getCode()));
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Sys ********************************************************************************/
		if(specimencontaineridentifiertypecoding.hasSystem()) {
			s.setSpcmnCntainerIdTypCdgSys(String.valueOf(specimencontaineridentifiertypecoding.getSystem()));
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimencontaineridentifiertypecoding.hasUserSelected()) {
			s.setSpcmnCntainerIdTypCdgUsrSltd(String.valueOf(specimencontaineridentifiertypecoding.getUserSelected()));
		}
		/******************** Spcmn_Cntainer_Id_Typ_Txt ********************************************************************************/
		if(specimencontaineridentifiertype.hasText()) {
			s.setSpcmnCntainerIdTypTxt(String.valueOf(specimencontaineridentifiertype.getText()));
		}
		/******************** Spcmn_Cntainer_Id_Sys ********************************************************************************/
		if(specimencontaineridentifier.hasSystem()) {
			s.setSpcmnCntainerIdSys(String.valueOf(specimencontaineridentifier.getSystem()));
		}
		/******************** Spcmn_Cntainer_Id_Assigner ********************************************************************************/
		if(specimencontaineridentifier.hasAssigner()) {
			s.setSpcmnCntainerIdAssigner(String.valueOf(specimencontaineridentifier.getAssigner()));
		}
		/******************** specimencontaineridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimencontaineridentifierperiod = specimencontaineridentifier.getPeriod();

		/******************** Spcmn_Cntainer_Id_Prd_End ********************************************************************************/
		if(specimencontaineridentifierperiod.hasEnd()) {
			s.setSpcmnCntainerIdPrdEnd(String.valueOf(specimencontaineridentifierperiod.getEnd()));
		}
		/******************** Spcmn_Cntainer_Id_Prd_Strt ********************************************************************************/
		if(specimencontaineridentifierperiod.hasStart()) {
			s.setSpcmnCntainerIdPrdStrt(String.valueOf(specimencontaineridentifierperiod.getStart()));
		}
		/******************** specimencontaineridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimencontaineridentifieruse = specimencontaineridentifier.getUse();
		s.setSpcmnCntainerIdUse(specimencontaineridentifieruse.toCode());

		/******************** specimencontainerspecimenquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencontainerspecimenquantity = specimencontainer.getSpecimenQuantity();

		/******************** Spcmn_Cntainer_SpcmnQnty_Vl ********************************************************************************/
		if(specimencontainerspecimenquantity.hasValue()) {
			s.setSpcmnCntainerSpcmnQntyVl(String.valueOf(specimencontainerspecimenquantity.getValue()));
		}
		/******************** specimencontainerspecimenquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencontainerspecimenquantitycomparator = specimencontainerspecimenquantity.getComparator();
		s.setSpcmnCntainerSpcmnQntyCmprtr(specimencontainerspecimenquantitycomparator.toCode());

		/******************** Spcmn_Cntainer_SpcmnQnty_Cd ********************************************************************************/
		if(specimencontainerspecimenquantity.hasCode()) {
			s.setSpcmnCntainerSpcmnQntyCd(String.valueOf(specimencontainerspecimenquantity.getCode()));
		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Sys ********************************************************************************/
		if(specimencontainerspecimenquantity.hasSystem()) {
			s.setSpcmnCntainerSpcmnQntySys(String.valueOf(specimencontainerspecimenquantity.getSystem()));
		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Unt ********************************************************************************/
		if(specimencontainerspecimenquantity.hasUnit()) {
			s.setSpcmnCntainerSpcmnQntyUnt(String.valueOf(specimencontainerspecimenquantity.getUnit()));
		}
		/******************** Spcmn_Cntainer_AddtvRfrnc ********************************************************************************/
		if(specimencontainer.hasAdditiveReference()) {
			s.setSpcmnCntainerAddtvRfrnc(String.valueOf(specimencontainer.getAdditiveReference()));
		}
		/******************** specimencontaineradditivecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontaineradditivecodeableconcept = specimencontainer.getAdditiveCodeableConcept();

		/******************** specimencontaineradditivecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencontaineradditivecodeableconceptcoding = specimencontaineradditivecodeableconcept.getCodingFirstRep();

		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcoding.hasDisplay()) {
			s.setSpcmnCntainerAddtvCdbleCncptCdgDsply(String.valueOf(specimencontaineradditivecodeableconceptcoding.getDisplay()));
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcoding.hasVersion()) {
			s.setSpcmnCntainerAddtvCdbleCncptCdgVrsn(String.valueOf(specimencontaineradditivecodeableconceptcoding.getVersion()));
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcoding.hasCode()) {
			s.setSpcmnCntainerAddtvCdbleCncptCdgCd(String.valueOf(specimencontaineradditivecodeableconceptcoding.getCode()));
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcoding.hasSystem()) {
			s.setSpcmnCntainerAddtvCdbleCncptCdgSys(String.valueOf(specimencontaineradditivecodeableconceptcoding.getSystem()));
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcoding.hasUserSelected()) {
			s.setSpcmnCntainerAddtvCdbleCncptCdgUsrSltd(String.valueOf(specimencontaineradditivecodeableconceptcoding.getUserSelected()));
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(specimencontaineradditivecodeableconcept.hasText()) {
			s.setSpcmnCntainerAddtvCdbleCncptTxt(String.valueOf(specimencontaineradditivecodeableconcept.getText()));
		}
		/******************** specimencontainercapacity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencontainercapacity = specimencontainer.getCapacity();

		/******************** Spcmn_Cntainer_Capacity_Vl ********************************************************************************/
		if(specimencontainercapacity.hasValue()) {
			s.setSpcmnCntainerCapacityVl(String.valueOf(specimencontainercapacity.getValue()));
		}
		/******************** specimencontainercapacitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencontainercapacitycomparator = specimencontainercapacity.getComparator();
		s.setSpcmnCntainerCapacityCmprtr(specimencontainercapacitycomparator.toCode());

		/******************** Spcmn_Cntainer_Capacity_Cd ********************************************************************************/
		if(specimencontainercapacity.hasCode()) {
			s.setSpcmnCntainerCapacityCd(String.valueOf(specimencontainercapacity.getCode()));
		}
		/******************** Spcmn_Cntainer_Capacity_Sys ********************************************************************************/
		if(specimencontainercapacity.hasSystem()) {
			s.setSpcmnCntainerCapacitySys(String.valueOf(specimencontainercapacity.getSystem()));
		}
		/******************** Spcmn_Cntainer_Capacity_Unt ********************************************************************************/
		if(specimencontainercapacity.hasUnit()) {
			s.setSpcmnCntainerCapacityUnt(String.valueOf(specimencontainercapacity.getUnit()));
		}
		/******************** Spcmn_ReceivedTime ********************************************************************************/
		if(specimen.hasReceivedTime()) {
			s.setSpcmnReceivedTime(String.valueOf(specimen.getReceivedTime()));
		}
		/******************** specimenidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimenidentifier = specimen.getIdentifierFirstRep();

		/******************** Spcmn_Id_Vl ********************************************************************************/
		if(specimenidentifier.hasValue()) {
			s.setSpcmnIdVl(String.valueOf(specimenidentifier.getValue()));
		}
		/******************** specimenidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenidentifiertype = specimenidentifier.getType();

		/******************** specimenidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenidentifiertypecoding = specimenidentifiertype.getCodingFirstRep();

		/******************** Spcmn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(specimenidentifiertypecoding.hasDisplay()) {
			s.setSpcmnIdTypCdgDsply(String.valueOf(specimenidentifiertypecoding.getDisplay()));
		}
		/******************** Spcmn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimenidentifiertypecoding.hasVersion()) {
			s.setSpcmnIdTypCdgVrsn(String.valueOf(specimenidentifiertypecoding.getVersion()));
		}
		/******************** Spcmn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(specimenidentifiertypecoding.hasCode()) {
			s.setSpcmnIdTypCdgCd(String.valueOf(specimenidentifiertypecoding.getCode()));
		}
		/******************** Spcmn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(specimenidentifiertypecoding.hasSystem()) {
			s.setSpcmnIdTypCdgSys(String.valueOf(specimenidentifiertypecoding.getSystem()));
		}
		/******************** Spcmn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimenidentifiertypecoding.hasUserSelected()) {
			s.setSpcmnIdTypCdgUsrSltd(String.valueOf(specimenidentifiertypecoding.getUserSelected()));
		}
		/******************** Spcmn_Id_Typ_Txt ********************************************************************************/
		if(specimenidentifiertype.hasText()) {
			s.setSpcmnIdTypTxt(String.valueOf(specimenidentifiertype.getText()));
		}
		/******************** Spcmn_Id_Sys ********************************************************************************/
		if(specimenidentifier.hasSystem()) {
			s.setSpcmnIdSys(String.valueOf(specimenidentifier.getSystem()));
		}
		/******************** Spcmn_Id_Assigner ********************************************************************************/
		if(specimenidentifier.hasAssigner()) {
			s.setSpcmnIdAssigner(String.valueOf(specimenidentifier.getAssigner()));
		}
		/******************** specimenidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenidentifierperiod = specimenidentifier.getPeriod();

		/******************** Spcmn_Id_Prd_End ********************************************************************************/
		if(specimenidentifierperiod.hasEnd()) {
			s.setSpcmnIdPrdEnd(String.valueOf(specimenidentifierperiod.getEnd()));
		}
		/******************** Spcmn_Id_Prd_Strt ********************************************************************************/
		if(specimenidentifierperiod.hasStart()) {
			s.setSpcmnIdPrdStrt(String.valueOf(specimenidentifierperiod.getStart()));
		}
		/******************** specimenidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimenidentifieruse = specimenidentifier.getUse();
		s.setSpcmnIdUse(specimenidentifieruse.toCode());

		/******************** Spcmn_Rqst ********************************************************************************/
		if(specimen.hasRequest()) {
			s.setSpcmnRqst(String.valueOf(specimen.getRequestFirstRep()));
		}
		/******************** Spcmn_Parent ********************************************************************************/
		if(specimen.hasParent()) {
			s.setSpcmnParent(String.valueOf(specimen.getParentFirstRep()));
		}
		/******************** specimencollection ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent specimencollection = specimen.getCollection();

		/******************** specimencollectionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionmethod = specimencollection.getMethod();

		/******************** specimencollectionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencollectionmethodcoding = specimencollectionmethod.getCodingFirstRep();

		/******************** Spcmn_Collection_Mthd_Cdg_Dsply ********************************************************************************/
		if(specimencollectionmethodcoding.hasDisplay()) {
			s.setSpcmnCollectionMthdCdgDsply(String.valueOf(specimencollectionmethodcoding.getDisplay()));
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Vrsn ********************************************************************************/
		if(specimencollectionmethodcoding.hasVersion()) {
			s.setSpcmnCollectionMthdCdgVrsn(String.valueOf(specimencollectionmethodcoding.getVersion()));
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Cd ********************************************************************************/
		if(specimencollectionmethodcoding.hasCode()) {
			s.setSpcmnCollectionMthdCdgCd(String.valueOf(specimencollectionmethodcoding.getCode()));
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Sys ********************************************************************************/
		if(specimencollectionmethodcoding.hasSystem()) {
			s.setSpcmnCollectionMthdCdgSys(String.valueOf(specimencollectionmethodcoding.getSystem()));
		}
		/******************** Spcmn_Collection_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(specimencollectionmethodcoding.hasUserSelected()) {
			s.setSpcmnCollectionMthdCdgUsrSltd(String.valueOf(specimencollectionmethodcoding.getUserSelected()));
		}
		/******************** Spcmn_Collection_Mthd_Txt ********************************************************************************/
		if(specimencollectionmethod.hasText()) {
			s.setSpcmnCollectionMthdTxt(String.valueOf(specimencollectionmethod.getText()));
		}
		/******************** specimencollectionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionbodysite = specimencollection.getBodySite();

		/******************** specimencollectionbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencollectionbodysitecoding = specimencollectionbodysite.getCodingFirstRep();

		/******************** Spcmn_Collection_BodySite_Cdg_Dsply ********************************************************************************/
		if(specimencollectionbodysitecoding.hasDisplay()) {
			s.setSpcmnCollectionBodySiteCdgDsply(String.valueOf(specimencollectionbodysitecoding.getDisplay()));
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Vrsn ********************************************************************************/
		if(specimencollectionbodysitecoding.hasVersion()) {
			s.setSpcmnCollectionBodySiteCdgVrsn(String.valueOf(specimencollectionbodysitecoding.getVersion()));
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Cd ********************************************************************************/
		if(specimencollectionbodysitecoding.hasCode()) {
			s.setSpcmnCollectionBodySiteCdgCd(String.valueOf(specimencollectionbodysitecoding.getCode()));
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Sys ********************************************************************************/
		if(specimencollectionbodysitecoding.hasSystem()) {
			s.setSpcmnCollectionBodySiteCdgSys(String.valueOf(specimencollectionbodysitecoding.getSystem()));
		}
		/******************** Spcmn_Collection_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(specimencollectionbodysitecoding.hasUserSelected()) {
			s.setSpcmnCollectionBodySiteCdgUsrSltd(String.valueOf(specimencollectionbodysitecoding.getUserSelected()));
		}
		/******************** Spcmn_Collection_BodySite_Txt ********************************************************************************/
		if(specimencollectionbodysite.hasText()) {
			s.setSpcmnCollectionBodySiteTxt(String.valueOf(specimencollectionbodysite.getText()));
		}
		/******************** Spcmn_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(specimencollection.hasCollectedDateTimeType()) {
			s.setSpcmnCollectionCollectedDtTimeTyp(String.valueOf(specimencollection.getCollectedDateTimeType()));
		}
		/******************** specimencollectioncollectedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimencollectioncollectedperiod = specimencollection.getCollectedPeriod();

		/******************** Spcmn_Collection_CollectedPrd_End ********************************************************************************/
		if(specimencollectioncollectedperiod.hasEnd()) {
			s.setSpcmnCollectionCollectedPrdEnd(String.valueOf(specimencollectioncollectedperiod.getEnd()));
		}
		/******************** Spcmn_Collection_CollectedPrd_Strt ********************************************************************************/
		if(specimencollectioncollectedperiod.hasStart()) {
			s.setSpcmnCollectionCollectedPrdStrt(String.valueOf(specimencollectioncollectedperiod.getStart()));
		}
		/******************** Spcmn_Collection_Collector ********************************************************************************/
		if(specimencollection.hasCollector()) {
			s.setSpcmnCollectionCollector(String.valueOf(specimencollection.getCollector()));
		}
		/******************** specimencollectionduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimencollectionduration = specimencollection.getDuration();

		/******************** specimencollectionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencollectionquantity = specimencollection.getQuantity();

		/******************** Spcmn_Collection_Qnty_Vl ********************************************************************************/
		if(specimencollectionquantity.hasValue()) {
			s.setSpcmnCollectionQntyVl(String.valueOf(specimencollectionquantity.getValue()));
		}
		/******************** specimencollectionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencollectionquantitycomparator = specimencollectionquantity.getComparator();
		s.setSpcmnCollectionQntyCmprtr(specimencollectionquantitycomparator.toCode());

		/******************** Spcmn_Collection_Qnty_Cd ********************************************************************************/
		if(specimencollectionquantity.hasCode()) {
			s.setSpcmnCollectionQntyCd(String.valueOf(specimencollectionquantity.getCode()));
		}
		/******************** Spcmn_Collection_Qnty_Sys ********************************************************************************/
		if(specimencollectionquantity.hasSystem()) {
			s.setSpcmnCollectionQntySys(String.valueOf(specimencollectionquantity.getSystem()));
		}
		/******************** Spcmn_Collection_Qnty_Unt ********************************************************************************/
		if(specimencollectionquantity.hasUnit()) {
			s.setSpcmnCollectionQntyUnt(String.valueOf(specimencollectionquantity.getUnit()));
		}
		/******************** specimencollectionfastingstatusduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimencollectionfastingstatusduration = specimencollection.getFastingStatusDuration();

		/******************** specimencollectionfastingstatuscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionfastingstatuscodeableconcept = specimencollection.getFastingStatusCodeableConcept();

		/******************** specimencollectionfastingstatuscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencollectionfastingstatuscodeableconceptcoding = specimencollectionfastingstatuscodeableconcept.getCodingFirstRep();

		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcoding.hasDisplay()) {
			s.setSpcmnCollectionFastingStsCdbleCncptCdgDsply(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getDisplay()));
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcoding.hasVersion()) {
			s.setSpcmnCollectionFastingStsCdbleCncptCdgVrsn(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getVersion()));
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcoding.hasCode()) {
			s.setSpcmnCollectionFastingStsCdbleCncptCdgCd(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getCode()));
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcoding.hasSystem()) {
			s.setSpcmnCollectionFastingStsCdbleCncptCdgSys(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getSystem()));
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcoding.hasUserSelected()) {
			s.setSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getUserSelected()));
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Txt ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconcept.hasText()) {
			s.setSpcmnCollectionFastingStsCdbleCncptTxt(String.valueOf(specimencollectionfastingstatuscodeableconcept.getText()));
		}
		/******************** specimencondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencondition = specimen.getConditionFirstRep();

		/******************** specimenconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenconditioncoding = specimencondition.getCodingFirstRep();

		/******************** Spcmn_Cndtn_Cdg_Dsply ********************************************************************************/
		if(specimenconditioncoding.hasDisplay()) {
			s.setSpcmnCndtnCdgDsply(String.valueOf(specimenconditioncoding.getDisplay()));
		}
		/******************** Spcmn_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(specimenconditioncoding.hasVersion()) {
			s.setSpcmnCndtnCdgVrsn(String.valueOf(specimenconditioncoding.getVersion()));
		}
		/******************** Spcmn_Cndtn_Cdg_Cd ********************************************************************************/
		if(specimenconditioncoding.hasCode()) {
			s.setSpcmnCndtnCdgCd(String.valueOf(specimenconditioncoding.getCode()));
		}
		/******************** Spcmn_Cndtn_Cdg_Sys ********************************************************************************/
		if(specimenconditioncoding.hasSystem()) {
			s.setSpcmnCndtnCdgSys(String.valueOf(specimenconditioncoding.getSystem()));
		}
		/******************** Spcmn_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(specimenconditioncoding.hasUserSelected()) {
			s.setSpcmnCndtnCdgUsrSltd(String.valueOf(specimenconditioncoding.getUserSelected()));
		}
		/******************** Spcmn_Cndtn_Txt ********************************************************************************/
		if(specimencondition.hasText()) {
			s.setSpcmnCndtnTxt(String.valueOf(specimencondition.getText()));
		}
		return s;
	}
}
