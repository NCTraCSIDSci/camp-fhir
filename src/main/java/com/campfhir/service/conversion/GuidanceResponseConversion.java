package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.GuidanceResponse;
public class GuidanceResponseConversion 
{
	public org.hl7.fhir.r4.model.GuidanceResponse GuidanceResponses(GuidanceResponse g) throws ParseException
	{
		org.hl7.fhir.r4.model.GuidanceResponse guidanceresponse = new org.hl7.fhir.r4.model.GuidanceResponse();

		/******************** id ********************************************************************************/
		guidanceresponse.setId(g.getId());

		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = g.getGuidnceRspsDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdDsply() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = g.getGuidnceRspsDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = g.getGuidnceRspsDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = g.getGuidnceRspsDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdVrsn() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = g.getGuidnceRspsDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Path ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrPath() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrSrchParam() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrVlSt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getCodeFilter().get(i1).setValueSet(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_Path ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrPath() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrSrchParam() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValuePeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getDateFilter().get(i1).getValuePeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_Lmt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentLmt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getDataRequirement().get(i0).setLimit(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_DataRqrment_MustSupport ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentMustSupport() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {guidanceresponse.getDataRequirement().get(i0).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_Profile ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentProfile() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {guidanceresponse.getDataRequirement().get(i0).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_Sort_Direction ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSortDirection() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSort().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSort().get(i1).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_Sort_Path ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSortPath() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSort().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSort().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				String[] arrayi1 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getDataRequirement().get(i0).getSubjectCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctRfrnc() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getDataRequirement().get(i0).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_DataRqrment_Typ ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentTyp() != null ) {

			String[] arrayi0 = g.getGuidnceRspsDataRqrmentTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getDataRequirement().size() < i0+1) { guidanceresponse.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getDataRequirement().get(i0).setType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_Enc ********************************************************************************/
		if(g.getGuidnceRspsEnc() != null ) {

			if(g.getGuidnceRspsEnc().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsEnc()==null) {} else {
			guidanceresponse.setEncounter(new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_EvaluationMsg ********************************************************************************/
		if(g.getGuidnceRspsEvaluationMsg() != null ) {

				for( String currListStrSplit : g.getGuidnceRspsEvaluationMsg().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			guidanceresponse.addEvaluationMessage(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** GuidnceRsps_Id_Assigner ********************************************************************************/
		if(g.getGuidnceRspsIdAssigner() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_Id_Prd_End ********************************************************************************/
		if(g.getGuidnceRspsIdPrdEnd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_Id_Prd_Strt ********************************************************************************/
		if(g.getGuidnceRspsIdPrdStrt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_Id_Sys ********************************************************************************/
		if(g.getGuidnceRspsIdSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				String[] arrayi1 = g.getGuidnceRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { guidanceresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgDsply() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				String[] arrayi1 = g.getGuidnceRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { guidanceresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				String[] arrayi1 = g.getGuidnceRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { guidanceresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				String[] arrayi1 = g.getGuidnceRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { guidanceresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				String[] arrayi1 = g.getGuidnceRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { guidanceresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_Id_Typ_Txt ********************************************************************************/
		if(g.getGuidnceRspsIdTypTxt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_Id_Use ********************************************************************************/
		if(g.getGuidnceRspsIdUse() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_Id_Vl ********************************************************************************/
		if(g.getGuidnceRspsIdVl() != null ) {

			String[] arrayi0 = g.getGuidnceRspsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getIdentifier().size() < i0+1) { guidanceresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_ModuleCanonicalTyp ********************************************************************************/
		if(g.getGuidnceRspsModuleCanonicalTyp() != null ) {

			if(g.getGuidnceRspsModuleCanonicalTyp().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsModuleCanonicalTyp()==null) {} else {
			guidanceresponse.setModule(new org.hl7.fhir.r4.model.CanonicalType(g.getGuidnceRspsModuleCanonicalTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsModuleCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getModuleCodeableConcept().getCoding().size() < i0+1) { guidanceresponse.getModuleCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getModuleCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = g.getGuidnceRspsModuleCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getModuleCodeableConcept().getCoding().size() < i0+1) { guidanceresponse.getModuleCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getModuleCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsModuleCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getModuleCodeableConcept().getCoding().size() < i0+1) { guidanceresponse.getModuleCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getModuleCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsModuleCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getModuleCodeableConcept().getCoding().size() < i0+1) { guidanceresponse.getModuleCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getModuleCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = g.getGuidnceRspsModuleCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getModuleCodeableConcept().getCoding().size() < i0+1) { guidanceresponse.getModuleCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getModuleCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Txt ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptTxt() != null ) {

			if(g.getGuidnceRspsModuleCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsModuleCdbleCncptTxt()==null) {} else {
			guidanceresponse.getModuleCodeableConcept().setText(g.getGuidnceRspsModuleCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** GuidnceRsps_ModuleUriTyp ********************************************************************************/
		if(g.getGuidnceRspsModuleUriTyp() != null ) {

			if(g.getGuidnceRspsModuleUriTyp().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsModuleUriTyp()==null) {} else {
			guidanceresponse.setModule(new org.hl7.fhir.r4.model.UriType(g.getGuidnceRspsModuleUriTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_Nt_AthrRfrnc ********************************************************************************/
		if(g.getGuidnceRspsNtAthrRfrnc() != null ) {

			String[] arrayi0 = g.getGuidnceRspsNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getNote().size() < i0+1) { guidanceresponse.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_Nt_AthrStrgTyp ********************************************************************************/
		if(g.getGuidnceRspsNtAthrStrgTyp() != null ) {

			String[] arrayi0 = g.getGuidnceRspsNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getNote().size() < i0+1) { guidanceresponse.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_Nt_Txt ********************************************************************************/
		if(g.getGuidnceRspsNtTxt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getNote().size() < i0+1) { guidanceresponse.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_Nt_Time ********************************************************************************/
		if(g.getGuidnceRspsNtTime() != null ) {

			String[] arrayi0 = g.getGuidnceRspsNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getNote().size() < i0+1) { guidanceresponse.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_OccrnceDtTime ********************************************************************************/
		if(g.getGuidnceRspsOccrnceDtTime() != null ) {

			if(g.getGuidnceRspsOccrnceDtTime().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsOccrnceDtTime()==null) {} else {
			guidanceresponse.setOccurrenceDateTime(g.getGuidnceRspsOccrnceDtTime().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsOccrnceDtTime()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(g.getGuidnceRspsOccrnceDtTime().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_OutputPrmtrs ********************************************************************************/
		if(g.getGuidnceRspsOutputPrmtrs() != null ) {

			if(g.getGuidnceRspsOutputPrmtrs().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsOutputPrmtrs()==null) {} else {
			guidanceresponse.setOutputParameters(new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsOutputPrmtrs().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_Prfrmr ********************************************************************************/
		if(g.getGuidnceRspsPrfrmr() != null ) {

			if(g.getGuidnceRspsPrfrmr().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsPrfrmr()==null) {} else {
			guidanceresponse.setPerformer(new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsPrfrmr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getReasonCode().size() < i0+1) { guidanceresponse.addReasonCode(); }
				String[] arrayi1 = g.getGuidnceRspsRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getReasonCode().get(i0).getCoding().size() < i1+1) { guidanceresponse.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_RsnCd_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgDsply() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getReasonCode().size() < i0+1) { guidanceresponse.addReasonCode(); }
				String[] arrayi1 = g.getGuidnceRspsRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getReasonCode().get(i0).getCoding().size() < i1+1) { guidanceresponse.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_RsnCd_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getReasonCode().size() < i0+1) { guidanceresponse.addReasonCode(); }
				String[] arrayi1 = g.getGuidnceRspsRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getReasonCode().get(i0).getCoding().size() < i1+1) { guidanceresponse.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getReasonCode().size() < i0+1) { guidanceresponse.addReasonCode(); }
				String[] arrayi1 = g.getGuidnceRspsRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getReasonCode().get(i0).getCoding().size() < i1+1) { guidanceresponse.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** GuidnceRsps_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getReasonCode().size() < i0+1) { guidanceresponse.addReasonCode(); }
				String[] arrayi1 = g.getGuidnceRspsRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(guidanceresponse.getReasonCode().get(i0).getCoding().size() < i1+1) { guidanceresponse.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {guidanceresponse.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** GuidnceRsps_RsnCd_Txt ********************************************************************************/
		if(g.getGuidnceRspsRsnCdTxt() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getReasonCode().size() < i0+1) { guidanceresponse.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_RsnRfrnc ********************************************************************************/
		if(g.getGuidnceRspsRsnRfrnc() != null ) {

				for( String currListStrSplit : g.getGuidnceRspsRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			guidanceresponse.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** GuidnceRsps_RqstId_Assigner ********************************************************************************/
		if(g.getGuidnceRspsRqstIdAssigner() != null ) {

			if(g.getGuidnceRspsRqstIdAssigner().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdAssigner()==null) {} else {
			guidanceresponse.getRequestIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsRqstIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_RqstId_Prd_End ********************************************************************************/
		if(g.getGuidnceRspsRqstIdPrdEnd() != null ) {

			if(g.getGuidnceRspsRqstIdPrdEnd().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdPrdEnd()==null) {} else {
			guidanceresponse.getRequestIdentifier().getPeriod().setEnd(g.getGuidnceRspsRqstIdPrdEnd().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(g.getGuidnceRspsRqstIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_RqstId_Prd_Strt ********************************************************************************/
		if(g.getGuidnceRspsRqstIdPrdStrt() != null ) {

			if(g.getGuidnceRspsRqstIdPrdStrt().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdPrdStrt()==null) {} else {
			guidanceresponse.getRequestIdentifier().getPeriod().setStart(g.getGuidnceRspsRqstIdPrdStrt().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(g.getGuidnceRspsRqstIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_RqstId_Sys ********************************************************************************/
		if(g.getGuidnceRspsRqstIdSys() != null ) {

			if(g.getGuidnceRspsRqstIdSys().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdSys()==null) {} else {
			guidanceresponse.getRequestIdentifier().setSystem(g.getGuidnceRspsRqstIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getRequestIdentifier().getType().getCoding().size() < i0+1) { guidanceresponse.getRequestIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getRequestIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getRequestIdentifier().getType().getCoding().size() < i0+1) { guidanceresponse.getRequestIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getRequestIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getRequestIdentifier().getType().getCoding().size() < i0+1) { guidanceresponse.getRequestIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getRequestIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getRequestIdentifier().getType().getCoding().size() < i0+1) { guidanceresponse.getRequestIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getRequestIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = g.getGuidnceRspsRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(guidanceresponse.getRequestIdentifier().getType().getCoding().size() < i0+1) { guidanceresponse.getRequestIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {guidanceresponse.getRequestIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** GuidnceRsps_RqstId_Typ_Txt ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypTxt() != null ) {

			if(g.getGuidnceRspsRqstIdTypTxt().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdTypTxt()==null) {} else {
			guidanceresponse.getRequestIdentifier().getType().setText(g.getGuidnceRspsRqstIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** GuidnceRsps_RqstId_Use ********************************************************************************/
		if(g.getGuidnceRspsRqstIdUse() != null ) {

			if(g.getGuidnceRspsRqstIdUse().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdUse()==null) {} else {
			guidanceresponse.getRequestIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(g.getGuidnceRspsRqstIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_RqstId_Vl ********************************************************************************/
		if(g.getGuidnceRspsRqstIdVl() != null ) {

			if(g.getGuidnceRspsRqstIdVl().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRqstIdVl()==null) {} else {
			guidanceresponse.getRequestIdentifier().setValue(g.getGuidnceRspsRqstIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** GuidnceRsps_Rslt ********************************************************************************/
		if(g.getGuidnceRspsRslt() != null ) {

			if(g.getGuidnceRspsRslt().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsRslt()==null) {} else {
			guidanceresponse.setResult(new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsRslt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_Sts ********************************************************************************/
		if(g.getGuidnceRspsSts() != null ) {

			if(g.getGuidnceRspsSts().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsSts()==null) {} else {
			guidanceresponse.setStatus(new org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatusEnumFactory().fromCode(g.getGuidnceRspsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** GuidnceRsps_Sbjct ********************************************************************************/
		if(g.getGuidnceRspsSbjct() != null ) {

			if(g.getGuidnceRspsSbjct().replace("[","").replace("]","").equals("NULL") | g.getGuidnceRspsSbjct()==null) {} else {
			guidanceresponse.setSubject(new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return guidanceresponse;
	}
}
