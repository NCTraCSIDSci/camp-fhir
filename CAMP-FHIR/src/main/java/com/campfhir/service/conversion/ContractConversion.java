package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Contract;
public class ContractConversion 
{
	public org.hl7.fhir.r4.model.Contract Contracts(Contract c) throws ParseException
	{
		
		org.hl7.fhir.r4.model.Contract contract = new org.hl7.fhir.r4.model.Contract();

		/******************** id ********************************************************************************/
		contract.setId(c.getId());

		/******************** Cnct_Alias ********************************************************************************/
		if(c.getCnctAlias() != null ) {

				for( String currListStrSplit : c.getCnctAlias().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addAlias(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Cnct_Applies_End ********************************************************************************/
		if(c.getCnctAppliesEnd() != null ) {

			if(c.getCnctAppliesEnd().replace("[","").replace("]","").equals("NULL") | c.getCnctAppliesEnd()==null) {} else {
			contract.getApplies().setEnd(c.getCnctAppliesEnd().replace("[","").replace("]","").equals("NULL") | c.getCnctAppliesEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnctAppliesEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_Applies_Strt ********************************************************************************/
		if(c.getCnctAppliesStrt() != null ) {

			if(c.getCnctAppliesStrt().replace("[","").replace("]","").equals("NULL") | c.getCnctAppliesStrt()==null) {} else {
			contract.getApplies().setStart(c.getCnctAppliesStrt().replace("[","").replace("]","").equals("NULL") | c.getCnctAppliesStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnctAppliesStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_Athr ********************************************************************************/
		if(c.getCnctAthr() != null ) {

			if(c.getCnctAthr().replace("[","").replace("]","").equals("NULL") | c.getCnctAthr()==null) {} else {
			contract.setAuthor(new org.hl7.fhir.r4.model.Reference(c.getCnctAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_Athrity ********************************************************************************/
		if(c.getCnctAthrity() != null ) {

				for( String currListStrSplit : c.getCnctAthrity().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addAuthority(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnct_CntntDfn_Copyright ********************************************************************************/
		if(c.getCnctCntntDfnCopyright() != null ) {

			if(c.getCnctCntntDfnCopyright().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnCopyright()==null) {} else {
			contract.getContentDefinition().setCopyright(c.getCnctCntntDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_CntntDfn_PublicationDt ********************************************************************************/
		if(c.getCnctCntntDfnPublicationDt() != null ) {

			if(c.getCnctCntntDfnPublicationDt().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnPublicationDt()==null) {} else {
			contract.getContentDefinition().setPublicationDate(c.getCnctCntntDfnPublicationDt().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnPublicationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnctCntntDfnPublicationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_CntntDfn_PublicationSts ********************************************************************************/
		if(c.getCnctCntntDfnPublicationSts() != null ) {

			if(c.getCnctCntntDfnPublicationSts().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnPublicationSts()==null) {} else {
			contract.getContentDefinition().setPublicationStatus(new org.hl7.fhir.r4.model.Contract.ContractPublicationStatusEnumFactory().fromCode(c.getCnctCntntDfnPublicationSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_CntntDfn_Pblshr ********************************************************************************/
		if(c.getCnctCntntDfnPblshr() != null ) {

			if(c.getCnctCntntDfnPblshr().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnPblshr()==null) {} else {
			contract.getContentDefinition().setPublisher(new org.hl7.fhir.r4.model.Reference(c.getCnctCntntDfnPblshr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getSubType().getCoding().size() < i0+1) { contract.getContentDefinition().getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getSubType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getSubType().getCoding().size() < i0+1) { contract.getContentDefinition().getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getSubType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getSubType().getCoding().size() < i0+1) { contract.getContentDefinition().getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getSubType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getSubType().getCoding().size() < i0+1) { contract.getContentDefinition().getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getSubType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getSubType().getCoding().size() < i0+1) { contract.getContentDefinition().getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getSubType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_SubTyp_Txt ********************************************************************************/
		if(c.getCnctCntntDfnSubTypTxt() != null ) {

			if(c.getCnctCntntDfnSubTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnSubTypTxt()==null) {} else {
			contract.getContentDefinition().getSubType().setText(c.getCnctCntntDfnSubTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getType().getCoding().size() < i0+1) { contract.getContentDefinition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getType().getCoding().size() < i0+1) { contract.getContentDefinition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getType().getCoding().size() < i0+1) { contract.getContentDefinition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getType().getCoding().size() < i0+1) { contract.getContentDefinition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctCntntDfnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDefinition().getType().getCoding().size() < i0+1) { contract.getContentDefinition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDefinition().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDfn_Typ_Txt ********************************************************************************/
		if(c.getCnctCntntDfnTypTxt() != null ) {

			if(c.getCnctCntntDfnTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDfnTypTxt()==null) {} else {
			contract.getContentDefinition().getType().setText(c.getCnctCntntDfnTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_CntntDerivative_Cdg_Cd ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgCd() != null ) {

			String[] arrayi0 = c.getCnctCntntDerivativeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDerivative().getCoding().size() < i0+1) { contract.getContentDerivative().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDerivative().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDerivative_Cdg_Dsply ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctCntntDerivativeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDerivative().getCoding().size() < i0+1) { contract.getContentDerivative().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDerivative().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDerivative_Cdg_Sys ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgSys() != null ) {

			String[] arrayi0 = c.getCnctCntntDerivativeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDerivative().getCoding().size() < i0+1) { contract.getContentDerivative().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDerivative().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDerivative_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctCntntDerivativeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDerivative().getCoding().size() < i0+1) { contract.getContentDerivative().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDerivative().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_CntntDerivative_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctCntntDerivativeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getContentDerivative().getCoding().size() < i0+1) { contract.getContentDerivative().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getContentDerivative().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_CntntDerivative_Txt ********************************************************************************/
		if(c.getCnctCntntDerivativeTxt() != null ) {

			if(c.getCnctCntntDerivativeTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctCntntDerivativeTxt()==null) {} else {
			contract.getContentDerivative().setText(c.getCnctCntntDerivativeTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_Domain ********************************************************************************/
		if(c.getCnctDomain() != null ) {

				for( String currListStrSplit : c.getCnctDomain().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addDomain(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnct_ExpirationTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctExpirationTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctExpirationTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getExpirationType().getCoding().size() < i0+1) { contract.getExpirationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getExpirationType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_ExpirationTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctExpirationTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctExpirationTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getExpirationType().getCoding().size() < i0+1) { contract.getExpirationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getExpirationType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_ExpirationTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctExpirationTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctExpirationTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getExpirationType().getCoding().size() < i0+1) { contract.getExpirationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getExpirationType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_ExpirationTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctExpirationTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctExpirationTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getExpirationType().getCoding().size() < i0+1) { contract.getExpirationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getExpirationType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_ExpirationTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctExpirationTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctExpirationTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getExpirationType().getCoding().size() < i0+1) { contract.getExpirationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getExpirationType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_ExpirationTyp_Txt ********************************************************************************/
		if(c.getCnctExpirationTypTxt() != null ) {

			if(c.getCnctExpirationTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctExpirationTypTxt()==null) {} else {
			contract.getExpirationType().setText(c.getCnctExpirationTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_Friendly_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntData() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntHash() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntSz() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Friendly_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).getContentAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Friendly_CntntRfrnc ********************************************************************************/
		if(c.getCnctFriendlyCntntRfrnc() != null ) {

			String[] arrayi0 = c.getCnctFriendlyCntntRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getFriendly().size() < i0+1) { contract.addFriendly(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getFriendly().get(i0).setContent(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Id_Assigner ********************************************************************************/
		if(c.getCnctIdAssigner() != null ) {

			String[] arrayi0 = c.getCnctIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Id_Prd_End ********************************************************************************/
		if(c.getCnctIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCnctIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCnctIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Id_Sys ********************************************************************************/
		if(c.getCnctIdSys() != null ) {

			String[] arrayi0 = c.getCnctIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				String[] arrayi1 = c.getCnctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { contract.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				String[] arrayi1 = c.getCnctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { contract.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				String[] arrayi1 = c.getCnctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { contract.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				String[] arrayi1 = c.getCnctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { contract.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				String[] arrayi1 = c.getCnctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { contract.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctIdTypTxt() != null ) {

			String[] arrayi0 = c.getCnctIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Id_Use ********************************************************************************/
		if(c.getCnctIdUse() != null ) {

			String[] arrayi0 = c.getCnctIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Id_Vl ********************************************************************************/
		if(c.getCnctIdVl() != null ) {

			String[] arrayi0 = c.getCnctIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getIdentifier().size() < i0+1) { contract.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_InstantiatesCanonical ********************************************************************************/
		if(c.getCnctInstantiatesCanonical() != null ) {

			if(c.getCnctInstantiatesCanonical().replace("[","").replace("]","").equals("NULL") | c.getCnctInstantiatesCanonical()==null) {} else {
			contract.setInstantiatesCanonical(new org.hl7.fhir.r4.model.Reference(c.getCnctInstantiatesCanonical().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_InstantiatesUri ********************************************************************************/
		if(c.getCnctInstantiatesUri() != null ) {

			if(c.getCnctInstantiatesUri().replace("[","").replace("]","").equals("NULL") | c.getCnctInstantiatesUri()==null) {} else {
			contract.setInstantiatesUri(c.getCnctInstantiatesUri().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_Issued ********************************************************************************/
		if(c.getCnctIssued() != null ) {

			if(c.getCnctIssued().replace("[","").replace("]","").equals("NULL") | c.getCnctIssued()==null) {} else {
			contract.setIssued(c.getCnctIssued().replace("[","").replace("]","").equals("NULL") | c.getCnctIssued()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnctIssued().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_Legal_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntData() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntHash() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntSz() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Legal_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).getContentAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Legal_CntntRfrnc ********************************************************************************/
		if(c.getCnctLegalCntntRfrnc() != null ) {

			String[] arrayi0 = c.getCnctLegalCntntRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegal().size() < i0+1) { contract.addLegal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegal().get(i0).setContent(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_LegalState_Cdg_Cd ********************************************************************************/
		if(c.getCnctLegalStateCdgCd() != null ) {

			String[] arrayi0 = c.getCnctLegalStateCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegalState().getCoding().size() < i0+1) { contract.getLegalState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegalState().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_LegalState_Cdg_Dsply ********************************************************************************/
		if(c.getCnctLegalStateCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctLegalStateCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegalState().getCoding().size() < i0+1) { contract.getLegalState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegalState().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_LegalState_Cdg_Sys ********************************************************************************/
		if(c.getCnctLegalStateCdgSys() != null ) {

			String[] arrayi0 = c.getCnctLegalStateCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegalState().getCoding().size() < i0+1) { contract.getLegalState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegalState().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_LegalState_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctLegalStateCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctLegalStateCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegalState().getCoding().size() < i0+1) { contract.getLegalState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegalState().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_LegalState_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctLegalStateCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctLegalStateCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getLegalState().getCoding().size() < i0+1) { contract.getLegalState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getLegalState().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_LegalState_Txt ********************************************************************************/
		if(c.getCnctLegalStateTxt() != null ) {

			if(c.getCnctLegalStateTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctLegalStateTxt()==null) {} else {
			contract.getLegalState().setText(c.getCnctLegalStateTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntCntntTyp() != null ) {

			if(c.getCnctLegallyBindingAttchmntCntntTyp().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntCntntTyp()==null) {} else {
			contract.getLegallyBindingAttachment().setContentType(c.getCnctLegallyBindingAttchmntCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Creation ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntCreation() != null ) {

			if(c.getCnctLegallyBindingAttchmntCreation().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntCreation()==null) {} else {
			contract.getLegallyBindingAttachment().setCreation(c.getCnctLegallyBindingAttchmntCreation().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnctLegallyBindingAttchmntCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Data ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntData() != null ) {

			if(c.getCnctLegallyBindingAttchmntData().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntData()==null) {} else {
			contract.getLegallyBindingAttachment().setData(c.getCnctLegallyBindingAttchmntData().getBytes());
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Hash ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntHash() != null ) {

			if(c.getCnctLegallyBindingAttchmntHash().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntHash()==null) {} else {
			contract.getLegallyBindingAttachment().setHash(c.getCnctLegallyBindingAttchmntHash().getBytes());
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntLnguage() != null ) {

			if(c.getCnctLegallyBindingAttchmntLnguage().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntLnguage()==null) {} else {
			contract.getLegallyBindingAttachment().setLanguage(c.getCnctLegallyBindingAttchmntLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Sz ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntSz() != null ) {

			if(c.getCnctLegallyBindingAttchmntSz().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntSz()==null) {} else {
			contract.getLegallyBindingAttachment().setSize(Integer.parseInt(c.getCnctLegallyBindingAttchmntSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntTtl() != null ) {

			if(c.getCnctLegallyBindingAttchmntTtl().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntTtl()==null) {} else {
			contract.getLegallyBindingAttachment().setTitle(c.getCnctLegallyBindingAttchmntTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_LegallyBindingAttchmnt_Url ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntUrl() != null ) {

			if(c.getCnctLegallyBindingAttchmntUrl().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingAttchmntUrl()==null) {} else {
			contract.getLegallyBindingAttachment().setUrl(c.getCnctLegallyBindingAttchmntUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_LegallyBindingRfrnc ********************************************************************************/
		if(c.getCnctLegallyBindingRfrnc() != null ) {

			if(c.getCnctLegallyBindingRfrnc().replace("[","").replace("]","").equals("NULL") | c.getCnctLegallyBindingRfrnc()==null) {} else {
			contract.setLegallyBinding(new org.hl7.fhir.r4.model.Reference(c.getCnctLegallyBindingRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_Nm ********************************************************************************/
		if(c.getCnctNm() != null ) {

			if(c.getCnctNm().replace("[","").replace("]","").equals("NULL") | c.getCnctNm()==null) {} else {
			contract.setName(c.getCnctNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_RelevantHis ********************************************************************************/
		if(c.getCnctRelevantHis() != null ) {

				for( String currListStrSplit : c.getCnctRelevantHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addRelevantHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnct_Rule_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntData() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntHash() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntSz() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Rule_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).getContentAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Rule_CntntRfrnc ********************************************************************************/
		if(c.getCnctRuleCntntRfrnc() != null ) {

			String[] arrayi0 = c.getCnctRuleCntntRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getRule().size() < i0+1) { contract.addRule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getRule().get(i0).setContent(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Scope_Cdg_Cd ********************************************************************************/
		if(c.getCnctScopeCdgCd() != null ) {

			String[] arrayi0 = c.getCnctScopeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getScope().getCoding().size() < i0+1) { contract.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getScope().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Scope_Cdg_Dsply ********************************************************************************/
		if(c.getCnctScopeCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctScopeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getScope().getCoding().size() < i0+1) { contract.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getScope().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Scope_Cdg_Sys ********************************************************************************/
		if(c.getCnctScopeCdgSys() != null ) {

			String[] arrayi0 = c.getCnctScopeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getScope().getCoding().size() < i0+1) { contract.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getScope().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Scope_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctScopeCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctScopeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getScope().getCoding().size() < i0+1) { contract.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getScope().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Scope_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctScopeCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctScopeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getScope().getCoding().size() < i0+1) { contract.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getScope().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Scope_Txt ********************************************************************************/
		if(c.getCnctScopeTxt() != null ) {

			if(c.getCnctScopeTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctScopeTxt()==null) {} else {
			contract.getScope().setText(c.getCnctScopeTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_Signer_Party ********************************************************************************/
		if(c.getCnctSignerParty() != null ) {

			String[] arrayi0 = c.getCnctSignerParty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSigner().get(i0).setParty(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Signer_Signature_Data ********************************************************************************/
		if(c.getCnctSignerSignatureData() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** Cnct_Signer_Signature_OnBehalfOf ********************************************************************************/
		if(c.getCnctSignerSignatureOnBehalfOf() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Signer_Signature_SigFrmat ********************************************************************************/
		if(c.getCnctSignerSignatureSigFrmat() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureSigFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureSigFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).setSigFormat(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Signer_Signature_TarFrmat ********************************************************************************/
		if(c.getCnctSignerSignatureTarFrmat() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureTarFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureTarFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).setTargetFormat(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Signer_Signature_Typ_Cd ********************************************************************************/
		if(c.getCnctSignerSignatureTypCd() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					String[] arrayi2 = c.getCnctSignerSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getSigner().get(i0).getSignature().get(i1).getType().size() < i2+1) { contract.getSigner().get(i0).getSignature().get(i1).addType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).getType().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Signer_Signature_Typ_Dsply ********************************************************************************/
		if(c.getCnctSignerSignatureTypDsply() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					String[] arrayi2 = c.getCnctSignerSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getSigner().get(i0).getSignature().get(i1).getType().size() < i2+1) { contract.getSigner().get(i0).getSignature().get(i1).addType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).getType().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Signer_Signature_Typ_Sys ********************************************************************************/
		if(c.getCnctSignerSignatureTypSys() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					String[] arrayi2 = c.getCnctSignerSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getSigner().get(i0).getSignature().get(i1).getType().size() < i2+1) { contract.getSigner().get(i0).getSignature().get(i1).addType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).getType().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Signer_Signature_Typ_UsrSltd ********************************************************************************/
		if(c.getCnctSignerSignatureTypUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					String[] arrayi2 = c.getCnctSignerSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getSigner().get(i0).getSignature().get(i1).getType().size() < i2+1) { contract.getSigner().get(i0).getSignature().get(i1).addType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).getType().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Signer_Signature_Typ_Vrsn ********************************************************************************/
		if(c.getCnctSignerSignatureTypVrsn() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					String[] arrayi2 = c.getCnctSignerSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getSigner().get(i0).getSignature().get(i1).getType().size() < i2+1) { contract.getSigner().get(i0).getSignature().get(i1).addType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).getType().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Signer_Signature_When ********************************************************************************/
		if(c.getCnctSignerSignatureWhen() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureWhen().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureWhen().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).setWhen(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Signer_Signature_Who ********************************************************************************/
		if(c.getCnctSignerSignatureWho() != null ) {

			String[] arrayi0 = c.getCnctSignerSignatureWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				String[] arrayi1 = c.getCnctSignerSignatureWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSigner().get(i0).getSignature().size() < i1+1) { contract.getSigner().get(i0).addSignature(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSigner().get(i0).getSignature().get(i1).setWho(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Signer_Typ_Cd ********************************************************************************/
		if(c.getCnctSignerTypCd() != null ) {

			String[] arrayi0 = c.getCnctSignerTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSigner().get(i0).getType().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Signer_Typ_Dsply ********************************************************************************/
		if(c.getCnctSignerTypDsply() != null ) {

			String[] arrayi0 = c.getCnctSignerTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSigner().get(i0).getType().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Signer_Typ_Sys ********************************************************************************/
		if(c.getCnctSignerTypSys() != null ) {

			String[] arrayi0 = c.getCnctSignerTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSigner().get(i0).getType().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Signer_Typ_UsrSltd ********************************************************************************/
		if(c.getCnctSignerTypUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctSignerTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSigner().get(i0).getType().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Signer_Typ_Vrsn ********************************************************************************/
		if(c.getCnctSignerTypVrsn() != null ) {

			String[] arrayi0 = c.getCnctSignerTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSigner().size() < i0+1) { contract.addSigner(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSigner().get(i0).getType().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Site ********************************************************************************/
		if(c.getCnctSite() != null ) {

				for( String currListStrSplit : c.getCnctSite().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addSite(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnct_Sts ********************************************************************************/
		if(c.getCnctSts() != null ) {

			if(c.getCnctSts().replace("[","").replace("]","").equals("NULL") | c.getCnctSts()==null) {} else {
			contract.setStatus(new org.hl7.fhir.r4.model.Contract.ContractStatusEnumFactory().fromCode(c.getCnctSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctSubTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSubType().size() < i0+1) { contract.addSubType(); }
				String[] arrayi1 = c.getCnctSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSubType().get(i0).getCoding().size() < i1+1) { contract.getSubType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSubType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctSubTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSubType().size() < i0+1) { contract.addSubType(); }
				String[] arrayi1 = c.getCnctSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSubType().get(i0).getCoding().size() < i1+1) { contract.getSubType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSubType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctSubTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSubType().size() < i0+1) { contract.addSubType(); }
				String[] arrayi1 = c.getCnctSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSubType().get(i0).getCoding().size() < i1+1) { contract.getSubType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSubType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctSubTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSubType().size() < i0+1) { contract.addSubType(); }
				String[] arrayi1 = c.getCnctSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSubType().get(i0).getCoding().size() < i1+1) { contract.getSubType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSubType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctSubTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSubType().size() < i0+1) { contract.addSubType(); }
				String[] arrayi1 = c.getCnctSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getSubType().get(i0).getCoding().size() < i1+1) { contract.getSubType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getSubType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_SubTyp_Txt ********************************************************************************/
		if(c.getCnctSubTypTxt() != null ) {

			String[] arrayi0 = c.getCnctSubTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getSubType().size() < i0+1) { contract.addSubType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getSubType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Sbjct ********************************************************************************/
		if(c.getCnctSbjct() != null ) {

				for( String currListStrSplit : c.getCnctSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnct_Subtitle ********************************************************************************/
		if(c.getCnctSubtitle() != null ) {

			if(c.getCnctSubtitle().replace("[","").replace("]","").equals("NULL") | c.getCnctSubtitle()==null) {} else {
			contract.setSubtitle(c.getCnctSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_SprtingInfo ********************************************************************************/
		if(c.getCnctSprtingInfo() != null ) {

				for( String currListStrSplit : c.getCnctSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			contract.addSupportingInfo(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnct_Trm_Actn_Cntxt ********************************************************************************/
		if(c.getCnctTrmActnCntxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnCntxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnCntxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).setContext(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_CntxtLinkId ********************************************************************************/
		if(c.getCnctTrmActnCntxtLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmActnCntxtLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnCntxtLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addContextLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_DoNotPerform ********************************************************************************/
		if(c.getCnctTrmActnDoNotPerform() != null ) {

			String[] arrayi0 = c.getCnctTrmActnDoNotPerform().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnDoNotPerform().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).setDoNotPerform(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnIntentCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnIntentCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnIntentCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getIntent().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnIntentCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnIntentCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnIntentCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getIntent().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnIntentCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnIntentCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnIntentCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getIntent().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnIntentCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnIntentCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnIntentCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getIntent().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnIntentCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnIntentCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnIntentCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getIntent().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getIntent().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Intent_Txt ********************************************************************************/
		if(c.getCnctTrmActnIntentTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnIntentTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnIntentTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getIntent().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_LinkId ********************************************************************************/
		if(c.getCnctTrmActnLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmActnLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCnctTrmActnNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmActnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getNote().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getNote().get(i2).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCnctTrmActnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmActnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getNote().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getNote().get(i2).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Nt_Txt ********************************************************************************/
		if(c.getCnctTrmActnNtTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getNote().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getNote().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Nt_Time ********************************************************************************/
		if(c.getCnctTrmActnNtTime() != null ) {

			String[] arrayi0 = c.getCnctTrmActnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getNote().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getNote().get(i2).setTime(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceDtTimeTyp ********************************************************************************/
		if(c.getCnctTrmActnOccrnceDtTimeTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrncePrd_End ********************************************************************************/
		if(c.getCnctTrmActnOccrncePrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrncePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrncePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrencePeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrncePrd_Strt ********************************************************************************/
		if(c.getCnctTrmActnOccrncePrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrncePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrncePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrencePeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Evnt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgEvnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptCnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setCount(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptCntMx() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setCountMax(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptDuration() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setDuration((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptDurationMx() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationUnt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptDurationUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptFrqncy() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setFrequency(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptOff() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setOffset(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptPrd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptPrdMx() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdUnt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptPrdUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = c.getCnctTrmActnOccrnceTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnOccrnceTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getOccurrenceTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Prfrmr ********************************************************************************/
		if(c.getCnctTrmActnPrfrmr() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).setPerformer(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrLinkId ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addPerformerLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Txt ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerRole().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addPerformerType(); }
						String[] arrayi3 = c.getCnctTrmActnPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addPerformerType(); }
						String[] arrayi3 = c.getCnctTrmActnPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addPerformerType(); }
						String[] arrayi3 = c.getCnctTrmActnPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addPerformerType(); }
						String[] arrayi3 = c.getCnctTrmActnPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addPerformerType(); }
						String[] arrayi3 = c.getCnctTrmActnPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Txt ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnPrfrmrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnPrfrmrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnPrfrmrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getPerformerType().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addPerformerType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getPerformerType().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Rsn ********************************************************************************/
		if(c.getCnctTrmActnRsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addReason(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addReasonCode(); }
						String[] arrayi3 = c.getCnctTrmActnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addReasonCode(); }
						String[] arrayi3 = c.getCnctTrmActnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addReasonCode(); }
						String[] arrayi3 = c.getCnctTrmActnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addReasonCode(); }
						String[] arrayi3 = c.getCnctTrmActnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addReasonCode(); }
						String[] arrayi3 = c.getCnctTrmActnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnCd_Txt ********************************************************************************/
		if(c.getCnctTrmActnRsnCdTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getReasonCode().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addReasonCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getReasonCode().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnLinkId ********************************************************************************/
		if(c.getCnctTrmActnRsnLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addReasonLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RsnRfrnc ********************************************************************************/
		if(c.getCnctTrmActnRsnRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		return Contracts_Extended( c, contract);
	}
		public org.hl7.fhir.r4.model.Contract Contracts_Extended(Contract c, org.hl7.fhir.r4.model.Contract contract) throws ParseException
		{
		/******************** Cnct_Trm_Actn_RqsterLinkId ********************************************************************************/
		if(c.getCnctTrmActnRqsterLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRqsterLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRqsterLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addRequester(new org.hl7.fhir.r4.model.Reference(  currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_RqsterLinkId ********************************************************************************/
		if(c.getCnctTrmActnRqsterLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmActnRqsterLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnRqsterLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addRequesterLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmActnSecurityLblNmbr() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).addSecurityLabelNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnStsCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getStatus().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnStsCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getStatus().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnStsCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getStatus().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnStsCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getStatus().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnStsCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getStatus().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getStatus().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sts_Txt ********************************************************************************/
		if(c.getCnctTrmActnStsTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getStatus().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Rfrnc ********************************************************************************/
		if(c.getCnctTrmActnSbjctRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).addReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						String[] arrayi3 = c.getCnctTrmActnSbjctRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						String[] arrayi3 = c.getCnctTrmActnSbjctRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						String[] arrayi3 = c.getCnctTrmActnSbjctRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						String[] arrayi3 = c.getCnctTrmActnSbjctRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						String[] arrayi3 = c.getCnctTrmActnSbjctRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Txt ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnSbjctRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnSbjctRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnSbjctRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getSubject().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).addSubject(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getSubject().get(i2).getRole().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					String[] arrayi2 = c.getCnctTrmActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAction().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Actn_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmActnTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmActnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmActnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAction().size() < i1+1) { contract.getTerm().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAction().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Applies_End ********************************************************************************/
		if(c.getCnctTrmAppliesEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmAppliesEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getApplies().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Applies_Strt ********************************************************************************/
		if(c.getCnctTrmAppliesStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmAppliesStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getApplies().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setContentType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setCreation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Data ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntData() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setData(arrayi2[i2].replace("[","").replace("]","").replace("\"","").getBytes()); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntHash() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setHash(arrayi2[i2].replace("[","").replace("]","").replace("\"","").getBytes()); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setLanguage(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntSz() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setSize(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setTitle(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlAttchmnt_Url ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueAttachment().setUrl(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlBooleanTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlBooleanTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlCdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueCoding().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlCdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueCoding().setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlCdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueCoding().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueCoding().setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlCdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueCoding().setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlDtTimeTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlDtTimeTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlDtTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlDtTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.DateType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlDecimalTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlDecimalTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.DecimalType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlIntegerTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlIntegerTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlQnty_Cd ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
	
		/******************** Cnct_Trm_Asset_Ans_VlQnty_Sys ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntySys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlQnty_Unt ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlQnty_Vl ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyVl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).getValueQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlRfrnc ********************************************************************************/
		if(c.getCnctTrmAsAnsVlRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlStrgTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlStrgTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlTimeTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlTimeTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.TimeType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Ans_VlUriTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlUriTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmAsAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getAnswer().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addAnswer(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getAnswer().get(i2).setValue(new org.hl7.fhir.r4.model.UriType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cndtn ********************************************************************************/
		if(c.getCnctTrmAsCndtn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCndtn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCndtn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).setCondition(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						String[] arrayi3 = c.getCnctTrmAsCntxtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).addCode(); }
							String[] arrayi4 = c.getCnctTrmAsCntxtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().size() < i4+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						String[] arrayi3 = c.getCnctTrmAsCntxtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).addCode(); }
							String[] arrayi4 = c.getCnctTrmAsCntxtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().size() < i4+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						String[] arrayi3 = c.getCnctTrmAsCntxtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).addCode(); }
							String[] arrayi4 = c.getCnctTrmAsCntxtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().size() < i4+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						String[] arrayi3 = c.getCnctTrmAsCntxtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).addCode(); }
							String[] arrayi4 = c.getCnctTrmAsCntxtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().size() < i4+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						String[] arrayi3 = c.getCnctTrmAsCntxtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).addCode(); }
							String[] arrayi4 = c.getCnctTrmAsCntxtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().size() < i4+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Cd_Txt ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						String[] arrayi3 = c.getCnctTrmAsCntxtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).getCode().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Rfrnc ********************************************************************************/
		if(c.getCnctTrmAsCntxtRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).setReference(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Cntxt_Txt ********************************************************************************/
		if(c.getCnctTrmAsCntxtTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsCntxtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsCntxtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsCntxtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getContext().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addContext(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getContext().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_LinkId ********************************************************************************/
		if(c.getCnctTrmAsLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmAsLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).addLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Prd_End ********************************************************************************/
		if(c.getCnctTrmAsPrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriod().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriod().get(i2).setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmAsPrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriod().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriod().get(i2).setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_PrdTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriodType(); }
						String[] arrayi3 = c.getCnctTrmAsPrdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_PrdTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriodType(); }
						String[] arrayi3 = c.getCnctTrmAsPrdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_PrdTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriodType(); }
						String[] arrayi3 = c.getCnctTrmAsPrdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_PrdTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriodType(); }
						String[] arrayi3 = c.getCnctTrmAsPrdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_PrdTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriodType(); }
						String[] arrayi3 = c.getCnctTrmAsPrdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_PrdTyp_Txt ********************************************************************************/
		if(c.getCnctTrmAsPrdTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsPrdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsPrdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsPrdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addPeriodType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getPeriodType().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Rltnship_Cd ********************************************************************************/
		if(c.getCnctTrmAsRltnshipCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsRltnshipCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsRltnshipCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getRelationship().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Rltnship_Dsply ********************************************************************************/
		if(c.getCnctTrmAsRltnshipDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsRltnshipDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsRltnshipDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getRelationship().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Rltnship_Sys ********************************************************************************/
		if(c.getCnctTrmAsRltnshipSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsRltnshipSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsRltnshipSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getRelationship().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Rltnship_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsRltnshipUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsRltnshipUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsRltnshipUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getRelationship().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Rltnship_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsRltnshipVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsRltnshipVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsRltnshipVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getRelationship().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Scope_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsScopeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsScopeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsScopeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).getScope().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Scope_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsScopeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsScopeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsScopeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).getScope().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Scope_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsScopeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsScopeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsScopeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).getScope().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Scope_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsScopeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsScopeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsScopeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).getScope().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Scope_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsScopeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsScopeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsScopeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).getScope().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getScope().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Scope_Txt ********************************************************************************/
		if(c.getCnctTrmAsScopeTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsScopeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsScopeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getScope().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmAsSecurityLblNmbr() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).addSecurityLabelNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Subtype_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSubtypeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSubtypeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsSubtypeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addSubtype(); }
						String[] arrayi3 = c.getCnctTrmAsSubtypeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Subtype_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSubtypeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSubtypeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsSubtypeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addSubtype(); }
						String[] arrayi3 = c.getCnctTrmAsSubtypeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Subtype_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSubtypeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSubtypeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsSubtypeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addSubtype(); }
						String[] arrayi3 = c.getCnctTrmAsSubtypeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSubtypeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSubtypeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsSubtypeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addSubtype(); }
						String[] arrayi3 = c.getCnctTrmAsSubtypeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Subtype_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSubtypeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSubtypeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsSubtypeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addSubtype(); }
						String[] arrayi3 = c.getCnctTrmAsSubtypeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Subtype_Txt ********************************************************************************/
		if(c.getCnctTrmAsSubtypeTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsSubtypeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsSubtypeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsSubtypeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getSubtype().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addSubtype(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getSubtype().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Txt ********************************************************************************/
		if(c.getCnctTrmAsTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Asset_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addType(); }
						String[] arrayi3 = c.getCnctTrmAsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addType(); }
						String[] arrayi3 = c.getCnctTrmAsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addType(); }
						String[] arrayi3 = c.getCnctTrmAsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addType(); }
						String[] arrayi3 = c.getCnctTrmAsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addType(); }
						String[] arrayi3 = c.getCnctTrmAsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmAsTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getType().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addType(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getType().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_TypRfrnc ********************************************************************************/
		if(c.getCnctTrmAsTypRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmAsTypRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsTypRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).addTypeReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_UsePrd_End ********************************************************************************/
		if(c.getCnctTrmAsUsePrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsUsePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsUsePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsUsePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getUsePeriod().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addUsePeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getUsePeriod().get(i2).setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_UsePrd_Strt ********************************************************************************/
		if(c.getCnctTrmAsUsePrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsUsePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsUsePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsUsePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getUsePeriod().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addUsePeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getUsePeriod().get(i2).setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EfctiveTime ********************************************************************************/
		if(c.getCnctTrmAsVldItmEfctiveTime() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEfctiveTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEfctiveTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEfctiveTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setEffectiveTime(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityCdbleCncpt_Txt ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getEntityCodeableConcept().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_EntityRfrnc ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmEntityRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmEntityRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmEntityRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setEntity(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Factor ********************************************************************************/
		if(c.getCnctTrmAsVldItmFactor() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setFactor((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Assigner ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdAssigner() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Prd_End ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getPeriod().setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getPeriod().setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						String[] arrayi3 = c.getCnctTrmAsVldItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().size() < i3+1) { contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		return Contracts_Extended2( c, contract);
		}
			public org.hl7.fhir.r4.model.Contract Contracts_Extended2(Contract c, org.hl7.fhir.r4.model.Contract contract) throws ParseException
			{
		/******************** Cnct_Trm_Asset_VldItm_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().getType().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Use ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdUse() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Id_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdVl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getIdentifier().setValue(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_LinkId ********************************************************************************/
		if(c.getCnctTrmAsVldItmLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).addLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Net_Crncy ********************************************************************************/
		if(c.getCnctTrmAsVldItmNetCrncy() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getNet().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Net_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmNetVl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getNet().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Pymnt ********************************************************************************/
		if(c.getCnctTrmAsVldItmPymnt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmPymnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmPymnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmPymnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setPayment(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_PymntDt ********************************************************************************/
		if(c.getCnctTrmAsVldItmPymntDt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmPymntDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmPymntDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmPymntDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setPaymentDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Points ********************************************************************************/
		if(c.getCnctTrmAsVldItmPoints() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmPoints().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmPoints().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmPoints().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setPoints((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Qnty_Cd ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyCd() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Qnty_Cmprtr ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Qnty_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntySys() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Qnty_Unt ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Qnty_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyVl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Recipient ********************************************************************************/
		if(c.getCnctTrmAsVldItmRecipient() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmRecipient().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmRecipient().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmRecipient().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setRecipient(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_Responsible ********************************************************************************/
		if(c.getCnctTrmAsVldItmResponsible() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmResponsible().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmResponsible().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmResponsible().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).setResponsible(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmAsVldItmSecurityLblNmbr() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).addSecurityLabelNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Cnct_Trm_Asset_VldItm_UntPrice_Crncy ********************************************************************************/
		if(c.getCnctTrmAsVldItmUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getUnitPrice().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		
		/******************** Cnct_Trm_Asset_VldItm_UntPrice_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmUntPriceVl() != null ) {

			String[] arrayi0 = c.getCnctTrmAsVldItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmAsVldItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getAsset().size() < i1+1) { contract.getTerm().get(i0).addAsset(); }
					String[] arrayi2 = c.getCnctTrmAsVldItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().size() < i2+1) { contract.getTerm().get(i0).getAsset().get(i1).addValuedItem(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getAsset().get(i1).getValuedItem().get(i2).getUnitPrice().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Id_Assigner ********************************************************************************/
		if(c.getCnctTrmIdAssigner() != null ) {

			String[] arrayi0 = c.getCnctTrmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Id_Prd_End ********************************************************************************/
		if(c.getCnctTrmIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Id_Sys ********************************************************************************/
		if(c.getCnctTrmIdSys() != null ) {

			String[] arrayi0 = c.getCnctTrmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmIdTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_Id_Use ********************************************************************************/
		if(c.getCnctTrmIdUse() != null ) {

			String[] arrayi0 = c.getCnctTrmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Id_Vl ********************************************************************************/
		if(c.getCnctTrmIdVl() != null ) {

			String[] arrayi0 = c.getCnctTrmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_Issued ********************************************************************************/
		if(c.getCnctTrmIssued() != null ) {

			String[] arrayi0 = c.getCnctTrmIssued().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).setIssued(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Data ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntData() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntHash() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntSz() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Url ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueAttachment().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlBooleanTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlBooleanTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueCoding().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueCoding().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueCoding().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueCoding().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueCoding().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlDtTimeTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlDtTimeTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlDtTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlDtTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.DateType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlDecimalTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlDecimalTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.DecimalType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlIntegerTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlIntegerTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Cd ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Sys ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntySys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Unt ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Vl ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyVl() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).getValueQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlRfrnc ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlStrgTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlStrgTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlTimeTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlTimeTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.TimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Ans_VlUriTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlUriTyp() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getAnswer().size() < i1+1) { contract.getTerm().get(i0).getOffer().addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.UriType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecision().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getDecision().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getDecision().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecision().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getDecision().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getDecision().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecision().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getDecision().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getDecision().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecision().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getDecision().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getDecision().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecision().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getDecision().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getDecision().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Decision_Txt ********************************************************************************/
		if(c.getCnctTrmOffrDecisionTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getOffer().getDecision().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionModeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionModeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecisionMode().size() < i1+1) { contract.getTerm().get(i0).getOffer().addDecisionMode(); }
					String[] arrayi2 = c.getCnctTrmOffrDecisionModeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionModeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionModeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecisionMode().size() < i1+1) { contract.getTerm().get(i0).getOffer().addDecisionMode(); }
					String[] arrayi2 = c.getCnctTrmOffrDecisionModeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionModeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionModeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecisionMode().size() < i1+1) { contract.getTerm().get(i0).getOffer().addDecisionMode(); }
					String[] arrayi2 = c.getCnctTrmOffrDecisionModeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionModeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionModeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecisionMode().size() < i1+1) { contract.getTerm().get(i0).getOffer().addDecisionMode(); }
					String[] arrayi2 = c.getCnctTrmOffrDecisionModeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionModeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionModeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecisionMode().size() < i1+1) { contract.getTerm().get(i0).getOffer().addDecisionMode(); }
					String[] arrayi2 = c.getCnctTrmOffrDecisionModeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_DecisionMode_Txt ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrDecisionModeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrDecisionModeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getDecisionMode().size() < i1+1) { contract.getTerm().get(i0).getOffer().addDecisionMode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getDecisionMode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Assigner ********************************************************************************/
		if(c.getCnctTrmOffrIdAssigner() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Prd_End ********************************************************************************/
		if(c.getCnctTrmOffrIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmOffrIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Sys ********************************************************************************/
		if(c.getCnctTrmOffrIdSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					String[] arrayi2 = c.getCnctTrmOffrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					String[] arrayi2 = c.getCnctTrmOffrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					String[] arrayi2 = c.getCnctTrmOffrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					String[] arrayi2 = c.getCnctTrmOffrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					String[] arrayi2 = c.getCnctTrmOffrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmOffrIdTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Use ********************************************************************************/
		if(c.getCnctTrmOffrIdUse() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Id_Vl ********************************************************************************/
		if(c.getCnctTrmOffrIdVl() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getIdentifier().size() < i1+1) { contract.getTerm().get(i0).getOffer().addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_LinkId ********************************************************************************/
		if(c.getCnctTrmOffrLinkId() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getOffer().addLinkId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Rfrnc ********************************************************************************/
		if(c.getCnctTrmOffrPartyRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).addReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					String[] arrayi2 = c.getCnctTrmOffrPartyRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					String[] arrayi2 = c.getCnctTrmOffrPartyRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					String[] arrayi2 = c.getCnctTrmOffrPartyRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					String[] arrayi2 = c.getCnctTrmOffrPartyRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					String[] arrayi2 = c.getCnctTrmOffrPartyRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().size() < i2+1) { contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_Offr_Party_Role_Txt ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrPartyRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrPartyRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getParty().size() < i1+1) { contract.getTerm().get(i0).getOffer().addParty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getParty().get(i1).getRole().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmOffrSecurityLblNmbr() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getOffer().addSecurityLabelNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Txt ********************************************************************************/
		if(c.getCnctTrmOffrTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getOffer().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_Offr_Topic ********************************************************************************/
		if(c.getCnctTrmOffrTopic() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTopic().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getOffer().setTopic(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmOffrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getOffer().getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getOffer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getOffer().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Offr_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmOffrTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmOffrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getOffer().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Cd ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryCd() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblCtgryCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblCtgryCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblCtgryCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addCategory(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Dsply ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblCtgryDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblCtgryDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblCtgryDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addCategory(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Sys ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgrySys() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblCtgrySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblCtgrySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblCtgrySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addCategory(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblCtgryUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblCtgryUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblCtgryUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addCategory(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Vrsn ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblCtgryVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblCtgryVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblCtgryVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addCategory(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getCategory().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Cd ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnCd() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblClsfctnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblClsfctnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getClassification().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Dsply ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblClsfctnDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblClsfctnDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getClassification().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Sys ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnSys() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblClsfctnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblClsfctnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getClassification().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblClsfctnUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblClsfctnUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getClassification().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Vrsn ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblClsfctnVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblClsfctnVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getClassification().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Control_Cd ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlCd() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblControlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblControlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblControlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addControl(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Control_Dsply ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblControlDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblControlDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblControlDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addControl(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Control_Sys ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlSys() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblControlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblControlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblControlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addControl(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Control_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblControlUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblControlUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblControlUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addControl(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Control_Vrsn ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblControlVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblControlVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					String[] arrayi2 = c.getCnctTrmSecurityLblControlVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().size() < i2+1) { contract.getTerm().get(i0).getSecurityLabel().get(i1).addControl(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).getControl().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SecurityLbl_Nmbr ********************************************************************************/
		if(c.getCnctTrmSecurityLblNmbr() != null ) {

			String[] arrayi0 = c.getCnctTrmSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSecurityLblNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSecurityLabel().size() < i1+1) { contract.getTerm().get(i0).addSecurityLabel(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {contract.getTerm().get(i0).getSecurityLabel().get(i1).addNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cnct_Trm_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmSubTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSubType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getSubType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSubType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmSubTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSubType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getSubType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSubType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmSubTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSubType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getSubType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSubType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSubTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSubType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getSubType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSubType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmSubTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getSubType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getSubType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getSubType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_SubTyp_Txt ********************************************************************************/
		if(c.getCnctTrmSubTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmSubTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getSubType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_Txt ********************************************************************************/
		if(c.getCnctTrmTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTopicCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().size() < i1+1) { contract.getTerm().get(i0).getTopicCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTopicCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().size() < i1+1) { contract.getTerm().get(i0).getTopicCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTopicCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().size() < i1+1) { contract.getTerm().get(i0).getTopicCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTopicCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().size() < i1+1) { contract.getTerm().get(i0).getTopicCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTopicCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().size() < i1+1) { contract.getTerm().get(i0).getTopicCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getTopicCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Txt ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getTopicCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Trm_TopicRfrnc ********************************************************************************/
		if(c.getCnctTrmTopicRfrnc() != null ) {

			String[] arrayi0 = c.getCnctTrmTopicRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).setTopic(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Trm_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTrmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTrmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTrmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTrmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnct_Trm_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTrmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				String[] arrayi1 = c.getCnctTrmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(contract.getTerm().get(i0).getType().getCoding().size() < i1+1) { contract.getTerm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {contract.getTerm().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnct_Trm_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmTypTxt() != null ) {

			String[] arrayi0 = c.getCnctTrmTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTerm().size() < i0+1) { contract.addTerm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTerm().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Ttl ********************************************************************************/
		if(c.getCnctTtl() != null ) {

			if(c.getCnctTtl().replace("[","").replace("]","").equals("NULL") | c.getCnctTtl()==null) {} else {
			contract.setTitle(c.getCnctTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTopicCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTopicCodeableConcept().getCoding().size() < i0+1) { contract.getTopicCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTopicCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTopicCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTopicCodeableConcept().getCoding().size() < i0+1) { contract.getTopicCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTopicCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTopicCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTopicCodeableConcept().getCoding().size() < i0+1) { contract.getTopicCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTopicCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTopicCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTopicCodeableConcept().getCoding().size() < i0+1) { contract.getTopicCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTopicCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTopicCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getTopicCodeableConcept().getCoding().size() < i0+1) { contract.getTopicCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getTopicCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_TopicCdbleCncpt_Txt ********************************************************************************/
		if(c.getCnctTopicCdbleCncptTxt() != null ) {

			if(c.getCnctTopicCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctTopicCdbleCncptTxt()==null) {} else {
			contract.getTopicCodeableConcept().setText(c.getCnctTopicCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_TopicRfrnc ********************************************************************************/
		if(c.getCnctTopicRfrnc() != null ) {

			if(c.getCnctTopicRfrnc().replace("[","").replace("]","").equals("NULL") | c.getCnctTopicRfrnc()==null) {} else {
			contract.setTopic(new org.hl7.fhir.r4.model.Reference(c.getCnctTopicRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnct_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnctTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getType().getCoding().size() < i0+1) { contract.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnctTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getType().getCoding().size() < i0+1) { contract.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnctTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getType().getCoding().size() < i0+1) { contract.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnctTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getType().getCoding().size() < i0+1) { contract.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnct_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnctTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(contract.getType().getCoding().size() < i0+1) { contract.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {contract.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnct_Typ_Txt ********************************************************************************/
		if(c.getCnctTypTxt() != null ) {

			if(c.getCnctTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCnctTypTxt()==null) {} else {
			contract.getType().setText(c.getCnctTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_Url ********************************************************************************/
		if(c.getCnctUrl() != null ) {

			if(c.getCnctUrl().replace("[","").replace("]","").equals("NULL") | c.getCnctUrl()==null) {} else {
			contract.setUrl(c.getCnctUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnct_Vrsn ********************************************************************************/
		if(c.getCnctVrsn() != null ) {

			if(c.getCnctVrsn().replace("[","").replace("]","").equals("NULL") | c.getCnctVrsn()==null) {} else {
			contract.setVersion(c.getCnctVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return contract;
	}
}
