package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Composition;
public class CompositionBidirectionalConversion 
{
	public Composition Compositions(org.hl7.fhir.r4.model.Composition composition) throws ParseException
	{
		 main.java.com.campfhir.model.Composition c = new  main.java.com.campfhir.model.Composition();

		/******************** id ********************************************************************************/
		composition.setId(c.getId());

		/******************** compositiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositiontype = composition.getType();

		/******************** compositiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositiontypecoding = compositiontype.getCodingFirstRep();

		/******************** Cmpsition_Typ_Cdg_Dsply ********************************************************************************/
		if(compositiontypecoding.hasDisplay()) {
			c.setCmpsitionTypCdgDsply(String.valueOf(compositiontypecoding.getDisplay()));
		}
		/******************** Cmpsition_Typ_Cdg_Vrsn ********************************************************************************/
		if(compositiontypecoding.hasVersion()) {
			c.setCmpsitionTypCdgVrsn(String.valueOf(compositiontypecoding.getVersion()));
		}
		/******************** Cmpsition_Typ_Cdg_Cd ********************************************************************************/
		if(compositiontypecoding.hasCode()) {
			c.setCmpsitionTypCdgCd(String.valueOf(compositiontypecoding.getCode()));
		}
		/******************** Cmpsition_Typ_Cdg_Sys ********************************************************************************/
		if(compositiontypecoding.hasSystem()) {
			c.setCmpsitionTypCdgSys(String.valueOf(compositiontypecoding.getSystem()));
		}
		/******************** Cmpsition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(compositiontypecoding.hasUserSelected()) {
			c.setCmpsitionTypCdgUsrSltd(String.valueOf(compositiontypecoding.getUserSelected()));
		}
		/******************** Cmpsition_Typ_Txt ********************************************************************************/
		if(compositiontype.hasText()) {
			c.setCmpsitionTypTxt(String.valueOf(compositiontype.getText()));
		}
		/******************** Cmpsition_Dt ********************************************************************************/
		if(composition.hasDate()) {
			c.setCmpsitionDt(String.valueOf(composition.getDate()));
		}
		/******************** Cmpsition_Sbjct ********************************************************************************/
		if(composition.hasSubject()) {
			c.setCmpsitionSbjct(String.valueOf(composition.getSubject()));
		}
		/******************** compositionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionStatus compositionstatus = composition.getStatus();
		c.setCmpsitionSts(compositionstatus.toCode());

		/******************** Cmpsition_Enc ********************************************************************************/
		if(composition.hasEncounter()) {
			c.setCmpsitionEnc(String.valueOf(composition.getEncounter()));
		}
		/******************** compositionattester ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent compositionattester = composition.getAttesterFirstRep();

		/******************** Cmpsition_Attester_Time ********************************************************************************/
		if(compositionattester.hasTime()) {
			c.setCmpsitionAttesterTime(String.valueOf(compositionattester.getTime()));
		}
		/******************** Cmpsition_Attester_Party ********************************************************************************/
		if(compositionattester.hasParty()) {
			c.setCmpsitionAttesterParty(String.valueOf(compositionattester.getParty()));
		}
		/******************** compositionattestermode ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionAttestationMode compositionattestermode = compositionattester.getMode();
		c.setCmpsitionAttesterMode(compositionattestermode.toCode());

		/******************** compositionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier compositionidentifier = composition.getIdentifier();

		/******************** Cmpsition_Id_Vl ********************************************************************************/
		if(compositionidentifier.hasValue()) {
			c.setCmpsitionIdVl(String.valueOf(compositionidentifier.getValue()));
		}
		/******************** compositionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionidentifiertype = compositionidentifier.getType();

		/******************** compositionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionidentifiertypecoding = compositionidentifiertype.getCodingFirstRep();

		/******************** Cmpsition_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(compositionidentifiertypecoding.hasDisplay()) {
			c.setCmpsitionIdTypCdgDsply(String.valueOf(compositionidentifiertypecoding.getDisplay()));
		}
		/******************** Cmpsition_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(compositionidentifiertypecoding.hasVersion()) {
			c.setCmpsitionIdTypCdgVrsn(String.valueOf(compositionidentifiertypecoding.getVersion()));
		}
		/******************** Cmpsition_Id_Typ_Cdg_Cd ********************************************************************************/
		if(compositionidentifiertypecoding.hasCode()) {
			c.setCmpsitionIdTypCdgCd(String.valueOf(compositionidentifiertypecoding.getCode()));
		}
		/******************** Cmpsition_Id_Typ_Cdg_Sys ********************************************************************************/
		if(compositionidentifiertypecoding.hasSystem()) {
			c.setCmpsitionIdTypCdgSys(String.valueOf(compositionidentifiertypecoding.getSystem()));
		}
		/******************** Cmpsition_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(compositionidentifiertypecoding.hasUserSelected()) {
			c.setCmpsitionIdTypCdgUsrSltd(String.valueOf(compositionidentifiertypecoding.getUserSelected()));
		}
		/******************** Cmpsition_Id_Typ_Txt ********************************************************************************/
		if(compositionidentifiertype.hasText()) {
			c.setCmpsitionIdTypTxt(String.valueOf(compositionidentifiertype.getText()));
		}
		/******************** Cmpsition_Id_Sys ********************************************************************************/
		if(compositionidentifier.hasSystem()) {
			c.setCmpsitionIdSys(String.valueOf(compositionidentifier.getSystem()));
		}
		/******************** Cmpsition_Id_Assigner ********************************************************************************/
		if(compositionidentifier.hasAssigner()) {
			c.setCmpsitionIdAssigner(String.valueOf(compositionidentifier.getAssigner()));
		}
		/******************** compositionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compositionidentifierperiod = compositionidentifier.getPeriod();

		/******************** Cmpsition_Id_Prd_End ********************************************************************************/
		if(compositionidentifierperiod.hasEnd()) {
			c.setCmpsitionIdPrdEnd(String.valueOf(compositionidentifierperiod.getEnd()));
		}
		/******************** Cmpsition_Id_Prd_Strt ********************************************************************************/
		if(compositionidentifierperiod.hasStart()) {
			c.setCmpsitionIdPrdStrt(String.valueOf(compositionidentifierperiod.getStart()));
		}
		/******************** compositionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse compositionidentifieruse = compositionidentifier.getUse();
		c.setCmpsitionIdUse(compositionidentifieruse.toCode());

		/******************** compositioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositioncategory = composition.getCategoryFirstRep();

		/******************** compositioncategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositioncategorycoding = compositioncategory.getCodingFirstRep();

		/******************** Cmpsition_Ctgry_Cdg_Dsply ********************************************************************************/
		if(compositioncategorycoding.hasDisplay()) {
			c.setCmpsitionCtgryCdgDsply(String.valueOf(compositioncategorycoding.getDisplay()));
		}
		/******************** Cmpsition_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(compositioncategorycoding.hasVersion()) {
			c.setCmpsitionCtgryCdgVrsn(String.valueOf(compositioncategorycoding.getVersion()));
		}
		/******************** Cmpsition_Ctgry_Cdg_Cd ********************************************************************************/
		if(compositioncategorycoding.hasCode()) {
			c.setCmpsitionCtgryCdgCd(String.valueOf(compositioncategorycoding.getCode()));
		}
		/******************** Cmpsition_Ctgry_Cdg_Sys ********************************************************************************/
		if(compositioncategorycoding.hasSystem()) {
			c.setCmpsitionCtgryCdgSys(String.valueOf(compositioncategorycoding.getSystem()));
		}
		/******************** Cmpsition_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(compositioncategorycoding.hasUserSelected()) {
			c.setCmpsitionCtgryCdgUsrSltd(String.valueOf(compositioncategorycoding.getUserSelected()));
		}
		/******************** Cmpsition_Ctgry_Txt ********************************************************************************/
		if(compositioncategory.hasText()) {
			c.setCmpsitionCtgryTxt(String.valueOf(compositioncategory.getText()));
		}
		/******************** Cmpsition_Ttl ********************************************************************************/
		if(composition.hasTitle()) {
			c.setCmpsitionTtl(String.valueOf(composition.getTitle()));
		}
		/******************** Cmpsition_Athr ********************************************************************************/
		if(composition.hasAuthor()) {
			c.setCmpsitionAthr(String.valueOf(composition.getAuthorFirstRep()));
		}
		/******************** Cmpsition_Custodian ********************************************************************************/
		if(composition.hasCustodian()) {
			c.setCmpsitionCustodian(String.valueOf(composition.getCustodian()));
		}
		/******************** compositionconfidentiality ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.DocumentConfidentiality compositionconfidentiality = composition.getConfidentiality();
		c.setCmpsitionConfidentiality(compositionconfidentiality.toCode());

		/******************** compositionevent ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionEventComponent compositionevent = composition.getEventFirstRep();

		/******************** compositioneventperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compositioneventperiod = compositionevent.getPeriod();

		/******************** Cmpsition_Evnt_Prd_End ********************************************************************************/
		if(compositioneventperiod.hasEnd()) {
			c.setCmpsitionEvntPrdEnd(String.valueOf(compositioneventperiod.getEnd()));
		}
		/******************** Cmpsition_Evnt_Prd_Strt ********************************************************************************/
		if(compositioneventperiod.hasStart()) {
			c.setCmpsitionEvntPrdStrt(String.valueOf(compositioneventperiod.getStart()));
		}
		/******************** Cmpsition_Evnt_Dtl ********************************************************************************/
		if(compositionevent.hasDetail()) {
			c.setCmpsitionEvntDtl(String.valueOf(compositionevent.getDetailFirstRep()));
		}
		/******************** compositioneventcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositioneventcode = compositionevent.getCodeFirstRep();

		/******************** compositioneventcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositioneventcodecoding = compositioneventcode.getCodingFirstRep();

		/******************** Cmpsition_Evnt_Cd_Cdg_Dsply ********************************************************************************/
		if(compositioneventcodecoding.hasDisplay()) {
			c.setCmpsitionEvntCdCdgDsply(String.valueOf(compositioneventcodecoding.getDisplay()));
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(compositioneventcodecoding.hasVersion()) {
			c.setCmpsitionEvntCdCdgVrsn(String.valueOf(compositioneventcodecoding.getVersion()));
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Cd ********************************************************************************/
		if(compositioneventcodecoding.hasCode()) {
			c.setCmpsitionEvntCdCdgCd(String.valueOf(compositioneventcodecoding.getCode()));
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Sys ********************************************************************************/
		if(compositioneventcodecoding.hasSystem()) {
			c.setCmpsitionEvntCdCdgSys(String.valueOf(compositioneventcodecoding.getSystem()));
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(compositioneventcodecoding.hasUserSelected()) {
			c.setCmpsitionEvntCdCdgUsrSltd(String.valueOf(compositioneventcodecoding.getUserSelected()));
		}
		/******************** Cmpsition_Evnt_Cd_Txt ********************************************************************************/
		if(compositioneventcode.hasText()) {
			c.setCmpsitionEvntCdTxt(String.valueOf(compositioneventcode.getText()));
		}
		/******************** compositionsection ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.SectionComponent compositionsection = composition.getSectionFirstRep();

		/******************** compositionsectioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionsectioncode = compositionsection.getCode();

		/******************** compositionsectioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionsectioncodecoding = compositionsectioncode.getCodingFirstRep();

		/******************** Cmpsition_Section_Cd_Cdg_Dsply ********************************************************************************/
		if(compositionsectioncodecoding.hasDisplay()) {
			c.setCmpsitionSectionCdCdgDsply(String.valueOf(compositionsectioncodecoding.getDisplay()));
		}
		/******************** Cmpsition_Section_Cd_Cdg_Vrsn ********************************************************************************/
		if(compositionsectioncodecoding.hasVersion()) {
			c.setCmpsitionSectionCdCdgVrsn(String.valueOf(compositionsectioncodecoding.getVersion()));
		}
		/******************** Cmpsition_Section_Cd_Cdg_Cd ********************************************************************************/
		if(compositionsectioncodecoding.hasCode()) {
			c.setCmpsitionSectionCdCdgCd(String.valueOf(compositionsectioncodecoding.getCode()));
		}
		/******************** Cmpsition_Section_Cd_Cdg_Sys ********************************************************************************/
		if(compositionsectioncodecoding.hasSystem()) {
			c.setCmpsitionSectionCdCdgSys(String.valueOf(compositionsectioncodecoding.getSystem()));
		}
		/******************** Cmpsition_Section_Cd_Cdg_UsrSltd ********************************************************************************/
		if(compositionsectioncodecoding.hasUserSelected()) {
			c.setCmpsitionSectionCdCdgUsrSltd(String.valueOf(compositionsectioncodecoding.getUserSelected()));
		}
		/******************** Cmpsition_Section_Cd_Txt ********************************************************************************/
		if(compositionsectioncode.hasText()) {
			c.setCmpsitionSectionCdTxt(String.valueOf(compositionsectioncode.getText()));
		}
		/******************** compositionsectiontext ********************************************************************************/
		org.hl7.fhir.r4.model.Narrative compositionsectiontext = compositionsection.getText();

		/******************** compositionsectiontextstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Narrative.NarrativeStatus compositionsectiontextstatus = compositionsectiontext.getStatus();
		c.setCmpsitionSectionTxtSts(compositionsectiontextstatus.toCode());

		/******************** compositionsectiontextdiv ********************************************************************************/
		org.hl7.fhir.utilities.xhtml.XhtmlNode compositionsectiontextdiv = compositionsectiontext.getDiv();

		/******************** Cmpsition_Section_Ttl ********************************************************************************/
		if(compositionsection.hasTitle()) {
			c.setCmpsitionSectionTtl(String.valueOf(compositionsection.getTitle()));
		}
		/******************** Cmpsition_Section_Focus ********************************************************************************/
		if(compositionsection.hasFocus()) {
			c.setCmpsitionSectionFocus(String.valueOf(compositionsection.getFocus()));
		}
		/******************** Cmpsition_Section_Athr ********************************************************************************/
		if(compositionsection.hasAuthor()) {
			c.setCmpsitionSectionAthr(String.valueOf(compositionsection.getAuthorFirstRep()));
		}
		/******************** compositionsectionmode ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.SectionMode compositionsectionmode = compositionsection.getMode();
		c.setCmpsitionSectionMode(compositionsectionmode.toCode());

		/******************** Cmpsition_Section_Entry ********************************************************************************/
		if(compositionsection.hasEntry()) {
			c.setCmpsitionSectionEntry(String.valueOf(compositionsection.getEntryFirstRep()));
		}
		/******************** compositionsectionemptyreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionsectionemptyreason = compositionsection.getEmptyReason();

		/******************** compositionsectionemptyreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionsectionemptyreasoncoding = compositionsectionemptyreason.getCodingFirstRep();

		/******************** Cmpsition_Section_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(compositionsectionemptyreasoncoding.hasDisplay()) {
			c.setCmpsitionSectionEmptyRsnCdgDsply(String.valueOf(compositionsectionemptyreasoncoding.getDisplay()));
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(compositionsectionemptyreasoncoding.hasVersion()) {
			c.setCmpsitionSectionEmptyRsnCdgVrsn(String.valueOf(compositionsectionemptyreasoncoding.getVersion()));
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(compositionsectionemptyreasoncoding.hasCode()) {
			c.setCmpsitionSectionEmptyRsnCdgCd(String.valueOf(compositionsectionemptyreasoncoding.getCode()));
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(compositionsectionemptyreasoncoding.hasSystem()) {
			c.setCmpsitionSectionEmptyRsnCdgSys(String.valueOf(compositionsectionemptyreasoncoding.getSystem()));
		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(compositionsectionemptyreasoncoding.hasUserSelected()) {
			c.setCmpsitionSectionEmptyRsnCdgUsrSltd(String.valueOf(compositionsectionemptyreasoncoding.getUserSelected()));
		}
		/******************** Cmpsition_Section_EmptyRsn_Txt ********************************************************************************/
		if(compositionsectionemptyreason.hasText()) {
			c.setCmpsitionSectionEmptyRsnTxt(String.valueOf(compositionsectionemptyreason.getText()));
		}
		/******************** compositionsectionorderedby ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionsectionorderedby = compositionsection.getOrderedBy();

		/******************** compositionsectionorderedbycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionsectionorderedbycoding = compositionsectionorderedby.getCodingFirstRep();

		/******************** Cmpsition_Section_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(compositionsectionorderedbycoding.hasDisplay()) {
			c.setCmpsitionSectionOrdredByCdgDsply(String.valueOf(compositionsectionorderedbycoding.getDisplay()));
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(compositionsectionorderedbycoding.hasVersion()) {
			c.setCmpsitionSectionOrdredByCdgVrsn(String.valueOf(compositionsectionorderedbycoding.getVersion()));
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Cd ********************************************************************************/
		if(compositionsectionorderedbycoding.hasCode()) {
			c.setCmpsitionSectionOrdredByCdgCd(String.valueOf(compositionsectionorderedbycoding.getCode()));
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Sys ********************************************************************************/
		if(compositionsectionorderedbycoding.hasSystem()) {
			c.setCmpsitionSectionOrdredByCdgSys(String.valueOf(compositionsectionorderedbycoding.getSystem()));
		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(compositionsectionorderedbycoding.hasUserSelected()) {
			c.setCmpsitionSectionOrdredByCdgUsrSltd(String.valueOf(compositionsectionorderedbycoding.getUserSelected()));
		}
		/******************** Cmpsition_Section_OrdredBy_Txt ********************************************************************************/
		if(compositionsectionorderedby.hasText()) {
			c.setCmpsitionSectionOrdredByTxt(String.valueOf(compositionsectionorderedby.getText()));
		}
		/******************** compositionrelatesto ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent compositionrelatesto = composition.getRelatesToFirstRep();

		/******************** compositionrelatestocode ********************************************************************************/
		org.hl7.fhir.r4.model.Composition.DocumentRelationshipType compositionrelatestocode = compositionrelatesto.getCode();
		c.setCmpsitionRelatesToCd(compositionrelatestocode.toCode());

		/******************** compositionrelatestotargetidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier compositionrelatestotargetidentifier = compositionrelatesto.getTargetIdentifier();

		/******************** Cmpsition_RelatesTo_TargetId_Vl ********************************************************************************/
		if(compositionrelatestotargetidentifier.hasValue()) {
			c.setCmpsitionRelatesToTargetIdVl(String.valueOf(compositionrelatestotargetidentifier.getValue()));
		}
		/******************** compositionrelatestotargetidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compositionrelatestotargetidentifiertype = compositionrelatestotargetidentifier.getType();

		/******************** compositionrelatestotargetidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compositionrelatestotargetidentifiertypecoding = compositionrelatestotargetidentifiertype.getCodingFirstRep();

		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Dsply ********************************************************************************/
		if(compositionrelatestotargetidentifiertypecoding.hasDisplay()) {
			c.setCmpsitionRelatesToTargetIdTypCdgDsply(String.valueOf(compositionrelatestotargetidentifiertypecoding.getDisplay()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Vrsn ********************************************************************************/
		if(compositionrelatestotargetidentifiertypecoding.hasVersion()) {
			c.setCmpsitionRelatesToTargetIdTypCdgVrsn(String.valueOf(compositionrelatestotargetidentifiertypecoding.getVersion()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Cd ********************************************************************************/
		if(compositionrelatestotargetidentifiertypecoding.hasCode()) {
			c.setCmpsitionRelatesToTargetIdTypCdgCd(String.valueOf(compositionrelatestotargetidentifiertypecoding.getCode()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Sys ********************************************************************************/
		if(compositionrelatestotargetidentifiertypecoding.hasSystem()) {
			c.setCmpsitionRelatesToTargetIdTypCdgSys(String.valueOf(compositionrelatestotargetidentifiertypecoding.getSystem()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(compositionrelatestotargetidentifiertypecoding.hasUserSelected()) {
			c.setCmpsitionRelatesToTargetIdTypCdgUsrSltd(String.valueOf(compositionrelatestotargetidentifiertypecoding.getUserSelected()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Txt ********************************************************************************/
		if(compositionrelatestotargetidentifiertype.hasText()) {
			c.setCmpsitionRelatesToTargetIdTypTxt(String.valueOf(compositionrelatestotargetidentifiertype.getText()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Sys ********************************************************************************/
		if(compositionrelatestotargetidentifier.hasSystem()) {
			c.setCmpsitionRelatesToTargetIdSys(String.valueOf(compositionrelatestotargetidentifier.getSystem()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Assigner ********************************************************************************/
		if(compositionrelatestotargetidentifier.hasAssigner()) {
			c.setCmpsitionRelatesToTargetIdAssigner(String.valueOf(compositionrelatestotargetidentifier.getAssigner()));
		}
		/******************** compositionrelatestotargetidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compositionrelatestotargetidentifierperiod = compositionrelatestotargetidentifier.getPeriod();

		/******************** Cmpsition_RelatesTo_TargetId_Prd_End ********************************************************************************/
		if(compositionrelatestotargetidentifierperiod.hasEnd()) {
			c.setCmpsitionRelatesToTargetIdPrdEnd(String.valueOf(compositionrelatestotargetidentifierperiod.getEnd()));
		}
		/******************** Cmpsition_RelatesTo_TargetId_Prd_Strt ********************************************************************************/
		if(compositionrelatestotargetidentifierperiod.hasStart()) {
			c.setCmpsitionRelatesToTargetIdPrdStrt(String.valueOf(compositionrelatestotargetidentifierperiod.getStart()));
		}
		/******************** compositionrelatestotargetidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse compositionrelatestotargetidentifieruse = compositionrelatestotargetidentifier.getUse();
		c.setCmpsitionRelatesToTargetIdUse(compositionrelatestotargetidentifieruse.toCode());

		/******************** Cmpsition_RelatesTo_TarRfrnc ********************************************************************************/
		if(compositionrelatesto.hasTargetReference()) {
			c.setCmpsitionRelatesToTarRfrnc(String.valueOf(compositionrelatesto.getTargetReference()));
		}
		return c;
	}
}
