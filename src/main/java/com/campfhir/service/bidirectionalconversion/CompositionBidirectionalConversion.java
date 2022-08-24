package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Composition;
public class CompositionBidirectionalConversion 
{
	public Composition Compositions(org.hl7.fhir.r4.model.Composition composition) throws ParseException
	{
		 main.java.com.campfhir.model.Composition c = new  main.java.com.campfhir.model.Composition();

//		/******************** id ********************************************************************************/
//		c.setId(composition.getIdElement().getIdPart());
//
//		/******************** compositiontype ********************************************************************************/
//		org.hl7.fhir.r4.model.CodeableConcept compositiontype = composition.getType();
//
//		/******************** Cmpsition_Typ_Txt ********************************************************************************/
//		if(compositiontype.hasText()) {
//
//			c.addCmpsitionTypTxt(String.valueOf(compositiontype.getText()));
//		} else {
//			c.addCmpsitionTypTxt("NULL");
//		}
//
//
//		/******************** compositiontypecoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositiontypecodinglist = compositiontype.getCoding();
//		for(int compositiontypecodingi = 0; compositiontypecodingi<compositiontypecodinglist.size();compositiontypecodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositiontypecoding = compositiontypecodinglist.get(compositiontypecodingi);
//
//		/******************** Cmpsition_Typ_Cdg_Dsply ********************************************************************************/
//		if(compositiontypecodingi == 0) {c.addCmpsitionTypCdgDsply("[");}
//		if(compositiontypecoding.hasDisplay()) {
//
//			c.addCmpsitionTypCdgDsply(String.valueOf(compositiontypecoding.getDisplay()));
//		} else {
//			c.addCmpsitionTypCdgDsply("NULL");
//		}
//
//		if(compositiontypecodingi == compositiontypecodinglist.size()-1) {c.addCmpsitionTypCdgDsply("]");}
//
//
//		/******************** Cmpsition_Typ_Cdg_Vrsn ********************************************************************************/
//		if(compositiontypecodingi == 0) {c.addCmpsitionTypCdgVrsn("[");}
//		if(compositiontypecoding.hasVersion()) {
//
//			c.addCmpsitionTypCdgVrsn(String.valueOf(compositiontypecoding.getVersion()));
//		} else {
//			c.addCmpsitionTypCdgVrsn("NULL");
//		}
//
//		if(compositiontypecodingi == compositiontypecodinglist.size()-1) {c.addCmpsitionTypCdgVrsn("]");}
//
//
//		/******************** Cmpsition_Typ_Cdg_Cd ********************************************************************************/
//		if(compositiontypecodingi == 0) {c.addCmpsitionTypCdgCd("[");}
//		if(compositiontypecoding.hasCode()) {
//
//			c.addCmpsitionTypCdgCd(String.valueOf(compositiontypecoding.getCode()));
//		} else {
//			c.addCmpsitionTypCdgCd("NULL");
//		}
//
//		if(compositiontypecodingi == compositiontypecodinglist.size()-1) {c.addCmpsitionTypCdgCd("]");}
//
//
//		/******************** Cmpsition_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(compositiontypecodingi == 0) {c.addCmpsitionTypCdgUsrSltd("[");}
//		if(compositiontypecoding.hasUserSelected()) {
//
//			c.addCmpsitionTypCdgUsrSltd(String.valueOf(compositiontypecoding.getUserSelected()));
//		} else {
//			c.addCmpsitionTypCdgUsrSltd("NULL");
//		}
//
//		if(compositiontypecodingi == compositiontypecodinglist.size()-1) {c.addCmpsitionTypCdgUsrSltd("]");}
//
//
//		/******************** Cmpsition_Typ_Cdg_Sys ********************************************************************************/
//		if(compositiontypecodingi == 0) {c.addCmpsitionTypCdgSys("[");}
//		if(compositiontypecoding.hasSystem()) {
//
//			c.addCmpsitionTypCdgSys(String.valueOf(compositiontypecoding.getSystem()));
//		} else {
//			c.addCmpsitionTypCdgSys("NULL");
//		}
//
//		if(compositiontypecodingi == compositiontypecodinglist.size()-1) {c.addCmpsitionTypCdgSys("]");}
//
//
//		 };
//		/******************** compositionsection ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Composition.SectionComponent> compositionsectionlist = composition.getSection();
//		for(int compositionsectioni = 0; compositionsectioni<compositionsectionlist.size();compositionsectioni++ ) {
//		org.hl7.fhir.r4.model.Composition.SectionComponent  compositionsection = compositionsectionlist.get(compositionsectioni);
//
//		/******************** Cmpsition_Section_Entry ********************************************************************************/
//		if(compositionsectioni == 0) {c.addCmpsitionSectionEntry("[");}
//		if(compositionsection.hasEntry()) {
//
//			String  array = "[";
//			for(int incr=0; incr<compositionsection.getEntry().size(); incr++) {
//				array = array + compositionsection.getEntry().get(incr).getReference() + ",";
//			}
//			array = array.substring(0, array.length() -1);
//			array = array + "]";
//			c.addCmpsitionSectionEntry(array);
//
//		} else {
//			c.addCmpsitionSectionEntry("NULL");
//		}
//
//		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionEntry("]");}
//
//
//		/******************** compositionsectioncode ********************************************************************************/
//		org.hl7.fhir.r4.model.CodeableConcept compositionsectioncode = compositionsection.getCode();
//
//		/******************** Cmpsition_Section_Cd_Txt ********************************************************************************/
//		if(compositionsectioni == 0) {c.addCmpsitionSectionCdTxt("[");}
//		if(compositionsectioncode.hasText()) {
//
//			c.addCmpsitionSectionCdTxt(String.valueOf(compositionsectioncode.getText()));
//		} else {
//			c.addCmpsitionSectionCdTxt("NULL");
//		}
//
//		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionCdTxt("]");}
//
//
//		/******************** compositionsectioncodecoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositionsectioncodecodinglist = compositionsectioncode.getCoding();
//		for(int compositionsectioncodecodingi = 0; compositionsectioncodecodingi<compositionsectioncodecodinglist.size();compositionsectioncodecodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositionsectioncodecoding = compositionsectioncodecodinglist.get(compositionsectioncodecodingi);
//
//		/******************** Cmpsition_Section_Cd_Cdg_Dsply ********************************************************************************/
//		if(compositionsectioncodecodingi == 0) {c.addCmpsitionSectionCdCdgDsply("[[");}
//		if(compositionsectioncodecoding.hasDisplay()) {
//
//			c.addCmpsitionSectionCdCdgDsply(String.valueOf(compositionsectioncodecoding.getDisplay()));
//		} else {
//			c.addCmpsitionSectionCdCdgDsply("NULL");
//		}
//
//		if(compositionsectioncodecodingi == compositionsectioncodecodinglist.size()-1) {c.addCmpsitionSectionCdCdgDsply("]]");}
//
//
//		/******************** Cmpsition_Section_Cd_Cdg_Vrsn ********************************************************************************/
//		if(compositionsectioncodecodingi == 0) {c.addCmpsitionSectionCdCdgVrsn("[[");}
//		if(compositionsectioncodecoding.hasVersion()) {
//
//			c.addCmpsitionSectionCdCdgVrsn(String.valueOf(compositionsectioncodecoding.getVersion()));
//		} else {
//			c.addCmpsitionSectionCdCdgVrsn("NULL");
//		}
//
//		if(compositionsectioncodecodingi == compositionsectioncodecodinglist.size()-1) {c.addCmpsitionSectionCdCdgVrsn("]]");}
//
//
//		/******************** Cmpsition_Section_Cd_Cdg_Cd ********************************************************************************/
//		if(compositionsectioncodecodingi == 0) {c.addCmpsitionSectionCdCdgCd("[[");}
//		if(compositionsectioncodecoding.hasCode()) {
//
//			c.addCmpsitionSectionCdCdgCd(String.valueOf(compositionsectioncodecoding.getCode()));
//		} else {
//			c.addCmpsitionSectionCdCdgCd("NULL");
//		}
//
//		if(compositionsectioncodecodingi == compositionsectioncodecodinglist.size()-1) {c.addCmpsitionSectionCdCdgCd("]]");}
//
//
//		/******************** Cmpsition_Section_Cd_Cdg_UsrSltd ********************************************************************************/
//		if(compositionsectioncodecodingi == 0) {c.addCmpsitionSectionCdCdgUsrSltd("[[");}
//		if(compositionsectioncodecoding.hasUserSelected()) {
//
//			c.addCmpsitionSectionCdCdgUsrSltd(String.valueOf(compositionsectioncodecoding.getUserSelected()));
//		} else {
//			c.addCmpsitionSectionCdCdgUsrSltd("NULL");
//		}
//
//		if(compositionsectioncodecodingi == compositionsectioncodecodinglist.size()-1) {c.addCmpsitionSectionCdCdgUsrSltd("]]");}
//
//
//		/******************** Cmpsition_Section_Cd_Cdg_Sys ********************************************************************************/
//		if(compositionsectioncodecodingi == 0) {c.addCmpsitionSectionCdCdgSys("[[");}
//		if(compositionsectioncodecoding.hasSystem()) {
//
//			c.addCmpsitionSectionCdCdgSys(String.valueOf(compositionsectioncodecoding.getSystem()));
//		} else {
//			c.addCmpsitionSectionCdCdgSys("NULL");
//		}
//
//		if(compositionsectioncodecodingi == compositionsectioncodecodinglist.size()-1) {c.addCmpsitionSectionCdCdgSys("]]");}
//
//
//		 };
//		/******************** compositionsectionmode ********************************************************************************/
//		org.hl7.fhir.r4.model.Composition.SectionMode compositionsectionmode = compositionsection.getMode();
//		if(compositionsectionmode!=null) {
//		if(compositionsectioni == 0) {
//
//		c.addCmpsitionSectionMode("[");		}
//			c.addCmpsitionSectionMode(compositionsectionmode.toCode());
//		if(compositionsectioni == compositionsectionlist.size()-1) {
//
//		c.addCmpsitionSectionMode("]");		}
//
//		} else {
//			c.addCmpsitionSectionMode("NULL");
//		}
//
//		/******************** compositionsectionemptyreason ********************************************************************************/
//		org.hl7.fhir.r4.model.CodeableConcept compositionsectionemptyreason = compositionsection.getEmptyReason();
//
//		/******************** Cmpsition_Section_EmptyRsn_Txt ********************************************************************************/
//		if(compositionsectioni == 0) {c.addCmpsitionSectionEmptyRsnTxt("[");}
//		if(compositionsectionemptyreason.hasText()) {
//
//			c.addCmpsitionSectionEmptyRsnTxt(String.valueOf(compositionsectionemptyreason.getText()));
//		} else {
//			c.addCmpsitionSectionEmptyRsnTxt("NULL");
//		}
//
//		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionEmptyRsnTxt("]");}
//
//
//		/******************** compositionsectionemptyreasoncoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositionsectionemptyreasoncodinglist = compositionsectionemptyreason.getCoding();
//		for(int compositionsectionemptyreasoncodingi = 0; compositionsectionemptyreasoncodingi<compositionsectionemptyreasoncodinglist.size();compositionsectionemptyreasoncodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositionsectionemptyreasoncoding = compositionsectionemptyreasoncodinglist.get(compositionsectionemptyreasoncodingi);
//
//		/******************** Cmpsition_Section_EmptyRsn_Cdg_Dsply ********************************************************************************/
//		if(compositionsectionemptyreasoncodingi == 0) {c.addCmpsitionSectionEmptyRsnCdgDsply("[[");}
//		if(compositionsectionemptyreasoncoding.hasDisplay()) {
//
//			c.addCmpsitionSectionEmptyRsnCdgDsply(String.valueOf(compositionsectionemptyreasoncoding.getDisplay()));
//		} else {
//			c.addCmpsitionSectionEmptyRsnCdgDsply("NULL");
//		}
//
//		if(compositionsectionemptyreasoncodingi == compositionsectionemptyreasoncodinglist.size()-1) {c.addCmpsitionSectionEmptyRsnCdgDsply("]]");}
//
//
//		/******************** Cmpsition_Section_EmptyRsn_Cdg_Vrsn ********************************************************************************/
//		if(compositionsectionemptyreasoncodingi == 0) {c.addCmpsitionSectionEmptyRsnCdgVrsn("[[");}
//		if(compositionsectionemptyreasoncoding.hasVersion()) {
//
//			c.addCmpsitionSectionEmptyRsnCdgVrsn(String.valueOf(compositionsectionemptyreasoncoding.getVersion()));
//		} else {
//			c.addCmpsitionSectionEmptyRsnCdgVrsn("NULL");
//		}
//
//		if(compositionsectionemptyreasoncodingi == compositionsectionemptyreasoncodinglist.size()-1) {c.addCmpsitionSectionEmptyRsnCdgVrsn("]]");}
//
//
//		/******************** Cmpsition_Section_EmptyRsn_Cdg_Cd ********************************************************************************/
//		if(compositionsectionemptyreasoncodingi == 0) {c.addCmpsitionSectionEmptyRsnCdgCd("[[");}
//		if(compositionsectionemptyreasoncoding.hasCode()) {
//
//			c.addCmpsitionSectionEmptyRsnCdgCd(String.valueOf(compositionsectionemptyreasoncoding.getCode()));
//		} else {
//			c.addCmpsitionSectionEmptyRsnCdgCd("NULL");
//		}
//
//		if(compositionsectionemptyreasoncodingi == compositionsectionemptyreasoncodinglist.size()-1) {c.addCmpsitionSectionEmptyRsnCdgCd("]]");}
//
//
//		/******************** Cmpsition_Section_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
//		if(compositionsectionemptyreasoncodingi == 0) {c.addCmpsitionSectionEmptyRsnCdgUsrSltd("[[");}
//		if(compositionsectionemptyreasoncoding.hasUserSelected()) {
//
//			c.addCmpsitionSectionEmptyRsnCdgUsrSltd(String.valueOf(compositionsectionemptyreasoncoding.getUserSelected()));
//		} else {
//			c.addCmpsitionSectionEmptyRsnCdgUsrSltd("NULL");
//		}
//
//		if(compositionsectionemptyreasoncodingi == compositionsectionemptyreasoncodinglist.size()-1) {c.addCmpsitionSectionEmptyRsnCdgUsrSltd("]]");}
//
//
//		/******************** Cmpsition_Section_EmptyRsn_Cdg_Sys ********************************************************************************/
//		if(compositionsectionemptyreasoncodingi == 0) {c.addCmpsitionSectionEmptyRsnCdgSys("[[");}
//		if(compositionsectionemptyreasoncoding.hasSystem()) {
//
//			c.addCmpsitionSectionEmptyRsnCdgSys(String.valueOf(compositionsectionemptyreasoncoding.getSystem()));
//		} else {
//			c.addCmpsitionSectionEmptyRsnCdgSys("NULL");
//		}
//
//		if(compositionsectionemptyreasoncodingi == compositionsectionemptyreasoncodinglist.size()-1) {c.addCmpsitionSectionEmptyRsnCdgSys("]]");}
//
//
//		 };
//		/******************** compositionsectionorderedby ********************************************************************************/
//		org.hl7.fhir.r4.model.CodeableConcept compositionsectionorderedby = compositionsection.getOrderedBy();
//
//		/******************** Cmpsition_Section_OrdredBy_Txt ********************************************************************************/
//		if(compositionsectioni == 0) {c.addCmpsitionSectionOrdredByTxt("[");}
//		if(compositionsectionorderedby.hasText()) {
//
//			c.addCmpsitionSectionOrdredByTxt(String.valueOf(compositionsectionorderedby.getText()));
//		} else {
//			c.addCmpsitionSectionOrdredByTxt("NULL");
//		}
//
//		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionOrdredByTxt("]");}
//
//
//		/******************** compositionsectionorderedbycoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositionsectionorderedbycodinglist = compositionsectionorderedby.getCoding();
//		for(int compositionsectionorderedbycodingi = 0; compositionsectionorderedbycodingi<compositionsectionorderedbycodinglist.size();compositionsectionorderedbycodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositionsectionorderedbycoding = compositionsectionorderedbycodinglist.get(compositionsectionorderedbycodingi);
//
//		/******************** Cmpsition_Section_OrdredBy_Cdg_Dsply ********************************************************************************/
//		if(compositionsectionorderedbycodingi == 0) {c.addCmpsitionSectionOrdredByCdgDsply("[[");}
//		if(compositionsectionorderedbycoding.hasDisplay()) {
//
//			c.addCmpsitionSectionOrdredByCdgDsply(String.valueOf(compositionsectionorderedbycoding.getDisplay()));
//		} else {
//			c.addCmpsitionSectionOrdredByCdgDsply("NULL");
//		}
//
//		if(compositionsectionorderedbycodingi == compositionsectionorderedbycodinglist.size()-1) {c.addCmpsitionSectionOrdredByCdgDsply("]]");}
//
//
//		/******************** Cmpsition_Section_OrdredBy_Cdg_Vrsn ********************************************************************************/
//		if(compositionsectionorderedbycodingi == 0) {c.addCmpsitionSectionOrdredByCdgVrsn("[[");}
//		if(compositionsectionorderedbycoding.hasVersion()) {
//
//			c.addCmpsitionSectionOrdredByCdgVrsn(String.valueOf(compositionsectionorderedbycoding.getVersion()));
//		} else {
//			c.addCmpsitionSectionOrdredByCdgVrsn("NULL");
//		}
//
//		if(compositionsectionorderedbycodingi == compositionsectionorderedbycodinglist.size()-1) {c.addCmpsitionSectionOrdredByCdgVrsn("]]");}
//
//
//		/******************** Cmpsition_Section_OrdredBy_Cdg_Cd ********************************************************************************/
//		if(compositionsectionorderedbycodingi == 0) {c.addCmpsitionSectionOrdredByCdgCd("[[");}
//		if(compositionsectionorderedbycoding.hasCode()) {
//
//			c.addCmpsitionSectionOrdredByCdgCd(String.valueOf(compositionsectionorderedbycoding.getCode()));
//		} else {
//			c.addCmpsitionSectionOrdredByCdgCd("NULL");
//		}
//
//		if(compositionsectionorderedbycodingi == compositionsectionorderedbycodinglist.size()-1) {c.addCmpsitionSectionOrdredByCdgCd("]]");}
//
//
//		/******************** Cmpsition_Section_OrdredBy_Cdg_UsrSltd ********************************************************************************/
//		if(compositionsectionorderedbycodingi == 0) {c.addCmpsitionSectionOrdredByCdgUsrSltd("[[");}
//		if(compositionsectionorderedbycoding.hasUserSelected()) {
//
//			c.addCmpsitionSectionOrdredByCdgUsrSltd(String.valueOf(compositionsectionorderedbycoding.getUserSelected()));
//		} else {
//			c.addCmpsitionSectionOrdredByCdgUsrSltd("NULL");
//		}
//
//		if(compositionsectionorderedbycodingi == compositionsectionorderedbycodinglist.size()-1) {c.addCmpsitionSectionOrdredByCdgUsrSltd("]]");}
//
//
//		/******************** Cmpsition_Section_OrdredBy_Cdg_Sys ********************************************************************************/
//		if(compositionsectionorderedbycodingi == 0) {c.addCmpsitionSectionOrdredByCdgSys("[[");}
//		if(compositionsectionorderedbycoding.hasSystem()) {
//
//			c.addCmpsitionSectionOrdredByCdgSys(String.valueOf(compositionsectionorderedbycoding.getSystem()));
//		} else {
//			c.addCmpsitionSectionOrdredByCdgSys("NULL");
//		}
//
//		if(compositionsectionorderedbycodingi == compositionsectionorderedbycodinglist.size()-1) {c.addCmpsitionSectionOrdredByCdgSys("]]");}
//
//
//		 };
//		/******************** Cmpsition_Section_Focus ********************************************************************************/
//		if(compositionsectioni == 0) {c.addCmpsitionSectionFocus("[");}
//		if(compositionsection.hasFocus()) {
//
//			if(compositionsection.getFocus().getReference() != null) {
//			c.addCmpsitionSectionFocus(compositionsection.getFocus().getReference());
//			}
//		} else {
//			c.addCmpsitionSectionFocus("NULL");
//		}
//
//		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionFocus("]");}
//
//
//		/******************** Cmpsition_Section_Ttl ********************************************************************************/
//		if(compositionsectioni == 0) {c.addCmpsitionSectionTtl("[");}
//		if(compositionsection.hasTitle()) {
//
//			c.addCmpsitionSectionTtl(String.valueOf(compositionsection.getTitle()));
//		} else {
//			c.addCmpsitionSectionTtl("NULL");
//		}
//
//		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTtl("]");}
//
//
//		/******************** compositionsectiontext ********************************************************************************/
//		org.hl7.fhir.r4.model.Narrative compositionsectiontext = compositionsection.getText();
//
//		/******************** compositionsectiontextstatus ********************************************************************************/
//		org.hl7.fhir.r4.model.Narrative.NarrativeStatus compositionsectiontextstatus = compositionsectiontext.getStatus();
//		if(compositionsectiontextstatus!=null) {
//		if(compositionsectioni == 0) {
//
//		c.addCmpsitionSectionTxtSts("[");		}
//			c.addCmpsitionSectionTxtSts(compositionsectiontextstatus.toCode());
//		if(compositionsectioni == compositionsectionlist.size()-1) {
//
//		c.addCmpsitionSectionTxtSts("]");		}
//
//		} else {
//			c.addCmpsitionSectionTxtSts("NULL");
//		}
//
////		/******************** compositionsectiontextdiv ********************************************************************************/
////		org.hl7.fhir.utilities.xhtml.XhtmlNode compositionsectiontextdiv = compositionsectiontext.getDiv();
////
////		/******************** Cmpsition_Section_Txt_Div_Nm ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivNm("[");}
////		if(compositionsectiontextdiv.hasName()) {
////
////			c.addCmpsitionSectionTxtDivNm(String.valueOf(compositionsectiontextdiv.getName()));
////		} else {
////			c.addCmpsitionSectionTxtDivNm("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivNm("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_Vl ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivVl("[");}
////		if(compositionsectiontextdiv.hasValue()) {
////
////			c.addCmpsitionSectionTxtDivVl(String.valueOf(compositionsectiontextdiv.getValue()));
////		} else {
////			c.addCmpsitionSectionTxtDivVl("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivVl("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_Vl ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivVl("[");}
////		if(compositionsectiontextdiv.hasValue()) {
////
////			c.addCmpsitionSectionTxtDivVl(String.valueOf(compositionsectiontextdiv.getValue()));
////		} else {
////			c.addCmpsitionSectionTxtDivVl("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivVl("]");}
////
////
////		/******************** compositionsectiontextdivlocation ********************************************************************************/
////		org.hl7.fhir.utilities.xhtml.XhtmlNode.Location compositionsectiontextdivlocation = compositionsectiontextdiv.getLocation();
////
////		/******************** Cmpsition_Section_Txt_Div_Lctn_Line ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivLctnLine("[");}
////		if(compositionsectiontextdivlocation.hasLine()) {
////
////			c.addCmpsitionSectionTxtDivLctnLine(String.valueOf(compositionsectiontextdivlocation.getLine()));
////		} else {
////			c.addCmpsitionSectionTxtDivLctnLine("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivLctnLine("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_Lctn_Column ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivLctnColumn("[");}
////		if(compositionsectiontextdivlocation.hasColumn()) {
////
////			c.addCmpsitionSectionTxtDivLctnColumn(String.valueOf(compositionsectiontextdivlocation.getColumn()));
////		} else {
////			c.addCmpsitionSectionTxtDivLctnColumn("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivLctnColumn("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_Cntnt ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivCntnt("[");}
////		if(compositionsectiontextdiv.hasContent()) {
////
////			c.addCmpsitionSectionTxtDivCntnt(String.valueOf(compositionsectiontextdiv.getContent()));
////		} else {
////			c.addCmpsitionSectionTxtDivCntnt("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivCntnt("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_Attributes ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivAttributes("[");}
////		if(compositionsectiontextdiv.hasAttributes()) {
////
////			c.addCmpsitionSectionTxtDivAttributes(String.valueOf(compositionsectiontextdiv.getAttributes()));
////		} else {
////			c.addCmpsitionSectionTxtDivAttributes("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivAttributes("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_FrmatCommentsPre ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivFrmatCommentsPre("[");}
////		if(compositionsectiontextdiv.hasFormatCommentsPre()) {
////
////			String  array = "[";
////			for(int incr=0; incr<compositionsectiontextdiv.getFormatCommentsPre().size(); incr++) {
////				array = array + String.valueOf(compositionsectiontextdiv.getFormatCommentsPre().get(incr)) + ",";
////			}
////			array = array.substring(0, array.length() -1);
////			array = array + "]";
////			c.addCmpsitionSectionTxtDivFrmatCommentsPre(array);
////
////		} else {
////			c.addCmpsitionSectionTxtDivFrmatCommentsPre("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivFrmatCommentsPre("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_FrmatCommentsPost ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivFrmatCommentsPost("[");}
////		if(compositionsectiontextdiv.hasFormatCommentsPost()) {
////
////			String  array = "[";
////			for(int incr=0; incr<compositionsectiontextdiv.getFormatCommentsPost().size(); incr++) {
////				array = array + String.valueOf(compositionsectiontextdiv.getFormatCommentsPost().get(incr)) + ",";
////			}
////			array = array.substring(0, array.length() -1);
////			array = array + "]";
////			c.addCmpsitionSectionTxtDivFrmatCommentsPost(array);
////
////		} else {
////			c.addCmpsitionSectionTxtDivFrmatCommentsPost("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivFrmatCommentsPost("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_ChildNodes ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivChildNodes("[");}
////		if(compositionsectiontextdiv.hasChildNodes()) {
////
////			String  array = "[";
////			for(int incr=0; incr<compositionsectiontextdiv.getChildNodes().size(); incr++) {
////				array = array + String.valueOf(compositionsectiontextdiv.getChildNodes().get(incr)) + ",";
////			}
////			array = array.substring(0, array.length() -1);
////			array = array + "]";
////			c.addCmpsitionSectionTxtDivChildNodes(array);
////
////		} else {
////			c.addCmpsitionSectionTxtDivChildNodes("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivChildNodes("]");}
////
////
////		/******************** compositionsectiontextdivnodetype ********************************************************************************/
////		org.hl7.fhir.utilities.xhtml.NodeType compositionsectiontextdivnodetype = compositionsectiontextdiv.getNodeType();
////
////		/******************** Cmpsition_Section_Txt_Div_NsDecl ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivNsDecl("[");}
////		if(compositionsectiontextdiv.hasNsDecl()) {
////
////			c.addCmpsitionSectionTxtDivNsDecl(String.valueOf(compositionsectiontextdiv.getNsDecl()));
////		} else {
////			c.addCmpsitionSectionTxtDivNsDecl("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivNsDecl("]");}
////
////
////		/******************** Cmpsition_Section_Txt_Div_VlAsStrg ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionTxtDivVlAsStrg("[");}
////		if(compositionsectiontextdiv.hasValueAsString()) {
////
////			c.addCmpsitionSectionTxtDivVlAsStrg(String.valueOf(compositionsectiontextdiv.getValueAsString()));
////		} else {
////			c.addCmpsitionSectionTxtDivVlAsStrg("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionTxtDivVlAsStrg("]");}
////
////
////		/******************** Cmpsition_Section_Athr ********************************************************************************/
////		if(compositionsectioni == 0) {c.addCmpsitionSectionAthr("[");}
////		if(compositionsection.hasAuthor()) {
////
////			String  array = "[";
////			for(int incr=0; incr<compositionsection.getAuthor().size(); incr++) {
////				array = array + compositionsection.getAuthor().get(incr).getReference() + ",";
////			}
////			array = array.substring(0, array.length() -1);
////			array = array + "]";
////			c.addCmpsitionSectionAthr(array);
////
////		} else {
////			c.addCmpsitionSectionAthr("NULL");
////		}
////
////		if(compositionsectioni == compositionsectionlist.size()-1) {c.addCmpsitionSectionAthr("]");}
////
////
////		 };
//		/******************** Cmpsition_Dt ********************************************************************************/
//		if(composition.hasDate()) {
//
//			c.addCmpsitionDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(composition.getDate())+"\"");
//		} else {
//			c.addCmpsitionDt("NULL");
//		}
//
//
//		/******************** Cmpsition_Sbjct ********************************************************************************/
//		if(composition.hasSubject()) {
//
//			if(composition.getSubject().getReference() != null) {
//			c.addCmpsitionSbjct(composition.getSubject().getReference());
//			}
//		} else {
//			c.addCmpsitionSbjct("NULL");
//		}
//
//
//		/******************** compositionstatus ********************************************************************************/
//		org.hl7.fhir.r4.model.Composition.CompositionStatus compositionstatus = composition.getStatus();
//		if(compositionstatus!=null) {
//			c.addCmpsitionSts(compositionstatus.toCode());
//		} else {
//			c.addCmpsitionSts("NULL");
//		}
//
//		/******************** Cmpsition_Enc ********************************************************************************/
//		if(composition.hasEncounter()) {
//
//			if(composition.getEncounter().getReference() != null) {
//			c.addCmpsitionEnc(composition.getEncounter().getReference());
//			}
//		} else {
//			c.addCmpsitionEnc("NULL");
//		}
//
//
//		/******************** compositionidentifier ********************************************************************************/
//		org.hl7.fhir.r4.model.Identifier compositionidentifier = composition.getIdentifier();
//
//		/******************** Cmpsition_Id_Vl ********************************************************************************/
//		if(compositionidentifier.hasValue()) {
//
//			c.addCmpsitionIdVl(String.valueOf(compositionidentifier.getValue()));
//		} else {
//			c.addCmpsitionIdVl("NULL");
//		}
//
//
//		/******************** compositionidentifiertype ********************************************************************************/
//		org.hl7.fhir.r4.model.CodeableConcept compositionidentifiertype = compositionidentifier.getType();
//
//		/******************** Cmpsition_Id_Typ_Txt ********************************************************************************/
//		if(compositionidentifiertype.hasText()) {
//
//			c.addCmpsitionIdTypTxt(String.valueOf(compositionidentifiertype.getText()));
//		} else {
//			c.addCmpsitionIdTypTxt("NULL");
//		}
//
//
//		/******************** compositionidentifiertypecoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositionidentifiertypecodinglist = compositionidentifiertype.getCoding();
//		for(int compositionidentifiertypecodingi = 0; compositionidentifiertypecodingi<compositionidentifiertypecodinglist.size();compositionidentifiertypecodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositionidentifiertypecoding = compositionidentifiertypecodinglist.get(compositionidentifiertypecodingi);
//
//		/******************** Cmpsition_Id_Typ_Cdg_Dsply ********************************************************************************/
//		if(compositionidentifiertypecodingi == 0) {c.addCmpsitionIdTypCdgDsply("[");}
//		if(compositionidentifiertypecoding.hasDisplay()) {
//
//			c.addCmpsitionIdTypCdgDsply(String.valueOf(compositionidentifiertypecoding.getDisplay()));
//		} else {
//			c.addCmpsitionIdTypCdgDsply("NULL");
//		}
//
//		if(compositionidentifiertypecodingi == compositionidentifiertypecodinglist.size()-1) {c.addCmpsitionIdTypCdgDsply("]");}
//
//
//		/******************** Cmpsition_Id_Typ_Cdg_Vrsn ********************************************************************************/
//		if(compositionidentifiertypecodingi == 0) {c.addCmpsitionIdTypCdgVrsn("[");}
//		if(compositionidentifiertypecoding.hasVersion()) {
//
//			c.addCmpsitionIdTypCdgVrsn(String.valueOf(compositionidentifiertypecoding.getVersion()));
//		} else {
//			c.addCmpsitionIdTypCdgVrsn("NULL");
//		}
//
//		if(compositionidentifiertypecodingi == compositionidentifiertypecodinglist.size()-1) {c.addCmpsitionIdTypCdgVrsn("]");}
//
//
//		/******************** Cmpsition_Id_Typ_Cdg_Cd ********************************************************************************/
//		if(compositionidentifiertypecodingi == 0) {c.addCmpsitionIdTypCdgCd("[");}
//		if(compositionidentifiertypecoding.hasCode()) {
//
//			c.addCmpsitionIdTypCdgCd(String.valueOf(compositionidentifiertypecoding.getCode()));
//		} else {
//			c.addCmpsitionIdTypCdgCd("NULL");
//		}
//
//		if(compositionidentifiertypecodingi == compositionidentifiertypecodinglist.size()-1) {c.addCmpsitionIdTypCdgCd("]");}
//
//
//		/******************** Cmpsition_Id_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(compositionidentifiertypecodingi == 0) {c.addCmpsitionIdTypCdgUsrSltd("[");}
//		if(compositionidentifiertypecoding.hasUserSelected()) {
//
//			c.addCmpsitionIdTypCdgUsrSltd(String.valueOf(compositionidentifiertypecoding.getUserSelected()));
//		} else {
//			c.addCmpsitionIdTypCdgUsrSltd("NULL");
//		}
//
//		if(compositionidentifiertypecodingi == compositionidentifiertypecodinglist.size()-1) {c.addCmpsitionIdTypCdgUsrSltd("]");}
//
//
//		/******************** Cmpsition_Id_Typ_Cdg_Sys ********************************************************************************/
//		if(compositionidentifiertypecodingi == 0) {c.addCmpsitionIdTypCdgSys("[");}
//		if(compositionidentifiertypecoding.hasSystem()) {
//
//			c.addCmpsitionIdTypCdgSys(String.valueOf(compositionidentifiertypecoding.getSystem()));
//		} else {
//			c.addCmpsitionIdTypCdgSys("NULL");
//		}
//
//		if(compositionidentifiertypecodingi == compositionidentifiertypecodinglist.size()-1) {c.addCmpsitionIdTypCdgSys("]");}
//
//
//		 };
//		/******************** compositionidentifierperiod ********************************************************************************/
//		org.hl7.fhir.r4.model.Period compositionidentifierperiod = compositionidentifier.getPeriod();
//
//		/******************** Cmpsition_Id_Prd_Strt ********************************************************************************/
//		if(compositionidentifierperiod.hasStart()) {
//
//			c.addCmpsitionIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositionidentifierperiod.getStart())+"\"");
//		} else {
//			c.addCmpsitionIdPrdStrt("NULL");
//		}
//
//
//		/******************** Cmpsition_Id_Prd_End ********************************************************************************/
//		if(compositionidentifierperiod.hasEnd()) {
//
//			c.addCmpsitionIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositionidentifierperiod.getEnd())+"\"");
//		} else {
//			c.addCmpsitionIdPrdEnd("NULL");
//		}
//
//
//		/******************** compositionidentifieruse ********************************************************************************/
//		org.hl7.fhir.r4.model.Identifier.IdentifierUse compositionidentifieruse = compositionidentifier.getUse();
//		if(compositionidentifieruse!=null) {
//			c.addCmpsitionIdUse(compositionidentifieruse.toCode());
//		} else {
//			c.addCmpsitionIdUse("NULL");
//		}
//
//		/******************** Cmpsition_Id_Assigner ********************************************************************************/
//		if(compositionidentifier.hasAssigner()) {
//
//			if(compositionidentifier.getAssigner().getReference() != null) {
//			c.addCmpsitionIdAssigner(compositionidentifier.getAssigner().getReference());
//			}
//		} else {
//			c.addCmpsitionIdAssigner("NULL");
//		}
//
//
//		/******************** Cmpsition_Id_Sys ********************************************************************************/
//		if(compositionidentifier.hasSystem()) {
//
//			c.addCmpsitionIdSys(String.valueOf(compositionidentifier.getSystem()));
//		} else {
//			c.addCmpsitionIdSys("NULL");
//		}
//
//
//		/******************** compositioncategory ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> compositioncategorylist = composition.getCategory();
//		for(int compositioncategoryi = 0; compositioncategoryi<compositioncategorylist.size();compositioncategoryi++ ) {
//		org.hl7.fhir.r4.model.CodeableConcept  compositioncategory = compositioncategorylist.get(compositioncategoryi);
//
//		/******************** Cmpsition_Ctgry_Txt ********************************************************************************/
//		if(compositioncategoryi == 0) {c.addCmpsitionCtgryTxt("[");}
//		if(compositioncategory.hasText()) {
//
//			c.addCmpsitionCtgryTxt(String.valueOf(compositioncategory.getText()));
//		} else {
//			c.addCmpsitionCtgryTxt("NULL");
//		}
//
//		if(compositioncategoryi == compositioncategorylist.size()-1) {c.addCmpsitionCtgryTxt("]");}
//
//
//		/******************** compositioncategorycoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositioncategorycodinglist = compositioncategory.getCoding();
//		for(int compositioncategorycodingi = 0; compositioncategorycodingi<compositioncategorycodinglist.size();compositioncategorycodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositioncategorycoding = compositioncategorycodinglist.get(compositioncategorycodingi);
//
//		/******************** Cmpsition_Ctgry_Cdg_Dsply ********************************************************************************/
//		if(compositioncategorycodingi == 0) {c.addCmpsitionCtgryCdgDsply("[[");}
//		if(compositioncategorycoding.hasDisplay()) {
//
//			c.addCmpsitionCtgryCdgDsply(String.valueOf(compositioncategorycoding.getDisplay()));
//		} else {
//			c.addCmpsitionCtgryCdgDsply("NULL");
//		}
//
//		if(compositioncategorycodingi == compositioncategorycodinglist.size()-1) {c.addCmpsitionCtgryCdgDsply("]]");}
//
//
//		/******************** Cmpsition_Ctgry_Cdg_Vrsn ********************************************************************************/
//		if(compositioncategorycodingi == 0) {c.addCmpsitionCtgryCdgVrsn("[[");}
//		if(compositioncategorycoding.hasVersion()) {
//
//			c.addCmpsitionCtgryCdgVrsn(String.valueOf(compositioncategorycoding.getVersion()));
//		} else {
//			c.addCmpsitionCtgryCdgVrsn("NULL");
//		}
//
//		if(compositioncategorycodingi == compositioncategorycodinglist.size()-1) {c.addCmpsitionCtgryCdgVrsn("]]");}
//
//
//		/******************** Cmpsition_Ctgry_Cdg_Cd ********************************************************************************/
//		if(compositioncategorycodingi == 0) {c.addCmpsitionCtgryCdgCd("[[");}
//		if(compositioncategorycoding.hasCode()) {
//
//			c.addCmpsitionCtgryCdgCd(String.valueOf(compositioncategorycoding.getCode()));
//		} else {
//			c.addCmpsitionCtgryCdgCd("NULL");
//		}
//
//		if(compositioncategorycodingi == compositioncategorycodinglist.size()-1) {c.addCmpsitionCtgryCdgCd("]]");}
//
//
//		/******************** Cmpsition_Ctgry_Cdg_UsrSltd ********************************************************************************/
//		if(compositioncategorycodingi == 0) {c.addCmpsitionCtgryCdgUsrSltd("[[");}
//		if(compositioncategorycoding.hasUserSelected()) {
//
//			c.addCmpsitionCtgryCdgUsrSltd(String.valueOf(compositioncategorycoding.getUserSelected()));
//		} else {
//			c.addCmpsitionCtgryCdgUsrSltd("NULL");
//		}
//
//		if(compositioncategorycodingi == compositioncategorycodinglist.size()-1) {c.addCmpsitionCtgryCdgUsrSltd("]]");}
//
//
//		/******************** Cmpsition_Ctgry_Cdg_Sys ********************************************************************************/
//		if(compositioncategorycodingi == 0) {c.addCmpsitionCtgryCdgSys("[[");}
//		if(compositioncategorycoding.hasSystem()) {
//
//			c.addCmpsitionCtgryCdgSys(String.valueOf(compositioncategorycoding.getSystem()));
//		} else {
//			c.addCmpsitionCtgryCdgSys("NULL");
//		}
//
//		if(compositioncategorycodingi == compositioncategorycodinglist.size()-1) {c.addCmpsitionCtgryCdgSys("]]");}
//
//
//		 };
//		 };
//		/******************** Cmpsition_Ttl ********************************************************************************/
//		if(composition.hasTitle()) {
//
//			c.addCmpsitionTtl(String.valueOf(composition.getTitle()));
//		} else {
//			c.addCmpsitionTtl("NULL");
//		}
//
//
//		/******************** Cmpsition_Custodian ********************************************************************************/
//		if(composition.hasCustodian()) {
//
//			if(composition.getCustodian().getReference() != null) {
//			c.addCmpsitionCustodian(composition.getCustodian().getReference());
//			}
//		} else {
//			c.addCmpsitionCustodian("NULL");
//		}
//
//
//		/******************** compositionrelatesto ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent> compositionrelatestolist = composition.getRelatesTo();
//		for(int compositionrelatestoi = 0; compositionrelatestoi<compositionrelatestolist.size();compositionrelatestoi++ ) {
//		org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent  compositionrelatesto = compositionrelatestolist.get(compositionrelatestoi);
//
//		/******************** compositionrelatestocode ********************************************************************************/
//		org.hl7.fhir.r4.model.Composition.DocumentRelationshipType compositionrelatestocode = compositionrelatesto.getCode();
//		if(compositionrelatestocode!=null) {
//		if(compositionrelatestoi == 0) {
//
//		c.addCmpsitionRelatesToCd("[");		}
//			c.addCmpsitionRelatesToCd(compositionrelatestocode.toCode());
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {
//
//		c.addCmpsitionRelatesToCd("]");		}
//
//		} else {
//			c.addCmpsitionRelatesToCd("NULL");
//		}
//
//		/******************** compositionrelatestotargetidentifier ********************************************************************************/
//		org.hl7.fhir.r4.model.Identifier compositionrelatestotargetidentifier = compositionrelatesto.getTargetIdentifier();
//
//		/******************** Cmpsition_RelatesTo_TargetId_Vl ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTargetIdVl("[");}
//		if(compositionrelatestotargetidentifier.hasValue()) {
//
//			c.addCmpsitionRelatesToTargetIdVl(String.valueOf(compositionrelatestotargetidentifier.getValue()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdVl("NULL");
//		}
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTargetIdVl("]");}
//
//
//		/******************** compositionrelatestotargetidentifiertype ********************************************************************************/
//		org.hl7.fhir.r4.model.CodeableConcept compositionrelatestotargetidentifiertype = compositionrelatestotargetidentifier.getType();
//
//		/******************** Cmpsition_RelatesTo_TargetId_Typ_Txt ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTargetIdTypTxt("[");}
//		if(compositionrelatestotargetidentifiertype.hasText()) {
//
//			c.addCmpsitionRelatesToTargetIdTypTxt(String.valueOf(compositionrelatestotargetidentifiertype.getText()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdTypTxt("NULL");
//		}
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTargetIdTypTxt("]");}
//
//
//		/******************** compositionrelatestotargetidentifiertypecoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositionrelatestotargetidentifiertypecodinglist = compositionrelatestotargetidentifiertype.getCoding();
//		for(int compositionrelatestotargetidentifiertypecodingi = 0; compositionrelatestotargetidentifiertypecodingi<compositionrelatestotargetidentifiertypecodinglist.size();compositionrelatestotargetidentifiertypecodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositionrelatestotargetidentifiertypecoding = compositionrelatestotargetidentifiertypecodinglist.get(compositionrelatestotargetidentifiertypecodingi);
//
//		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Dsply ********************************************************************************/
//		if(compositionrelatestotargetidentifiertypecodingi == 0) {c.addCmpsitionRelatesToTargetIdTypCdgDsply("[[");}
//		if(compositionrelatestotargetidentifiertypecoding.hasDisplay()) {
//
//			c.addCmpsitionRelatesToTargetIdTypCdgDsply(String.valueOf(compositionrelatestotargetidentifiertypecoding.getDisplay()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdTypCdgDsply("NULL");
//		}
//
//		if(compositionrelatestotargetidentifiertypecodingi == compositionrelatestotargetidentifiertypecodinglist.size()-1) {c.addCmpsitionRelatesToTargetIdTypCdgDsply("]]");}
//
//
//		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Vrsn ********************************************************************************/
//		if(compositionrelatestotargetidentifiertypecodingi == 0) {c.addCmpsitionRelatesToTargetIdTypCdgVrsn("[[");}
//		if(compositionrelatestotargetidentifiertypecoding.hasVersion()) {
//
//			c.addCmpsitionRelatesToTargetIdTypCdgVrsn(String.valueOf(compositionrelatestotargetidentifiertypecoding.getVersion()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdTypCdgVrsn("NULL");
//		}
//
//		if(compositionrelatestotargetidentifiertypecodingi == compositionrelatestotargetidentifiertypecodinglist.size()-1) {c.addCmpsitionRelatesToTargetIdTypCdgVrsn("]]");}
//
//
//		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Cd ********************************************************************************/
//		if(compositionrelatestotargetidentifiertypecodingi == 0) {c.addCmpsitionRelatesToTargetIdTypCdgCd("[[");}
//		if(compositionrelatestotargetidentifiertypecoding.hasCode()) {
//
//			c.addCmpsitionRelatesToTargetIdTypCdgCd(String.valueOf(compositionrelatestotargetidentifiertypecoding.getCode()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdTypCdgCd("NULL");
//		}
//
//		if(compositionrelatestotargetidentifiertypecodingi == compositionrelatestotargetidentifiertypecodinglist.size()-1) {c.addCmpsitionRelatesToTargetIdTypCdgCd("]]");}
//
//
//		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(compositionrelatestotargetidentifiertypecodingi == 0) {c.addCmpsitionRelatesToTargetIdTypCdgUsrSltd("[[");}
//		if(compositionrelatestotargetidentifiertypecoding.hasUserSelected()) {
//
//			c.addCmpsitionRelatesToTargetIdTypCdgUsrSltd(String.valueOf(compositionrelatestotargetidentifiertypecoding.getUserSelected()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdTypCdgUsrSltd("NULL");
//		}
//
//		if(compositionrelatestotargetidentifiertypecodingi == compositionrelatestotargetidentifiertypecodinglist.size()-1) {c.addCmpsitionRelatesToTargetIdTypCdgUsrSltd("]]");}
//
//
//		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Sys ********************************************************************************/
//		if(compositionrelatestotargetidentifiertypecodingi == 0) {c.addCmpsitionRelatesToTargetIdTypCdgSys("[[");}
//		if(compositionrelatestotargetidentifiertypecoding.hasSystem()) {
//
//			c.addCmpsitionRelatesToTargetIdTypCdgSys(String.valueOf(compositionrelatestotargetidentifiertypecoding.getSystem()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdTypCdgSys("NULL");
//		}
//
//		if(compositionrelatestotargetidentifiertypecodingi == compositionrelatestotargetidentifiertypecodinglist.size()-1) {c.addCmpsitionRelatesToTargetIdTypCdgSys("]]");}
//
//
//		 };
//		/******************** compositionrelatestotargetidentifierperiod ********************************************************************************/
//		org.hl7.fhir.r4.model.Period compositionrelatestotargetidentifierperiod = compositionrelatestotargetidentifier.getPeriod();
//
//		/******************** Cmpsition_RelatesTo_TargetId_Prd_Strt ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTargetIdPrdStrt("[");}
//		if(compositionrelatestotargetidentifierperiod.hasStart()) {
//
//			c.addCmpsitionRelatesToTargetIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositionrelatestotargetidentifierperiod.getStart())+"\"");
//		} else {
//			c.addCmpsitionRelatesToTargetIdPrdStrt("NULL");
//		}
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTargetIdPrdStrt("]");}
//
//
//		/******************** Cmpsition_RelatesTo_TargetId_Prd_End ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTargetIdPrdEnd("[");}
//		if(compositionrelatestotargetidentifierperiod.hasEnd()) {
//
//			c.addCmpsitionRelatesToTargetIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositionrelatestotargetidentifierperiod.getEnd())+"\"");
//		} else {
//			c.addCmpsitionRelatesToTargetIdPrdEnd("NULL");
//		}
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTargetIdPrdEnd("]");}
//
//
//		/******************** compositionrelatestotargetidentifieruse ********************************************************************************/
//		org.hl7.fhir.r4.model.Identifier.IdentifierUse compositionrelatestotargetidentifieruse = compositionrelatestotargetidentifier.getUse();
//		if(compositionrelatestotargetidentifieruse!=null) {
//		if(compositionrelatestoi == 0) {
//
//		c.addCmpsitionRelatesToTargetIdUse("[");		}
//			c.addCmpsitionRelatesToTargetIdUse(compositionrelatestotargetidentifieruse.toCode());
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {
//
//		c.addCmpsitionRelatesToTargetIdUse("]");		}
//
//		} else {
//			c.addCmpsitionRelatesToTargetIdUse("NULL");
//		}
//
//		/******************** Cmpsition_RelatesTo_TargetId_Assigner ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTargetIdAssigner("[");}
//		if(compositionrelatestotargetidentifier.hasAssigner()) {
//
//			if(compositionrelatestotargetidentifier.getAssigner().getReference() != null) {
//			c.addCmpsitionRelatesToTargetIdAssigner(compositionrelatestotargetidentifier.getAssigner().getReference());
//			}
//		} else {
//			c.addCmpsitionRelatesToTargetIdAssigner("NULL");
//		}
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTargetIdAssigner("]");}
//
//
//		/******************** Cmpsition_RelatesTo_TargetId_Sys ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTargetIdSys("[");}
//		if(compositionrelatestotargetidentifier.hasSystem()) {
//
//			c.addCmpsitionRelatesToTargetIdSys(String.valueOf(compositionrelatestotargetidentifier.getSystem()));
//		} else {
//			c.addCmpsitionRelatesToTargetIdSys("NULL");
//		}
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTargetIdSys("]");}
//
//
//		/******************** Cmpsition_RelatesTo_TarRfrnc ********************************************************************************/
//		if(compositionrelatestoi == 0) {c.addCmpsitionRelatesToTarRfrnc("[");}
//		if(compositionrelatesto.hasTargetReference()) {
//
//			if(compositionrelatesto.getTargetReference().getReference() != null) {
//			c.addCmpsitionRelatesToTarRfrnc(compositionrelatesto.getTargetReference().getReference());
//			}
//		} else {
//			c.addCmpsitionRelatesToTarRfrnc("NULL");
//
//		if(compositionrelatestoi == compositionrelatestolist.size()-1) {c.addCmpsitionRelatesToTarRfrnc("]");}
//
//
//		 };
//		/******************** compositionevent ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Composition.CompositionEventComponent> compositioneventlist = composition.getEvent();
//		for(int compositioneventi = 0; compositioneventi<compositioneventlist.size();compositioneventi++ ) {
//		org.hl7.fhir.r4.model.Composition.CompositionEventComponent  compositionevent = compositioneventlist.get(compositioneventi);
//
//		/******************** compositioneventcode ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> compositioneventcodelist = compositionevent.getCode();
//		for(int compositioneventcodei = 0; compositioneventcodei<compositioneventcodelist.size();compositioneventcodei++ ) {
//		org.hl7.fhir.r4.model.CodeableConcept  compositioneventcode = compositioneventcodelist.get(compositioneventcodei);
//
//		/******************** Cmpsition_Evnt_Cd_Txt ********************************************************************************/
//		if(compositioneventcodei == 0) {c.addCmpsitionEvntCdTxt("[[");}
//		if(compositioneventcode.hasText()) {
//
//			c.addCmpsitionEvntCdTxt(String.valueOf(compositioneventcode.getText()));
//		} else {
//			c.addCmpsitionEvntCdTxt("NULL");
//		}
//
//		if(compositioneventcodei == compositioneventcodelist.size()-1) {c.addCmpsitionEvntCdTxt("]]");}
//
//
//		/******************** compositioneventcodecoding ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Coding> compositioneventcodecodinglist = compositioneventcode.getCoding();
//		for(int compositioneventcodecodingi = 0; compositioneventcodecodingi<compositioneventcodecodinglist.size();compositioneventcodecodingi++ ) {
//		org.hl7.fhir.r4.model.Coding  compositioneventcodecoding = compositioneventcodecodinglist.get(compositioneventcodecodingi);
//
//		/******************** Cmpsition_Evnt_Cd_Cdg_Dsply ********************************************************************************/
//		if(compositioneventcodecodingi == 0) {c.addCmpsitionEvntCdCdgDsply("[[[");}
//		if(compositioneventcodecoding.hasDisplay()) {
//
//			c.addCmpsitionEvntCdCdgDsply(String.valueOf(compositioneventcodecoding.getDisplay()));
//		} else {
//			c.addCmpsitionEvntCdCdgDsply("NULL");
//		}
//
//		if(compositioneventcodecodingi == compositioneventcodecodinglist.size()-1) {c.addCmpsitionEvntCdCdgDsply("]]]");}
//
//
//		/******************** Cmpsition_Evnt_Cd_Cdg_Vrsn ********************************************************************************/
//		if(compositioneventcodecodingi == 0) {c.addCmpsitionEvntCdCdgVrsn("[[[");}
//		if(compositioneventcodecoding.hasVersion()) {
//
//			c.addCmpsitionEvntCdCdgVrsn(String.valueOf(compositioneventcodecoding.getVersion()));
//		} else {
//			c.addCmpsitionEvntCdCdgVrsn("NULL");
//		}
//
//		if(compositioneventcodecodingi == compositioneventcodecodinglist.size()-1) {c.addCmpsitionEvntCdCdgVrsn("]]]");}
//
//
//		/******************** Cmpsition_Evnt_Cd_Cdg_Cd ********************************************************************************/
//		if(compositioneventcodecodingi == 0) {c.addCmpsitionEvntCdCdgCd("[[[");}
//		if(compositioneventcodecoding.hasCode()) {
//
//			c.addCmpsitionEvntCdCdgCd(String.valueOf(compositioneventcodecoding.getCode()));
//		} else {
//			c.addCmpsitionEvntCdCdgCd("NULL");
//		}
//
//		if(compositioneventcodecodingi == compositioneventcodecodinglist.size()-1) {c.addCmpsitionEvntCdCdgCd("]]]");}
//
//
//		/******************** Cmpsition_Evnt_Cd_Cdg_UsrSltd ********************************************************************************/
//		if(compositioneventcodecodingi == 0) {c.addCmpsitionEvntCdCdgUsrSltd("[[[");}
//		if(compositioneventcodecoding.hasUserSelected()) {
//
//			c.addCmpsitionEvntCdCdgUsrSltd(String.valueOf(compositioneventcodecoding.getUserSelected()));
//		} else {
//			c.addCmpsitionEvntCdCdgUsrSltd("NULL");
//		}
//
//		if(compositioneventcodecodingi == compositioneventcodecodinglist.size()-1) {c.addCmpsitionEvntCdCdgUsrSltd("]]]");}
//
//
//		/******************** Cmpsition_Evnt_Cd_Cdg_Sys ********************************************************************************/
//		if(compositioneventcodecodingi == 0) {c.addCmpsitionEvntCdCdgSys("[[[");}
//		if(compositioneventcodecoding.hasSystem()) {
//
//			c.addCmpsitionEvntCdCdgSys(String.valueOf(compositioneventcodecoding.getSystem()));
//		} else {
//			c.addCmpsitionEvntCdCdgSys("NULL");
//		}
//
//		if(compositioneventcodecodingi == compositioneventcodecodinglist.size()-1) {c.addCmpsitionEvntCdCdgSys("]]]");}
//
//
//		 };
//		 };
//		/******************** compositioneventperiod ********************************************************************************/
//		org.hl7.fhir.r4.model.Period compositioneventperiod = compositionevent.getPeriod();
//
//		/******************** Cmpsition_Evnt_Prd_Strt ********************************************************************************/
//		if(compositioneventperiod.hasStart()) {
//
//			c.addCmpsitionEvntPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositioneventperiod.getStart())+"\"");
//		} else {
//			c.addCmpsitionEvntPrdStrt("NULL");
//		}
//
//
//		/******************** Cmpsition_Evnt_Prd_End ********************************************************************************/
//		if(compositioneventperiod.hasEnd()) {
//
//			c.addCmpsitionEvntPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositioneventperiod.getEnd())+"\"");
//		} else {
//			c.addCmpsitionEvntPrdEnd("NULL");
//		}
//
//
//		/******************** Cmpsition_Evnt_Dtl ********************************************************************************/
//		if(compositionevent.hasDetail()) {
//
//			String  array = "[";
//			for(int incr=0; incr<compositionevent.getDetail().size(); incr++) {
//				array = array + compositionevent.getDetail().get(incr).getReference() + ",";
//			}
//			array = array.substring(0, array.length() -1);
//			array = array + "]";
//			c.addCmpsitionEvntDtl(array);
//
//		} else {
//			c.addCmpsitionEvntDtl("NULL");
//		}
//
//
//		 };
//		/******************** Cmpsition_Athr ********************************************************************************/
//		if(composition.hasAuthor()) {
//
//			String  array = "[";
//			for(int incr=0; incr<composition.getAuthor().size(); incr++) {
//				array = array + composition.getAuthor().get(incr).getReference() + ",";
//			}
//			array = array.substring(0, array.length() -1);
//			array = array + "]";
//			c.addCmpsitionAthr(array);
//
//		} else {
//			c.addCmpsitionAthr("NULL");
//		}
//
//
//		/******************** compositionconfidentiality ********************************************************************************/
//		org.hl7.fhir.r4.model.Composition.DocumentConfidentiality compositionconfidentiality = composition.getConfidentiality();
//		if(compositionconfidentiality!=null) {
//			c.addCmpsitionConfidentiality(compositionconfidentiality.toCode());
//		} else {
//			c.addCmpsitionConfidentiality("NULL");
//		}
//
//		/******************** compositionattester ********************************************************************************/
//		java.util.List<org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent> compositionattesterlist = composition.getAttester();
//		for(int compositionattesteri = 0; compositionattesteri<compositionattesterlist.size();compositionattesteri++ ) {
//		org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent  compositionattester = compositionattesterlist.get(compositionattesteri);
//
//		/******************** Cmpsition_Attester_Time ********************************************************************************/
//		if(compositionattesteri == 0) {c.addCmpsitionAttesterTime("[");}
//		if(compositionattester.hasTime()) {
//
//			c.addCmpsitionAttesterTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(compositionattester.getTime())+"\"");
//		} else {
//			c.addCmpsitionAttesterTime("NULL");
//		}
//
//		if(compositionattesteri == compositionattesterlist.size()-1) {c.addCmpsitionAttesterTime("]");}
//
//
//		/******************** compositionattestermode ********************************************************************************/
//		org.hl7.fhir.r4.model.Composition.CompositionAttestationMode compositionattestermode = compositionattester.getMode();
//		if(compositionattestermode!=null) {
//		if(compositionattesteri == 0) {
//
//		c.addCmpsitionAttesterMode("[");		}
//			c.addCmpsitionAttesterMode(compositionattestermode.toCode());
//		if(compositionattesteri == compositionattesterlist.size()-1) {
//
//		c.addCmpsitionAttesterMode("]");		}
//
//		} else {
//			c.addCmpsitionAttesterMode("NULL");
//		}
//
//		/******************** Cmpsition_Attester_Party ********************************************************************************/
//		if(compositionattesteri == 0) {c.addCmpsitionAttesterParty("[");}
//		if(compositionattester.hasParty()) {
//
//			if(compositionattester.getParty().getReference() != null) {
//			c.addCmpsitionAttesterParty(compositionattester.getParty().getReference());
//			}
//		} else {
//			c.addCmpsitionAttesterParty("NULL");
//		}
//
//		if(compositionattesteri == compositionattesterlist.size()-1) {c.addCmpsitionAttesterParty("]");}
//
//
//		 };
		return c;
		
	}
}
