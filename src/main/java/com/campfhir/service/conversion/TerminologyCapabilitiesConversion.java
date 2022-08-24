package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TerminologyCapabilities;
public class TerminologyCapabilitiesConversion 
{
	public org.hl7.fhir.r4.model.TerminologyCapabilities TerminologyCapabilitiess(TerminologyCapabilities t) throws ParseException
	{
		org.hl7.fhir.r4.model.TerminologyCapabilities terminologycapabilities = new org.hl7.fhir.r4.model.TerminologyCapabilities();

		/******************** id ********************************************************************************/
		terminologycapabilities.setId(t.getId());

		/******************** TrminologyCpnlties_Closure_Translation ********************************************************************************/
		if(t.getTrminologyCpnltiesClosureTranslation() != null ) {

			if(t.getTrminologyCpnltiesClosureTranslation().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesClosureTranslation()==null) {} else {
			terminologycapabilities.getClosure().setTranslation(Boolean.parseBoolean(t.getTrminologyCpnltiesClosureTranslation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_CdSrch ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSrch() != null ) {

			if(t.getTrminologyCpnltiesCdSrch().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesCdSrch()==null) {} else {
			terminologycapabilities.setCodeSearch(new org.hl7.fhir.r4.model.TerminologyCapabilities.CodeSearchSupportEnumFactory().fromCode(t.getTrminologyCpnltiesCdSrch().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_CdSys_Subsumption ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysSubsumption() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysSubsumption().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getCodeSystem().get(i0).setSubsumption(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TrminologyCpnlties_CdSys_Uri ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysUri() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysUri().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getCodeSystem().get(i0).setUri(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Cmpsitional ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnCmpsitional() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnCmpsitional().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnCmpsitional().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).setCompositional(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnFltrCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnFltrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnFltrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					String[] arrayi2 = t.getTrminologyCpnltiesCdSysVrsnFltrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).getFilter().size() < i2+1) { terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).addFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).getFilter().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Op ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnFltrOp() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					String[] arrayi2 = t.getTrminologyCpnltiesCdSysVrsnFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).getFilter().size() < i2+1) { terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).addFilter(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).getFilter().get(i2).addOp(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_IsDefault ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnIsDefault() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnIsDefault().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnIsDefault().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).setIsDefault(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Lnguage ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnLnguage() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).addLanguage(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Prpty ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnPrpty() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCdSysVrsnPrpty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getCodeSystem().size() < i0+1) { terminologycapabilities.addCodeSystem(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCdSysVrsnPrpty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getCodeSystem().get(i0).getVersion().size() < i1+1) { terminologycapabilities.getCodeSystem().get(i0).addVersion(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {terminologycapabilities.getCodeSystem().get(i0).getVersion().get(i1).addProperty(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** TrminologyCpnlties_Cntct_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctNm() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getContact().get(i0).getTelecom().size() < i1+1) { terminologycapabilities.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getContact().get(i0).getTelecom().size() < i1+1) { terminologycapabilities.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Rnk ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmRnk() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getContact().get(i0).getTelecom().size() < i1+1) { terminologycapabilities.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmSys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getContact().get(i0).getTelecom().size() < i1+1) { terminologycapabilities.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Use ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmUse() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getContact().get(i0).getTelecom().size() < i1+1) { terminologycapabilities.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmVl() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getContact().size() < i0+1) { terminologycapabilities.addContact(); }
				String[] arrayi1 = t.getTrminologyCpnltiesCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getContact().get(i0).getTelecom().size() < i1+1) { terminologycapabilities.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_Copyright ********************************************************************************/
		if(t.getTrminologyCpnltiesCopyright() != null ) {

			if(t.getTrminologyCpnltiesCopyright().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesCopyright()==null) {} else {
			terminologycapabilities.setCopyright(t.getTrminologyCpnltiesCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Dt ********************************************************************************/
		if(t.getTrminologyCpnltiesDt() != null ) {

			if(t.getTrminologyCpnltiesDt().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesDt()==null) {} else {
			terminologycapabilities.setDate(t.getTrminologyCpnltiesDt().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTrminologyCpnltiesDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Dscrptn ********************************************************************************/
		if(t.getTrminologyCpnltiesDscrptn() != null ) {

			if(t.getTrminologyCpnltiesDscrptn().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesDscrptn()==null) {} else {
			terminologycapabilities.setDescription(t.getTrminologyCpnltiesDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Expansion_Hierarchical ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionHierarchical() != null ) {

			if(t.getTrminologyCpnltiesExpansionHierarchical().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesExpansionHierarchical()==null) {} else {
			terminologycapabilities.getExpansion().setHierarchical(Boolean.parseBoolean(t.getTrminologyCpnltiesExpansionHierarchical().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Expansion_Incomplete ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionIncomplete() != null ) {

			if(t.getTrminologyCpnltiesExpansionIncomplete().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesExpansionIncomplete()==null) {} else {
			terminologycapabilities.getExpansion().setIncomplete(Boolean.parseBoolean(t.getTrminologyCpnltiesExpansionIncomplete().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Expansion_Paging ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionPaging() != null ) {

			if(t.getTrminologyCpnltiesExpansionPaging().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesExpansionPaging()==null) {} else {
			terminologycapabilities.getExpansion().setPaging(Boolean.parseBoolean(t.getTrminologyCpnltiesExpansionPaging().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Expansion_Prmtr_Docation ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionPrmtrDocation() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesExpansionPrmtrDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getExpansion().getParameter().size() < i0+1) { terminologycapabilities.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getExpansion().getParameter().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_Expansion_Prmtr_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionPrmtrNm() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesExpansionPrmtrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getExpansion().getParameter().size() < i0+1) { terminologycapabilities.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getExpansion().getParameter().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_Expansion_TxtFltr ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionTxtFltr() != null ) {

			if(t.getTrminologyCpnltiesExpansionTxtFltr().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesExpansionTxtFltr()==null) {} else {
			terminologycapabilities.getExpansion().setTextFilter(t.getTrminologyCpnltiesExpansionTxtFltr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Exprmtl ********************************************************************************/
		if(t.getTrminologyCpnltiesExprmtl() != null ) {

			if(t.getTrminologyCpnltiesExprmtl().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesExprmtl()==null) {} else {
			terminologycapabilities.setExperimental(Boolean.parseBoolean(t.getTrminologyCpnltiesExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Implementation_Dscrptn ********************************************************************************/
		if(t.getTrminologyCpnltiesImplementationDscrptn() != null ) {

			if(t.getTrminologyCpnltiesImplementationDscrptn().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesImplementationDscrptn()==null) {} else {
			terminologycapabilities.getImplementation().setDescription(t.getTrminologyCpnltiesImplementationDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Implementation_Url ********************************************************************************/
		if(t.getTrminologyCpnltiesImplementationUrl() != null ) {

			if(t.getTrminologyCpnltiesImplementationUrl().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesImplementationUrl()==null) {} else {
			terminologycapabilities.getImplementation().setUrl(t.getTrminologyCpnltiesImplementationUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getJurisdiction().size() < i0+1) { terminologycapabilities.addJurisdiction(); }
				String[] arrayi1 = t.getTrminologyCpnltiesJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getJurisdiction().get(i0).getCoding().size() < i1+1) { terminologycapabilities.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getJurisdiction().size() < i0+1) { terminologycapabilities.addJurisdiction(); }
				String[] arrayi1 = t.getTrminologyCpnltiesJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getJurisdiction().get(i0).getCoding().size() < i1+1) { terminologycapabilities.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgSys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getJurisdiction().size() < i0+1) { terminologycapabilities.addJurisdiction(); }
				String[] arrayi1 = t.getTrminologyCpnltiesJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getJurisdiction().get(i0).getCoding().size() < i1+1) { terminologycapabilities.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getJurisdiction().size() < i0+1) { terminologycapabilities.addJurisdiction(); }
				String[] arrayi1 = t.getTrminologyCpnltiesJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getJurisdiction().get(i0).getCoding().size() < i1+1) { terminologycapabilities.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getJurisdiction().size() < i0+1) { terminologycapabilities.addJurisdiction(); }
				String[] arrayi1 = t.getTrminologyCpnltiesJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getJurisdiction().get(i0).getCoding().size() < i1+1) { terminologycapabilities.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_Jrsdctn_Txt ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnTxt() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getJurisdiction().size() < i0+1) { terminologycapabilities.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_Kind ********************************************************************************/
		if(t.getTrminologyCpnltiesKind() != null ) {

			if(t.getTrminologyCpnltiesKind().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesKind()==null) {} else {
			terminologycapabilities.setKind(new org.hl7.fhir.r4.model.TerminologyCapabilities.CapabilityStatementKindEnumFactory().fromCode(t.getTrminologyCpnltiesKind().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_LockedDt ********************************************************************************/
		if(t.getTrminologyCpnltiesLockedDt() != null ) {

			if(t.getTrminologyCpnltiesLockedDt().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesLockedDt()==null) {} else {
			terminologycapabilities.setLockedDate(Boolean.parseBoolean(t.getTrminologyCpnltiesLockedDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesNm() != null ) {

			if(t.getTrminologyCpnltiesNm().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesNm()==null) {} else {
			terminologycapabilities.setName(t.getTrminologyCpnltiesNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Pblshr ********************************************************************************/
		if(t.getTrminologyCpnltiesPblshr() != null ) {

			if(t.getTrminologyCpnltiesPblshr().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesPblshr()==null) {} else {
			terminologycapabilities.setPublisher(t.getTrminologyCpnltiesPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Prpse ********************************************************************************/
		if(t.getTrminologyCpnltiesPrpse() != null ) {

			if(t.getTrminologyCpnltiesPrpse().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesPrpse()==null) {} else {
			terminologycapabilities.setPurpose(t.getTrminologyCpnltiesPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Software_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesSoftwareNm() != null ) {

			if(t.getTrminologyCpnltiesSoftwareNm().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesSoftwareNm()==null) {} else {
			terminologycapabilities.getSoftware().setName(t.getTrminologyCpnltiesSoftwareNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Software_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesSoftwareVrsn() != null ) {

			if(t.getTrminologyCpnltiesSoftwareVrsn().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesSoftwareVrsn()==null) {} else {
			terminologycapabilities.getSoftware().setVersion(t.getTrminologyCpnltiesSoftwareVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Sts ********************************************************************************/
		if(t.getTrminologyCpnltiesSts() != null ) {

			if(t.getTrminologyCpnltiesSts().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesSts()==null) {} else {
			terminologycapabilities.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(t.getTrminologyCpnltiesSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Ttl ********************************************************************************/
		if(t.getTrminologyCpnltiesTtl() != null ) {

			if(t.getTrminologyCpnltiesTtl().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesTtl()==null) {} else {
			terminologycapabilities.setTitle(t.getTrminologyCpnltiesTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_Translation_NeedsMap ********************************************************************************/
		if(t.getTrminologyCpnltiesTranslationNeedsMap() != null ) {

			if(t.getTrminologyCpnltiesTranslationNeedsMap().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesTranslationNeedsMap()==null) {} else {
			terminologycapabilities.getTranslation().setNeedsMap(Boolean.parseBoolean(t.getTrminologyCpnltiesTranslationNeedsMap().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Url ********************************************************************************/
		if(t.getTrminologyCpnltiesUrl() != null ) {

			if(t.getTrminologyCpnltiesUrl().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesUrl()==null) {} else {
			terminologycapabilities.setUrl(t.getTrminologyCpnltiesUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Dsply ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdDsply() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdSys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				String[] arrayi1 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				String[] arrayi1 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				String[] arrayi1 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				String[] arrayi1 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				String[] arrayi1 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** TrminologyCpnlties_UseCntxt_VlRfrnc ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = t.getTrminologyCpnltiesUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(terminologycapabilities.getUseContext().size() < i0+1) { terminologycapabilities.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {terminologycapabilities.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TrminologyCpnlties_ValidateCd_Translations ********************************************************************************/
		if(t.getTrminologyCpnltiesValidateCdTranslations() != null ) {

			if(t.getTrminologyCpnltiesValidateCdTranslations().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesValidateCdTranslations()==null) {} else {
			terminologycapabilities.getValidateCode().setTranslations(Boolean.parseBoolean(t.getTrminologyCpnltiesValidateCdTranslations().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TrminologyCpnlties_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesVrsn() != null ) {

			if(t.getTrminologyCpnltiesVrsn().replace("[","").replace("]","").equals("NULL") | t.getTrminologyCpnltiesVrsn()==null) {} else {
			terminologycapabilities.setVersion(t.getTrminologyCpnltiesVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return terminologycapabilities;
	}
}
